package app.chalo.ridehailing.feedback;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.ridehailing.data.app.RideHailingBookingDriverDetailsAppModel;
import app.chalo.ridehailing.data.app.RideHailingVehicleCategory;
import app.chalo.ridehailing.data.app.RideHailingVehicleDetailsAppModel;
import app.chalo.ridehailing.data.manager.RideHailingStaticTripDetails;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.t11;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackUIStateFactory;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideFeedbackUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyFeature f9154a;
    public final StringProvider b;
    public final RideFeedbackCommonUIStateFactory c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9155a;

        static {
            int[] iArr = new int[RideHailingVehicleCategory.values().length];
            try {
                iArr[RideHailingVehicleCategory.AUTO_RICKSHAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RideHailingVehicleCategory.CAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RideHailingVehicleCategory.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9155a = iArr;
        }
    }

    public RideFeedbackUIStateFactory(CurrencyFeature currencyFeature, StringProvider stringProvider, RideFeedbackCommonUIStateFactory rideFeedbackCommonUIStateFactory) {
        this.f9154a = currencyFeature;
        this.b = stringProvider;
        this.c = rideFeedbackCommonUIStateFactory;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x024d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(RideHailingStaticTripDetails rideHailingStaticTripDetails, Function1 function1, ContinuationImpl continuationImpl) {
        RideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1 rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1;
        IconType iconType;
        ImageUrlUIState imageUrlUIState;
        ImageUIState imageUIState;
        ImageUIState imageUIState2;
        ImageUrlUIState imageUrlUIState2;
        ImageUIState imageUIState3;
        Function1 function2;
        RideHailingBookingDriverDetailsAppModel rideHailingBookingDriverDetailsAppModel;
        String str;
        RideHailingVehicleDetailsAppModel rideHailingVehicleDetailsAppModel;
        String str2;
        RideHailingVehicleDetailsAppModel rideHailingVehicleDetailsAppModel2;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState;
        ImageUrlUIState imageUrlUIState3;
        ImageUIState imageUIState4;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object objC;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ImageUrlUIState imageUrlUIState4;
        RideHailingStaticTripDetails rideHailingStaticTripDetails2 = rideHailingStaticTripDetails;
        if (continuationImpl instanceof RideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1) {
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1 = (RideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1) continuationImpl;
            int i = rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1 = new RideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1(this, continuationImpl);
            }
        } else {
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1 = new RideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1(this, continuationImpl);
        }
        Object obj = rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label;
        StringProvider stringProvider = this.b;
        if (i2 == 0) {
            ResultKt.b(obj);
            RideHailingVehicleCategory rideHailingVehicleCategory = (rideHailingStaticTripDetails2 == null || (rideHailingVehicleDetailsAppModel2 = rideHailingStaticTripDetails2.e) == null) ? null : rideHailingVehicleDetailsAppModel2.f9117a;
            int i3 = rideHailingVehicleCategory == null ? -1 : WhenMappings.f9155a[rideHailingVehicleCategory.ordinal()];
            if (i3 == -1) {
                iconType = IconType.IC_CHALO_BUS;
            } else if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iconType = IconType.IC_CHALO_BUS;
            } else {
                iconType = IconType.AUTO_NEARBY;
            }
            IconType iconType2 = iconType;
            ImageUrlUIState imageUrlUIState5 = (rideHailingStaticTripDetails2 == null || (rideHailingVehicleDetailsAppModel = rideHailingStaticTripDetails2.e) == null || (str2 = rideHailingVehicleDetailsAppModel.h) == null) ? null : new ImageUrlUIState(str2, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            ImageUIState imageUIState5 = new ImageUIState(iconType2, (String) null, (ChaloColorToken) null, new ImageUISize(null, Dp.m7276boximpl(ChaloThemeHelper.a().u), 1), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            ImageUrlUIState imageUrlUIState6 = (rideHailingStaticTripDetails2 == null || (rideHailingBookingDriverDetailsAppModel = rideHailingStaticTripDetails2.d) == null || (str = rideHailingBookingDriverDetailsAppModel.d) == null) ? null : new ImageUrlUIState(str, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            ImageUIState imageUIState6 = new ImageUIState(IconType.IC_DRIVER_FALLBACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().s), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            ImageUIState imageUIState7 = new ImageUIState(IconType.CHECK_CIRCLE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$0 = rideHailingStaticTripDetails2;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$1 = function1;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$2 = imageUrlUIState5;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$3 = imageUIState5;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$4 = imageUrlUIState6;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$5 = imageUIState6;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$6 = imageUIState7;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label = 1;
            Object objB = stringProvider.b(StringEnum.RIDE_COMPLETE, new Object[0], rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1);
            if (objB != coroutineSingletons) {
                imageUrlUIState = imageUrlUIState5;
                obj = objB;
                imageUIState = imageUIState6;
                ImageUrlUIState imageUrlUIState7 = imageUrlUIState6;
                imageUIState2 = imageUIState5;
                imageUrlUIState2 = imageUrlUIState7;
                imageUIState3 = imageUIState7;
                function2 = function1;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ImageUIState imageUIState8 = (ImageUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$6;
            imageUIState = (ImageUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$5;
            imageUrlUIState2 = (ImageUrlUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$4;
            imageUIState2 = (ImageUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$3;
            imageUrlUIState = (ImageUrlUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$2;
            function2 = (Function1) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$1;
            RideHailingStaticTripDetails rideHailingStaticTripDetails3 = (RideHailingStaticTripDetails) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$0;
            ResultKt.b(obj);
            imageUIState3 = imageUIState8;
            rideHailingStaticTripDetails2 = rideHailingStaticTripDetails3;
        } else {
            if (i2 == 2) {
                textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$5;
                imageUIState = (ImageUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$4;
                imageUrlUIState3 = (ImageUrlUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$3;
                imageUIState4 = (ImageUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$2;
                ImageUrlUIState imageUrlUIState8 = (ImageUrlUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$1;
                function3 = (Function1) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$0;
                ResultKt.b(obj);
                imageUrlUIState = imageUrlUIState8;
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(28), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7996);
                t11 t11Var = new t11(function3, 13);
                t11 t11Var2 = new t11(function3, 14);
                rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$0 = imageUrlUIState;
                rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$1 = imageUIState4;
                rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$2 = imageUrlUIState3;
                rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$3 = imageUIState;
                rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$4 = textWithLeftAndRightIconUIState;
                rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$5 = chaloTextUIState;
                rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label = 3;
                objC = this.c.c(t11Var, t11Var2, rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1);
                if (objC != coroutineSingletons) {
                    textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                    chaloTextUIState2 = chaloTextUIState;
                    obj = objC;
                    imageUrlUIState4 = imageUrlUIState;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$5;
            TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState3 = (TextWithLeftAndRightIconUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$4;
            imageUIState = (ImageUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$3;
            imageUrlUIState3 = (ImageUrlUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$2;
            imageUIState4 = (ImageUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$1;
            ImageUrlUIState imageUrlUIState9 = (ImageUrlUIState) rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$0;
            ResultKt.b(obj);
            chaloTextUIState2 = chaloTextUIState3;
            imageUrlUIState4 = imageUrlUIState9;
            textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState3;
        }
        return new RideFeedbackHeaderUIState(imageUrlUIState4, imageUIState4, imageUrlUIState3, imageUIState, textWithLeftAndRightIconUIState2, chaloTextUIState2, (RideFeedbackHeaderCtaUISState) obj);
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState4 = new TextWithLeftAndRightIconUIState(imageUIState3, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), null, 0.0f, null, 28);
        StringEnum stringEnum = StringEnum.PAY_;
        ImageUrlUIState imageUrlUIState10 = imageUrlUIState2;
        Object[] objArr = {new Double(this.f9154a.f(rideHailingStaticTripDetails2 != null ? rideHailingStaticTripDetails2.g : 0L, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING))};
        rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$0 = function2;
        rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$1 = imageUrlUIState;
        rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$2 = imageUIState2;
        rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$3 = imageUrlUIState10;
        rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$4 = imageUIState;
        rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$5 = textWithLeftAndRightIconUIState4;
        rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$6 = null;
        rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label = 2;
        Object objB2 = stringProvider.b(stringEnum, objArr, rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1);
        if (objB2 != coroutineSingletons) {
            obj = objB2;
            textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState4;
            imageUrlUIState3 = imageUrlUIState10;
            imageUIState4 = imageUIState2;
            function3 = function2;
            chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(28), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7996);
            t11 t11Var3 = new t11(function3, 13);
            t11 t11Var4 = new t11(function3, 14);
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$0 = imageUrlUIState;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$1 = imageUIState4;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$2 = imageUrlUIState3;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$3 = imageUIState;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$4 = textWithLeftAndRightIconUIState;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$5 = chaloTextUIState;
            rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label = 3;
            objC = this.c.c(t11Var3, t11Var4, rideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1);
            if (objC != coroutineSingletons) {
                textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                chaloTextUIState2 = chaloTextUIState;
                obj = objC;
                imageUrlUIState4 = imageUrlUIState;
                return new RideFeedbackHeaderUIState(imageUrlUIState4, imageUIState4, imageUrlUIState3, imageUIState, textWithLeftAndRightIconUIState2, chaloTextUIState2, (RideFeedbackHeaderCtaUISState) obj);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(RideFeedbackDataState rideFeedbackDataState, Function1 function1, ContinuationImpl continuationImpl) {
        RideFeedbackUIStateFactory$getViewState$1 rideFeedbackUIStateFactory$getViewState$1;
        RideHailingStaticTripDetails rideHailingStaticTripDetails;
        RideFeedbackCommonUIStateFactory rideFeedbackCommonUIStateFactory;
        Function1 function2;
        if (continuationImpl instanceof RideFeedbackUIStateFactory$getViewState$1) {
            rideFeedbackUIStateFactory$getViewState$1 = (RideFeedbackUIStateFactory$getViewState$1) continuationImpl;
            int i = rideFeedbackUIStateFactory$getViewState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackUIStateFactory$getViewState$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackUIStateFactory$getViewState$1 = new RideFeedbackUIStateFactory$getViewState$1(this, continuationImpl);
            }
        } else {
            rideFeedbackUIStateFactory$getViewState$1 = new RideFeedbackUIStateFactory$getViewState$1(this, continuationImpl);
        }
        RideFeedbackUIStateFactory$getViewState$1 rideFeedbackUIStateFactory$getViewState$2 = rideFeedbackUIStateFactory$getViewState$1;
        Object objA = rideFeedbackUIStateFactory$getViewState$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackUIStateFactory$getViewState$2.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            BookingContext bookingContext = rideFeedbackDataState.f9141a;
            if (bookingContext instanceof BookingContext.Auto) {
                rideHailingStaticTripDetails = ((BookingContext.Auto) bookingContext).f9130a;
            } else {
                if (!(bookingContext instanceof BookingContext.Default) && bookingContext != null) {
                    throw new NoWhenBranchMatchedException();
                }
                rideHailingStaticTripDetails = null;
            }
            rideFeedbackUIStateFactory$getViewState$2.L$0 = function1;
            rideFeedbackCommonUIStateFactory = this.c;
            rideFeedbackUIStateFactory$getViewState$2.L$1 = rideFeedbackCommonUIStateFactory;
            rideFeedbackUIStateFactory$getViewState$2.L$2 = rideFeedbackDataState;
            rideFeedbackUIStateFactory$getViewState$2.I$0 = 0;
            rideFeedbackUIStateFactory$getViewState$2.label = 1;
            objA = a(rideHailingStaticTripDetails, function1, rideFeedbackUIStateFactory$getViewState$2);
            if (objA != obj) {
                function2 = function1;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return objA;
        }
        rideFeedbackDataState = (RideFeedbackDataState) rideFeedbackUIStateFactory$getViewState$2.L$2;
        RideFeedbackCommonUIStateFactory rideFeedbackCommonUIStateFactory2 = (RideFeedbackCommonUIStateFactory) rideFeedbackUIStateFactory$getViewState$2.L$1;
        Function1 function3 = (Function1) rideFeedbackUIStateFactory$getViewState$2.L$0;
        ResultKt.b(objA);
        function2 = function3;
        rideFeedbackCommonUIStateFactory = rideFeedbackCommonUIStateFactory2;
        RideFeedbackDataState rideFeedbackDataState2 = rideFeedbackDataState;
        rideFeedbackUIStateFactory$getViewState$2.L$0 = null;
        rideFeedbackUIStateFactory$getViewState$2.L$1 = null;
        rideFeedbackUIStateFactory$getViewState$2.L$2 = null;
        rideFeedbackUIStateFactory$getViewState$2.label = 2;
        Object objH = rideFeedbackCommonUIStateFactory.h(true, rideFeedbackDataState2, null, (RideFeedbackHeaderUIState) objA, function2, rideFeedbackUIStateFactory$getViewState$2);
        return objH == obj ? obj : objH;
    }
}
