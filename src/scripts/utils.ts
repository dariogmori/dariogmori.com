export function isMobile(): boolean {
    const userAgent = navigator.userAgent || navigator.vendor;
    // Regular expressions to match mobile user agents
    const mobileRegex = /android|webos|iphone|ipad|ipod|blackberry|iemobile|opera mini|mobile/i;

    return mobileRegex.test(userAgent);
}