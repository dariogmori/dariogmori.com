import {isMobile} from "@/scripts/utils";

export function getSpan(index: number) {
    switch(index) {
        case 0:
            return isMobile() ? 24 : 8
        case 1:
            return isMobile() ? 24 : 12
        case 2:
            return isMobile() ? 24 : 8
    }
}