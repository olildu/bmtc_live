package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsToastMsgType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_PREMIUM_ROUTE_AVAILABLE", "GENERIC_ERROR", "getStringResIdForMsgType", "Lapp/chalo/providers/stringprovider/StringEnum;", "getGetStringResIdForMsgType", "()Lapp/chalo/providers/stringprovider/StringEnum;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum RouteDetailsToastMsgType {
    NO_PREMIUM_ROUTE_AVAILABLE,
    GENERIC_ERROR;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4876a;

        static {
            int[] iArr = new int[RouteDetailsToastMsgType.values().length];
            try {
                iArr[RouteDetailsToastMsgType.NO_PREMIUM_ROUTE_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteDetailsToastMsgType.GENERIC_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4876a = iArr;
        }
    }

    public static EnumEntries<RouteDetailsToastMsgType> getEntries() {
        return $ENTRIES;
    }

    public final StringEnum getGetStringResIdForMsgType() {
        int i = WhenMappings.f4876a[ordinal()];
        if (i == 1) {
            return StringEnum.PREMIUM_BUS_ROUTE_TYPE_UNAVAILABLE;
        }
        if (i == 2) {
            return StringEnum.GENERIC_ERROR_MESSAGE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
