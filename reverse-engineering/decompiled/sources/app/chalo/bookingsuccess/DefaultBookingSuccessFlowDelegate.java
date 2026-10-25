package app.chalo.bookingsuccess;

import androidx.compose.ui.unit.Dp;
import app.chalo.HomeDestinationTabType.DestinationTabType;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.bookingsuccess.DefaultBookingSuccessFlowDelegate;
import app.chalo.bookingsuccessproducttype.BookingSuccessProductType;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.Source;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.ProductActivationArgs;
import app.chalo.scenes.args.SuperPassVerificationStatusArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.success.StandardSuccessScreenUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/bookingsuccess/DefaultBookingSuccessFlowDelegate;", "Lapp/chalo/bookingsuccess/BookingSuccessFlowDelegate;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultBookingSuccessFlowDelegate implements BookingSuccessFlowDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingSuccessArgs.ProductSuccessScreen f1155a;
    public final StringProvider b;
    public final ChaloNavigationManager c;
    public final GetPremiumReserveTicketByIdUseCase d;
    public final TimeUtilsContract e;
    public final AnalyticsContract f;
    public final TriggerPremiumBusBookingBookingEventsUseCase g;
    public final MutableStateFlow h;
    public final StateFlow i;

    public DefaultBookingSuccessFlowDelegate(BookingSuccessArgs.ProductSuccessScreen productSuccessScreen, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, GetPremiumReserveTicketByIdUseCase getPremiumReserveTicketByIdUseCase, TimeUtilsContract timeUtilsContract, AnalyticsContract analyticsContract, TriggerPremiumBusBookingBookingEventsUseCase triggerPremiumBusBookingBookingEventsUseCase) {
        this.f1155a = productSuccessScreen;
        this.b = stringProvider;
        this.c = chaloNavigationManager;
        this.d = getPremiumReserveTicketByIdUseCase;
        this.e = timeUtilsContract;
        this.f = analyticsContract;
        this.g = triggerPremiumBusBookingBookingEventsUseCase;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new BookingSuccessDataState(productSuccessScreen, productSuccessScreen.b, 9));
        this.h = mutableStateFlowA;
        this.i = FlowKt.c(mutableStateFlowA);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static final Object f(DefaultBookingSuccessFlowDelegate defaultBookingSuccessFlowDelegate, BookingSuccessProductType bookingSuccessProductType, String str, boolean z, Map map, ContinuationImpl continuationImpl) {
        DefaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1 defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String strName;
        defaultBookingSuccessFlowDelegate.getClass();
        if (continuationImpl instanceof DefaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1) {
            defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1 = (DefaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1) continuationImpl;
            int i = defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1 = new DefaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1(defaultBookingSuccessFlowDelegate, continuationImpl);
            }
        } else {
            defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1 = new DefaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1(defaultBookingSuccessFlowDelegate, continuationImpl);
        }
        DefaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1 defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$2 = defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$1;
        Object obj = defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (bookingSuccessProductType instanceof BookingSuccessProductType.PremiumReserveTicket) {
                TriggerPremiumBusBookingBookingEventsUseCase triggerPremiumBusBookingBookingEventsUseCase = defaultBookingSuccessFlowDelegate.g;
                String sourceName = Source.PRODUCT_BOOKING_SUCCESS_FRAGMENT.getSourceName();
                defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$2.label = 1;
                return triggerPremiumBusBookingBookingEventsUseCase.d(str, sourceName, z, map, defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$2) == coroutineSingletons ? coroutineSingletons : unit;
            }
            if (bookingSuccessProductType instanceof BookingSuccessProductType.PremiumBusReschedule) {
                Flow flowA = defaultBookingSuccessFlowDelegate.d.a(str);
                defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$2.L$0 = str;
                defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$2.label = 2;
                Object objV = FlowKt.v(flowA, defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$2);
                if (objV != coroutineSingletons) {
                    obj = objV;
                    str2 = str;
                }
            }
        }
        if (i2 == 1) {
            ResultKt.b(obj);
            return unit;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) defaultBookingSuccessFlowDelegate$raiseProductBookingSuccessEvent$2.L$0;
        ResultKt.b(obj);
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) obj;
        String str8 = "";
        String str9 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.b.f7117a : "";
        if (premiumReserveTicketAppModel == null || (str3 = premiumReserveTicketAppModel.b.e) == null) {
            str3 = "";
        }
        String str10 = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.b.f : "";
        long j = premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.b.b : -1L;
        if (premiumReserveTicketAppModel == null || (str4 = premiumReserveTicketAppModel.b.g.f7121a) == null) {
            str4 = "";
        }
        if (premiumReserveTicketAppModel == null || (str5 = premiumReserveTicketAppModel.b.g.b) == null) {
            str5 = "";
        }
        if (premiumReserveTicketAppModel == null || (str6 = premiumReserveTicketAppModel.b.h.f7121a) == null) {
            str6 = "";
        }
        if (premiumReserveTicketAppModel == null || (str7 = premiumReserveTicketAppModel.b.h.b) == null) {
            str7 = "";
        }
        if (premiumReserveTicketAppModel != null && (strName = premiumReserveTicketAppModel.f7113a.h.name()) != null) {
            str8 = strName;
        }
        AnalyticsContract.DefaultImpls.a(defaultBookingSuccessFlowDelegate.f, "pb booking reschedule successful event", Source.PRODUCT_BOOKING_SUCCESS_FRAGMENT.getSourceName(), MapsKt.i(new Pair("bookingId", str2), new Pair("tripId", str9), new Pair("route id", str3), new Pair("route name", str10), new Pair("tripDate", String.valueOf(j)), new Pair("pickupStopId", str4), new Pair("pickupStopName", str5), new Pair("dropStopId", str6), new Pair("dropStopName", str7), new Pair("ticketStatus", str8)), null, true, 8);
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    public final BookingSuccessViewState a(final ContextScope contextScope, BookingSuccessDataState bookingSuccessDataState) {
        GifImageUIState gifImageUIState;
        ButtonUIState buttonUIStateF;
        BookingSuccessScreenDetail bookingSuccessScreenDetail = bookingSuccessDataState.f1149a;
        StandardSuccessScreenUIState.SuccessWithGifMsgAndCta successWithGifMsgAndCta = null;
        ButtonUIState buttonUIStateD = null;
        if (bookingSuccessScreenDetail != null) {
            String str = bookingSuccessScreenDetail.f1152a;
            UITextStyle uITextStyle = UITextStyle.DisplaySmall;
            UIFontWeight uIFontWeight = UIFontWeight.Bold;
            UITextAlign uITextAlign = UITextAlign.Center;
            TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(str, uITextStyle, (ChaloColorToken) ChaloColorToken.AlmostBlackColor.f9756a, 0, uITextAlign, uIFontWeight, (Integer) 24, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7960);
            String str2 = bookingSuccessScreenDetail.b;
            ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
            TextUIState.ChaloTextUIState chaloTextUIState2 = str2 != null ? new TextUIState.ChaloTextUIState(str2, UITextStyle.BodyMedium, shadyGray, 0, uITextAlign, UIFontWeight.Normal, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088) : null;
            IconType iconType = bookingSuccessScreenDetail.c;
            ImageUIState imageUIState = iconType != null ? new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().B), null, 2), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : null;
            String str3 = bookingSuccessScreenDetail.d;
            TextUIState.ChaloTextUIState chaloTextUIState3 = str3 != null ? new TextUIState.ChaloTextUIState(str3, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, UIFontWeight.Normal, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120) : null;
            LottieType lottieType = bookingSuccessScreenDetail.e;
            if (lottieType != null) {
                float f = 200;
                gifImageUIState = new GifImageUIState(lottieType, 1, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(f)), Dp.m7276boximpl(Dp.m7278constructorimpl(f))));
            } else {
                float f2 = 200;
                gifImageUIState = new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(f2)), Dp.m7276boximpl(Dp.m7278constructorimpl(f2))));
            }
            GifImageUIState gifImageUIState2 = gifImageUIState;
            String str4 = bookingSuccessScreenDetail.f;
            ButtonUIStateFactory buttonUIStateFactory = ButtonUIStateFactory.f9921a;
            if (str4 != null) {
                final int i = 0;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new Function0(this) { // from class: px
                    public final /* synthetic */ DefaultBookingSuccessFlowDelegate b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                this.b.e(contextScope);
                                break;
                            default:
                                this.b.d(contextScope);
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, UIShape.e, false, 0.0f, 52);
            } else {
                buttonUIStateF = null;
            }
            String str5 = bookingSuccessScreenDetail.g;
            if (str5 != null) {
                final int i2 = 1;
                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory, new TextUIState.ChaloTextUIState(str5, UITextStyle.HeadlineSmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new Function0(this) { // from class: px
                    public final /* synthetic */ DefaultBookingSuccessFlowDelegate b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                this.b.e(contextScope);
                                break;
                            default:
                                this.b.d(contextScope);
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, UIShape.e, false, 52);
            }
            successWithGifMsgAndCta = new StandardSuccessScreenUIState.SuccessWithGifMsgAndCta(gifImageUIState2, null, chaloTextUIState, chaloTextUIState2, imageUIState, chaloTextUIState3, buttonUIStateF, buttonUIStateD, 5);
        }
        return new BookingSuccessViewState(successWithGifMsgAndCta);
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    public final void b(ContextScope coroutineScope) {
        Intrinsics.i(coroutineScope, "coroutineScope");
        BookingSuccessArgs.ProductSuccessScreen productSuccessScreen = this.f1155a;
        BookingSuccessProductType bookingSuccessProductType = productSuccessScreen.e;
        if (bookingSuccessProductType instanceof BookingSuccessProductType.PremiumBusReschedule) {
            return;
        }
        boolean z = bookingSuccessProductType instanceof BookingSuccessProductType.SuperPassApplication;
        ChaloNavigationManager chaloNavigationManager = this.c;
        if (z) {
            ChaloNavigationManagerKt.b(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7), new SuperPassVerificationStatusArgs(((BookingSuccessProductType.SuperPassApplication) bookingSuccessProductType).b, productSuccessScreen.b.getSourceName()));
            return;
        }
        if (bookingSuccessProductType instanceof BookingSuccessProductType.QuickPay) {
            ChaloNavigationManagerKt.b(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7), new ProductActivationArgs(((BookingSuccessProductType.QuickPay) bookingSuccessProductType).b, "quickpay", "quickpay", productSuccessScreen.b, null, null, null, 1008));
            return;
        }
        if (bookingSuccessProductType instanceof BookingSuccessProductType.PremiumReserveTicket) {
            ChaloNavigationManagerKt.b(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7), new PremiumBusActivationArgs(Source.PRODUCT_BOOKING_SUCCESS_FRAGMENT, ((BookingSuccessProductType.PremiumReserveTicket) bookingSuccessProductType).b, "mobileTicket", "premiumReserveTicket", true));
        } else if (bookingSuccessProductType instanceof BookingSuccessProductType.ONDCVehicleBasedTicket) {
            ChaloNavigationManagerKt.b(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7), new ProductActivationArgs(((BookingSuccessProductType.ONDCVehicleBasedTicket) bookingSuccessProductType).b, "mobileTicket", "ondcTicket", productSuccessScreen.b, null, null, null, 1008));
        } else if (!(bookingSuccessProductType instanceof BookingSuccessProductType.GenderMismatchError)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    public final void c(ContextScope coroutineScope) {
        Intrinsics.i(coroutineScope, "coroutineScope");
        BuildersKt.d(coroutineScope, null, null, new DefaultBookingSuccessFlowDelegate$initialize$1(this, null), 3);
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    public final void d(CoroutineScope coroutineScope) {
        Intrinsics.i(coroutineScope, "coroutineScope");
        BookingSuccessProductType bookingSuccessProductType = this.f1155a.e;
        if ((bookingSuccessProductType instanceof BookingSuccessProductType.PremiumBusReschedule) || (bookingSuccessProductType instanceof BookingSuccessProductType.SuperPassApplication) || (bookingSuccessProductType instanceof BookingSuccessProductType.QuickPay) || (bookingSuccessProductType instanceof BookingSuccessProductType.ONDCVehicleBasedTicket) || (bookingSuccessProductType instanceof BookingSuccessProductType.PremiumReserveTicket)) {
            return;
        }
        if (!(bookingSuccessProductType instanceof BookingSuccessProductType.GenderMismatchError)) {
            throw new NoWhenBranchMatchedException();
        }
        ChaloNavigationManagerKt.b(this.c, new HomeArgs((String) null, (String) null, 7));
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    public final void e(CoroutineScope coroutineScope) {
        Intrinsics.i(coroutineScope, "coroutineScope");
        BookingSuccessArgs.ProductSuccessScreen productSuccessScreen = this.f1155a;
        BookingSuccessProductType bookingSuccessProductType = productSuccessScreen.e;
        boolean z = bookingSuccessProductType instanceof BookingSuccessProductType.PremiumBusReschedule;
        ChaloNavigationManager chaloNavigationManager = this.c;
        if (z) {
            BookingSuccessProductType.PremiumBusReschedule premiumBusReschedule = (BookingSuccessProductType.PremiumBusReschedule) bookingSuccessProductType;
            ChaloNavigationManagerKt.b(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7), new PremiumBusActivationArgs(productSuccessScreen.b, premiumBusReschedule.b, premiumBusReschedule.c, premiumBusReschedule.d, false));
        } else {
            if ((bookingSuccessProductType instanceof BookingSuccessProductType.SuperPassApplication) || (bookingSuccessProductType instanceof BookingSuccessProductType.QuickPay) || (bookingSuccessProductType instanceof BookingSuccessProductType.ONDCVehicleBasedTicket) || (bookingSuccessProductType instanceof BookingSuccessProductType.PremiumReserveTicket)) {
                return;
            }
            if (!(bookingSuccessProductType instanceof BookingSuccessProductType.GenderMismatchError)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloNavigationManagerKt.b(chaloNavigationManager, new HomeArgs(DestinationTabType.CHALO_BUS.getDestinationTabType(), (String) null, 6), new PremiumBusArgs.SlotSelectionArgs(Source.PRODUCT_BOOKING_SUCCESS_FRAGMENT, ((BookingSuccessProductType.GenderMismatchError) bookingSuccessProductType).b, null));
        }
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final StateFlow getI() {
        return this.i;
    }
}
