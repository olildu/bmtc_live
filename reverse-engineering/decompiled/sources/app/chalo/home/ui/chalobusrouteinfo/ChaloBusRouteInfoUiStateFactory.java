package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.home.data.model.app.response.ScheduleBlockType;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.ab;
import defpackage.fh;
import defpackage.l3;
import defpackage.wb;
import defpackage.ya;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoUiStateFactory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusRouteInfoUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f3335a;
    public final TimeUtilsContract b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3336a;

        static {
            int[] iArr = new int[ScheduleBlockType.values().length];
            try {
                iArr[ScheduleBlockType.MORNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScheduleBlockType.EVENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScheduleBlockType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3336a = iArr;
        }
    }

    public ChaloBusRouteInfoUiStateFactory(StringProvider stringProvider, TimeUtilsContract timeUtilsContract) {
        this.f3335a = stringProvider;
        this.b = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    public static ChaloBusRouteSuggestionFieldUiState b(IconType iconType, String str, UITextStyle uITextStyle, ChaloColorToken chaloColorToken, String str2, String str3, Function0 function0) {
        TextUIState.ChaloTextUIState chaloTextUIState;
        boolean z = str3 == null || StringsKt.F(str3);
        String str4 = !z ? str2 : str;
        String str5 = !z ? str3 : null;
        ImageUIState imageUIState = new ImageUIState(iconType, (String) null, ChaloColorToken.Black.f9759a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
        UIFontWeight uIFontWeight = UIFontWeight.Normal;
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(str4, uITextStyle, chaloColorToken, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        if (str5 == null) {
            chaloTextUIState = null;
        } else {
            String str6 = !StringsKt.F(str5) ? str5 : null;
            if (str6 != null) {
                chaloTextUIState = new TextUIState.ChaloTextUIState(str6, !z ? UITextStyle.BodyLarge : UITextStyle.BodySmall, !z ? ChaloColorToken.AlmostBlackColor.f9756a : ChaloColorToken.ShadyGray.f9851a, 1, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7088);
            } else {
                chaloTextUIState = null;
            }
        }
        return new ChaloBusRouteSuggestionFieldUiState(imageUIState, new TitleSubtitleUiState(null, chaloTextUIState2, chaloTextUIState, UiEventHandler.Companion.a(function0), 1));
    }

    public static TextUIState.ChaloTextUIState f(String str, UITextStyle uITextStyle, UIFontWeight uIFontWeight) {
        return new TextUIState.ChaloTextUIState(str, uITextStyle, (ChaloColorToken) null, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124);
    }

    public static /* synthetic */ TextUIState.ChaloTextUIState g(ChaloBusRouteInfoUiStateFactory chaloBusRouteInfoUiStateFactory, String str, UITextStyle uITextStyle) {
        UIFontWeight uIFontWeight = UIFontWeight.Normal;
        chaloBusRouteInfoUiStateFactory.getClass();
        return f(str, uITextStyle, uIFontWeight);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x015d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(RouteUiModel routeUiModel, String str, Function1 function1, ContinuationImpl continuationImpl) {
        ChaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1 chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object objB;
        RouteNameAndIconUIState routeNameAndIconUIState;
        String str2;
        Function1 function2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ImageUIState imageUIState;
        RouteUiModel routeUiModel2 = routeUiModel;
        if (continuationImpl instanceof ChaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1) {
            chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1 = (ChaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1) continuationImpl;
            int i = chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1 = new ChaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1(this, continuationImpl);
            }
        } else {
            chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1 = new ChaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1(this, continuationImpl);
        }
        Object obj = chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ImageUIState imageUIState2 = new ImageUIState(IconType.IC_BUS, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            String str3 = routeUiModel2.b;
            UITextStyle uITextStyle = UITextStyle.BodySmall;
            UIFontWeight uIFontWeight = UIFontWeight.SemiBold;
            RouteNameAndIconUIState routeNameAndIconUIState2 = new RouteNameAndIconUIState(imageUIState2, new TextUIState.ChaloTextUIState(str3, uITextStyle, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120));
            chaloTextUIState = new TextUIState.ChaloTextUIState(routeUiModel2.c, UITextStyle.HeadlineSmall, (ChaloColorToken) null, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124);
            String str4 = routeUiModel2.d;
            TextUIState.ChaloTextUIState chaloTextUIState3 = str4 != null ? new TextUIState.ChaloTextUIState(str4, uITextStyle, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null;
            ImageUIState imageUIState3 = new ImageUIState(IconType.IC_SCHEDULE_CLOCK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$0 = routeUiModel2;
            chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$1 = str;
            chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$2 = function1;
            chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$3 = routeNameAndIconUIState2;
            chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$4 = chaloTextUIState;
            chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$5 = chaloTextUIState3;
            chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$6 = imageUIState3;
            chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.label = 1;
            Long l = routeUiModel2.e;
            Long l2 = routeUiModel2.f;
            StringProvider stringProvider = this.f3335a;
            if (l == null && l2 == null) {
                objB = stringProvider.b(StringEnum.NO_SLOTS_AVAILABLE_TODAY, new Object[0], chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1);
            } else {
                TimeUtilsContract timeUtilsContract = this.b;
                if (l == null || l2 != null) {
                    if (l == null && l2 != null) {
                        objB = timeUtilsContract.t(l2.longValue());
                    } else if (l == null || l2 == null) {
                        objB = stringProvider.b(StringEnum.NO_SLOTS_AVAILABLE_TODAY, new Object[0], chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1);
                    } else {
                        objB = stringProvider.b(StringEnum.X_TO_Y, new Object[]{timeUtilsContract.t(l.longValue()), timeUtilsContract.t(l2.longValue())}, chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1);
                    }
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    routeNameAndIconUIState = routeNameAndIconUIState2;
                    obj = objB;
                    str2 = str;
                    function2 = function1;
                    chaloTextUIState2 = chaloTextUIState3;
                    imageUIState = imageUIState3;
                } else {
                    objB = timeUtilsContract.t(l.longValue());
                }
            }
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            routeNameAndIconUIState = routeNameAndIconUIState2;
            obj = objB;
            str2 = str;
            function2 = function1;
            chaloTextUIState2 = chaloTextUIState3;
            imageUIState = imageUIState3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ImageUIState imageUIState4 = (ImageUIState) chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$6;
            TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$5;
            chaloTextUIState = (TextUIState.ChaloTextUIState) chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$4;
            RouteNameAndIconUIState routeNameAndIconUIState3 = (RouteNameAndIconUIState) chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$3;
            function2 = (Function1) chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$2;
            String str5 = (String) chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$1;
            RouteUiModel routeUiModel3 = (RouteUiModel) chaloBusRouteInfoUiStateFactory$createChaloBusRouteInfoRouteUIState$1.L$0;
            ResultKt.b(obj);
            imageUIState = imageUIState4;
            routeUiModel2 = routeUiModel3;
            chaloTextUIState2 = chaloTextUIState4;
            routeNameAndIconUIState = routeNameAndIconUIState3;
            str2 = str5;
        }
        return new ChaloBusRouteInfoRouteUIState(routeNameAndIconUIState, chaloTextUIState, chaloTextUIState2, imageUIState, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ClickableTextUiState(new TextUIState.ChaloTextUIState(str2, UITextStyle.TitleLarge, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), UiEventHandler.Companion.a(new l3(21, function2, routeUiModel2)), 26));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(RouteSuggestionReachByTime routeSuggestionReachByTime, Function1 function1, ContinuationImpl continuationImpl) {
        ChaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1 chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1;
        Function1 function2;
        RouteSuggestionReachByTime routeSuggestionReachByTime2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        int i;
        String str;
        ImageUIState imageUIState;
        int i2;
        ButtonUIStateFactory buttonUIStateFactory;
        ButtonUIState buttonUIStateB;
        ButtonUIState buttonUIState;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ButtonUIStateFactory buttonUIStateFactory2;
        int i3;
        int i4;
        if (continuationImpl instanceof ChaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1) {
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1 = (ChaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1) continuationImpl;
            int i5 = chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.label = i5 - Integer.MIN_VALUE;
            } else {
                chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1 = new ChaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1(this, continuationImpl);
            }
        } else {
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1 = new ChaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1(this, continuationImpl);
        }
        Object objB = chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.label;
        ButtonUIStateFactory buttonUIStateFactory3 = ButtonUIStateFactory.f9921a;
        StringProvider stringProvider = this.f3335a;
        if (i6 == 0) {
            ResultKt.b(objB);
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$0 = routeSuggestionReachByTime;
            function2 = function1;
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$1 = function2;
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.WHEN_DO_YOU_WANT_TO_REACH, new Object[0], chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1);
            if (objB != coroutineSingletons) {
                routeSuggestionReachByTime2 = routeSuggestionReachByTime;
            }
            return coroutineSingletons;
        }
        if (i6 == 1) {
            Function1 function4 = (Function1) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$1;
            routeSuggestionReachByTime2 = (RouteSuggestionReachByTime) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$0;
            ResultKt.b(objB);
            function2 = function4;
        } else {
            if (i6 == 2) {
                i = chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.I$1;
                i2 = chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.I$0;
                ButtonUIStateFactory buttonUIStateFactory4 = (ButtonUIStateFactory) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$4;
                ImageUIState imageUIState2 = (ImageUIState) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$3;
                String str2 = (String) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$2;
                chaloTextUIState = (TextUIState.ChaloTextUIState) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$1;
                Function1 function5 = (Function1) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$0;
                ResultKt.b(objB);
                buttonUIStateFactory = buttonUIStateFactory4;
                str = str2;
                function2 = function5;
                imageUIState = imageUIState2;
                buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, (String) objB, new ya(function2, 28), null, false, 60);
                chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$0 = function2;
                chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$1 = chaloTextUIState;
                chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$2 = str;
                chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$3 = imageUIState;
                chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$4 = buttonUIStateB;
                chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$5 = buttonUIStateFactory3;
                chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.I$0 = i2;
                chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.I$1 = i;
                chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.CONTINUE, new Object[0], chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1);
                if (objB != coroutineSingletons) {
                    buttonUIState = buttonUIStateB;
                    function3 = function2;
                    chaloTextUIState2 = chaloTextUIState;
                    buttonUIStateFactory2 = buttonUIStateFactory3;
                    i3 = i;
                    i4 = i2;
                }
                return coroutineSingletons;
            }
            if (i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.I$1;
            i4 = chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.I$0;
            ButtonUIStateFactory buttonUIStateFactory5 = (ButtonUIStateFactory) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$5;
            ButtonUIState buttonUIState2 = (ButtonUIState) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$4;
            ImageUIState imageUIState3 = (ImageUIState) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$3;
            str = (String) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$2;
            TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$1;
            function3 = (Function1) chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$0;
            ResultKt.b(objB);
            i3 = i7;
            buttonUIState = buttonUIState2;
            buttonUIStateFactory2 = buttonUIStateFactory5;
            imageUIState = imageUIState3;
            chaloTextUIState2 = chaloTextUIState3;
        }
        return new RouteSuggestionTimePickerUIState(i4, i3, str, chaloTextUIState2, imageUIState, ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB, new wb(8), null, null, false, 0.0f, 60), buttonUIState, new ab(function3, 3));
        chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124);
        int i8 = routeSuggestionReachByTime2.f3369a;
        i = routeSuggestionReachByTime2.b;
        str = routeSuggestionReachByTime2.c;
        imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, ChaloColorToken.ShadyGray.f9851a, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ya(function2, 27)), 114);
        chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$0 = function2;
        chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$1 = chaloTextUIState;
        chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$2 = str;
        chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$3 = imageUIState;
        chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$4 = buttonUIStateFactory3;
        chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.I$0 = i8;
        chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.I$1 = i;
        chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1);
        if (objB2 != coroutineSingletons) {
            i2 = i8;
            buttonUIStateFactory = buttonUIStateFactory3;
            objB = objB2;
            buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, (String) objB, new ya(function2, 28), null, false, 60);
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$0 = function2;
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$1 = chaloTextUIState;
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$2 = str;
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$3 = imageUIState;
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$4 = buttonUIStateB;
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.L$5 = buttonUIStateFactory3;
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.I$0 = i2;
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.I$1 = i;
            chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1.label = 3;
            objB = stringProvider.b(StringEnum.CONTINUE, new Object[0], chaloBusRouteInfoUiStateFactory$createRouteSuggestionTimePickerUIState$1);
            if (objB != coroutineSingletons) {
                buttonUIState = buttonUIStateB;
                function3 = function2;
                chaloTextUIState2 = chaloTextUIState;
                buttonUIStateFactory2 = buttonUIStateFactory3;
                i3 = i;
                i4 = i2;
                return new RouteSuggestionTimePickerUIState(i4, i3, str, chaloTextUIState2, imageUIState, ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB, new wb(8), null, null, false, 0.0f, 60), buttonUIState, new ab(function3, 3));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x053c  */
    /* JADX WARN: Code duplicated, block: B:116:0x059e  */
    /* JADX WARN: Code duplicated, block: B:117:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x05a1 -> B:118:0x05b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoDataState r55, defpackage.ch r56, kotlin.coroutines.jvm.internal.ContinuationImpl r57) {
        /*
            Method dump skipped, instruction units count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoUiStateFactory.d(app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoDataState, ch, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0132  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    /* JADX WARN: Code duplicated, block: B:56:0x0177  */
    /* JADX WARN: Code duplicated, block: B:58:0x018b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0132, please report this as an issue */
    public final Object e(ChaloBusRouteInfoDataState chaloBusRouteInfoDataState, List list, List list2, List list3, String str, String str2, String str3, String str4, String str5, String str6, String str7, Function1 function1, ContinuationImpl continuationImpl) {
        ChaloBusRouteInfoUiStateFactory$toContentState$1 chaloBusRouteInfoUiStateFactory$toContentState$1;
        String str8;
        String str9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zD;
        ChaloColorToken.ShadyGray shadyGray;
        ChaloColorToken.AlmostBlackColor almostBlackColor;
        String str10;
        List list4;
        List list5;
        Object objB;
        Function1 function2;
        List list6;
        List list7;
        List list8;
        List list9;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof ChaloBusRouteInfoUiStateFactory$toContentState$1) {
            chaloBusRouteInfoUiStateFactory$toContentState$1 = (ChaloBusRouteInfoUiStateFactory$toContentState$1) continuationImpl;
            int i = chaloBusRouteInfoUiStateFactory$toContentState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusRouteInfoUiStateFactory$toContentState$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusRouteInfoUiStateFactory$toContentState$1 = new ChaloBusRouteInfoUiStateFactory$toContentState$1(this, continuationImpl);
            }
        } else {
            chaloBusRouteInfoUiStateFactory$toContentState$1 = new ChaloBusRouteInfoUiStateFactory$toContentState$1(this, continuationImpl);
        }
        Object obj = chaloBusRouteInfoUiStateFactory$toContentState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusRouteInfoUiStateFactory$toContentState$1.label;
        StringProvider stringProvider = this.f3335a;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        if (i2 != 0) {
            if (i2 == 1) {
                List list10 = (List) chaloBusRouteInfoUiStateFactory$toContentState$1.L$3;
                list6 = (List) chaloBusRouteInfoUiStateFactory$toContentState$1.L$2;
                List list11 = (List) chaloBusRouteInfoUiStateFactory$toContentState$1.L$1;
                function2 = (Function1) chaloBusRouteInfoUiStateFactory$toContentState$1.L$0;
                ResultKt.b(obj);
                list5 = list10;
                objB = obj;
                list4 = list11;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloTextUIState = (TextUIState.ChaloTextUIState) chaloBusRouteInfoUiStateFactory$toContentState$1.L$4;
                list9 = (List) chaloBusRouteInfoUiStateFactory$toContentState$1.L$3;
                list7 = (List) chaloBusRouteInfoUiStateFactory$toContentState$1.L$2;
                list8 = (List) chaloBusRouteInfoUiStateFactory$toContentState$1.L$1;
                function3 = (Function1) chaloBusRouteInfoUiStateFactory$toContentState$1.L$0;
                ResultKt.b(obj);
            }
            return new ChaloBusRouteInfoContentState.Content(list8, list7, list9, new ChaloBusRouteSuggestionCardUiState(chaloTextUIState, new ClickableTextUiState(new TextUIState.ChaloTextUIState((String) obj, UITextStyle.HeadlineSmall, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), UiEventHandler.Companion.a(new fh(function3, 0)), 26), UiEventHandler.Companion.a(new fh(function3, 1))));
        }
        ResultKt.b(obj);
        List list12 = chaloBusRouteInfoDataState.e;
        ChaloBusRouteInfoErrorType chaloBusRouteInfoErrorType = chaloBusRouteInfoDataState.h;
        boolean zIsEmpty = list12.isEmpty();
        boolean z4 = chaloBusRouteInfoErrorType instanceof ChaloBusRouteInfoErrorType.ApiError;
        ChaloBusRouteInfoErrorType.ResetFilter resetFilter = ChaloBusRouteInfoErrorType.ResetFilter.f3319a;
        ChaloBusRouteInfoErrorType.NoRoutesAvailable noRoutesAvailable = ChaloBusRouteInfoErrorType.NoRoutesAvailable.f3318a;
        if (!z4) {
            if (Intrinsics.d(chaloBusRouteInfoErrorType, noRoutesAvailable)) {
                str9 = str4;
            } else if (Intrinsics.d(chaloBusRouteInfoErrorType, resetFilter)) {
                str9 = str5;
            } else {
                if (chaloBusRouteInfoErrorType != null) {
                    throw new NoWhenBranchMatchedException();
                }
                str8 = "";
            }
            if (z4 || !zIsEmpty) {
                z = false;
            } else {
                z = true;
            }
            if (Intrinsics.d(chaloBusRouteInfoErrorType, noRoutesAvailable) || !zIsEmpty) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (chaloBusRouteInfoDataState.f.isEmpty() || chaloBusRouteInfoErrorType == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            zD = Intrinsics.d(chaloBusRouteInfoErrorType, resetFilter);
            if (chaloBusRouteInfoDataState.b) {
                return new ChaloBusRouteInfoContentState.Loading();
            }
            shadyGray = ChaloColorToken.ShadyGray.f9851a;
            almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
            if (z) {
                return new ChaloBusRouteInfoContentState.FullScreenError(new TextUIState.ChaloTextUIState(str, UITextStyle.DisplaySmall, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new TextUIState.ChaloTextUIState(str2, UITextStyle.BodySmall, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ButtonUIStateFactory.g(ButtonUIStateFactory.f9921a, str7, new ya(function1, 29), null, null, false, 0.0f, 60), 17);
            }
            if (z2) {
                return new ChaloBusRouteInfoContentState.FullScreenError(new TextUIState.ChaloTextUIState(str3, UITextStyle.DisplaySmall, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new TextUIState.ChaloTextUIState(str9, UITextStyle.BodySmall, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 25);
            }
            str10 = str9;
            if (z3) {
                TextUIState.ChaloTextUIState chaloTextUIStateG = g(this, str3, UITextStyle.DisplaySmall);
                UITextStyle uITextStyle = UITextStyle.BodySmall;
                return new ChaloBusRouteInfoContentState.Empty(list, list2, chaloTextUIStateG, g(this, str10, uITextStyle), zD ? new ClickableTextUiState(new TextUIState.ChaloTextUIState(str6, uITextStyle, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_ARROW_RIGHT, (String) null, orangePrimary, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), UiEventHandler.Companion.a(new fh(function1, 3)), 26) : null);
            }
            chaloBusRouteInfoUiStateFactory$toContentState$1.L$0 = function1;
            list4 = list;
            chaloBusRouteInfoUiStateFactory$toContentState$1.L$1 = list4;
            chaloBusRouteInfoUiStateFactory$toContentState$1.L$2 = list2;
            list5 = list3;
            chaloBusRouteInfoUiStateFactory$toContentState$1.L$3 = list5;
            chaloBusRouteInfoUiStateFactory$toContentState$1.label = 1;
            objB = stringProvider.b(StringEnum.CANT_FIND_YOUR_PREFERRED_ROUTE, new Object[0], chaloBusRouteInfoUiStateFactory$toContentState$1);
            if (objB != coroutineSingletons) {
                function2 = function1;
                list6 = list2;
            }
            return coroutineSingletons;
        }
        str8 = ((ChaloBusRouteInfoErrorType.ApiError) chaloBusRouteInfoErrorType).f3317a;
        str9 = str8;
        if (z4) {
            z = false;
        } else {
            z = false;
        }
        if (Intrinsics.d(chaloBusRouteInfoErrorType, noRoutesAvailable)) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (chaloBusRouteInfoDataState.f.isEmpty()) {
            z3 = false;
        } else {
            z3 = false;
        }
        zD = Intrinsics.d(chaloBusRouteInfoErrorType, resetFilter);
        if (chaloBusRouteInfoDataState.b) {
            return new ChaloBusRouteInfoContentState.Loading();
        }
        shadyGray = ChaloColorToken.ShadyGray.f9851a;
        almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        if (z) {
            return new ChaloBusRouteInfoContentState.FullScreenError(new TextUIState.ChaloTextUIState(str, UITextStyle.DisplaySmall, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new TextUIState.ChaloTextUIState(str2, UITextStyle.BodySmall, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), ButtonUIStateFactory.g(ButtonUIStateFactory.f9921a, str7, new ya(function1, 29), null, null, false, 0.0f, 60), 17);
        }
        if (z2) {
            return new ChaloBusRouteInfoContentState.FullScreenError(new TextUIState.ChaloTextUIState(str3, UITextStyle.DisplaySmall, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new TextUIState.ChaloTextUIState(str9, UITextStyle.BodySmall, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 25);
        }
        str10 = str9;
        if (z3) {
            TextUIState.ChaloTextUIState chaloTextUIStateG2 = g(this, str3, UITextStyle.DisplaySmall);
            UITextStyle uITextStyle2 = UITextStyle.BodySmall;
            return new ChaloBusRouteInfoContentState.Empty(list, list2, chaloTextUIStateG2, g(this, str10, uITextStyle2), zD ? new ClickableTextUiState(new TextUIState.ChaloTextUIState(str6, uITextStyle2, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_ARROW_RIGHT, (String) null, orangePrimary, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), UiEventHandler.Companion.a(new fh(function1, 3)), 26) : null);
        }
        chaloBusRouteInfoUiStateFactory$toContentState$1.L$0 = function1;
        list4 = list;
        chaloBusRouteInfoUiStateFactory$toContentState$1.L$1 = list4;
        chaloBusRouteInfoUiStateFactory$toContentState$1.L$2 = list2;
        list5 = list3;
        chaloBusRouteInfoUiStateFactory$toContentState$1.L$3 = list5;
        chaloBusRouteInfoUiStateFactory$toContentState$1.label = 1;
        objB = stringProvider.b(StringEnum.CANT_FIND_YOUR_PREFERRED_ROUTE, new Object[0], chaloBusRouteInfoUiStateFactory$toContentState$1);
        if (objB != coroutineSingletons) {
            function2 = function1;
            list6 = list2;
        }
        return coroutineSingletons;
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
        chaloBusRouteInfoUiStateFactory$toContentState$1.L$0 = function2;
        chaloBusRouteInfoUiStateFactory$toContentState$1.L$1 = list4;
        chaloBusRouteInfoUiStateFactory$toContentState$1.L$2 = list6;
        chaloBusRouteInfoUiStateFactory$toContentState$1.L$3 = list5;
        chaloBusRouteInfoUiStateFactory$toContentState$1.L$4 = chaloTextUIState2;
        chaloBusRouteInfoUiStateFactory$toContentState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.SUGGEST_A_NEW_ROUTE, new Object[0], chaloBusRouteInfoUiStateFactory$toContentState$1);
        if (objB2 != coroutineSingletons) {
            list7 = list6;
            list8 = list4;
            list9 = list5;
            function3 = function2;
            chaloTextUIState = chaloTextUIState2;
            obj = objB2;
            return new ChaloBusRouteInfoContentState.Content(list8, list7, list9, new ChaloBusRouteSuggestionCardUiState(chaloTextUIState, new ClickableTextUiState(new TextUIState.ChaloTextUIState((String) obj, UITextStyle.HeadlineSmall, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), UiEventHandler.Companion.a(new fh(function3, 0)), 26), UiEventHandler.Companion.a(new fh(function3, 1))));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x016b  */
    /* JADX WARN: Code duplicated, block: B:35:0x019e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x019f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x019f -> B:37:0x01b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(app.chalo.home.ui.chalobusrouteinfo.CorridorUiModel r41, boolean r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, kotlin.jvm.functions.Function1 r46, kotlin.coroutines.jvm.internal.ContinuationImpl r47) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoUiStateFactory.h(app.chalo.home.ui.chalobusrouteinfo.CorridorUiModel, boolean, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x053e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0548  */
    /* JADX WARN: Code duplicated, block: B:107:0x054c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0551  */
    /* JADX WARN: Code duplicated, block: B:112:0x056a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0571  */
    /* JADX WARN: Code duplicated, block: B:116:0x0582  */
    /* JADX WARN: Code duplicated, block: B:119:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:121:0x05e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:124:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:125:0x0602  */
    /* JADX WARN: Code duplicated, block: B:127:0x0608  */
    /* JADX WARN: Code duplicated, block: B:131:0x0635  */
    /* JADX WARN: Code duplicated, block: B:135:0x0652  */
    /* JADX WARN: Code duplicated, block: B:137:0x065d  */
    /* JADX WARN: Code duplicated, block: B:139:0x06df  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0293  */
    /* JADX WARN: Code duplicated, block: B:33:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x0319  */
    /* JADX WARN: Code duplicated, block: B:49:0x0343  */
    /* JADX WARN: Code duplicated, block: B:53:0x0370  */
    /* JADX WARN: Code duplicated, block: B:57:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x040e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0449  */
    /* JADX WARN: Code duplicated, block: B:73:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:76:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:78:0x04c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:84:0x0505  */
    /* JADX WARN: Code duplicated, block: B:85:0x0509  */
    /* JADX WARN: Code duplicated, block: B:87:0x050c  */
    /* JADX WARN: Code duplicated, block: B:88:0x050f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0514  */
    /* JADX WARN: Code duplicated, block: B:95:0x051e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0538  */
    /* JADX WARN: Code duplicated, block: B:99:0x053b  */
    public final Object i(RouteSuggestionSheetState routeSuggestionSheetState, Function1 function1, ContinuationImpl continuationImpl) {
        ChaloBusRouteInfoUiStateFactory$toUiState$9 chaloBusRouteInfoUiStateFactory$toUiState$9;
        int i;
        RouteSuggestionSheetState routeSuggestionSheetState2;
        Object obj;
        Function1 function2;
        String str;
        Object objB;
        Function1 function3;
        Object obj2;
        String str2;
        Object objB2;
        String str3;
        Object obj3;
        RouteSuggestionSheetState routeSuggestionSheetState3;
        Function1 function4;
        String str4;
        Object objB3;
        String str5;
        Object obj4;
        RouteSuggestionSheetState routeSuggestionSheetState4;
        Function1 function5;
        String str6;
        String str7;
        String str8;
        Object objB4;
        String str9;
        Object obj5;
        RouteSuggestionSheetState routeSuggestionSheetState5;
        Function1 function6;
        String str10;
        String str11;
        String str12;
        String str13;
        Object objB5;
        String str14;
        Object obj6;
        RouteSuggestionSheetState routeSuggestionSheetState6;
        Function1 function7;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        Object objB6;
        String str20;
        Object obj7;
        RouteSuggestionSheetState routeSuggestionSheetState7;
        Function1 function8;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        Object objB7;
        String str27;
        Object obj8;
        RouteSuggestionSheetState routeSuggestionSheetState8;
        Function1 function9;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        Object objB8;
        RouteSuggestionSheetState routeSuggestionSheetState9;
        Function1 function10;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        Object obj9;
        String str43;
        Object objB9;
        Object obj10;
        String str44;
        String str45;
        StringProvider stringProvider;
        Object objB10;
        Object obj11;
        String str46;
        String str47;
        String str48;
        Object obj12;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        String str55;
        Function1 function11;
        String str56;
        String str57;
        Object objB11;
        String str58;
        String str59;
        String str60;
        Object obj13;
        String str61;
        String str62;
        String str63;
        String str64;
        String str65;
        String str66;
        Function1 function12;
        String str67;
        boolean z;
        ButtonUIStateFactory buttonUIStateFactory;
        ChaloColorToken.ShadyGray shadyGray;
        Function1 function13;
        RouteSuggestionSheetState.Form form;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        RouteSuggestionReachByTime routeSuggestionReachByTime;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2;
        boolean z2;
        TextUIState.ChaloTextUIState chaloTextUIStateF;
        ImageUIState imageUIState;
        UITextStyle uITextStyle;
        String str68;
        String str69;
        ChaloColorToken.AlmostBlackColor almostBlackColor;
        ChaloColorToken chaloColorToken;
        Object obj14;
        ChaloBusRouteSuggestionFieldUiState chaloBusRouteSuggestionFieldUiStateB;
        String str70;
        ChaloColorToken chaloColorToken2;
        String str71;
        ChaloBusRouteSuggestionFieldUiState chaloBusRouteSuggestionFieldUiStateB2;
        TimeUtilsContract timeUtilsContract;
        String strL;
        ChaloBusRouteSuggestionFieldUiState chaloBusRouteSuggestionFieldUiStateB3;
        ButtonUIState buttonUIStateG;
        Function1 function14;
        ButtonUIState buttonUIStateB;
        RouteSuggestionReachByTime routeSuggestionReachByTime2;
        Object objC;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ButtonUIState buttonUIState;
        ChaloBusRouteSuggestionFieldUiState chaloBusRouteSuggestionFieldUiState;
        ChaloBusRouteSuggestionFieldUiState chaloBusRouteSuggestionFieldUiState2;
        ChaloBusRouteSuggestionFieldUiState chaloBusRouteSuggestionFieldUiState3;
        ImageUIState imageUIState2;
        int i2;
        String str72;
        ButtonUIState buttonUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ChaloBusRouteSuggestionFieldUiState chaloBusRouteSuggestionFieldUiState4;
        RouteSuggestionTimePickerUIState routeSuggestionTimePickerUIState;
        ChaloBusRouteSuggestionFieldUiState chaloBusRouteSuggestionFieldUiState5;
        ImageUIState imageUIState3;
        ChaloBusRouteSuggestionFieldUiState chaloBusRouteSuggestionFieldUiState6;
        if (continuationImpl instanceof ChaloBusRouteInfoUiStateFactory$toUiState$9) {
            chaloBusRouteInfoUiStateFactory$toUiState$9 = (ChaloBusRouteInfoUiStateFactory$toUiState$9) continuationImpl;
            int i3 = chaloBusRouteInfoUiStateFactory$toUiState$9.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = i3 - Integer.MIN_VALUE;
            } else {
                chaloBusRouteInfoUiStateFactory$toUiState$9 = new ChaloBusRouteInfoUiStateFactory$toUiState$9(this, continuationImpl);
            }
        } else {
            chaloBusRouteInfoUiStateFactory$toUiState$9 = new ChaloBusRouteInfoUiStateFactory$toUiState$9(this, continuationImpl);
        }
        Object obj15 = chaloBusRouteInfoUiStateFactory$toUiState$9.result;
        Object obj16 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = chaloBusRouteInfoUiStateFactory$toUiState$9.label;
        StringProvider stringProvider2 = this.f3335a;
        switch (i4) {
            case 0:
                ResultKt.b(obj15);
                i = 0;
                routeSuggestionSheetState2 = routeSuggestionSheetState;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState2;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function1;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 1;
                Object objB12 = stringProvider2.b(StringEnum.SUGGEST_ROUTE, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                if (objB12 != obj16) {
                    obj = objB12;
                    function2 = function1;
                    str = (String) obj;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState2;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function2;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 2;
                    objB = stringProvider2.b(StringEnum.PICKUP_LOCATION, new Object[i], chaloBusRouteInfoUiStateFactory$toUiState$9);
                    if (objB == obj16) {
                        function3 = function2;
                        obj2 = objB;
                        str2 = (String) obj2;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState2;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function3;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str2;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 3;
                        objB2 = stringProvider2.b(StringEnum.ENTER_PICKUP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                        if (objB2 != obj16) {
                            Function1 function15 = function3;
                            str3 = str2;
                            obj3 = objB2;
                            routeSuggestionSheetState3 = routeSuggestionSheetState2;
                            function4 = function15;
                            str4 = (String) obj3;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState3;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function4;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str3;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str4;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 4;
                            objB3 = stringProvider2.b(StringEnum.DROP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                            if (objB3 == obj16) {
                                String str73 = str3;
                                str5 = str4;
                                obj4 = objB3;
                                routeSuggestionSheetState4 = routeSuggestionSheetState3;
                                function5 = function4;
                                str6 = str;
                                str7 = str73;
                                str8 = (String) obj4;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState4;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function5;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str6;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str7;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str5;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str8;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 5;
                                objB4 = stringProvider2.b(StringEnum.ENTER_DROP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                if (objB4 != obj16) {
                                    String str74 = str5;
                                    str9 = str8;
                                    obj5 = objB4;
                                    routeSuggestionSheetState5 = routeSuggestionSheetState4;
                                    function6 = function5;
                                    str10 = str6;
                                    str11 = str7;
                                    str12 = str74;
                                    str13 = (String) obj5;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState5;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function6;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str10;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str11;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str12;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str9;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str13;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 6;
                                    objB5 = stringProvider2.b(StringEnum.WHEN_DO_YOU_WANT_TO_REACH, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                    if (objB5 == obj16) {
                                        String str75 = str9;
                                        str14 = str13;
                                        obj6 = objB5;
                                        routeSuggestionSheetState6 = routeSuggestionSheetState5;
                                        function7 = function6;
                                        str15 = str10;
                                        str16 = str11;
                                        str17 = str12;
                                        str18 = str75;
                                        str19 = (String) obj6;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState6;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function7;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str15;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str16;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str17;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str18;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str14;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str19;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 7;
                                        objB6 = stringProvider2.b(StringEnum.ARRIVAL_TIME, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                        if (objB6 != obj16) {
                                            String str76 = str14;
                                            str20 = str19;
                                            obj7 = objB6;
                                            routeSuggestionSheetState7 = routeSuggestionSheetState6;
                                            function8 = function7;
                                            str21 = str15;
                                            str22 = str16;
                                            str23 = str17;
                                            str24 = str18;
                                            str25 = str76;
                                            str26 = (String) obj7;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState7;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function8;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str21;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str22;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str23;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str24;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str25;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str20;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str26;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 8;
                                            objB7 = stringProvider2.b(StringEnum.THANKS_FOR_THE_SUGGESTION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                            if (objB7 == obj16) {
                                                String str77 = str20;
                                                str27 = str26;
                                                obj8 = objB7;
                                                routeSuggestionSheetState8 = routeSuggestionSheetState7;
                                                function9 = function8;
                                                str28 = str21;
                                                str29 = str22;
                                                str30 = str23;
                                                str31 = str24;
                                                str32 = str25;
                                                str33 = str77;
                                                str34 = (String) obj8;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState8;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function9;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str28;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str29;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str30;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str31;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str32;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str33;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str27;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str34;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 9;
                                                objB8 = stringProvider2.b(StringEnum.ROUTE_SUGGESTION_SUCCESS_DESC, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                if (objB8 != obj16) {
                                                    routeSuggestionSheetState9 = routeSuggestionSheetState8;
                                                    function10 = function9;
                                                    str35 = str28;
                                                    str36 = str29;
                                                    str37 = str30;
                                                    str38 = str31;
                                                    str39 = str32;
                                                    str40 = str33;
                                                    str41 = str27;
                                                    str42 = str34;
                                                    obj9 = objB8;
                                                    str43 = (String) obj9;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str43;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 10;
                                                    objB9 = stringProvider2.b(StringEnum.SUBMIT_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                    obj16 = obj16;
                                                    if (objB9 != obj16) {
                                                        obj10 = objB9;
                                                        str44 = str43;
                                                        str45 = (String) obj10;
                                                        Object obj17 = obj16;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str44;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str45;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 11;
                                                        stringProvider = stringProvider2;
                                                        objB10 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                        obj11 = obj17;
                                                        if (objB10 != obj11) {
                                                            String str78 = str38;
                                                            str46 = str44;
                                                            str47 = str78;
                                                            str48 = str45;
                                                            obj12 = objB10;
                                                            String str79 = str37;
                                                            str49 = str42;
                                                            str50 = str79;
                                                            String str80 = str36;
                                                            str51 = str41;
                                                            str52 = str80;
                                                            String str81 = str35;
                                                            str53 = str40;
                                                            str54 = str81;
                                                            Function1 function16 = function10;
                                                            str55 = str39;
                                                            function11 = function16;
                                                            str56 = (String) obj12;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                                                            str57 = str47;
                                                            objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                            obj11 = obj11;
                                                            if (objB11 != obj11) {
                                                                str58 = str50;
                                                                str59 = str57;
                                                                str60 = str56;
                                                                obj13 = objB11;
                                                                str61 = str46;
                                                                str62 = str51;
                                                                str63 = str53;
                                                                str64 = str55;
                                                                str65 = str52;
                                                                str66 = str48;
                                                                function12 = function11;
                                                                str67 = (String) obj13;
                                                                z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                                                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                                                shadyGray = ChaloColorToken.ShadyGray.f9851a;
                                                                if (!z) {
                                                                    function13 = function12;
                                                                    if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                                                                }
                                                                form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                                                                pBStopPlaceSelectedAppModel = form.f3370a;
                                                                routeSuggestionReachByTime = form.c;
                                                                pBStopPlaceSelectedAppModel2 = form.b;
                                                                if (pBStopPlaceSelectedAppModel != null || pBStopPlaceSelectedAppModel2 == null || routeSuggestionReachByTime == null) {
                                                                    z2 = false;
                                                                } else {
                                                                    z2 = true;
                                                                }
                                                                chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                                                                imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                                                                IconType iconType = IconType.IC_LOCATION_PIN;
                                                                uITextStyle = UITextStyle.BodySmall;
                                                                if (pBStopPlaceSelectedAppModel != null) {
                                                                    str68 = pBStopPlaceSelectedAppModel.c;
                                                                } else {
                                                                    str68 = null;
                                                                }
                                                                if (pBStopPlaceSelectedAppModel != null) {
                                                                    str69 = pBStopPlaceSelectedAppModel.c;
                                                                } else {
                                                                    str69 = null;
                                                                }
                                                                almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                                                                if (str69 != null || str69.length() == 0) {
                                                                    chaloColorToken = almostBlackColor;
                                                                } else {
                                                                    chaloColorToken = shadyGray;
                                                                }
                                                                obj14 = obj11;
                                                                chaloBusRouteSuggestionFieldUiStateB = b(iconType, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                                                                if (pBStopPlaceSelectedAppModel2 != null) {
                                                                    str70 = pBStopPlaceSelectedAppModel2.c;
                                                                } else {
                                                                    str70 = null;
                                                                }
                                                                if (str70 != null || str70.length() == 0) {
                                                                    chaloColorToken2 = almostBlackColor;
                                                                } else {
                                                                    chaloColorToken2 = shadyGray;
                                                                }
                                                                if (pBStopPlaceSelectedAppModel2 != null) {
                                                                    str71 = pBStopPlaceSelectedAppModel2.c;
                                                                } else {
                                                                    str71 = null;
                                                                }
                                                                chaloBusRouteSuggestionFieldUiStateB2 = b(iconType, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                                                                IconType iconType2 = IconType.IC_SCHEDULE_CLOCK;
                                                                if (routeSuggestionReachByTime == null) {
                                                                    uITextStyle = UITextStyle.BodyLarge;
                                                                }
                                                                UITextStyle uITextStyle2 = uITextStyle;
                                                                timeUtilsContract = this.b;
                                                                if (routeSuggestionReachByTime != null) {
                                                                    strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                                                                } else {
                                                                    strL = null;
                                                                }
                                                                chaloBusRouteSuggestionFieldUiStateB3 = b(iconType2, str63, uITextStyle2, shadyGray, str62, strL, new fh(function12, 8));
                                                                UIShape.Rectangle rectangle = UIShape.e;
                                                                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle, z2, ChaloThemeHelper.a().n, 4);
                                                                function14 = function12;
                                                                buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle, false, 52);
                                                                if (form.d) {
                                                                    if (routeSuggestionReachByTime == null) {
                                                                        int iB = timeUtilsContract.B(null) / 60;
                                                                        i2 = iB / 60;
                                                                        int iC = timeUtilsContract.C(iB % 60);
                                                                        int iR = timeUtilsContract.r(i2);
                                                                        if (i2 < 12) {
                                                                            str72 = "AM";
                                                                        } else {
                                                                            str72 = "PM";
                                                                        }
                                                                        routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR, iC, str72);
                                                                    } else {
                                                                        routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                                                                    }
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                                                                    objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                                    if (objC == obj14) {
                                                                        return obj14;
                                                                    }
                                                                    chaloTextUIState = chaloTextUIStateF;
                                                                    obj15 = objC;
                                                                    buttonUIState = buttonUIStateG;
                                                                    chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                                                                    chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                                                                    chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                                                                    imageUIState2 = imageUIState;
                                                                    routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                                                                    chaloTextUIState2 = chaloTextUIState;
                                                                    buttonUIState2 = buttonUIState;
                                                                    chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                                                                    chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                                                                    chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                                                                    imageUIState3 = imageUIState2;
                                                                } else {
                                                                    buttonUIState2 = buttonUIStateG;
                                                                    chaloTextUIState2 = chaloTextUIStateF;
                                                                    chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                                                                    routeSuggestionTimePickerUIState = null;
                                                                    chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                                                                    imageUIState3 = imageUIState;
                                                                    chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                                                                }
                                                                return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                                                            }
                                                        }
                                                        return obj11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj16;
            case 1:
                obj = obj15;
                function2 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                RouteSuggestionSheetState routeSuggestionSheetState10 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj);
                routeSuggestionSheetState2 = routeSuggestionSheetState10;
                i = 0;
                str = (String) obj;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState2;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function2;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 2;
                objB = stringProvider2.b(StringEnum.PICKUP_LOCATION, new Object[i], chaloBusRouteInfoUiStateFactory$toUiState$9);
                if (objB == obj16) {
                    function3 = function2;
                    obj2 = objB;
                    str2 = (String) obj2;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState2;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function3;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str2;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 3;
                    objB2 = stringProvider2.b(StringEnum.ENTER_PICKUP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                    if (objB2 != obj16) {
                        Function1 function17 = function3;
                        str3 = str2;
                        obj3 = objB2;
                        routeSuggestionSheetState3 = routeSuggestionSheetState2;
                        function4 = function17;
                        str4 = (String) obj3;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState3;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function4;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str3;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str4;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 4;
                        objB3 = stringProvider2.b(StringEnum.DROP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                        if (objB3 == obj16) {
                            String str710 = str3;
                            str5 = str4;
                            obj4 = objB3;
                            routeSuggestionSheetState4 = routeSuggestionSheetState3;
                            function5 = function4;
                            str6 = str;
                            str7 = str710;
                            str8 = (String) obj4;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState4;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function5;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str6;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str7;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str5;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str8;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 5;
                            objB4 = stringProvider2.b(StringEnum.ENTER_DROP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                            if (objB4 != obj16) {
                                String str711 = str5;
                                str9 = str8;
                                obj5 = objB4;
                                routeSuggestionSheetState5 = routeSuggestionSheetState4;
                                function6 = function5;
                                str10 = str6;
                                str11 = str7;
                                str12 = str711;
                                str13 = (String) obj5;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState5;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function6;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str10;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str11;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str12;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str9;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str13;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 6;
                                objB5 = stringProvider2.b(StringEnum.WHEN_DO_YOU_WANT_TO_REACH, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                if (objB5 == obj16) {
                                    String str712 = str9;
                                    str14 = str13;
                                    obj6 = objB5;
                                    routeSuggestionSheetState6 = routeSuggestionSheetState5;
                                    function7 = function6;
                                    str15 = str10;
                                    str16 = str11;
                                    str17 = str12;
                                    str18 = str712;
                                    str19 = (String) obj6;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState6;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function7;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str15;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str16;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str17;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str18;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str14;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str19;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 7;
                                    objB6 = stringProvider2.b(StringEnum.ARRIVAL_TIME, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                    if (objB6 != obj16) {
                                        String str713 = str14;
                                        str20 = str19;
                                        obj7 = objB6;
                                        routeSuggestionSheetState7 = routeSuggestionSheetState6;
                                        function8 = function7;
                                        str21 = str15;
                                        str22 = str16;
                                        str23 = str17;
                                        str24 = str18;
                                        str25 = str713;
                                        str26 = (String) obj7;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState7;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function8;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str21;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str22;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str23;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str24;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str25;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str20;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str26;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 8;
                                        objB7 = stringProvider2.b(StringEnum.THANKS_FOR_THE_SUGGESTION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                        if (objB7 == obj16) {
                                            String str714 = str20;
                                            str27 = str26;
                                            obj8 = objB7;
                                            routeSuggestionSheetState8 = routeSuggestionSheetState7;
                                            function9 = function8;
                                            str28 = str21;
                                            str29 = str22;
                                            str30 = str23;
                                            str31 = str24;
                                            str32 = str25;
                                            str33 = str714;
                                            str34 = (String) obj8;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState8;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function9;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str28;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str29;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str30;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str31;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str32;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str33;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str27;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str34;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 9;
                                            objB8 = stringProvider2.b(StringEnum.ROUTE_SUGGESTION_SUCCESS_DESC, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                            if (objB8 != obj16) {
                                                routeSuggestionSheetState9 = routeSuggestionSheetState8;
                                                function10 = function9;
                                                str35 = str28;
                                                str36 = str29;
                                                str37 = str30;
                                                str38 = str31;
                                                str39 = str32;
                                                str40 = str33;
                                                str41 = str27;
                                                str42 = str34;
                                                obj9 = objB8;
                                                str43 = (String) obj9;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str43;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 10;
                                                objB9 = stringProvider2.b(StringEnum.SUBMIT_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                obj16 = obj16;
                                                if (objB9 != obj16) {
                                                    obj10 = objB9;
                                                    str44 = str43;
                                                    str45 = (String) obj10;
                                                    Object obj18 = obj16;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str44;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str45;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 11;
                                                    stringProvider = stringProvider2;
                                                    objB10 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                    obj11 = obj18;
                                                    if (objB10 != obj11) {
                                                        String str715 = str38;
                                                        str46 = str44;
                                                        str47 = str715;
                                                        str48 = str45;
                                                        obj12 = objB10;
                                                        String str716 = str37;
                                                        str49 = str42;
                                                        str50 = str716;
                                                        String str82 = str36;
                                                        str51 = str41;
                                                        str52 = str82;
                                                        String str83 = str35;
                                                        str53 = str40;
                                                        str54 = str83;
                                                        Function1 function18 = function10;
                                                        str55 = str39;
                                                        function11 = function18;
                                                        str56 = (String) obj12;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                                                        str57 = str47;
                                                        objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                        obj11 = obj11;
                                                        if (objB11 != obj11) {
                                                            str58 = str50;
                                                            str59 = str57;
                                                            str60 = str56;
                                                            obj13 = objB11;
                                                            str61 = str46;
                                                            str62 = str51;
                                                            str63 = str53;
                                                            str64 = str55;
                                                            str65 = str52;
                                                            str66 = str48;
                                                            function12 = function11;
                                                            str67 = (String) obj13;
                                                            z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                                                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                                            shadyGray = ChaloColorToken.ShadyGray.f9851a;
                                                            if (!z) {
                                                                function13 = function12;
                                                                if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                                                            }
                                                            form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                                                            pBStopPlaceSelectedAppModel = form.f3370a;
                                                            routeSuggestionReachByTime = form.c;
                                                            pBStopPlaceSelectedAppModel2 = form.b;
                                                            if (pBStopPlaceSelectedAppModel != null) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                                                            imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                                                            IconType iconType3 = IconType.IC_LOCATION_PIN;
                                                            uITextStyle = UITextStyle.BodySmall;
                                                            if (pBStopPlaceSelectedAppModel != null) {
                                                                str68 = pBStopPlaceSelectedAppModel.c;
                                                            } else {
                                                                str68 = null;
                                                            }
                                                            if (pBStopPlaceSelectedAppModel != null) {
                                                                str69 = pBStopPlaceSelectedAppModel.c;
                                                            } else {
                                                                str69 = null;
                                                            }
                                                            almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                                                            if (str69 != null) {
                                                                chaloColorToken = almostBlackColor;
                                                            } else {
                                                                chaloColorToken = almostBlackColor;
                                                            }
                                                            obj14 = obj11;
                                                            chaloBusRouteSuggestionFieldUiStateB = b(iconType3, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                                                            if (pBStopPlaceSelectedAppModel2 != null) {
                                                                str70 = pBStopPlaceSelectedAppModel2.c;
                                                            } else {
                                                                str70 = null;
                                                            }
                                                            if (str70 != null) {
                                                                chaloColorToken2 = almostBlackColor;
                                                            } else {
                                                                chaloColorToken2 = almostBlackColor;
                                                            }
                                                            if (pBStopPlaceSelectedAppModel2 != null) {
                                                                str71 = pBStopPlaceSelectedAppModel2.c;
                                                            } else {
                                                                str71 = null;
                                                            }
                                                            chaloBusRouteSuggestionFieldUiStateB2 = b(iconType3, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                                                            IconType iconType4 = IconType.IC_SCHEDULE_CLOCK;
                                                            if (routeSuggestionReachByTime == null) {
                                                                uITextStyle = UITextStyle.BodyLarge;
                                                            }
                                                            UITextStyle uITextStyle3 = uITextStyle;
                                                            timeUtilsContract = this.b;
                                                            if (routeSuggestionReachByTime != null) {
                                                                strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                                                            } else {
                                                                strL = null;
                                                            }
                                                            chaloBusRouteSuggestionFieldUiStateB3 = b(iconType4, str63, uITextStyle3, shadyGray, str62, strL, new fh(function12, 8));
                                                            UIShape.Rectangle rectangle2 = UIShape.e;
                                                            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle2, z2, ChaloThemeHelper.a().n, 4);
                                                            function14 = function12;
                                                            buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle2, false, 52);
                                                            if (form.d) {
                                                                buttonUIState2 = buttonUIStateG;
                                                                chaloTextUIState2 = chaloTextUIStateF;
                                                                chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                                                                routeSuggestionTimePickerUIState = null;
                                                                chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                                                                imageUIState3 = imageUIState;
                                                                chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                                                            } else {
                                                                if (routeSuggestionReachByTime == null) {
                                                                    int iB2 = timeUtilsContract.B(null) / 60;
                                                                    i2 = iB2 / 60;
                                                                    int iC2 = timeUtilsContract.C(iB2 % 60);
                                                                    int iR2 = timeUtilsContract.r(i2);
                                                                    if (i2 < 12) {
                                                                        str72 = "AM";
                                                                    } else {
                                                                        str72 = "PM";
                                                                    }
                                                                    routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR2, iC2, str72);
                                                                } else {
                                                                    routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                                                                }
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                                                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                                                                objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                                if (objC == obj14) {
                                                                    return obj14;
                                                                }
                                                                chaloTextUIState = chaloTextUIStateF;
                                                                obj15 = objC;
                                                                buttonUIState = buttonUIStateG;
                                                                chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                                                                chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                                                                chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                                                                imageUIState2 = imageUIState;
                                                                routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                                                                chaloTextUIState2 = chaloTextUIState;
                                                                buttonUIState2 = buttonUIState;
                                                                chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                                                                chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                                                                chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                                                                imageUIState3 = imageUIState2;
                                                            }
                                                            return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                                                        }
                                                    }
                                                    return obj11;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj16;
            case 2:
                String str84 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                function3 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                RouteSuggestionSheetState routeSuggestionSheetState11 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                routeSuggestionSheetState2 = routeSuggestionSheetState11;
                str = str84;
                obj2 = obj15;
                str2 = (String) obj2;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState2;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function3;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str2;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 3;
                objB2 = stringProvider2.b(StringEnum.ENTER_PICKUP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                if (objB2 != obj16) {
                    Function1 function19 = function3;
                    str3 = str2;
                    obj3 = objB2;
                    routeSuggestionSheetState3 = routeSuggestionSheetState2;
                    function4 = function19;
                    str4 = (String) obj3;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState3;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function4;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str3;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str4;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 4;
                    objB3 = stringProvider2.b(StringEnum.DROP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                    if (objB3 == obj16) {
                        String str717 = str3;
                        str5 = str4;
                        obj4 = objB3;
                        routeSuggestionSheetState4 = routeSuggestionSheetState3;
                        function5 = function4;
                        str6 = str;
                        str7 = str717;
                        str8 = (String) obj4;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState4;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function5;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str6;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str7;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str5;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str8;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 5;
                        objB4 = stringProvider2.b(StringEnum.ENTER_DROP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                        if (objB4 != obj16) {
                            String str718 = str5;
                            str9 = str8;
                            obj5 = objB4;
                            routeSuggestionSheetState5 = routeSuggestionSheetState4;
                            function6 = function5;
                            str10 = str6;
                            str11 = str7;
                            str12 = str718;
                            str13 = (String) obj5;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState5;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function6;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str10;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str11;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str12;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str9;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str13;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 6;
                            objB5 = stringProvider2.b(StringEnum.WHEN_DO_YOU_WANT_TO_REACH, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                            if (objB5 == obj16) {
                                String str719 = str9;
                                str14 = str13;
                                obj6 = objB5;
                                routeSuggestionSheetState6 = routeSuggestionSheetState5;
                                function7 = function6;
                                str15 = str10;
                                str16 = str11;
                                str17 = str12;
                                str18 = str719;
                                str19 = (String) obj6;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState6;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function7;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str15;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str16;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str17;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str18;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str14;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str19;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 7;
                                objB6 = stringProvider2.b(StringEnum.ARRIVAL_TIME, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                if (objB6 != obj16) {
                                    String str7110 = str14;
                                    str20 = str19;
                                    obj7 = objB6;
                                    routeSuggestionSheetState7 = routeSuggestionSheetState6;
                                    function8 = function7;
                                    str21 = str15;
                                    str22 = str16;
                                    str23 = str17;
                                    str24 = str18;
                                    str25 = str7110;
                                    str26 = (String) obj7;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState7;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function8;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str21;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str22;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str23;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str24;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str25;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str20;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str26;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 8;
                                    objB7 = stringProvider2.b(StringEnum.THANKS_FOR_THE_SUGGESTION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                    if (objB7 == obj16) {
                                        String str7111 = str20;
                                        str27 = str26;
                                        obj8 = objB7;
                                        routeSuggestionSheetState8 = routeSuggestionSheetState7;
                                        function9 = function8;
                                        str28 = str21;
                                        str29 = str22;
                                        str30 = str23;
                                        str31 = str24;
                                        str32 = str25;
                                        str33 = str7111;
                                        str34 = (String) obj8;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState8;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function9;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str28;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str29;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str30;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str31;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str32;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str33;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str27;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str34;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 9;
                                        objB8 = stringProvider2.b(StringEnum.ROUTE_SUGGESTION_SUCCESS_DESC, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                        if (objB8 != obj16) {
                                            routeSuggestionSheetState9 = routeSuggestionSheetState8;
                                            function10 = function9;
                                            str35 = str28;
                                            str36 = str29;
                                            str37 = str30;
                                            str38 = str31;
                                            str39 = str32;
                                            str40 = str33;
                                            str41 = str27;
                                            str42 = str34;
                                            obj9 = objB8;
                                            str43 = (String) obj9;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str43;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 10;
                                            objB9 = stringProvider2.b(StringEnum.SUBMIT_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                            obj16 = obj16;
                                            if (objB9 != obj16) {
                                                obj10 = objB9;
                                                str44 = str43;
                                                str45 = (String) obj10;
                                                Object obj19 = obj16;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str44;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str45;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 11;
                                                stringProvider = stringProvider2;
                                                objB10 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                obj11 = obj19;
                                                if (objB10 != obj11) {
                                                    String str7112 = str38;
                                                    str46 = str44;
                                                    str47 = str7112;
                                                    str48 = str45;
                                                    obj12 = objB10;
                                                    String str7113 = str37;
                                                    str49 = str42;
                                                    str50 = str7113;
                                                    String str85 = str36;
                                                    str51 = str41;
                                                    str52 = str85;
                                                    String str86 = str35;
                                                    str53 = str40;
                                                    str54 = str86;
                                                    Function1 function110 = function10;
                                                    str55 = str39;
                                                    function11 = function110;
                                                    str56 = (String) obj12;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                                                    str57 = str47;
                                                    objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                    obj11 = obj11;
                                                    if (objB11 != obj11) {
                                                        str58 = str50;
                                                        str59 = str57;
                                                        str60 = str56;
                                                        obj13 = objB11;
                                                        str61 = str46;
                                                        str62 = str51;
                                                        str63 = str53;
                                                        str64 = str55;
                                                        str65 = str52;
                                                        str66 = str48;
                                                        function12 = function11;
                                                        str67 = (String) obj13;
                                                        z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                                                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                                        shadyGray = ChaloColorToken.ShadyGray.f9851a;
                                                        if (!z) {
                                                            function13 = function12;
                                                            if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                                                        }
                                                        form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                                                        pBStopPlaceSelectedAppModel = form.f3370a;
                                                        routeSuggestionReachByTime = form.c;
                                                        pBStopPlaceSelectedAppModel2 = form.b;
                                                        if (pBStopPlaceSelectedAppModel != null) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                                                        imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                                                        IconType iconType5 = IconType.IC_LOCATION_PIN;
                                                        uITextStyle = UITextStyle.BodySmall;
                                                        if (pBStopPlaceSelectedAppModel != null) {
                                                            str68 = pBStopPlaceSelectedAppModel.c;
                                                        } else {
                                                            str68 = null;
                                                        }
                                                        if (pBStopPlaceSelectedAppModel != null) {
                                                            str69 = pBStopPlaceSelectedAppModel.c;
                                                        } else {
                                                            str69 = null;
                                                        }
                                                        almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                                                        if (str69 != null) {
                                                            chaloColorToken = almostBlackColor;
                                                        } else {
                                                            chaloColorToken = almostBlackColor;
                                                        }
                                                        obj14 = obj11;
                                                        chaloBusRouteSuggestionFieldUiStateB = b(iconType5, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                                                        if (pBStopPlaceSelectedAppModel2 != null) {
                                                            str70 = pBStopPlaceSelectedAppModel2.c;
                                                        } else {
                                                            str70 = null;
                                                        }
                                                        if (str70 != null) {
                                                            chaloColorToken2 = almostBlackColor;
                                                        } else {
                                                            chaloColorToken2 = almostBlackColor;
                                                        }
                                                        if (pBStopPlaceSelectedAppModel2 != null) {
                                                            str71 = pBStopPlaceSelectedAppModel2.c;
                                                        } else {
                                                            str71 = null;
                                                        }
                                                        chaloBusRouteSuggestionFieldUiStateB2 = b(iconType5, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                                                        IconType iconType6 = IconType.IC_SCHEDULE_CLOCK;
                                                        if (routeSuggestionReachByTime == null) {
                                                            uITextStyle = UITextStyle.BodyLarge;
                                                        }
                                                        UITextStyle uITextStyle4 = uITextStyle;
                                                        timeUtilsContract = this.b;
                                                        if (routeSuggestionReachByTime != null) {
                                                            strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                                                        } else {
                                                            strL = null;
                                                        }
                                                        chaloBusRouteSuggestionFieldUiStateB3 = b(iconType6, str63, uITextStyle4, shadyGray, str62, strL, new fh(function12, 8));
                                                        UIShape.Rectangle rectangle3 = UIShape.e;
                                                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle3, z2, ChaloThemeHelper.a().n, 4);
                                                        function14 = function12;
                                                        buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle3, false, 52);
                                                        if (form.d) {
                                                            buttonUIState2 = buttonUIStateG;
                                                            chaloTextUIState2 = chaloTextUIStateF;
                                                            chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                                                            routeSuggestionTimePickerUIState = null;
                                                            chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                                                            imageUIState3 = imageUIState;
                                                            chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                                                        } else {
                                                            if (routeSuggestionReachByTime == null) {
                                                                int iB3 = timeUtilsContract.B(null) / 60;
                                                                i2 = iB3 / 60;
                                                                int iC3 = timeUtilsContract.C(iB3 % 60);
                                                                int iR3 = timeUtilsContract.r(i2);
                                                                if (i2 < 12) {
                                                                    str72 = "AM";
                                                                } else {
                                                                    str72 = "PM";
                                                                }
                                                                routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR3, iC3, str72);
                                                            } else {
                                                                routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                                                            }
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                                                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                                                            objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                            if (objC == obj14) {
                                                                return obj14;
                                                            }
                                                            chaloTextUIState = chaloTextUIStateF;
                                                            obj15 = objC;
                                                            buttonUIState = buttonUIStateG;
                                                            chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                                                            chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                                                            chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                                                            imageUIState2 = imageUIState;
                                                            routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                                                            chaloTextUIState2 = chaloTextUIState;
                                                            buttonUIState2 = buttonUIState;
                                                            chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                                                            chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                                                            chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                                                            imageUIState3 = imageUIState2;
                                                        }
                                                        return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                                                    }
                                                }
                                                return obj11;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj16;
            case 3:
                String str87 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$3;
                String str88 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                Function1 function20 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                RouteSuggestionSheetState routeSuggestionSheetState12 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                routeSuggestionSheetState3 = routeSuggestionSheetState12;
                function4 = function20;
                str = str88;
                str3 = str87;
                obj3 = obj15;
                str4 = (String) obj3;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState3;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function4;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str3;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str4;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 4;
                objB3 = stringProvider2.b(StringEnum.DROP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                if (objB3 == obj16) {
                    String str7114 = str3;
                    str5 = str4;
                    obj4 = objB3;
                    routeSuggestionSheetState4 = routeSuggestionSheetState3;
                    function5 = function4;
                    str6 = str;
                    str7 = str7114;
                    str8 = (String) obj4;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState4;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function5;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str6;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str7;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str5;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str8;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 5;
                    objB4 = stringProvider2.b(StringEnum.ENTER_DROP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                    if (objB4 != obj16) {
                        String str7115 = str5;
                        str9 = str8;
                        obj5 = objB4;
                        routeSuggestionSheetState5 = routeSuggestionSheetState4;
                        function6 = function5;
                        str10 = str6;
                        str11 = str7;
                        str12 = str7115;
                        str13 = (String) obj5;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState5;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function6;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str10;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str11;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str12;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str9;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str13;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 6;
                        objB5 = stringProvider2.b(StringEnum.WHEN_DO_YOU_WANT_TO_REACH, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                        if (objB5 == obj16) {
                            String str7116 = str9;
                            str14 = str13;
                            obj6 = objB5;
                            routeSuggestionSheetState6 = routeSuggestionSheetState5;
                            function7 = function6;
                            str15 = str10;
                            str16 = str11;
                            str17 = str12;
                            str18 = str7116;
                            str19 = (String) obj6;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState6;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function7;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str15;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str16;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str17;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str18;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str14;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str19;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 7;
                            objB6 = stringProvider2.b(StringEnum.ARRIVAL_TIME, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                            if (objB6 != obj16) {
                                String str7117 = str14;
                                str20 = str19;
                                obj7 = objB6;
                                routeSuggestionSheetState7 = routeSuggestionSheetState6;
                                function8 = function7;
                                str21 = str15;
                                str22 = str16;
                                str23 = str17;
                                str24 = str18;
                                str25 = str7117;
                                str26 = (String) obj7;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState7;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function8;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str21;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str22;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str23;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str24;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str25;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str20;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str26;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 8;
                                objB7 = stringProvider2.b(StringEnum.THANKS_FOR_THE_SUGGESTION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                if (objB7 == obj16) {
                                    String str7118 = str20;
                                    str27 = str26;
                                    obj8 = objB7;
                                    routeSuggestionSheetState8 = routeSuggestionSheetState7;
                                    function9 = function8;
                                    str28 = str21;
                                    str29 = str22;
                                    str30 = str23;
                                    str31 = str24;
                                    str32 = str25;
                                    str33 = str7118;
                                    str34 = (String) obj8;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState8;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function9;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str28;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str29;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str30;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str31;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str32;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str33;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str27;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str34;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 9;
                                    objB8 = stringProvider2.b(StringEnum.ROUTE_SUGGESTION_SUCCESS_DESC, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                    if (objB8 != obj16) {
                                        routeSuggestionSheetState9 = routeSuggestionSheetState8;
                                        function10 = function9;
                                        str35 = str28;
                                        str36 = str29;
                                        str37 = str30;
                                        str38 = str31;
                                        str39 = str32;
                                        str40 = str33;
                                        str41 = str27;
                                        str42 = str34;
                                        obj9 = objB8;
                                        str43 = (String) obj9;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str43;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 10;
                                        objB9 = stringProvider2.b(StringEnum.SUBMIT_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                        obj16 = obj16;
                                        if (objB9 != obj16) {
                                            obj10 = objB9;
                                            str44 = str43;
                                            str45 = (String) obj10;
                                            Object obj110 = obj16;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str44;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str45;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 11;
                                            stringProvider = stringProvider2;
                                            objB10 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                            obj11 = obj110;
                                            if (objB10 != obj11) {
                                                String str7119 = str38;
                                                str46 = str44;
                                                str47 = str7119;
                                                str48 = str45;
                                                obj12 = objB10;
                                                String str71110 = str37;
                                                str49 = str42;
                                                str50 = str71110;
                                                String str89 = str36;
                                                str51 = str41;
                                                str52 = str89;
                                                String str810 = str35;
                                                str53 = str40;
                                                str54 = str810;
                                                Function1 function111 = function10;
                                                str55 = str39;
                                                function11 = function111;
                                                str56 = (String) obj12;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                                                str57 = str47;
                                                objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                obj11 = obj11;
                                                if (objB11 != obj11) {
                                                    str58 = str50;
                                                    str59 = str57;
                                                    str60 = str56;
                                                    obj13 = objB11;
                                                    str61 = str46;
                                                    str62 = str51;
                                                    str63 = str53;
                                                    str64 = str55;
                                                    str65 = str52;
                                                    str66 = str48;
                                                    function12 = function11;
                                                    str67 = (String) obj13;
                                                    z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                                                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                                    shadyGray = ChaloColorToken.ShadyGray.f9851a;
                                                    if (!z) {
                                                        function13 = function12;
                                                        if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                                                    }
                                                    form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                                                    pBStopPlaceSelectedAppModel = form.f3370a;
                                                    routeSuggestionReachByTime = form.c;
                                                    pBStopPlaceSelectedAppModel2 = form.b;
                                                    if (pBStopPlaceSelectedAppModel != null) {
                                                        z2 = false;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                                                    imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                                                    IconType iconType7 = IconType.IC_LOCATION_PIN;
                                                    uITextStyle = UITextStyle.BodySmall;
                                                    if (pBStopPlaceSelectedAppModel != null) {
                                                        str68 = pBStopPlaceSelectedAppModel.c;
                                                    } else {
                                                        str68 = null;
                                                    }
                                                    if (pBStopPlaceSelectedAppModel != null) {
                                                        str69 = pBStopPlaceSelectedAppModel.c;
                                                    } else {
                                                        str69 = null;
                                                    }
                                                    almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                                                    if (str69 != null) {
                                                        chaloColorToken = almostBlackColor;
                                                    } else {
                                                        chaloColorToken = almostBlackColor;
                                                    }
                                                    obj14 = obj11;
                                                    chaloBusRouteSuggestionFieldUiStateB = b(iconType7, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                                                    if (pBStopPlaceSelectedAppModel2 != null) {
                                                        str70 = pBStopPlaceSelectedAppModel2.c;
                                                    } else {
                                                        str70 = null;
                                                    }
                                                    if (str70 != null) {
                                                        chaloColorToken2 = almostBlackColor;
                                                    } else {
                                                        chaloColorToken2 = almostBlackColor;
                                                    }
                                                    if (pBStopPlaceSelectedAppModel2 != null) {
                                                        str71 = pBStopPlaceSelectedAppModel2.c;
                                                    } else {
                                                        str71 = null;
                                                    }
                                                    chaloBusRouteSuggestionFieldUiStateB2 = b(iconType7, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                                                    IconType iconType8 = IconType.IC_SCHEDULE_CLOCK;
                                                    if (routeSuggestionReachByTime == null) {
                                                        uITextStyle = UITextStyle.BodyLarge;
                                                    }
                                                    UITextStyle uITextStyle5 = uITextStyle;
                                                    timeUtilsContract = this.b;
                                                    if (routeSuggestionReachByTime != null) {
                                                        strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                                                    } else {
                                                        strL = null;
                                                    }
                                                    chaloBusRouteSuggestionFieldUiStateB3 = b(iconType8, str63, uITextStyle5, shadyGray, str62, strL, new fh(function12, 8));
                                                    UIShape.Rectangle rectangle4 = UIShape.e;
                                                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle4, z2, ChaloThemeHelper.a().n, 4);
                                                    function14 = function12;
                                                    buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle4, false, 52);
                                                    if (form.d) {
                                                        buttonUIState2 = buttonUIStateG;
                                                        chaloTextUIState2 = chaloTextUIStateF;
                                                        chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                                                        routeSuggestionTimePickerUIState = null;
                                                        chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                                                        imageUIState3 = imageUIState;
                                                        chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                                                    } else {
                                                        if (routeSuggestionReachByTime == null) {
                                                            int iB4 = timeUtilsContract.B(null) / 60;
                                                            i2 = iB4 / 60;
                                                            int iC4 = timeUtilsContract.C(iB4 % 60);
                                                            int iR4 = timeUtilsContract.r(i2);
                                                            if (i2 < 12) {
                                                                str72 = "AM";
                                                            } else {
                                                                str72 = "PM";
                                                            }
                                                            routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR4, iC4, str72);
                                                        } else {
                                                            routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                                                        }
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                                                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                                                        objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                        if (objC == obj14) {
                                                            return obj14;
                                                        }
                                                        chaloTextUIState = chaloTextUIStateF;
                                                        obj15 = objC;
                                                        buttonUIState = buttonUIStateG;
                                                        chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                                                        chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                                                        chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                                                        imageUIState2 = imageUIState;
                                                        routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                                                        chaloTextUIState2 = chaloTextUIState;
                                                        buttonUIState2 = buttonUIState;
                                                        chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                                                        chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                                                        chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                                                        imageUIState3 = imageUIState2;
                                                    }
                                                    return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                                                }
                                            }
                                            return obj11;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj16;
            case 4:
                String str90 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$4;
                String str91 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$3;
                String str92 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                Function1 function21 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                RouteSuggestionSheetState routeSuggestionSheetState13 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                routeSuggestionSheetState4 = routeSuggestionSheetState13;
                function5 = function21;
                str6 = str92;
                str7 = str91;
                str5 = str90;
                obj4 = obj15;
                str8 = (String) obj4;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState4;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function5;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str6;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str7;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str5;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str8;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 5;
                objB4 = stringProvider2.b(StringEnum.ENTER_DROP_LOCATION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                if (objB4 != obj16) {
                    String str71111 = str5;
                    str9 = str8;
                    obj5 = objB4;
                    routeSuggestionSheetState5 = routeSuggestionSheetState4;
                    function6 = function5;
                    str10 = str6;
                    str11 = str7;
                    str12 = str71111;
                    str13 = (String) obj5;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState5;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function6;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str10;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str11;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str12;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str9;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str13;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 6;
                    objB5 = stringProvider2.b(StringEnum.WHEN_DO_YOU_WANT_TO_REACH, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                    if (objB5 == obj16) {
                        String str71112 = str9;
                        str14 = str13;
                        obj6 = objB5;
                        routeSuggestionSheetState6 = routeSuggestionSheetState5;
                        function7 = function6;
                        str15 = str10;
                        str16 = str11;
                        str17 = str12;
                        str18 = str71112;
                        str19 = (String) obj6;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState6;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function7;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str15;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str16;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str17;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str18;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str14;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str19;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 7;
                        objB6 = stringProvider2.b(StringEnum.ARRIVAL_TIME, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                        if (objB6 != obj16) {
                            String str71113 = str14;
                            str20 = str19;
                            obj7 = objB6;
                            routeSuggestionSheetState7 = routeSuggestionSheetState6;
                            function8 = function7;
                            str21 = str15;
                            str22 = str16;
                            str23 = str17;
                            str24 = str18;
                            str25 = str71113;
                            str26 = (String) obj7;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState7;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function8;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str21;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str22;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str23;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str24;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str25;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str20;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str26;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 8;
                            objB7 = stringProvider2.b(StringEnum.THANKS_FOR_THE_SUGGESTION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                            if (objB7 == obj16) {
                                String str71114 = str20;
                                str27 = str26;
                                obj8 = objB7;
                                routeSuggestionSheetState8 = routeSuggestionSheetState7;
                                function9 = function8;
                                str28 = str21;
                                str29 = str22;
                                str30 = str23;
                                str31 = str24;
                                str32 = str25;
                                str33 = str71114;
                                str34 = (String) obj8;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState8;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function9;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str28;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str29;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str30;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str31;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str32;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str33;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str27;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str34;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 9;
                                objB8 = stringProvider2.b(StringEnum.ROUTE_SUGGESTION_SUCCESS_DESC, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                if (objB8 != obj16) {
                                    routeSuggestionSheetState9 = routeSuggestionSheetState8;
                                    function10 = function9;
                                    str35 = str28;
                                    str36 = str29;
                                    str37 = str30;
                                    str38 = str31;
                                    str39 = str32;
                                    str40 = str33;
                                    str41 = str27;
                                    str42 = str34;
                                    obj9 = objB8;
                                    str43 = (String) obj9;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str43;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 10;
                                    objB9 = stringProvider2.b(StringEnum.SUBMIT_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                    obj16 = obj16;
                                    if (objB9 != obj16) {
                                        obj10 = objB9;
                                        str44 = str43;
                                        str45 = (String) obj10;
                                        Object obj111 = obj16;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str44;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str45;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 11;
                                        stringProvider = stringProvider2;
                                        objB10 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                        obj11 = obj111;
                                        if (objB10 != obj11) {
                                            String str71115 = str38;
                                            str46 = str44;
                                            str47 = str71115;
                                            str48 = str45;
                                            obj12 = objB10;
                                            String str71116 = str37;
                                            str49 = str42;
                                            str50 = str71116;
                                            String str811 = str36;
                                            str51 = str41;
                                            str52 = str811;
                                            String str812 = str35;
                                            str53 = str40;
                                            str54 = str812;
                                            Function1 function112 = function10;
                                            str55 = str39;
                                            function11 = function112;
                                            str56 = (String) obj12;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                                            str57 = str47;
                                            objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                            obj11 = obj11;
                                            if (objB11 != obj11) {
                                                str58 = str50;
                                                str59 = str57;
                                                str60 = str56;
                                                obj13 = objB11;
                                                str61 = str46;
                                                str62 = str51;
                                                str63 = str53;
                                                str64 = str55;
                                                str65 = str52;
                                                str66 = str48;
                                                function12 = function11;
                                                str67 = (String) obj13;
                                                z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                                shadyGray = ChaloColorToken.ShadyGray.f9851a;
                                                if (!z) {
                                                    function13 = function12;
                                                    if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                                                }
                                                form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                                                pBStopPlaceSelectedAppModel = form.f3370a;
                                                routeSuggestionReachByTime = form.c;
                                                pBStopPlaceSelectedAppModel2 = form.b;
                                                if (pBStopPlaceSelectedAppModel != null) {
                                                    z2 = false;
                                                } else {
                                                    z2 = false;
                                                }
                                                chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                                                imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                                                IconType iconType9 = IconType.IC_LOCATION_PIN;
                                                uITextStyle = UITextStyle.BodySmall;
                                                if (pBStopPlaceSelectedAppModel != null) {
                                                    str68 = pBStopPlaceSelectedAppModel.c;
                                                } else {
                                                    str68 = null;
                                                }
                                                if (pBStopPlaceSelectedAppModel != null) {
                                                    str69 = pBStopPlaceSelectedAppModel.c;
                                                } else {
                                                    str69 = null;
                                                }
                                                almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                                                if (str69 != null) {
                                                    chaloColorToken = almostBlackColor;
                                                } else {
                                                    chaloColorToken = almostBlackColor;
                                                }
                                                obj14 = obj11;
                                                chaloBusRouteSuggestionFieldUiStateB = b(iconType9, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                                                if (pBStopPlaceSelectedAppModel2 != null) {
                                                    str70 = pBStopPlaceSelectedAppModel2.c;
                                                } else {
                                                    str70 = null;
                                                }
                                                if (str70 != null) {
                                                    chaloColorToken2 = almostBlackColor;
                                                } else {
                                                    chaloColorToken2 = almostBlackColor;
                                                }
                                                if (pBStopPlaceSelectedAppModel2 != null) {
                                                    str71 = pBStopPlaceSelectedAppModel2.c;
                                                } else {
                                                    str71 = null;
                                                }
                                                chaloBusRouteSuggestionFieldUiStateB2 = b(iconType9, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                                                IconType iconType10 = IconType.IC_SCHEDULE_CLOCK;
                                                if (routeSuggestionReachByTime == null) {
                                                    uITextStyle = UITextStyle.BodyLarge;
                                                }
                                                UITextStyle uITextStyle6 = uITextStyle;
                                                timeUtilsContract = this.b;
                                                if (routeSuggestionReachByTime != null) {
                                                    strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                                                } else {
                                                    strL = null;
                                                }
                                                chaloBusRouteSuggestionFieldUiStateB3 = b(iconType10, str63, uITextStyle6, shadyGray, str62, strL, new fh(function12, 8));
                                                UIShape.Rectangle rectangle5 = UIShape.e;
                                                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle5, z2, ChaloThemeHelper.a().n, 4);
                                                function14 = function12;
                                                buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle5, false, 52);
                                                if (form.d) {
                                                    buttonUIState2 = buttonUIStateG;
                                                    chaloTextUIState2 = chaloTextUIStateF;
                                                    chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                                                    routeSuggestionTimePickerUIState = null;
                                                    chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                                                    imageUIState3 = imageUIState;
                                                    chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                                                } else {
                                                    if (routeSuggestionReachByTime == null) {
                                                        int iB5 = timeUtilsContract.B(null) / 60;
                                                        i2 = iB5 / 60;
                                                        int iC5 = timeUtilsContract.C(iB5 % 60);
                                                        int iR5 = timeUtilsContract.r(i2);
                                                        if (i2 < 12) {
                                                            str72 = "AM";
                                                        } else {
                                                            str72 = "PM";
                                                        }
                                                        routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR5, iC5, str72);
                                                    } else {
                                                        routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                                                    }
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                                                    objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                    if (objC == obj14) {
                                                        return obj14;
                                                    }
                                                    chaloTextUIState = chaloTextUIStateF;
                                                    obj15 = objC;
                                                    buttonUIState = buttonUIStateG;
                                                    chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                                                    chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                                                    chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                                                    imageUIState2 = imageUIState;
                                                    routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                                                    chaloTextUIState2 = chaloTextUIState;
                                                    buttonUIState2 = buttonUIState;
                                                    chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                                                    chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                                                    chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                                                    imageUIState3 = imageUIState2;
                                                }
                                                return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                                            }
                                        }
                                        return obj11;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj16;
            case 5:
                String str93 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$5;
                String str94 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$4;
                String str95 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$3;
                String str96 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                Function1 function22 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                RouteSuggestionSheetState routeSuggestionSheetState14 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                routeSuggestionSheetState5 = routeSuggestionSheetState14;
                function6 = function22;
                str10 = str96;
                str11 = str95;
                str12 = str94;
                str9 = str93;
                obj5 = obj15;
                str13 = (String) obj5;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState5;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function6;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str10;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str11;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str12;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str9;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str13;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 6;
                objB5 = stringProvider2.b(StringEnum.WHEN_DO_YOU_WANT_TO_REACH, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                if (objB5 == obj16) {
                    String str71117 = str9;
                    str14 = str13;
                    obj6 = objB5;
                    routeSuggestionSheetState6 = routeSuggestionSheetState5;
                    function7 = function6;
                    str15 = str10;
                    str16 = str11;
                    str17 = str12;
                    str18 = str71117;
                    str19 = (String) obj6;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState6;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function7;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str15;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str16;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str17;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str18;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str14;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str19;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 7;
                    objB6 = stringProvider2.b(StringEnum.ARRIVAL_TIME, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                    if (objB6 != obj16) {
                        String str71118 = str14;
                        str20 = str19;
                        obj7 = objB6;
                        routeSuggestionSheetState7 = routeSuggestionSheetState6;
                        function8 = function7;
                        str21 = str15;
                        str22 = str16;
                        str23 = str17;
                        str24 = str18;
                        str25 = str71118;
                        str26 = (String) obj7;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState7;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function8;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str21;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str22;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str23;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str24;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str25;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str20;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str26;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 8;
                        objB7 = stringProvider2.b(StringEnum.THANKS_FOR_THE_SUGGESTION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                        if (objB7 == obj16) {
                            String str71119 = str20;
                            str27 = str26;
                            obj8 = objB7;
                            routeSuggestionSheetState8 = routeSuggestionSheetState7;
                            function9 = function8;
                            str28 = str21;
                            str29 = str22;
                            str30 = str23;
                            str31 = str24;
                            str32 = str25;
                            str33 = str71119;
                            str34 = (String) obj8;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState8;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function9;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str28;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str29;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str30;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str31;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str32;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str33;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str27;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str34;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 9;
                            objB8 = stringProvider2.b(StringEnum.ROUTE_SUGGESTION_SUCCESS_DESC, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                            if (objB8 != obj16) {
                                routeSuggestionSheetState9 = routeSuggestionSheetState8;
                                function10 = function9;
                                str35 = str28;
                                str36 = str29;
                                str37 = str30;
                                str38 = str31;
                                str39 = str32;
                                str40 = str33;
                                str41 = str27;
                                str42 = str34;
                                obj9 = objB8;
                                str43 = (String) obj9;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str43;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 10;
                                objB9 = stringProvider2.b(StringEnum.SUBMIT_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                obj16 = obj16;
                                if (objB9 != obj16) {
                                    obj10 = objB9;
                                    str44 = str43;
                                    str45 = (String) obj10;
                                    Object obj112 = obj16;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str44;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str45;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 11;
                                    stringProvider = stringProvider2;
                                    objB10 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                    obj11 = obj112;
                                    if (objB10 != obj11) {
                                        String str711110 = str38;
                                        str46 = str44;
                                        str47 = str711110;
                                        str48 = str45;
                                        obj12 = objB10;
                                        String str711111 = str37;
                                        str49 = str42;
                                        str50 = str711111;
                                        String str813 = str36;
                                        str51 = str41;
                                        str52 = str813;
                                        String str814 = str35;
                                        str53 = str40;
                                        str54 = str814;
                                        Function1 function113 = function10;
                                        str55 = str39;
                                        function11 = function113;
                                        str56 = (String) obj12;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                                        str57 = str47;
                                        objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                        obj11 = obj11;
                                        if (objB11 != obj11) {
                                            str58 = str50;
                                            str59 = str57;
                                            str60 = str56;
                                            obj13 = objB11;
                                            str61 = str46;
                                            str62 = str51;
                                            str63 = str53;
                                            str64 = str55;
                                            str65 = str52;
                                            str66 = str48;
                                            function12 = function11;
                                            str67 = (String) obj13;
                                            z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                            shadyGray = ChaloColorToken.ShadyGray.f9851a;
                                            if (!z) {
                                                function13 = function12;
                                                if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                                            }
                                            form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                                            pBStopPlaceSelectedAppModel = form.f3370a;
                                            routeSuggestionReachByTime = form.c;
                                            pBStopPlaceSelectedAppModel2 = form.b;
                                            if (pBStopPlaceSelectedAppModel != null) {
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                            }
                                            chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                                            imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                                            IconType iconType11 = IconType.IC_LOCATION_PIN;
                                            uITextStyle = UITextStyle.BodySmall;
                                            if (pBStopPlaceSelectedAppModel != null) {
                                                str68 = pBStopPlaceSelectedAppModel.c;
                                            } else {
                                                str68 = null;
                                            }
                                            if (pBStopPlaceSelectedAppModel != null) {
                                                str69 = pBStopPlaceSelectedAppModel.c;
                                            } else {
                                                str69 = null;
                                            }
                                            almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                                            if (str69 != null) {
                                                chaloColorToken = almostBlackColor;
                                            } else {
                                                chaloColorToken = almostBlackColor;
                                            }
                                            obj14 = obj11;
                                            chaloBusRouteSuggestionFieldUiStateB = b(iconType11, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                                            if (pBStopPlaceSelectedAppModel2 != null) {
                                                str70 = pBStopPlaceSelectedAppModel2.c;
                                            } else {
                                                str70 = null;
                                            }
                                            if (str70 != null) {
                                                chaloColorToken2 = almostBlackColor;
                                            } else {
                                                chaloColorToken2 = almostBlackColor;
                                            }
                                            if (pBStopPlaceSelectedAppModel2 != null) {
                                                str71 = pBStopPlaceSelectedAppModel2.c;
                                            } else {
                                                str71 = null;
                                            }
                                            chaloBusRouteSuggestionFieldUiStateB2 = b(iconType11, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                                            IconType iconType12 = IconType.IC_SCHEDULE_CLOCK;
                                            if (routeSuggestionReachByTime == null) {
                                                uITextStyle = UITextStyle.BodyLarge;
                                            }
                                            UITextStyle uITextStyle7 = uITextStyle;
                                            timeUtilsContract = this.b;
                                            if (routeSuggestionReachByTime != null) {
                                                strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                                            } else {
                                                strL = null;
                                            }
                                            chaloBusRouteSuggestionFieldUiStateB3 = b(iconType12, str63, uITextStyle7, shadyGray, str62, strL, new fh(function12, 8));
                                            UIShape.Rectangle rectangle6 = UIShape.e;
                                            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle6, z2, ChaloThemeHelper.a().n, 4);
                                            function14 = function12;
                                            buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle6, false, 52);
                                            if (form.d) {
                                                buttonUIState2 = buttonUIStateG;
                                                chaloTextUIState2 = chaloTextUIStateF;
                                                chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                                                routeSuggestionTimePickerUIState = null;
                                                chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                                                imageUIState3 = imageUIState;
                                                chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                                            } else {
                                                if (routeSuggestionReachByTime == null) {
                                                    int iB6 = timeUtilsContract.B(null) / 60;
                                                    i2 = iB6 / 60;
                                                    int iC6 = timeUtilsContract.C(iB6 % 60);
                                                    int iR6 = timeUtilsContract.r(i2);
                                                    if (i2 < 12) {
                                                        str72 = "AM";
                                                    } else {
                                                        str72 = "PM";
                                                    }
                                                    routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR6, iC6, str72);
                                                } else {
                                                    routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                                                }
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                                                objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                                                if (objC == obj14) {
                                                    return obj14;
                                                }
                                                chaloTextUIState = chaloTextUIStateF;
                                                obj15 = objC;
                                                buttonUIState = buttonUIStateG;
                                                chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                                                chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                                                chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                                                imageUIState2 = imageUIState;
                                                routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                                                chaloTextUIState2 = chaloTextUIState;
                                                buttonUIState2 = buttonUIState;
                                                chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                                                chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                                                chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                                                imageUIState3 = imageUIState2;
                                            }
                                            return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                                        }
                                    }
                                    return obj11;
                                }
                            }
                        }
                    }
                }
                return obj16;
            case 6:
                String str97 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$6;
                String str98 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$5;
                String str99 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$4;
                String str100 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$3;
                String str101 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                Function1 function23 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                RouteSuggestionSheetState routeSuggestionSheetState15 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                routeSuggestionSheetState6 = routeSuggestionSheetState15;
                function7 = function23;
                str15 = str101;
                str16 = str100;
                str17 = str99;
                str18 = str98;
                str14 = str97;
                obj6 = obj15;
                str19 = (String) obj6;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState6;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function7;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str15;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str16;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str17;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str18;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str14;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str19;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 7;
                objB6 = stringProvider2.b(StringEnum.ARRIVAL_TIME, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                if (objB6 != obj16) {
                    String str711112 = str14;
                    str20 = str19;
                    obj7 = objB6;
                    routeSuggestionSheetState7 = routeSuggestionSheetState6;
                    function8 = function7;
                    str21 = str15;
                    str22 = str16;
                    str23 = str17;
                    str24 = str18;
                    str25 = str711112;
                    str26 = (String) obj7;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState7;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function8;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str21;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str22;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str23;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str24;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str25;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str20;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str26;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 8;
                    objB7 = stringProvider2.b(StringEnum.THANKS_FOR_THE_SUGGESTION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                    if (objB7 == obj16) {
                        String str711113 = str20;
                        str27 = str26;
                        obj8 = objB7;
                        routeSuggestionSheetState8 = routeSuggestionSheetState7;
                        function9 = function8;
                        str28 = str21;
                        str29 = str22;
                        str30 = str23;
                        str31 = str24;
                        str32 = str25;
                        str33 = str711113;
                        str34 = (String) obj8;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState8;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function9;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str28;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str29;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str30;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str31;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str32;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str33;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str27;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str34;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 9;
                        objB8 = stringProvider2.b(StringEnum.ROUTE_SUGGESTION_SUCCESS_DESC, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                        if (objB8 != obj16) {
                            routeSuggestionSheetState9 = routeSuggestionSheetState8;
                            function10 = function9;
                            str35 = str28;
                            str36 = str29;
                            str37 = str30;
                            str38 = str31;
                            str39 = str32;
                            str40 = str33;
                            str41 = str27;
                            str42 = str34;
                            obj9 = objB8;
                            str43 = (String) obj9;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str43;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 10;
                            objB9 = stringProvider2.b(StringEnum.SUBMIT_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                            obj16 = obj16;
                            if (objB9 != obj16) {
                                obj10 = objB9;
                                str44 = str43;
                                str45 = (String) obj10;
                                Object obj113 = obj16;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str44;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str45;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 11;
                                stringProvider = stringProvider2;
                                objB10 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                obj11 = obj113;
                                if (objB10 != obj11) {
                                    String str711114 = str38;
                                    str46 = str44;
                                    str47 = str711114;
                                    str48 = str45;
                                    obj12 = objB10;
                                    String str711115 = str37;
                                    str49 = str42;
                                    str50 = str711115;
                                    String str815 = str36;
                                    str51 = str41;
                                    str52 = str815;
                                    String str816 = str35;
                                    str53 = str40;
                                    str54 = str816;
                                    Function1 function114 = function10;
                                    str55 = str39;
                                    function11 = function114;
                                    str56 = (String) obj12;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                                    str57 = str47;
                                    objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                    obj11 = obj11;
                                    if (objB11 != obj11) {
                                        str58 = str50;
                                        str59 = str57;
                                        str60 = str56;
                                        obj13 = objB11;
                                        str61 = str46;
                                        str62 = str51;
                                        str63 = str53;
                                        str64 = str55;
                                        str65 = str52;
                                        str66 = str48;
                                        function12 = function11;
                                        str67 = (String) obj13;
                                        z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                        shadyGray = ChaloColorToken.ShadyGray.f9851a;
                                        if (!z) {
                                            function13 = function12;
                                            if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                                        }
                                        form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                                        pBStopPlaceSelectedAppModel = form.f3370a;
                                        routeSuggestionReachByTime = form.c;
                                        pBStopPlaceSelectedAppModel2 = form.b;
                                        if (pBStopPlaceSelectedAppModel != null) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                                        imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                                        IconType iconType13 = IconType.IC_LOCATION_PIN;
                                        uITextStyle = UITextStyle.BodySmall;
                                        if (pBStopPlaceSelectedAppModel != null) {
                                            str68 = pBStopPlaceSelectedAppModel.c;
                                        } else {
                                            str68 = null;
                                        }
                                        if (pBStopPlaceSelectedAppModel != null) {
                                            str69 = pBStopPlaceSelectedAppModel.c;
                                        } else {
                                            str69 = null;
                                        }
                                        almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                                        if (str69 != null) {
                                            chaloColorToken = almostBlackColor;
                                        } else {
                                            chaloColorToken = almostBlackColor;
                                        }
                                        obj14 = obj11;
                                        chaloBusRouteSuggestionFieldUiStateB = b(iconType13, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                                        if (pBStopPlaceSelectedAppModel2 != null) {
                                            str70 = pBStopPlaceSelectedAppModel2.c;
                                        } else {
                                            str70 = null;
                                        }
                                        if (str70 != null) {
                                            chaloColorToken2 = almostBlackColor;
                                        } else {
                                            chaloColorToken2 = almostBlackColor;
                                        }
                                        if (pBStopPlaceSelectedAppModel2 != null) {
                                            str71 = pBStopPlaceSelectedAppModel2.c;
                                        } else {
                                            str71 = null;
                                        }
                                        chaloBusRouteSuggestionFieldUiStateB2 = b(iconType13, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                                        IconType iconType14 = IconType.IC_SCHEDULE_CLOCK;
                                        if (routeSuggestionReachByTime == null) {
                                            uITextStyle = UITextStyle.BodyLarge;
                                        }
                                        UITextStyle uITextStyle8 = uITextStyle;
                                        timeUtilsContract = this.b;
                                        if (routeSuggestionReachByTime != null) {
                                            strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                                        } else {
                                            strL = null;
                                        }
                                        chaloBusRouteSuggestionFieldUiStateB3 = b(iconType14, str63, uITextStyle8, shadyGray, str62, strL, new fh(function12, 8));
                                        UIShape.Rectangle rectangle7 = UIShape.e;
                                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle7, z2, ChaloThemeHelper.a().n, 4);
                                        function14 = function12;
                                        buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle7, false, 52);
                                        if (form.d) {
                                            buttonUIState2 = buttonUIStateG;
                                            chaloTextUIState2 = chaloTextUIStateF;
                                            chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                                            routeSuggestionTimePickerUIState = null;
                                            chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                                            imageUIState3 = imageUIState;
                                            chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                                        } else {
                                            if (routeSuggestionReachByTime == null) {
                                                int iB7 = timeUtilsContract.B(null) / 60;
                                                i2 = iB7 / 60;
                                                int iC7 = timeUtilsContract.C(iB7 % 60);
                                                int iR7 = timeUtilsContract.r(i2);
                                                if (i2 < 12) {
                                                    str72 = "AM";
                                                } else {
                                                    str72 = "PM";
                                                }
                                                routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR7, iC7, str72);
                                            } else {
                                                routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                                            }
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                                            objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                                            if (objC == obj14) {
                                                return obj14;
                                            }
                                            chaloTextUIState = chaloTextUIStateF;
                                            obj15 = objC;
                                            buttonUIState = buttonUIStateG;
                                            chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                                            chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                                            chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                                            imageUIState2 = imageUIState;
                                            routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                                            chaloTextUIState2 = chaloTextUIState;
                                            buttonUIState2 = buttonUIState;
                                            chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                                            chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                                            chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                                            imageUIState3 = imageUIState2;
                                        }
                                        return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                                    }
                                }
                                return obj11;
                            }
                        }
                    }
                }
                return obj16;
            case 7:
                String str102 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$7;
                String str103 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$6;
                String str104 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$5;
                String str105 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$4;
                String str106 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$3;
                String str107 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                Function1 function24 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                RouteSuggestionSheetState routeSuggestionSheetState16 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                routeSuggestionSheetState7 = routeSuggestionSheetState16;
                function8 = function24;
                str21 = str107;
                str22 = str106;
                str23 = str105;
                str24 = str104;
                str25 = str103;
                str20 = str102;
                obj7 = obj15;
                str26 = (String) obj7;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState7;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function8;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str21;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str22;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str23;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str24;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str25;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str20;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str26;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 8;
                objB7 = stringProvider2.b(StringEnum.THANKS_FOR_THE_SUGGESTION, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                if (objB7 == obj16) {
                    String str711116 = str20;
                    str27 = str26;
                    obj8 = objB7;
                    routeSuggestionSheetState8 = routeSuggestionSheetState7;
                    function9 = function8;
                    str28 = str21;
                    str29 = str22;
                    str30 = str23;
                    str31 = str24;
                    str32 = str25;
                    str33 = str711116;
                    str34 = (String) obj8;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState8;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function9;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str28;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str29;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str30;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str31;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str32;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str33;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str27;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str34;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 9;
                    objB8 = stringProvider2.b(StringEnum.ROUTE_SUGGESTION_SUCCESS_DESC, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                    if (objB8 != obj16) {
                        routeSuggestionSheetState9 = routeSuggestionSheetState8;
                        function10 = function9;
                        str35 = str28;
                        str36 = str29;
                        str37 = str30;
                        str38 = str31;
                        str39 = str32;
                        str40 = str33;
                        str41 = str27;
                        str42 = str34;
                        obj9 = objB8;
                        str43 = (String) obj9;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str43;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 10;
                        objB9 = stringProvider2.b(StringEnum.SUBMIT_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                        obj16 = obj16;
                        if (objB9 != obj16) {
                            obj10 = objB9;
                            str44 = str43;
                            str45 = (String) obj10;
                            Object obj114 = obj16;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str44;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str45;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 11;
                            stringProvider = stringProvider2;
                            objB10 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                            obj11 = obj114;
                            if (objB10 != obj11) {
                                String str711117 = str38;
                                str46 = str44;
                                str47 = str711117;
                                str48 = str45;
                                obj12 = objB10;
                                String str711118 = str37;
                                str49 = str42;
                                str50 = str711118;
                                String str817 = str36;
                                str51 = str41;
                                str52 = str817;
                                String str818 = str35;
                                str53 = str40;
                                str54 = str818;
                                Function1 function115 = function10;
                                str55 = str39;
                                function11 = function115;
                                str56 = (String) obj12;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                                str57 = str47;
                                objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                                obj11 = obj11;
                                if (objB11 != obj11) {
                                    str58 = str50;
                                    str59 = str57;
                                    str60 = str56;
                                    obj13 = objB11;
                                    str61 = str46;
                                    str62 = str51;
                                    str63 = str53;
                                    str64 = str55;
                                    str65 = str52;
                                    str66 = str48;
                                    function12 = function11;
                                    str67 = (String) obj13;
                                    z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                    shadyGray = ChaloColorToken.ShadyGray.f9851a;
                                    if (!z) {
                                        function13 = function12;
                                        if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                                    }
                                    form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                                    pBStopPlaceSelectedAppModel = form.f3370a;
                                    routeSuggestionReachByTime = form.c;
                                    pBStopPlaceSelectedAppModel2 = form.b;
                                    if (pBStopPlaceSelectedAppModel != null) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                                    imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                                    IconType iconType15 = IconType.IC_LOCATION_PIN;
                                    uITextStyle = UITextStyle.BodySmall;
                                    if (pBStopPlaceSelectedAppModel != null) {
                                        str68 = pBStopPlaceSelectedAppModel.c;
                                    } else {
                                        str68 = null;
                                    }
                                    if (pBStopPlaceSelectedAppModel != null) {
                                        str69 = pBStopPlaceSelectedAppModel.c;
                                    } else {
                                        str69 = null;
                                    }
                                    almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                                    if (str69 != null) {
                                        chaloColorToken = almostBlackColor;
                                    } else {
                                        chaloColorToken = almostBlackColor;
                                    }
                                    obj14 = obj11;
                                    chaloBusRouteSuggestionFieldUiStateB = b(iconType15, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                                    if (pBStopPlaceSelectedAppModel2 != null) {
                                        str70 = pBStopPlaceSelectedAppModel2.c;
                                    } else {
                                        str70 = null;
                                    }
                                    if (str70 != null) {
                                        chaloColorToken2 = almostBlackColor;
                                    } else {
                                        chaloColorToken2 = almostBlackColor;
                                    }
                                    if (pBStopPlaceSelectedAppModel2 != null) {
                                        str71 = pBStopPlaceSelectedAppModel2.c;
                                    } else {
                                        str71 = null;
                                    }
                                    chaloBusRouteSuggestionFieldUiStateB2 = b(iconType15, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                                    IconType iconType16 = IconType.IC_SCHEDULE_CLOCK;
                                    if (routeSuggestionReachByTime == null) {
                                        uITextStyle = UITextStyle.BodyLarge;
                                    }
                                    UITextStyle uITextStyle9 = uITextStyle;
                                    timeUtilsContract = this.b;
                                    if (routeSuggestionReachByTime != null) {
                                        strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                                    } else {
                                        strL = null;
                                    }
                                    chaloBusRouteSuggestionFieldUiStateB3 = b(iconType16, str63, uITextStyle9, shadyGray, str62, strL, new fh(function12, 8));
                                    UIShape.Rectangle rectangle8 = UIShape.e;
                                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle8, z2, ChaloThemeHelper.a().n, 4);
                                    function14 = function12;
                                    buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle8, false, 52);
                                    if (form.d) {
                                        buttonUIState2 = buttonUIStateG;
                                        chaloTextUIState2 = chaloTextUIStateF;
                                        chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                                        routeSuggestionTimePickerUIState = null;
                                        chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                                        imageUIState3 = imageUIState;
                                        chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                                    } else {
                                        if (routeSuggestionReachByTime == null) {
                                            int iB8 = timeUtilsContract.B(null) / 60;
                                            i2 = iB8 / 60;
                                            int iC8 = timeUtilsContract.C(iB8 % 60);
                                            int iR8 = timeUtilsContract.r(i2);
                                            if (i2 < 12) {
                                                str72 = "AM";
                                            } else {
                                                str72 = "PM";
                                            }
                                            routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR8, iC8, str72);
                                        } else {
                                            routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                                        }
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                                        objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                                        if (objC == obj14) {
                                            return obj14;
                                        }
                                        chaloTextUIState = chaloTextUIStateF;
                                        obj15 = objC;
                                        buttonUIState = buttonUIStateG;
                                        chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                                        chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                                        chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                                        imageUIState2 = imageUIState;
                                        routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                                        chaloTextUIState2 = chaloTextUIState;
                                        buttonUIState2 = buttonUIState;
                                        chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                                        chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                                        chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                                        imageUIState3 = imageUIState2;
                                    }
                                    return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                                }
                            }
                            return obj11;
                        }
                    }
                }
                return obj16;
            case 8:
                String str108 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$8;
                String str109 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$7;
                String str110 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$6;
                String str111 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$5;
                String str112 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$4;
                String str113 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$3;
                String str114 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                Function1 function25 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                RouteSuggestionSheetState routeSuggestionSheetState17 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                routeSuggestionSheetState8 = routeSuggestionSheetState17;
                function9 = function25;
                str28 = str114;
                str29 = str113;
                str30 = str112;
                str31 = str111;
                str32 = str110;
                str33 = str109;
                str27 = str108;
                obj8 = obj15;
                str34 = (String) obj8;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState8;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function9;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str28;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str29;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str30;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str31;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str32;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str33;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str27;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str34;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 9;
                objB8 = stringProvider2.b(StringEnum.ROUTE_SUGGESTION_SUCCESS_DESC, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                if (objB8 != obj16) {
                    routeSuggestionSheetState9 = routeSuggestionSheetState8;
                    function10 = function9;
                    str35 = str28;
                    str36 = str29;
                    str37 = str30;
                    str38 = str31;
                    str39 = str32;
                    str40 = str33;
                    str41 = str27;
                    str42 = str34;
                    obj9 = objB8;
                    str43 = (String) obj9;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str43;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 10;
                    objB9 = stringProvider2.b(StringEnum.SUBMIT_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                    obj16 = obj16;
                    if (objB9 != obj16) {
                        obj10 = objB9;
                        str44 = str43;
                        str45 = (String) obj10;
                        Object obj115 = obj16;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str44;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str45;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 11;
                        stringProvider = stringProvider2;
                        objB10 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                        obj11 = obj115;
                        if (objB10 != obj11) {
                            String str711119 = str38;
                            str46 = str44;
                            str47 = str711119;
                            str48 = str45;
                            obj12 = objB10;
                            String str7111110 = str37;
                            str49 = str42;
                            str50 = str7111110;
                            String str819 = str36;
                            str51 = str41;
                            str52 = str819;
                            String str8110 = str35;
                            str53 = str40;
                            str54 = str8110;
                            Function1 function116 = function10;
                            str55 = str39;
                            function11 = function116;
                            str56 = (String) obj12;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                            str57 = str47;
                            objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                            obj11 = obj11;
                            if (objB11 != obj11) {
                                str58 = str50;
                                str59 = str57;
                                str60 = str56;
                                obj13 = objB11;
                                str61 = str46;
                                str62 = str51;
                                str63 = str53;
                                str64 = str55;
                                str65 = str52;
                                str66 = str48;
                                function12 = function11;
                                str67 = (String) obj13;
                                z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                shadyGray = ChaloColorToken.ShadyGray.f9851a;
                                if (!z) {
                                    function13 = function12;
                                    if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                                }
                                form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                                pBStopPlaceSelectedAppModel = form.f3370a;
                                routeSuggestionReachByTime = form.c;
                                pBStopPlaceSelectedAppModel2 = form.b;
                                if (pBStopPlaceSelectedAppModel != null) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                                imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                                IconType iconType17 = IconType.IC_LOCATION_PIN;
                                uITextStyle = UITextStyle.BodySmall;
                                if (pBStopPlaceSelectedAppModel != null) {
                                    str68 = pBStopPlaceSelectedAppModel.c;
                                } else {
                                    str68 = null;
                                }
                                if (pBStopPlaceSelectedAppModel != null) {
                                    str69 = pBStopPlaceSelectedAppModel.c;
                                } else {
                                    str69 = null;
                                }
                                almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                                if (str69 != null) {
                                    chaloColorToken = almostBlackColor;
                                } else {
                                    chaloColorToken = almostBlackColor;
                                }
                                obj14 = obj11;
                                chaloBusRouteSuggestionFieldUiStateB = b(iconType17, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                                if (pBStopPlaceSelectedAppModel2 != null) {
                                    str70 = pBStopPlaceSelectedAppModel2.c;
                                } else {
                                    str70 = null;
                                }
                                if (str70 != null) {
                                    chaloColorToken2 = almostBlackColor;
                                } else {
                                    chaloColorToken2 = almostBlackColor;
                                }
                                if (pBStopPlaceSelectedAppModel2 != null) {
                                    str71 = pBStopPlaceSelectedAppModel2.c;
                                } else {
                                    str71 = null;
                                }
                                chaloBusRouteSuggestionFieldUiStateB2 = b(iconType17, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                                IconType iconType18 = IconType.IC_SCHEDULE_CLOCK;
                                if (routeSuggestionReachByTime == null) {
                                    uITextStyle = UITextStyle.BodyLarge;
                                }
                                UITextStyle uITextStyle10 = uITextStyle;
                                timeUtilsContract = this.b;
                                if (routeSuggestionReachByTime != null) {
                                    strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                                } else {
                                    strL = null;
                                }
                                chaloBusRouteSuggestionFieldUiStateB3 = b(iconType18, str63, uITextStyle10, shadyGray, str62, strL, new fh(function12, 8));
                                UIShape.Rectangle rectangle9 = UIShape.e;
                                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle9, z2, ChaloThemeHelper.a().n, 4);
                                function14 = function12;
                                buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle9, false, 52);
                                if (form.d) {
                                    buttonUIState2 = buttonUIStateG;
                                    chaloTextUIState2 = chaloTextUIStateF;
                                    chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                                    routeSuggestionTimePickerUIState = null;
                                    chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                                    imageUIState3 = imageUIState;
                                    chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                                } else {
                                    if (routeSuggestionReachByTime == null) {
                                        int iB9 = timeUtilsContract.B(null) / 60;
                                        i2 = iB9 / 60;
                                        int iC9 = timeUtilsContract.C(iB9 % 60);
                                        int iR9 = timeUtilsContract.r(i2);
                                        if (i2 < 12) {
                                            str72 = "AM";
                                        } else {
                                            str72 = "PM";
                                        }
                                        routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR9, iC9, str72);
                                    } else {
                                        routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                                    }
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                                    objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                                    if (objC == obj14) {
                                        return obj14;
                                    }
                                    chaloTextUIState = chaloTextUIStateF;
                                    obj15 = objC;
                                    buttonUIState = buttonUIStateG;
                                    chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                                    chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                                    chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                                    imageUIState2 = imageUIState;
                                    routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                                    chaloTextUIState2 = chaloTextUIState;
                                    buttonUIState2 = buttonUIState;
                                    chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                                    chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                                    chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                                    imageUIState3 = imageUIState2;
                                }
                                return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                            }
                        }
                        return obj11;
                    }
                }
                return obj16;
            case 9:
                String str115 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$9;
                String str116 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$8;
                String str117 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$7;
                String str118 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$6;
                String str119 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$5;
                String str120 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$4;
                String str121 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$3;
                String str122 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                Function1 function26 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                RouteSuggestionSheetState routeSuggestionSheetState18 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                routeSuggestionSheetState9 = routeSuggestionSheetState18;
                function10 = function26;
                str35 = str122;
                str36 = str121;
                str37 = str120;
                str38 = str119;
                str39 = str118;
                str40 = str117;
                str41 = str116;
                str42 = str115;
                obj9 = obj15;
                str43 = (String) obj9;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str43;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 10;
                objB9 = stringProvider2.b(StringEnum.SUBMIT_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                obj16 = obj16;
                if (objB9 != obj16) {
                    obj10 = objB9;
                    str44 = str43;
                    str45 = (String) obj10;
                    Object obj116 = obj16;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str44;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str45;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 11;
                    stringProvider = stringProvider2;
                    objB10 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                    obj11 = obj116;
                    if (objB10 != obj11) {
                        String str7111111 = str38;
                        str46 = str44;
                        str47 = str7111111;
                        str48 = str45;
                        obj12 = objB10;
                        String str7111112 = str37;
                        str49 = str42;
                        str50 = str7111112;
                        String str8111 = str36;
                        str51 = str41;
                        str52 = str8111;
                        String str8112 = str35;
                        str53 = str40;
                        str54 = str8112;
                        Function1 function117 = function10;
                        str55 = str39;
                        function11 = function117;
                        str56 = (String) obj12;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                        str57 = str47;
                        objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                        obj11 = obj11;
                        if (objB11 != obj11) {
                            str58 = str50;
                            str59 = str57;
                            str60 = str56;
                            obj13 = objB11;
                            str61 = str46;
                            str62 = str51;
                            str63 = str53;
                            str64 = str55;
                            str65 = str52;
                            str66 = str48;
                            function12 = function11;
                            str67 = (String) obj13;
                            z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            shadyGray = ChaloColorToken.ShadyGray.f9851a;
                            if (!z) {
                                function13 = function12;
                                if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                            }
                            form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                            pBStopPlaceSelectedAppModel = form.f3370a;
                            routeSuggestionReachByTime = form.c;
                            pBStopPlaceSelectedAppModel2 = form.b;
                            if (pBStopPlaceSelectedAppModel != null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                            imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                            IconType iconType19 = IconType.IC_LOCATION_PIN;
                            uITextStyle = UITextStyle.BodySmall;
                            if (pBStopPlaceSelectedAppModel != null) {
                                str68 = pBStopPlaceSelectedAppModel.c;
                            } else {
                                str68 = null;
                            }
                            if (pBStopPlaceSelectedAppModel != null) {
                                str69 = pBStopPlaceSelectedAppModel.c;
                            } else {
                                str69 = null;
                            }
                            almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                            if (str69 != null) {
                                chaloColorToken = almostBlackColor;
                            } else {
                                chaloColorToken = almostBlackColor;
                            }
                            obj14 = obj11;
                            chaloBusRouteSuggestionFieldUiStateB = b(iconType19, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                            if (pBStopPlaceSelectedAppModel2 != null) {
                                str70 = pBStopPlaceSelectedAppModel2.c;
                            } else {
                                str70 = null;
                            }
                            if (str70 != null) {
                                chaloColorToken2 = almostBlackColor;
                            } else {
                                chaloColorToken2 = almostBlackColor;
                            }
                            if (pBStopPlaceSelectedAppModel2 != null) {
                                str71 = pBStopPlaceSelectedAppModel2.c;
                            } else {
                                str71 = null;
                            }
                            chaloBusRouteSuggestionFieldUiStateB2 = b(iconType19, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                            IconType iconType110 = IconType.IC_SCHEDULE_CLOCK;
                            if (routeSuggestionReachByTime == null) {
                                uITextStyle = UITextStyle.BodyLarge;
                            }
                            UITextStyle uITextStyle11 = uITextStyle;
                            timeUtilsContract = this.b;
                            if (routeSuggestionReachByTime != null) {
                                strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                            } else {
                                strL = null;
                            }
                            chaloBusRouteSuggestionFieldUiStateB3 = b(iconType110, str63, uITextStyle11, shadyGray, str62, strL, new fh(function12, 8));
                            UIShape.Rectangle rectangle10 = UIShape.e;
                            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle10, z2, ChaloThemeHelper.a().n, 4);
                            function14 = function12;
                            buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle10, false, 52);
                            if (form.d) {
                                buttonUIState2 = buttonUIStateG;
                                chaloTextUIState2 = chaloTextUIStateF;
                                chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                                routeSuggestionTimePickerUIState = null;
                                chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                                imageUIState3 = imageUIState;
                                chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                            } else {
                                if (routeSuggestionReachByTime == null) {
                                    int iB10 = timeUtilsContract.B(null) / 60;
                                    i2 = iB10 / 60;
                                    int iC10 = timeUtilsContract.C(iB10 % 60);
                                    int iR10 = timeUtilsContract.r(i2);
                                    if (i2 < 12) {
                                        str72 = "AM";
                                    } else {
                                        str72 = "PM";
                                    }
                                    routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR10, iC10, str72);
                                } else {
                                    routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                                }
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                                objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                                if (objC == obj14) {
                                    return obj14;
                                }
                                chaloTextUIState = chaloTextUIStateF;
                                obj15 = objC;
                                buttonUIState = buttonUIStateG;
                                chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                                chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                                chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                                imageUIState2 = imageUIState;
                                routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                                chaloTextUIState2 = chaloTextUIState;
                                buttonUIState2 = buttonUIState;
                                chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                                chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                                chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                                imageUIState3 = imageUIState2;
                            }
                            return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                        }
                    }
                    return obj11;
                }
                return obj16;
            case 10:
                String str123 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$10;
                str42 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$9;
                str41 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$8;
                str40 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$7;
                str39 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$6;
                str38 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$5;
                str37 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$4;
                str36 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$3;
                str35 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                function10 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                routeSuggestionSheetState9 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                str44 = str123;
                obj10 = obj15;
                str45 = (String) obj10;
                Object obj117 = obj16;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function10;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str35;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str36;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str37;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str38;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str39;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str40;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str41;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str42;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str44;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str45;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 11;
                stringProvider = stringProvider2;
                objB10 = stringProvider.b(StringEnum.CANCEL_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                obj11 = obj117;
                if (objB10 != obj11) {
                    String str7111113 = str38;
                    str46 = str44;
                    str47 = str7111113;
                    str48 = str45;
                    obj12 = objB10;
                    String str7111114 = str37;
                    str49 = str42;
                    str50 = str7111114;
                    String str8113 = str36;
                    str51 = str41;
                    str52 = str8113;
                    String str8114 = str35;
                    str53 = str40;
                    str54 = str8114;
                    Function1 function118 = function10;
                    str55 = str39;
                    function11 = function118;
                    str56 = (String) obj12;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                    str57 = str47;
                    objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                    obj11 = obj11;
                    if (objB11 != obj11) {
                        str58 = str50;
                        str59 = str57;
                        str60 = str56;
                        obj13 = objB11;
                        str61 = str46;
                        str62 = str51;
                        str63 = str53;
                        str64 = str55;
                        str65 = str52;
                        str66 = str48;
                        function12 = function11;
                        str67 = (String) obj13;
                        z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        shadyGray = ChaloColorToken.ShadyGray.f9851a;
                        if (!z) {
                            function13 = function12;
                            if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                        }
                        form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                        pBStopPlaceSelectedAppModel = form.f3370a;
                        routeSuggestionReachByTime = form.c;
                        pBStopPlaceSelectedAppModel2 = form.b;
                        if (pBStopPlaceSelectedAppModel != null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                        imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                        IconType iconType111 = IconType.IC_LOCATION_PIN;
                        uITextStyle = UITextStyle.BodySmall;
                        if (pBStopPlaceSelectedAppModel != null) {
                            str68 = pBStopPlaceSelectedAppModel.c;
                        } else {
                            str68 = null;
                        }
                        if (pBStopPlaceSelectedAppModel != null) {
                            str69 = pBStopPlaceSelectedAppModel.c;
                        } else {
                            str69 = null;
                        }
                        almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                        if (str69 != null) {
                            chaloColorToken = almostBlackColor;
                        } else {
                            chaloColorToken = almostBlackColor;
                        }
                        obj14 = obj11;
                        chaloBusRouteSuggestionFieldUiStateB = b(iconType111, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                        if (pBStopPlaceSelectedAppModel2 != null) {
                            str70 = pBStopPlaceSelectedAppModel2.c;
                        } else {
                            str70 = null;
                        }
                        if (str70 != null) {
                            chaloColorToken2 = almostBlackColor;
                        } else {
                            chaloColorToken2 = almostBlackColor;
                        }
                        if (pBStopPlaceSelectedAppModel2 != null) {
                            str71 = pBStopPlaceSelectedAppModel2.c;
                        } else {
                            str71 = null;
                        }
                        chaloBusRouteSuggestionFieldUiStateB2 = b(iconType111, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                        IconType iconType112 = IconType.IC_SCHEDULE_CLOCK;
                        if (routeSuggestionReachByTime == null) {
                            uITextStyle = UITextStyle.BodyLarge;
                        }
                        UITextStyle uITextStyle12 = uITextStyle;
                        timeUtilsContract = this.b;
                        if (routeSuggestionReachByTime != null) {
                            strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                        } else {
                            strL = null;
                        }
                        chaloBusRouteSuggestionFieldUiStateB3 = b(iconType112, str63, uITextStyle12, shadyGray, str62, strL, new fh(function12, 8));
                        UIShape.Rectangle rectangle11 = UIShape.e;
                        buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle11, z2, ChaloThemeHelper.a().n, 4);
                        function14 = function12;
                        buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle11, false, 52);
                        if (form.d) {
                            buttonUIState2 = buttonUIStateG;
                            chaloTextUIState2 = chaloTextUIStateF;
                            chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                            routeSuggestionTimePickerUIState = null;
                            chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                            imageUIState3 = imageUIState;
                            chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                        } else {
                            if (routeSuggestionReachByTime == null) {
                                int iB11 = timeUtilsContract.B(null) / 60;
                                i2 = iB11 / 60;
                                int iC11 = timeUtilsContract.C(iB11 % 60);
                                int iR11 = timeUtilsContract.r(i2);
                                if (i2 < 12) {
                                    str72 = "AM";
                                } else {
                                    str72 = "PM";
                                }
                                routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR11, iC11, str72);
                            } else {
                                routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                            }
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                            chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                            objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                            if (objC == obj14) {
                                return obj14;
                            }
                            chaloTextUIState = chaloTextUIStateF;
                            obj15 = objC;
                            buttonUIState = buttonUIStateG;
                            chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                            chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                            chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                            imageUIState2 = imageUIState;
                            routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                            chaloTextUIState2 = chaloTextUIState;
                            buttonUIState2 = buttonUIState;
                            chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                            chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                            chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                            imageUIState3 = imageUIState2;
                        }
                        return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                    }
                }
                return obj11;
            case 11:
                String str124 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$11;
                String str125 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$10;
                String str126 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$9;
                String str127 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$8;
                String str128 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$7;
                String str129 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$6;
                String str130 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$5;
                String str131 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$4;
                String str132 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$3;
                String str133 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                Function1 function27 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                RouteSuggestionSheetState routeSuggestionSheetState19 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                str46 = str125;
                str50 = str131;
                str51 = str127;
                str54 = str133;
                str55 = str129;
                str47 = str130;
                str49 = str126;
                str52 = str132;
                str53 = str128;
                function11 = function27;
                routeSuggestionSheetState9 = routeSuggestionSheetState19;
                obj11 = obj16;
                stringProvider = stringProvider2;
                str48 = str124;
                obj12 = obj15;
                str56 = (String) obj12;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = routeSuggestionSheetState9;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = function11;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = str54;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = str52;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = str50;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = str47;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = str55;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = str53;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = str51;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = str49;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = str46;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = str48;
                chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = str56;
                chaloBusRouteInfoUiStateFactory$toUiState$9.label = 12;
                str57 = str47;
                objB11 = stringProvider.b(StringEnum.OKAY_SMALL, new Object[0], chaloBusRouteInfoUiStateFactory$toUiState$9);
                obj11 = obj11;
                if (objB11 != obj11) {
                    str58 = str50;
                    str59 = str57;
                    str60 = str56;
                    obj13 = objB11;
                    str61 = str46;
                    str62 = str51;
                    str63 = str53;
                    str64 = str55;
                    str65 = str52;
                    str66 = str48;
                    function12 = function11;
                    str67 = (String) obj13;
                    z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    shadyGray = ChaloColorToken.ShadyGray.f9851a;
                    if (!z) {
                        function13 = function12;
                        if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                    }
                    form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                    pBStopPlaceSelectedAppModel = form.f3370a;
                    routeSuggestionReachByTime = form.c;
                    pBStopPlaceSelectedAppModel2 = form.b;
                    if (pBStopPlaceSelectedAppModel != null) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                    imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                    IconType iconType113 = IconType.IC_LOCATION_PIN;
                    uITextStyle = UITextStyle.BodySmall;
                    if (pBStopPlaceSelectedAppModel != null) {
                        str68 = pBStopPlaceSelectedAppModel.c;
                    } else {
                        str68 = null;
                    }
                    if (pBStopPlaceSelectedAppModel != null) {
                        str69 = pBStopPlaceSelectedAppModel.c;
                    } else {
                        str69 = null;
                    }
                    almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                    if (str69 != null) {
                        chaloColorToken = almostBlackColor;
                    } else {
                        chaloColorToken = almostBlackColor;
                    }
                    obj14 = obj11;
                    chaloBusRouteSuggestionFieldUiStateB = b(iconType113, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                    if (pBStopPlaceSelectedAppModel2 != null) {
                        str70 = pBStopPlaceSelectedAppModel2.c;
                    } else {
                        str70 = null;
                    }
                    if (str70 != null) {
                        chaloColorToken2 = almostBlackColor;
                    } else {
                        chaloColorToken2 = almostBlackColor;
                    }
                    if (pBStopPlaceSelectedAppModel2 != null) {
                        str71 = pBStopPlaceSelectedAppModel2.c;
                    } else {
                        str71 = null;
                    }
                    chaloBusRouteSuggestionFieldUiStateB2 = b(iconType113, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                    IconType iconType114 = IconType.IC_SCHEDULE_CLOCK;
                    if (routeSuggestionReachByTime == null) {
                        uITextStyle = UITextStyle.BodyLarge;
                    }
                    UITextStyle uITextStyle13 = uITextStyle;
                    timeUtilsContract = this.b;
                    if (routeSuggestionReachByTime != null) {
                        strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                    } else {
                        strL = null;
                    }
                    chaloBusRouteSuggestionFieldUiStateB3 = b(iconType114, str63, uITextStyle13, shadyGray, str62, strL, new fh(function12, 8));
                    UIShape.Rectangle rectangle12 = UIShape.e;
                    buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle12, z2, ChaloThemeHelper.a().n, 4);
                    function14 = function12;
                    buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle12, false, 52);
                    if (form.d) {
                        buttonUIState2 = buttonUIStateG;
                        chaloTextUIState2 = chaloTextUIStateF;
                        chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                        routeSuggestionTimePickerUIState = null;
                        chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                        imageUIState3 = imageUIState;
                        chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                    } else {
                        if (routeSuggestionReachByTime == null) {
                            int iB12 = timeUtilsContract.B(null) / 60;
                            i2 = iB12 / 60;
                            int iC12 = timeUtilsContract.C(iB12 % 60);
                            int iR12 = timeUtilsContract.r(i2);
                            if (i2 < 12) {
                                str72 = "AM";
                            } else {
                                str72 = "PM";
                            }
                            routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR12, iC12, str72);
                        } else {
                            routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                        }
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                        chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                        objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                        if (objC == obj14) {
                            return obj14;
                        }
                        chaloTextUIState = chaloTextUIStateF;
                        obj15 = objC;
                        buttonUIState = buttonUIStateG;
                        chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                        chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                        chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                        imageUIState2 = imageUIState;
                        routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                        chaloTextUIState2 = chaloTextUIState;
                        buttonUIState2 = buttonUIState;
                        chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                        chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                        chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                        imageUIState3 = imageUIState2;
                    }
                    return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
                }
                return obj11;
            case 12:
                str60 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$12;
                String str134 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$11;
                String str135 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$10;
                str49 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$9;
                String str136 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$8;
                String str137 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$7;
                String str138 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$6;
                String str139 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$5;
                String str140 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$4;
                String str141 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$3;
                str54 = (String) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                Function1 function28 = (Function1) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                RouteSuggestionSheetState routeSuggestionSheetState20 = (RouteSuggestionSheetState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                obj11 = obj16;
                str58 = str140;
                str59 = str139;
                routeSuggestionSheetState9 = routeSuggestionSheetState20;
                obj13 = obj15;
                str66 = str134;
                function12 = function28;
                str61 = str135;
                str62 = str136;
                str63 = str137;
                str64 = str138;
                str65 = str141;
                str67 = (String) obj13;
                z = routeSuggestionSheetState9 instanceof RouteSuggestionSheetState.Form;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                shadyGray = ChaloColorToken.ShadyGray.f9851a;
                if (!z) {
                    function13 = function12;
                    if (!Intrinsics.d(routeSuggestionSheetState9, RouteSuggestionSheetState.Success.f3371a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return new ChaloBusRouteSuggestionBottomSheetUiState.Success(new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function13, 11)), 114), new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().t)), f(str49, UITextStyle.DisplaySmall, UIFontWeight.Bold), new TextUIState.ChaloTextUIState(str61, UITextStyle.BodyMedium, shadyGray, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), ButtonUIStateFactory.g(buttonUIStateFactory, str67, new ya(function13, 26), null, UIShape.e, false, 0.0f, 52));
                }
                form = (RouteSuggestionSheetState.Form) routeSuggestionSheetState9;
                pBStopPlaceSelectedAppModel = form.f3370a;
                routeSuggestionReachByTime = form.c;
                pBStopPlaceSelectedAppModel2 = form.b;
                if (pBStopPlaceSelectedAppModel != null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                chaloTextUIStateF = f(str54, UITextStyle.DisplaySmall, UIFontWeight.Bold);
                imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, shadyGray, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fh(function12, 5)), 114);
                IconType iconType115 = IconType.IC_LOCATION_PIN;
                uITextStyle = UITextStyle.BodySmall;
                if (pBStopPlaceSelectedAppModel != null) {
                    str68 = pBStopPlaceSelectedAppModel.c;
                } else {
                    str68 = null;
                }
                if (pBStopPlaceSelectedAppModel != null) {
                    str69 = pBStopPlaceSelectedAppModel.c;
                } else {
                    str69 = null;
                }
                almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                if (str69 != null) {
                    chaloColorToken = almostBlackColor;
                } else {
                    chaloColorToken = almostBlackColor;
                }
                obj14 = obj11;
                chaloBusRouteSuggestionFieldUiStateB = b(iconType115, str58, uITextStyle, chaloColorToken, str65, str68, new fh(function12, 6));
                if (pBStopPlaceSelectedAppModel2 != null) {
                    str70 = pBStopPlaceSelectedAppModel2.c;
                } else {
                    str70 = null;
                }
                if (str70 != null) {
                    chaloColorToken2 = almostBlackColor;
                } else {
                    chaloColorToken2 = almostBlackColor;
                }
                if (pBStopPlaceSelectedAppModel2 != null) {
                    str71 = pBStopPlaceSelectedAppModel2.c;
                } else {
                    str71 = null;
                }
                chaloBusRouteSuggestionFieldUiStateB2 = b(iconType115, str64, uITextStyle, chaloColorToken2, str59, str71, new fh(function12, 7));
                IconType iconType116 = IconType.IC_SCHEDULE_CLOCK;
                if (routeSuggestionReachByTime == null) {
                    uITextStyle = UITextStyle.BodyLarge;
                }
                UITextStyle uITextStyle14 = uITextStyle;
                timeUtilsContract = this.b;
                if (routeSuggestionReachByTime != null) {
                    strL = timeUtilsContract.l(timeUtilsContract.k(routeSuggestionReachByTime.f3369a, routeSuggestionReachByTime.b, routeSuggestionReachByTime.c));
                } else {
                    strL = null;
                }
                chaloBusRouteSuggestionFieldUiStateB3 = b(iconType116, str63, uITextStyle14, shadyGray, str62, strL, new fh(function12, 8));
                UIShape.Rectangle rectangle13 = UIShape.e;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, str66, new fh(function12, 9), null, rectangle13, z2, ChaloThemeHelper.a().n, 4);
                function14 = function12;
                buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory, str60, new fh(function12, 10), rectangle13, false, 52);
                if (form.d) {
                    buttonUIState2 = buttonUIStateG;
                    chaloTextUIState2 = chaloTextUIStateF;
                    chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiStateB2;
                    routeSuggestionTimePickerUIState = null;
                    chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiStateB3;
                    imageUIState3 = imageUIState;
                    chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiStateB;
                } else {
                    if (routeSuggestionReachByTime == null) {
                        int iB13 = timeUtilsContract.B(null) / 60;
                        i2 = iB13 / 60;
                        int iC13 = timeUtilsContract.C(iB13 % 60);
                        int iR13 = timeUtilsContract.r(i2);
                        if (i2 < 12) {
                            str72 = "AM";
                        } else {
                            str72 = "PM";
                        }
                        routeSuggestionReachByTime2 = new RouteSuggestionReachByTime(iR13, iC13, str72);
                    } else {
                        routeSuggestionReachByTime2 = routeSuggestionReachByTime;
                    }
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$0 = chaloTextUIStateF;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$1 = imageUIState;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$2 = chaloBusRouteSuggestionFieldUiStateB;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$3 = chaloBusRouteSuggestionFieldUiStateB2;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$4 = chaloBusRouteSuggestionFieldUiStateB3;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$5 = buttonUIStateG;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$6 = buttonUIStateB;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$7 = null;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$8 = null;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$9 = null;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$10 = null;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$11 = null;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.L$12 = null;
                    chaloBusRouteInfoUiStateFactory$toUiState$9.label = 13;
                    objC = c(routeSuggestionReachByTime2, function14, chaloBusRouteInfoUiStateFactory$toUiState$9);
                    if (objC == obj14) {
                        return obj14;
                    }
                    chaloTextUIState = chaloTextUIStateF;
                    obj15 = objC;
                    buttonUIState = buttonUIStateG;
                    chaloBusRouteSuggestionFieldUiState = chaloBusRouteSuggestionFieldUiStateB;
                    chaloBusRouteSuggestionFieldUiState2 = chaloBusRouteSuggestionFieldUiStateB2;
                    chaloBusRouteSuggestionFieldUiState3 = chaloBusRouteSuggestionFieldUiStateB3;
                    imageUIState2 = imageUIState;
                    routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                    chaloTextUIState2 = chaloTextUIState;
                    buttonUIState2 = buttonUIState;
                    chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                    chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                    chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                    imageUIState3 = imageUIState2;
                }
                return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
            case 13:
                buttonUIStateB = (ButtonUIState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$6;
                buttonUIState = (ButtonUIState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$5;
                chaloBusRouteSuggestionFieldUiState3 = (ChaloBusRouteSuggestionFieldUiState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$4;
                chaloBusRouteSuggestionFieldUiState2 = (ChaloBusRouteSuggestionFieldUiState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$3;
                chaloBusRouteSuggestionFieldUiState = (ChaloBusRouteSuggestionFieldUiState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$2;
                imageUIState2 = (ImageUIState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$1;
                chaloTextUIState = (TextUIState.ChaloTextUIState) chaloBusRouteInfoUiStateFactory$toUiState$9.L$0;
                ResultKt.b(obj15);
                routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj15;
                chaloTextUIState2 = chaloTextUIState;
                buttonUIState2 = buttonUIState;
                chaloBusRouteSuggestionFieldUiState5 = chaloBusRouteSuggestionFieldUiState3;
                chaloBusRouteSuggestionFieldUiState4 = chaloBusRouteSuggestionFieldUiState2;
                chaloBusRouteSuggestionFieldUiState6 = chaloBusRouteSuggestionFieldUiState;
                imageUIState3 = imageUIState2;
                return new ChaloBusRouteSuggestionBottomSheetUiState.Form(chaloTextUIState2, imageUIState3, chaloBusRouteSuggestionFieldUiState6, chaloBusRouteSuggestionFieldUiState4, chaloBusRouteSuggestionFieldUiState5, buttonUIState2, buttonUIStateB, routeSuggestionTimePickerUIState);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
