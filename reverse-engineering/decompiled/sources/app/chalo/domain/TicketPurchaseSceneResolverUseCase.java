package app.chalo.domain;

import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.data.InstantTicketFeatureConfigForCity;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.scenes.args.TicketPurchaseArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/TicketPurchaseSceneResolverUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketPurchaseSceneResolverUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductBookingHelper f2522a;
    public final GetWalletSetupConfigurationUseCase b;
    public final GetInstantTicketFeatureConfigUseCase c;
    public final BasicInfoContract d;
    public final CityProvider e;
    public final GetClusterConfigForCityUseCase f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2523a;

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
                iArr[ProductNavigationSource.TICKET_SUMMARY_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductNavigationSource.GROUP_TICKET_LEG_SELECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductNavigationSource.REGULAR_BUS_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductNavigationSource.INSTANT_TICKET_SCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f2523a = iArr;
        }
    }

    public TicketPurchaseSceneResolverUseCase(ProductBookingHelper productBookingHelper, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, GetInstantTicketFeatureConfigUseCase getInstantTicketFeatureConfigUseCase, BasicInfoContract basicInfoContract, CityProvider cityProvider, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase) {
        this.f2522a = productBookingHelper;
        this.b = getWalletSetupConfigurationUseCase;
        this.c = getInstantTicketFeatureConfigUseCase;
        this.d = basicInfoContract;
        this.e = cityProvider;
        this.f = getClusterConfigForCityUseCase;
    }

    public static Object a(TicketPurchaseSceneResolverUseCase ticketPurchaseSceneResolverUseCase, ProductNavigationSource productNavigationSource, String str, InstantTicketStopPrefill instantTicketStopPrefill, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            instantTicketStopPrefill = null;
        }
        ticketPurchaseSceneResolverUseCase.getClass();
        switch (WhenMappings.f2523a[productNavigationSource.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                Object objC = ticketPurchaseSceneResolverUseCase.c(TicketPurchaseSceneResolverUseCaseKt.a(productNavigationSource), str, instantTicketStopPrefill, continuationImpl);
                return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : (TicketPurchaseArgs) objC;
            case 5:
                return ticketPurchaseSceneResolverUseCase.b(TicketPurchaseSceneResolverUseCaseKt.a(productNavigationSource), str, instantTicketStopPrefill, continuationImpl);
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Code duplicated, block: B:53:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x0155  */
    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    /* JADX WARN: Code duplicated, block: B:71:0x018d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0187, code lost:
    
        if (r14 == r1) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.constants.Source r11, java.lang.String r12, app.chalo.domain.InstantTicketStopPrefill r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.domain.TicketPurchaseSceneResolverUseCase.b(app.chalo.constants.Source, java.lang.String, app.chalo.domain.InstantTicketStopPrefill, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Source source, String str, InstantTicketStopPrefill instantTicketStopPrefill, ContinuationImpl continuationImpl) {
        TicketPurchaseSceneResolverUseCase$openInstantTicketFlow$1 ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1;
        if (continuationImpl instanceof TicketPurchaseSceneResolverUseCase$openInstantTicketFlow$1) {
            ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1 = (TicketPurchaseSceneResolverUseCase$openInstantTicketFlow$1) continuationImpl;
            int i = ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1 = new TicketPurchaseSceneResolverUseCase$openInstantTicketFlow$1(this, continuationImpl);
            }
        } else {
            ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1 = new TicketPurchaseSceneResolverUseCase$openInstantTicketFlow$1(this, continuationImpl);
        }
        Object objA = ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1.L$0 = source;
            ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1.L$1 = str;
            ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1.L$2 = instantTicketStopPrefill;
            ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1.label = 1;
            objA = this.c.a(ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            instantTicketStopPrefill = (InstantTicketStopPrefill) ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1.L$2;
            str = (String) ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1.L$1;
            source = (Source) ticketPurchaseSceneResolverUseCase$openInstantTicketFlow$1.L$0;
            ResultKt.b(objA);
        }
        InstantTicketFeatureConfigForCity instantTicketFeatureConfigForCity = (InstantTicketFeatureConfigForCity) objA;
        if (instantTicketFeatureConfigForCity.a(this.d.h())) {
            if (instantTicketFeatureConfigForCity.h) {
                return TicketPurchaseArgs.RouteSelectionArgs.InstantTicket.INSTANCE;
            }
            return new TicketPurchaseArgs.StopSelectionArgs.InstantTicket(instantTicketStopPrefill != null ? instantTicketStopPrefill.f2503a : null, instantTicketStopPrefill != null ? instantTicketStopPrefill.b : null, instantTicketStopPrefill != null ? instantTicketStopPrefill.c : null);
        }
        if (str == null || str.length() <= 0) {
            str = null;
        }
        return new TicketPurchaseArgs.MTicketTripInfoArgs(source, str, null);
    }
}
