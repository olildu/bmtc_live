package app.chalo.appsupport;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.appsupport.data.models.app.CancelBookingStatus;
import app.chalo.appsupport.domain.CancelBookingUseCase;
import app.chalo.appsupport.uistate.BookingHelpScreenViewState;
import app.chalo.appsupport.uistate.BookingHelpUIStateFactory;
import app.chalo.constants.Source;
import app.chalo.models.bookinghelp.BookingHelpFaq;
import app.chalo.models.bookinghelp.BookingHelpFaqActionType;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.resultstatemanager.booking.BookingHelpResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.BookingCancellationTarget;
import app.chalo.scenes.args.BookingHelpArgs;
import com.arkivanov.decompose.ComponentContext;
import defpackage.f;
import defpackage.vo1;
import defpackage.wa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/appsupport/BookingHelpScreenComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/appsupport/BookingHelpScreenViewIntent;", "Lapp/chalo/appsupport/BookingHelpScreenDataState;", "Lapp/chalo/appsupport/uistate/BookingHelpScreenViewState;", "Lapp/chalo/appsupport/BookingHelpScreenSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BookingHelpScreenComponent extends ChaloBaseStateMviComponent<BookingHelpScreenViewIntent, BookingHelpScreenDataState, BookingHelpScreenViewState, BookingHelpScreenSideEffect> {
    public final BookingHelpUIStateFactory k;
    public final BookingHelpResultStateManager l;
    public final CancelBookingUseCase m;
    public final StringProvider n;
    public final AnalyticsContract o;
    public final ChaloNavigationManager p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f967a;

        static {
            int[] iArr = new int[CancelBookingStatus.values().length];
            try {
                iArr[CancelBookingStatus.Initiated.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CancelBookingStatus.Success.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CancelBookingStatus.Failed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CancelBookingStatus.Error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f967a = iArr;
        }
    }

    public BookingHelpScreenComponent(ComponentContext componentContext, BookingHelpArgs bookingHelpArgs, BookingHelpUIStateFactory bookingHelpUIStateFactory, BookingHelpResultStateManager bookingHelpResultStateManager, CancelBookingUseCase cancelBookingUseCase, StringProvider stringProvider, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager) {
        super(componentContext);
        this.k = bookingHelpUIStateFactory;
        this.l = bookingHelpResultStateManager;
        this.m = cancelBookingUseCase;
        this.n = stringProvider;
        this.o = analyticsContract;
        this.p = chaloNavigationManager;
        G0(new BookingHelpScreenViewIntent.InitialisationIntent(bookingHelpArgs.b, bookingHelpArgs.c));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0164, code lost:
    
        if (r2 == r6) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.appsupport.BookingHelpScreenComponent r17, app.chalo.scenes.args.BookingCancellationTarget r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.appsupport.BookingHelpScreenComponent.F0(app.chalo.appsupport.BookingHelpScreenComponent, app.chalo.scenes.args.BookingCancellationTarget, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void G0(BookingHelpScreenViewIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        if (intent instanceof BookingHelpScreenViewIntent.InitialisationIntent) {
            BookingHelpScreenViewIntent.InitialisationIntent initialisationIntent = (BookingHelpScreenViewIntent.InitialisationIntent) intent;
            List list = initialisationIntent.f970a;
            BookingCancellationTarget bookingCancellationTarget = initialisationIntent.b;
            AnalyticsContractImplKt.b(this.o, "booking help screen opened", Source.BOOKING_HELP_SCREEN, MapsKt.i(new Pair("bookingHelpFaqCount", Integer.valueOf(list.size())), new Pair("bookingId", bookingCancellationTarget.getB())), false, 24);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                BookingHelpFaq bookingHelpFaq = (BookingHelpFaq) obj;
                if (!StringsKt.F(bookingHelpFaq.f5606a) && !StringsKt.F(bookingHelpFaq.b)) {
                    arrayList.add(obj);
                }
            }
            E0(new f(10, bookingCancellationTarget, arrayList));
            return;
        }
        boolean z = intent instanceof BookingHelpScreenViewIntent.OnFaqActionClicked;
        ContextScope contextScope = this.j;
        if (z) {
            BookingHelpFaqActionType bookingHelpFaqActionType = ((BookingHelpScreenViewIntent.OnFaqActionClicked) intent).f974a;
            AnalyticsContractImplKt.b(this.o, "booking help faq action clicked", Source.BOOKING_HELP_SCREEN, vo1.s("bookingHelpFaqActionType", bookingHelpFaqActionType.name()), false, 24);
            BuildersKt.d(contextScope, null, null, new BookingHelpScreenComponent$handleOnFaqActionClicked$1(bookingHelpFaqActionType, this, null), 3);
            return;
        }
        int i = 9;
        if (intent instanceof BookingHelpScreenViewIntent.OnBottomSheetNegativeButtonClicked) {
            BookingHelpBottomSheetType bookingHelpBottomSheetType = ((BookingHelpScreenViewIntent.OnBottomSheetNegativeButtonClicked) intent).f972a;
            AnalyticsContractImplKt.b(this.o, "booking help bottom sheet negative button clicked", Source.BOOKING_HELP_SCREEN, vo1.s("bottomSheetType", bookingHelpBottomSheetType.toString()), false, 24);
            E0(new wa(i));
            BuildersKt.d(contextScope, null, null, new BookingHelpScreenComponent$handleOnBottomSheetNegativeButtonClicked$1(bookingHelpBottomSheetType, this, null), 3);
            return;
        }
        if (!(intent instanceof BookingHelpScreenViewIntent.OnBottomSheetPositiveButtonClicked)) {
            if (!(intent instanceof BookingHelpScreenViewIntent.OnBottomSheetDismissed)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new wa(i));
        } else {
            BookingHelpBottomSheetType bookingHelpBottomSheetType2 = ((BookingHelpScreenViewIntent.OnBottomSheetPositiveButtonClicked) intent).f973a;
            AnalyticsContractImplKt.b(this.o, "booking help bottom sheet positive button clicked", Source.BOOKING_HELP_SCREEN, vo1.s("bottomSheetType", bookingHelpBottomSheetType2.toString()), false, 24);
            E0(new wa(i));
            BuildersKt.d(contextScope, null, null, new BookingHelpScreenComponent$handleOnBottomSheetPositiveButtonClicked$1(bookingHelpBottomSheetType2, this, null), 3);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        BookingHelpScreenComponent$convertToUiState$2 bookingHelpScreenComponent$convertToUiState$2 = new BookingHelpScreenComponent$convertToUiState$2(1, this, BookingHelpScreenComponent.class, "processIntent", "processIntent(Lapp/chalo/appsupport/BookingHelpScreenViewIntent;)V", 0);
        return this.k.c((BookingHelpScreenDataState) obj, bookingHelpScreenComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new BookingHelpScreenDataState(ChaloTransitMode.BUS, new BookingCancellationTarget.DirectMetro(""), EmptyList.f17557a, false, BookingHelpBottomSheetType.None.f966a);
    }
}
