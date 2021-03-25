import dpkt
import datetime
from dpkt.utils import mac_to_str, inet_to_str


def print_icmp(pcap):

    for timestamp, buf in pcap:
        eth = dpkt.ethernet.Ethernet(buf)
        if not isinstance(eth.data, dpkt.ip.IP):
            print('Non IP Packet type not supported %s\n' % eth.data.__class__.__name__)
            continue
        ip = eth.data

        if isinstance(ip.data, dpkt.icmp.ICMP):
            icmp = ip.data
            do_not_fragment = bool(ip.off & dpkt.ip.IP_DF)
            more_fragments = bool(ip.off & dpkt.ip.IP_MF)
            fragment_offset = ip.off & dpkt.ip.IP_OFFMASK

            print('Timestamp: ', str(datetime.datetime.utcfromtimestamp(timestamp)))
            print('Ethernet Frame: ', mac_to_str(eth.src), mac_to_str(eth.dst), eth.type)
            print('IP: %s -> %s   (len=%d ttl=%d DF=%d MF=%d offset=%d)' %
                  (inet_to_str(ip.src), inet_to_str(ip.dst), ip.len, ip.ttl,
                   do_not_fragment, more_fragments, fragment_offset))
def test():
    with open('/home/david/march24.pcap', 'rb') as f:
        pcap = dpkt.pcap.Reader(f)
        print_icmp(pcap)


if __name__ == '__main__':
    test()
