package app.chalo.domain;

import app.chalo.constants.Source;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketPurchaseSceneResolverUseCaseKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2524a;

        static {
            int[] iArr = new int[ProductNavigationSource.values().length];
            try {
                iArr[ProductNavigationSource.ROUTE_DETAILS_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductNavigationSource.PAY_FOR_TICKET_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductNavigationSource.REGULAR_BUS_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductNavigationSource.INSTANT_TICKET_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductNavigationSource.TICKET_SUMMARY_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductNavigationSource.GROUP_TICKET_LEG_SELECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f2524a = iArr;
        }
    }

    public static final Source a(ProductNavigationSource productNavigationSource) {
        Intrinsics.i(productNavigationSource, "<this>");
        switch (WhenMappings.f2524a[productNavigationSource.ordinal()]) {
            case 1:
                return Source.ROUTE_DETAILS;
            case 2:
                return Source.PAY_FOR_TICKET_SCREEN;
            case 3:
                return Source.REGULAR_BUS_SCREEN_TAB;
            case 4:
                return Source.INSTANT_TICKET_FRAGMENT;
            case 5:
                return Source.TICKET_SUMMARY_SCREEN;
            case 6:
                return Source.GROUP_TICKET_LEG_SELECTION_SCREEN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
