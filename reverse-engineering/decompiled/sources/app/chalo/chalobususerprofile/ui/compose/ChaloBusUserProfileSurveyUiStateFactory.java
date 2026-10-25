package app.chalo.chalobususerprofile.ui.compose;

import app.chalo.chalobususerprofile.data.model.TimingVariability;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.ab;
import defpackage.ii;
import defpackage.l3;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyUiStateFactory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusUserProfileSurveyUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f1225a;
    public final TimeUtilsContract b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1226a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[TimePickerType.values().length];
            try {
                iArr[TimePickerType.WORK_START_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimePickerType.WORK_END_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1226a = iArr;
            int[] iArr2 = new int[TimingVariability.values().length];
            try {
                iArr2[TimingVariability.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TimingVariability.MINUTES_15.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TimingVariability.MINUTES_30.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TimingVariability.HOUR_1.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[TravelFrequency.values().length];
            try {
                iArr3[TravelFrequency.ONE_TWO_DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[TravelFrequency.THREE_FOUR_DAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[TravelFrequency.FIVE_DAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[TravelFrequency.NOT_FIXED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            c = iArr3;
        }
    }

    public ChaloBusUserProfileSurveyUiStateFactory(StringProvider stringProvider, TimeUtilsContract timeUtilsContract) {
        this.f1225a = stringProvider;
        this.b = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0157  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(PBUserProfileSurveyInputState pBUserProfileSurveyInputState, ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState, Function1 function1, ContinuationImpl continuationImpl) {
        ChaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1 chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1;
        TimePickerType timePickerType;
        TimePickerSelection timePickerSelection;
        StringEnum stringEnum;
        Function1 function2;
        Function3 function3;
        ButtonUIStateFactory buttonUIStateFactory;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ButtonUIState buttonUIStateF;
        Object objB;
        TimePickerSelection timePickerSelection2;
        ButtonUIState buttonUIState;
        Function3 function4;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Function1 function5;
        if (continuationImpl instanceof ChaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1) {
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1 = (ChaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1) continuationImpl;
            int i = chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1 = new ChaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1(this, continuationImpl);
            }
        } else {
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1 = new ChaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1(this, continuationImpl);
        }
        Object objB2 = chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.label;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        StringProvider stringProvider = this.f1225a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            if (!(pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) || (timePickerType = chaloBusUserProfileSurveyDataState.e) == null || (timePickerSelection = chaloBusUserProfileSurveyDataState.f) == null) {
                return null;
            }
            int i3 = WhenMappings.f1226a[timePickerType.ordinal()];
            if (i3 == 1) {
                stringEnum = StringEnum.PB_USER_PROFILE_SURVEY_REACH_OFFICE_BY;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stringEnum = StringEnum.PB_USER_PROFILE_SURVEY_LEAVE_OFFICE_BY;
            }
            function2 = function1;
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$0 = function2;
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$1 = timePickerSelection;
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.label = 1;
            objB2 = stringProvider.b(stringEnum, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1);
            if (objB2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            timePickerSelection = (TimePickerSelection) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$1;
            Function1 function6 = (Function1) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$0;
            ResultKt.b(objB2);
            function2 = function6;
        } else {
            if (i2 == 2) {
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$4;
                function3 = (Function3) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$3;
                TimePickerSelection timePickerSelection3 = (TimePickerSelection) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$2;
                chaloTextUIState = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$1;
                function2 = (Function1) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$0;
                ResultKt.b(objB2);
                buttonUIStateFactory = buttonUIStateFactory3;
                timePickerSelection = timePickerSelection3;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ii(function2, 1), UIShape.e, false, 0.0f, 52);
                chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$0 = function2;
                chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$1 = chaloTextUIState;
                chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$2 = timePickerSelection;
                chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$3 = function3;
                chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$4 = buttonUIStateF;
                chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$5 = buttonUIStateFactory2;
                chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.CANCEL, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1);
                if (objB != coroutineSingletons) {
                    timePickerSelection2 = timePickerSelection;
                    buttonUIState = buttonUIStateF;
                    objB2 = objB;
                    function4 = function3;
                    chaloTextUIState2 = chaloTextUIState;
                    function5 = function2;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buttonUIStateFactory2 = (ButtonUIStateFactory) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$5;
            ButtonUIState buttonUIState2 = (ButtonUIState) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$4;
            Function3 function7 = (Function3) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$3;
            TimePickerSelection timePickerSelection4 = (TimePickerSelection) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$2;
            TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$1;
            function5 = (Function1) chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$0;
            ResultKt.b(objB2);
            buttonUIState = buttonUIState2;
            function4 = function7;
            timePickerSelection2 = timePickerSelection4;
            chaloTextUIState2 = chaloTextUIState3;
        }
        return new SurveyTimePickerDialogUIState(chaloTextUIState2, timePickerSelection2, function4, buttonUIState, ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ii(function5, 2), UIShape.e, false, 52), new ii(function5, 3));
        TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        ab abVar = new ab(function2, 5);
        chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$0 = function2;
        chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$1 = chaloTextUIState4;
        chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$2 = timePickerSelection;
        chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$3 = abVar;
        chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$4 = buttonUIStateFactory2;
        chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.DONE, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1);
        if (objB3 != coroutineSingletons) {
            function3 = abVar;
            objB2 = objB3;
            buttonUIStateFactory = buttonUIStateFactory2;
            chaloTextUIState = chaloTextUIState4;
            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ii(function2, 1), UIShape.e, false, 0.0f, 52);
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$0 = function2;
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$1 = chaloTextUIState;
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$2 = timePickerSelection;
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$3 = function3;
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$4 = buttonUIStateF;
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.L$5 = buttonUIStateFactory2;
            chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1.label = 3;
            objB = stringProvider.b(StringEnum.CANCEL, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildTimePickerDialogUIState$1);
            if (objB != coroutineSingletons) {
                timePickerSelection2 = timePickerSelection;
                buttonUIState = buttonUIStateF;
                objB2 = objB;
                function4 = function3;
                chaloTextUIState2 = chaloTextUIState;
                function5 = function2;
                return new SurveyTimePickerDialogUIState(chaloTextUIState2, timePickerSelection2, function4, buttonUIState, ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ii(function5, 2), UIShape.e, false, 52), new ii(function5, 3));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:105:0x02cd A[PHI: r1 r2 r3 r6 r7 r8 r10 r12 r13 r16
      0x02cd: PHI (r1v38 boolean) = (r1v32 boolean), (r1v39 boolean) binds: [B:103:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r2v27 boolean) = (r2v22 boolean), (r2v28 boolean) binds: [B:103:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r3v35 java.lang.Object) = (r3v33 java.lang.Object), (r3v1 java.lang.Object) binds: [B:103:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r6v34 app.chalo.chalobususerprofile.ui.compose.SurveyTimePickerDialogUIState) = 
      (r6v28 app.chalo.chalobususerprofile.ui.compose.SurveyTimePickerDialogUIState)
      (r6v37 app.chalo.chalobususerprofile.ui.compose.SurveyTimePickerDialogUIState)
     binds: [B:103:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r7v35 app.chalo.chalobususerprofile.ui.compose.ProfileSurveyUIState) = 
      (r7v28 app.chalo.chalobususerprofile.ui.compose.ProfileSurveyUIState)
      (r7v38 app.chalo.chalobususerprofile.ui.compose.ProfileSurveyUIState)
     binds: [B:103:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r8v27 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = 
      (r8v21 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
      (r8v30 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
     binds: [B:103:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r10v16 kotlin.jvm.functions.Function1) = (r10v9 kotlin.jvm.functions.Function1), (r10v19 kotlin.jvm.functions.Function1) binds: [B:103:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r12v9 app.chalo.uistate.dialog.DialogUIStateFactory) = (r12v0 app.chalo.uistate.dialog.DialogUIStateFactory), (r12v11 app.chalo.uistate.dialog.DialogUIStateFactory) binds: [B:103:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r13v15 app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState) = 
      (r13v9 app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState)
      (r13v17 app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState)
     binds: [B:103:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x02cd: PHI (r16v14 boolean) = (r16v10 boolean), (r16v15 boolean) binds: [B:103:0x02c9, B:15:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x02de  */
    /* JADX WARN: Code duplicated, block: B:110:0x030f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0338  */
    /* JADX WARN: Code duplicated, block: B:115:0x0380  */
    /* JADX WARN: Code duplicated, block: B:117:0x0388  */
    /* JADX WARN: Code duplicated, block: B:120:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:122:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:135:0x0434  */
    /* JADX WARN: Code duplicated, block: B:31:0x019d  */
    /* JADX WARN: Code duplicated, block: B:36:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x01df  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:47:0x020d  */
    /* JADX WARN: Code duplicated, block: B:49:0x021b  */
    /* JADX WARN: Code duplicated, block: B:51:0x021f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0233  */
    /* JADX WARN: Code duplicated, block: B:72:0x024c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0250  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:86:0x026d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0281  */
    /* JADX WARN: Code duplicated, block: B:99:0x029a  */
    public final Object b(ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState, Function1 function1, ContinuationImpl continuationImpl) {
        ChaloBusUserProfileSurveyUiStateFactory$buildUiState$1 chaloBusUserProfileSurveyUiStateFactory$buildUiState$1;
        boolean z;
        LoadingDialogUIState loadingDialogUIStateA;
        PBUserProfileSurveyInputState pBUserProfileSurveyInputState;
        PBUserProfileSurveyInputState pBUserProfileSurveyInputState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object objB;
        Object objC;
        LoadingDialogUIState loadingDialogUIState;
        PBUserProfileSurveyInputState pBUserProfileSurveyInputState3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ProfileSurveyUIState profileSurveyUIState;
        Object objD;
        ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        Function1 function2;
        PBUserProfileSurveyInputState pBUserProfileSurveyInputState4;
        Object objE;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objA;
        Function1 function3;
        boolean z5;
        ProfileSurveyUIState profileSurveyUIState2;
        ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState3;
        boolean z6;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        SurveyTimePickerDialogUIState surveyTimePickerDialogUIState;
        ProfileSurveyUIState profileSurveyUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        Function1 function4;
        LoadingDialogUIState loadingDialogUIStateA2;
        boolean z7;
        boolean z8;
        ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState4;
        ChaloColorToken.Black black;
        StringProvider stringProvider;
        ImageUIState imageUIState;
        SurveyTimePickerDialogUIState surveyTimePickerDialogUIState2;
        LoadingDialogUIState loadingDialogUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        boolean z9;
        ButtonUIState buttonUIStateD;
        ChaloColorToken.Black black2;
        Object objB2;
        SurveyTimePickerDialogUIState surveyTimePickerDialogUIState3;
        ProfileSurveyUIState profileSurveyUIState4;
        ButtonUIStateFactory buttonUIStateFactory;
        ImageUIState imageUIState2;
        ProfileSurveyUIState profileSurveyUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        ImageUIState imageUIState3;
        ButtonUIState buttonUIStateF;
        ButtonUIState buttonUIState;
        SurveyTimePickerDialogUIState surveyTimePickerDialogUIState4;
        LoadingDialogUIState loadingDialogUIState3;
        Function1 function5;
        ProfileSurveyUIState profileSurveyUIState6;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        ImageUIState imageUIState4;
        ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState5 = chaloBusUserProfileSurveyDataState;
        Function1 function6 = function1;
        if (continuationImpl instanceof ChaloBusUserProfileSurveyUiStateFactory$buildUiState$1) {
            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1 = (ChaloBusUserProfileSurveyUiStateFactory$buildUiState$1) continuationImpl;
            int i = chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1 = new ChaloBusUserProfileSurveyUiStateFactory$buildUiState$1(this, continuationImpl);
            }
        } else {
            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1 = new ChaloBusUserProfileSurveyUiStateFactory$buildUiState$1(this, continuationImpl);
        }
        Object objB3 = chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        ChaloColorToken.Black black3 = ChaloColorToken.Black.f9759a;
        DialogUIStateFactory dialogUIStateFactory = DialogUIStateFactory.f9989a;
        StringProvider stringProvider2 = this.f1225a;
        switch (i2) {
            case 0:
                z = true;
                ResultKt.b(objB3);
                boolean z10 = chaloBusUserProfileSurveyDataState5.g;
                int i3 = chaloBusUserProfileSurveyDataState5.c;
                List list = chaloBusUserProfileSurveyDataState5.b;
                if (z10 || chaloBusUserProfileSurveyDataState5.h) {
                    if (chaloBusUserProfileSurveyDataState5.d) {
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = dialogUIStateFactory;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 1;
                        objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objB3 != obj) {
                            dialogUIStateFactory.getClass();
                            loadingDialogUIStateA = DialogUIStateFactory.a((String) objB3);
                        }
                        return obj;
                    }
                    loadingDialogUIStateA = null;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = loadingDialogUIStateA;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = null;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = null;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 2;
                    objC = c(chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                    if (objC != obj) {
                        loadingDialogUIState = loadingDialogUIStateA;
                        return new ChaloBusUserProfileSurveyViewState(null, loadingDialogUIState, (ProfileSurveyUIState) objC, null, null, null, null);
                    }
                    return obj;
                }
                pBUserProfileSurveyInputState = (PBUserProfileSurveyInputState) CollectionsKt.L(i3, list);
                if (list.isEmpty()) {
                    pBUserProfileSurveyInputState2 = pBUserProfileSurveyInputState;
                    chaloTextUIState = null;
                    if (pBUserProfileSurveyInputState2 instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) {
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = pBUserProfileSurveyInputState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = chaloTextUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 4;
                        objE = e((PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) pBUserProfileSurveyInputState2, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objE != obj) {
                            chaloBusUserProfileSurveyDataState2 = chaloBusUserProfileSurveyDataState5;
                            chaloTextUIState3 = chaloTextUIState;
                            objB3 = objE;
                            PBUserProfileSurveyInputState pBUserProfileSurveyInputState5 = pBUserProfileSurveyInputState2;
                            function2 = function6;
                            pBUserProfileSurveyInputState4 = pBUserProfileSurveyInputState5;
                            profileSurveyUIState = (ProfileSurveyUIState) objB3;
                            Function1 function7 = function2;
                            chaloTextUIState2 = chaloTextUIState3;
                            chaloBusUserProfileSurveyDataState5 = chaloBusUserProfileSurveyDataState2;
                            pBUserProfileSurveyInputState3 = pBUserProfileSurveyInputState4;
                            function6 = function7;
                            z2 = pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile;
                            if (z2) {
                                z3 = z;
                            } else {
                                z3 = z;
                            }
                            if (z3) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 6;
                            objA = a(pBUserProfileSurveyInputState3, chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objA != obj) {
                                boolean z11 = z3;
                                function3 = function6;
                                z5 = z11;
                                profileSurveyUIState2 = profileSurveyUIState;
                                objB3 = objA;
                                chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState5;
                                z6 = z4;
                                chaloTextUIState4 = chaloTextUIState2;
                                surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                                if (chaloBusUserProfileSurveyDataState3.d) {
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                                    objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                    if (objB3 == obj) {
                                        dialogUIStateFactory.getClass();
                                        profileSurveyUIState3 = profileSurveyUIState2;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        function4 = function3;
                                        loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                                    }
                                } else {
                                    black3 = black3;
                                    profileSurveyUIState3 = profileSurveyUIState2;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    function4 = function3;
                                    loadingDialogUIStateA2 = null;
                                }
                                z7 = z5;
                                z8 = z6;
                                chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                                black = black3;
                                stringProvider = stringProvider2;
                                imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                                if (!z7) {
                                    TextUIState.ChaloTextUIState chaloTextUIState9 = chaloTextUIState5;
                                    surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                                    loadingDialogUIState2 = loadingDialogUIStateA2;
                                    chaloTextUIState6 = chaloTextUIState9;
                                    z9 = z8;
                                    buttonUIStateD = null;
                                    if (z7) {
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                        objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                        if (objB3 != obj) {
                                            function5 = function4;
                                            profileSurveyUIState6 = profileSurveyUIState3;
                                            chaloTextUIState8 = chaloTextUIState6;
                                            imageUIState4 = imageUIState;
                                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                            imageUIState3 = imageUIState4;
                                            profileSurveyUIState5 = profileSurveyUIState6;
                                            chaloTextUIState7 = chaloTextUIState8;
                                            buttonUIState = buttonUIStateD;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        }
                                    } else {
                                        profileSurveyUIState5 = profileSurveyUIState3;
                                        chaloTextUIState7 = chaloTextUIState6;
                                        imageUIState3 = imageUIState;
                                        buttonUIStateF = null;
                                        buttonUIState = buttonUIStateD;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                    }
                                    return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                                }
                                black2 = black;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                                objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                if (objB2 != obj) {
                                    surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                                    profileSurveyUIState4 = profileSurveyUIState3;
                                    buttonUIStateFactory = buttonUIStateFactory2;
                                    imageUIState2 = imageUIState;
                                    ButtonUIStateFactory buttonUIStateFactory3 = buttonUIStateFactory;
                                    boolean z12 = z8;
                                    buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory3, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                                    z9 = z12;
                                    imageUIState = imageUIState2;
                                    loadingDialogUIState2 = loadingDialogUIStateA2;
                                    profileSurveyUIState3 = profileSurveyUIState4;
                                    chaloTextUIState6 = chaloTextUIState5;
                                    surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                                    if (z7) {
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                        objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                        if (objB3 != obj) {
                                            function5 = function4;
                                            profileSurveyUIState6 = profileSurveyUIState3;
                                            chaloTextUIState8 = chaloTextUIState6;
                                            imageUIState4 = imageUIState;
                                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                            imageUIState3 = imageUIState4;
                                            profileSurveyUIState5 = profileSurveyUIState6;
                                            chaloTextUIState7 = chaloTextUIState8;
                                            buttonUIState = buttonUIStateD;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        }
                                    } else {
                                        profileSurveyUIState5 = profileSurveyUIState3;
                                        chaloTextUIState7 = chaloTextUIState6;
                                        imageUIState3 = imageUIState;
                                        buttonUIStateF = null;
                                        buttonUIState = buttonUIStateD;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                    }
                                    return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                                }
                            }
                        }
                        return obj;
                    }
                    if (pBUserProfileSurveyInputState2 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) {
                        if (pBUserProfileSurveyInputState2 instanceof PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) {
                        }
                        pBUserProfileSurveyInputState3 = pBUserProfileSurveyInputState2;
                        chaloTextUIState2 = chaloTextUIState;
                        profileSurveyUIState = null;
                        z2 = pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile;
                        if (z2) {
                            z3 = z;
                        } else {
                            z3 = z;
                        }
                        if (z3) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 6;
                        objA = a(pBUserProfileSurveyInputState3, chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objA != obj) {
                            boolean z13 = z3;
                            function3 = function6;
                            z5 = z13;
                            profileSurveyUIState2 = profileSurveyUIState;
                            objB3 = objA;
                            chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState5;
                            z6 = z4;
                            chaloTextUIState4 = chaloTextUIState2;
                            surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                            if (chaloBusUserProfileSurveyDataState3.d) {
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                                objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                if (objB3 == obj) {
                                    dialogUIStateFactory.getClass();
                                    profileSurveyUIState3 = profileSurveyUIState2;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    function4 = function3;
                                    loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                                }
                            } else {
                                black3 = black3;
                                profileSurveyUIState3 = profileSurveyUIState2;
                                chaloTextUIState5 = chaloTextUIState4;
                                function4 = function3;
                                loadingDialogUIStateA2 = null;
                            }
                            z7 = z5;
                            z8 = z6;
                            chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                            black = black3;
                            stringProvider = stringProvider2;
                            imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                            if (!z7) {
                                TextUIState.ChaloTextUIState chaloTextUIState10 = chaloTextUIState5;
                                surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                                loadingDialogUIState2 = loadingDialogUIStateA2;
                                chaloTextUIState6 = chaloTextUIState10;
                                z9 = z8;
                                buttonUIStateD = null;
                                if (z7) {
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                    objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                    if (objB3 != obj) {
                                        function5 = function4;
                                        profileSurveyUIState6 = profileSurveyUIState3;
                                        chaloTextUIState8 = chaloTextUIState6;
                                        imageUIState4 = imageUIState;
                                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                        imageUIState3 = imageUIState4;
                                        profileSurveyUIState5 = profileSurveyUIState6;
                                        chaloTextUIState7 = chaloTextUIState8;
                                        buttonUIState = buttonUIStateD;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    }
                                } else {
                                    profileSurveyUIState5 = profileSurveyUIState3;
                                    chaloTextUIState7 = chaloTextUIState6;
                                    imageUIState3 = imageUIState;
                                    buttonUIStateF = null;
                                    buttonUIState = buttonUIStateD;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                }
                                return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                            }
                            black2 = black;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                            objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objB2 != obj) {
                                surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                                profileSurveyUIState4 = profileSurveyUIState3;
                                buttonUIStateFactory = buttonUIStateFactory2;
                                imageUIState2 = imageUIState;
                                ButtonUIStateFactory buttonUIStateFactory4 = buttonUIStateFactory;
                                boolean z14 = z8;
                                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory4, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                                z9 = z14;
                                imageUIState = imageUIState2;
                                loadingDialogUIState2 = loadingDialogUIStateA2;
                                profileSurveyUIState3 = profileSurveyUIState4;
                                chaloTextUIState6 = chaloTextUIState5;
                                surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                                if (z7) {
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                    objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                    if (objB3 != obj) {
                                        function5 = function4;
                                        profileSurveyUIState6 = profileSurveyUIState3;
                                        chaloTextUIState8 = chaloTextUIState6;
                                        imageUIState4 = imageUIState;
                                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                        imageUIState3 = imageUIState4;
                                        profileSurveyUIState5 = profileSurveyUIState6;
                                        chaloTextUIState7 = chaloTextUIState8;
                                        buttonUIState = buttonUIStateD;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    }
                                } else {
                                    profileSurveyUIState5 = profileSurveyUIState3;
                                    chaloTextUIState7 = chaloTextUIState6;
                                    imageUIState3 = imageUIState;
                                    buttonUIStateF = null;
                                    buttonUIState = buttonUIStateD;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                }
                                return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                            }
                        }
                        return obj;
                    }
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = pBUserProfileSurveyInputState2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = chaloTextUIState;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 5;
                    objD = d((PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) pBUserProfileSurveyInputState2, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                    if (objD != obj) {
                        chaloBusUserProfileSurveyDataState2 = chaloBusUserProfileSurveyDataState5;
                        chaloTextUIState3 = chaloTextUIState;
                        objB3 = objD;
                        PBUserProfileSurveyInputState pBUserProfileSurveyInputState6 = pBUserProfileSurveyInputState2;
                        function2 = function6;
                        pBUserProfileSurveyInputState4 = pBUserProfileSurveyInputState6;
                        profileSurveyUIState = (ProfileSurveyUIState) objB3;
                        Function1 function8 = function2;
                        chaloTextUIState2 = chaloTextUIState3;
                        chaloBusUserProfileSurveyDataState5 = chaloBusUserProfileSurveyDataState2;
                        pBUserProfileSurveyInputState3 = pBUserProfileSurveyInputState4;
                        function6 = function8;
                        z2 = pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile;
                        if (z2) {
                            z3 = z;
                        } else {
                            z3 = z;
                        }
                        if (z3) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 6;
                        objA = a(pBUserProfileSurveyInputState3, chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objA != obj) {
                            boolean z15 = z3;
                            function3 = function6;
                            z5 = z15;
                            profileSurveyUIState2 = profileSurveyUIState;
                            objB3 = objA;
                            chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState5;
                            z6 = z4;
                            chaloTextUIState4 = chaloTextUIState2;
                            surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                            if (chaloBusUserProfileSurveyDataState3.d) {
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                                objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                if (objB3 == obj) {
                                    dialogUIStateFactory.getClass();
                                    profileSurveyUIState3 = profileSurveyUIState2;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    function4 = function3;
                                    loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                                }
                            } else {
                                black3 = black3;
                                profileSurveyUIState3 = profileSurveyUIState2;
                                chaloTextUIState5 = chaloTextUIState4;
                                function4 = function3;
                                loadingDialogUIStateA2 = null;
                            }
                            z7 = z5;
                            z8 = z6;
                            chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                            black = black3;
                            stringProvider = stringProvider2;
                            imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                            if (!z7) {
                                TextUIState.ChaloTextUIState chaloTextUIState11 = chaloTextUIState5;
                                surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                                loadingDialogUIState2 = loadingDialogUIStateA2;
                                chaloTextUIState6 = chaloTextUIState11;
                                z9 = z8;
                                buttonUIStateD = null;
                                if (z7) {
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                    objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                    if (objB3 != obj) {
                                        function5 = function4;
                                        profileSurveyUIState6 = profileSurveyUIState3;
                                        chaloTextUIState8 = chaloTextUIState6;
                                        imageUIState4 = imageUIState;
                                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                        imageUIState3 = imageUIState4;
                                        profileSurveyUIState5 = profileSurveyUIState6;
                                        chaloTextUIState7 = chaloTextUIState8;
                                        buttonUIState = buttonUIStateD;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    }
                                } else {
                                    profileSurveyUIState5 = profileSurveyUIState3;
                                    chaloTextUIState7 = chaloTextUIState6;
                                    imageUIState3 = imageUIState;
                                    buttonUIStateF = null;
                                    buttonUIState = buttonUIStateD;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                }
                                return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                            }
                            black2 = black;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                            objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objB2 != obj) {
                                surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                                profileSurveyUIState4 = profileSurveyUIState3;
                                buttonUIStateFactory = buttonUIStateFactory2;
                                imageUIState2 = imageUIState;
                                ButtonUIStateFactory buttonUIStateFactory5 = buttonUIStateFactory;
                                boolean z16 = z8;
                                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory5, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                                z9 = z16;
                                imageUIState = imageUIState2;
                                loadingDialogUIState2 = loadingDialogUIStateA2;
                                profileSurveyUIState3 = profileSurveyUIState4;
                                chaloTextUIState6 = chaloTextUIState5;
                                surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                                if (z7) {
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                    objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                    if (objB3 != obj) {
                                        function5 = function4;
                                        profileSurveyUIState6 = profileSurveyUIState3;
                                        chaloTextUIState8 = chaloTextUIState6;
                                        imageUIState4 = imageUIState;
                                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                        imageUIState3 = imageUIState4;
                                        profileSurveyUIState5 = profileSurveyUIState6;
                                        chaloTextUIState7 = chaloTextUIState8;
                                        buttonUIState = buttonUIStateD;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    }
                                } else {
                                    profileSurveyUIState5 = profileSurveyUIState3;
                                    chaloTextUIState7 = chaloTextUIState6;
                                    imageUIState3 = imageUIState;
                                    buttonUIStateF = null;
                                    buttonUIState = buttonUIStateD;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                }
                                return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                            }
                        }
                    }
                    return obj;
                }
                StringEnum stringEnum = StringEnum.PB_USER_PROFILE_SURVEY_STEP_X_OF_Y;
                Object[] objArr = {new Integer(i3 + 1), new Integer(list.size())};
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = pBUserProfileSurveyInputState;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 3;
                objB = stringProvider2.b(stringEnum, objArr, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                if (objB != obj) {
                    TextUIState.ChaloTextUIState chaloTextUIState12 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    pBUserProfileSurveyInputState2 = pBUserProfileSurveyInputState;
                    chaloTextUIState = chaloTextUIState12;
                    if (pBUserProfileSurveyInputState2 instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) {
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = pBUserProfileSurveyInputState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = chaloTextUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 4;
                        objE = e((PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) pBUserProfileSurveyInputState2, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objE != obj) {
                            chaloBusUserProfileSurveyDataState2 = chaloBusUserProfileSurveyDataState5;
                            chaloTextUIState3 = chaloTextUIState;
                            objB3 = objE;
                            PBUserProfileSurveyInputState pBUserProfileSurveyInputState7 = pBUserProfileSurveyInputState2;
                            function2 = function6;
                            pBUserProfileSurveyInputState4 = pBUserProfileSurveyInputState7;
                            profileSurveyUIState = (ProfileSurveyUIState) objB3;
                            Function1 function9 = function2;
                            chaloTextUIState2 = chaloTextUIState3;
                            chaloBusUserProfileSurveyDataState5 = chaloBusUserProfileSurveyDataState2;
                            pBUserProfileSurveyInputState3 = pBUserProfileSurveyInputState4;
                            function6 = function9;
                            z2 = pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile;
                            if (z2 || (pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile)) {
                                z3 = z;
                            } else {
                                if (!(pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) && !(pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile) && pBUserProfileSurveyInputState3 != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z3 = false;
                            }
                            if (z3 || chaloBusUserProfileSurveyDataState5.d) {
                                z4 = false;
                            } else if (pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) {
                                PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) pBUserProfileSurveyInputState3;
                                if (workTimingInputPBUserProfile.c == null || workTimingInputPBUserProfile.e == null) {
                                    z4 = false;
                                } else {
                                    z4 = z;
                                }
                            } else {
                                if (z2) {
                                    if (((PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) pBUserProfileSurveyInputState3).c != null) {
                                        z4 = z;
                                    }
                                } else if (!(pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) && !(pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile) && pBUserProfileSurveyInputState3 != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z4 = false;
                            }
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 6;
                            objA = a(pBUserProfileSurveyInputState3, chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objA != obj) {
                                boolean z17 = z3;
                                function3 = function6;
                                z5 = z17;
                                profileSurveyUIState2 = profileSurveyUIState;
                                objB3 = objA;
                                chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState5;
                                z6 = z4;
                                chaloTextUIState4 = chaloTextUIState2;
                                surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                                if (chaloBusUserProfileSurveyDataState3.d) {
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                                    objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                    if (objB3 == obj) {
                                        dialogUIStateFactory.getClass();
                                        profileSurveyUIState3 = profileSurveyUIState2;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        function4 = function3;
                                        loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                                    }
                                } else {
                                    black3 = black3;
                                    profileSurveyUIState3 = profileSurveyUIState2;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    function4 = function3;
                                    loadingDialogUIStateA2 = null;
                                }
                                z7 = z5;
                                z8 = z6;
                                chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                                black = black3;
                                stringProvider = stringProvider2;
                                imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                                if (!z7) {
                                    TextUIState.ChaloTextUIState chaloTextUIState13 = chaloTextUIState5;
                                    surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                                    loadingDialogUIState2 = loadingDialogUIStateA2;
                                    chaloTextUIState6 = chaloTextUIState13;
                                    z9 = z8;
                                    buttonUIStateD = null;
                                    if (z7) {
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                        objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                        if (objB3 != obj) {
                                            function5 = function4;
                                            profileSurveyUIState6 = profileSurveyUIState3;
                                            chaloTextUIState8 = chaloTextUIState6;
                                            imageUIState4 = imageUIState;
                                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                            imageUIState3 = imageUIState4;
                                            profileSurveyUIState5 = profileSurveyUIState6;
                                            chaloTextUIState7 = chaloTextUIState8;
                                            buttonUIState = buttonUIStateD;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        }
                                    } else {
                                        profileSurveyUIState5 = profileSurveyUIState3;
                                        chaloTextUIState7 = chaloTextUIState6;
                                        imageUIState3 = imageUIState;
                                        buttonUIStateF = null;
                                        buttonUIState = buttonUIStateD;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                    }
                                    return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                                }
                                black2 = black;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                                objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                if (objB2 != obj) {
                                    surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                                    profileSurveyUIState4 = profileSurveyUIState3;
                                    buttonUIStateFactory = buttonUIStateFactory2;
                                    imageUIState2 = imageUIState;
                                    ButtonUIStateFactory buttonUIStateFactory6 = buttonUIStateFactory;
                                    boolean z18 = z8;
                                    buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory6, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                                    z9 = z18;
                                    imageUIState = imageUIState2;
                                    loadingDialogUIState2 = loadingDialogUIStateA2;
                                    profileSurveyUIState3 = profileSurveyUIState4;
                                    chaloTextUIState6 = chaloTextUIState5;
                                    surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                                    if (z7) {
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                        objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                        if (objB3 != obj) {
                                            function5 = function4;
                                            profileSurveyUIState6 = profileSurveyUIState3;
                                            chaloTextUIState8 = chaloTextUIState6;
                                            imageUIState4 = imageUIState;
                                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                            imageUIState3 = imageUIState4;
                                            profileSurveyUIState5 = profileSurveyUIState6;
                                            chaloTextUIState7 = chaloTextUIState8;
                                            buttonUIState = buttonUIStateD;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        }
                                    } else {
                                        profileSurveyUIState5 = profileSurveyUIState3;
                                        chaloTextUIState7 = chaloTextUIState6;
                                        imageUIState3 = imageUIState;
                                        buttonUIStateF = null;
                                        buttonUIState = buttonUIStateD;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                    }
                                    return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                                }
                            }
                        }
                    } else if (pBUserProfileSurveyInputState2 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) {
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = pBUserProfileSurveyInputState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = chaloTextUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 5;
                        objD = d((PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) pBUserProfileSurveyInputState2, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objD != obj) {
                            chaloBusUserProfileSurveyDataState2 = chaloBusUserProfileSurveyDataState5;
                            chaloTextUIState3 = chaloTextUIState;
                            objB3 = objD;
                            PBUserProfileSurveyInputState pBUserProfileSurveyInputState8 = pBUserProfileSurveyInputState2;
                            function2 = function6;
                            pBUserProfileSurveyInputState4 = pBUserProfileSurveyInputState8;
                            profileSurveyUIState = (ProfileSurveyUIState) objB3;
                            Function1 function10 = function2;
                            chaloTextUIState2 = chaloTextUIState3;
                            chaloBusUserProfileSurveyDataState5 = chaloBusUserProfileSurveyDataState2;
                            pBUserProfileSurveyInputState3 = pBUserProfileSurveyInputState4;
                            function6 = function10;
                            z2 = pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile;
                            if (z2) {
                                z3 = z;
                            } else {
                                z3 = z;
                            }
                            if (z3) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 6;
                            objA = a(pBUserProfileSurveyInputState3, chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objA != obj) {
                                boolean z19 = z3;
                                function3 = function6;
                                z5 = z19;
                                profileSurveyUIState2 = profileSurveyUIState;
                                objB3 = objA;
                                chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState5;
                                z6 = z4;
                                chaloTextUIState4 = chaloTextUIState2;
                                surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                                if (chaloBusUserProfileSurveyDataState3.d) {
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                                    objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                    if (objB3 == obj) {
                                        dialogUIStateFactory.getClass();
                                        profileSurveyUIState3 = profileSurveyUIState2;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        function4 = function3;
                                        loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                                    }
                                } else {
                                    black3 = black3;
                                    profileSurveyUIState3 = profileSurveyUIState2;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    function4 = function3;
                                    loadingDialogUIStateA2 = null;
                                }
                                z7 = z5;
                                z8 = z6;
                                chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                                black = black3;
                                stringProvider = stringProvider2;
                                imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                                if (!z7) {
                                    TextUIState.ChaloTextUIState chaloTextUIState14 = chaloTextUIState5;
                                    surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                                    loadingDialogUIState2 = loadingDialogUIStateA2;
                                    chaloTextUIState6 = chaloTextUIState14;
                                    z9 = z8;
                                    buttonUIStateD = null;
                                    if (z7) {
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                        objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                        if (objB3 != obj) {
                                            function5 = function4;
                                            profileSurveyUIState6 = profileSurveyUIState3;
                                            chaloTextUIState8 = chaloTextUIState6;
                                            imageUIState4 = imageUIState;
                                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                            imageUIState3 = imageUIState4;
                                            profileSurveyUIState5 = profileSurveyUIState6;
                                            chaloTextUIState7 = chaloTextUIState8;
                                            buttonUIState = buttonUIStateD;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        }
                                    } else {
                                        profileSurveyUIState5 = profileSurveyUIState3;
                                        chaloTextUIState7 = chaloTextUIState6;
                                        imageUIState3 = imageUIState;
                                        buttonUIStateF = null;
                                        buttonUIState = buttonUIStateD;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                    }
                                    return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                                }
                                black2 = black;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                                objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                if (objB2 != obj) {
                                    surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                                    profileSurveyUIState4 = profileSurveyUIState3;
                                    buttonUIStateFactory = buttonUIStateFactory2;
                                    imageUIState2 = imageUIState;
                                    ButtonUIStateFactory buttonUIStateFactory7 = buttonUIStateFactory;
                                    boolean z110 = z8;
                                    buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory7, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                                    z9 = z110;
                                    imageUIState = imageUIState2;
                                    loadingDialogUIState2 = loadingDialogUIStateA2;
                                    profileSurveyUIState3 = profileSurveyUIState4;
                                    chaloTextUIState6 = chaloTextUIState5;
                                    surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                                    if (z7) {
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                        objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                        if (objB3 != obj) {
                                            function5 = function4;
                                            profileSurveyUIState6 = profileSurveyUIState3;
                                            chaloTextUIState8 = chaloTextUIState6;
                                            imageUIState4 = imageUIState;
                                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                            imageUIState3 = imageUIState4;
                                            profileSurveyUIState5 = profileSurveyUIState6;
                                            chaloTextUIState7 = chaloTextUIState8;
                                            buttonUIState = buttonUIStateD;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        }
                                    } else {
                                        profileSurveyUIState5 = profileSurveyUIState3;
                                        chaloTextUIState7 = chaloTextUIState6;
                                        imageUIState3 = imageUIState;
                                        buttonUIStateF = null;
                                        buttonUIState = buttonUIStateD;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                    }
                                    return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                                }
                            }
                        }
                    } else {
                        if ((pBUserProfileSurveyInputState2 instanceof PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) && !(pBUserProfileSurveyInputState2 instanceof PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile) && pBUserProfileSurveyInputState2 != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pBUserProfileSurveyInputState3 = pBUserProfileSurveyInputState2;
                        chaloTextUIState2 = chaloTextUIState;
                        profileSurveyUIState = null;
                        z2 = pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile;
                        if (z2) {
                            z3 = z;
                        } else {
                            z3 = z;
                        }
                        if (z3) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 6;
                        objA = a(pBUserProfileSurveyInputState3, chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objA != obj) {
                            boolean z111 = z3;
                            function3 = function6;
                            z5 = z111;
                            profileSurveyUIState2 = profileSurveyUIState;
                            objB3 = objA;
                            chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState5;
                            z6 = z4;
                            chaloTextUIState4 = chaloTextUIState2;
                            surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                            if (chaloBusUserProfileSurveyDataState3.d) {
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                                objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                if (objB3 == obj) {
                                    dialogUIStateFactory.getClass();
                                    profileSurveyUIState3 = profileSurveyUIState2;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    function4 = function3;
                                    loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                                }
                            } else {
                                black3 = black3;
                                profileSurveyUIState3 = profileSurveyUIState2;
                                chaloTextUIState5 = chaloTextUIState4;
                                function4 = function3;
                                loadingDialogUIStateA2 = null;
                            }
                            z7 = z5;
                            z8 = z6;
                            chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                            black = black3;
                            stringProvider = stringProvider2;
                            imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                            if (!z7) {
                                TextUIState.ChaloTextUIState chaloTextUIState15 = chaloTextUIState5;
                                surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                                loadingDialogUIState2 = loadingDialogUIStateA2;
                                chaloTextUIState6 = chaloTextUIState15;
                                z9 = z8;
                                buttonUIStateD = null;
                                if (z7) {
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                    objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                    if (objB3 != obj) {
                                        function5 = function4;
                                        profileSurveyUIState6 = profileSurveyUIState3;
                                        chaloTextUIState8 = chaloTextUIState6;
                                        imageUIState4 = imageUIState;
                                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                        imageUIState3 = imageUIState4;
                                        profileSurveyUIState5 = profileSurveyUIState6;
                                        chaloTextUIState7 = chaloTextUIState8;
                                        buttonUIState = buttonUIStateD;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    }
                                } else {
                                    profileSurveyUIState5 = profileSurveyUIState3;
                                    chaloTextUIState7 = chaloTextUIState6;
                                    imageUIState3 = imageUIState;
                                    buttonUIStateF = null;
                                    buttonUIState = buttonUIStateD;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                }
                                return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                            }
                            black2 = black;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                            objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objB2 != obj) {
                                surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                                profileSurveyUIState4 = profileSurveyUIState3;
                                buttonUIStateFactory = buttonUIStateFactory2;
                                imageUIState2 = imageUIState;
                                ButtonUIStateFactory buttonUIStateFactory8 = buttonUIStateFactory;
                                boolean z112 = z8;
                                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory8, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                                z9 = z112;
                                imageUIState = imageUIState2;
                                loadingDialogUIState2 = loadingDialogUIStateA2;
                                profileSurveyUIState3 = profileSurveyUIState4;
                                chaloTextUIState6 = chaloTextUIState5;
                                surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                                if (z7) {
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                    objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                    if (objB3 != obj) {
                                        function5 = function4;
                                        profileSurveyUIState6 = profileSurveyUIState3;
                                        chaloTextUIState8 = chaloTextUIState6;
                                        imageUIState4 = imageUIState;
                                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                        imageUIState3 = imageUIState4;
                                        profileSurveyUIState5 = profileSurveyUIState6;
                                        chaloTextUIState7 = chaloTextUIState8;
                                        buttonUIState = buttonUIStateD;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    }
                                } else {
                                    profileSurveyUIState5 = profileSurveyUIState3;
                                    chaloTextUIState7 = chaloTextUIState6;
                                    imageUIState3 = imageUIState;
                                    buttonUIStateF = null;
                                    buttonUIState = buttonUIStateD;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                }
                                return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                            }
                        }
                    }
                }
                return obj;
                return obj;
                return obj;
            case 1:
                dialogUIStateFactory = (DialogUIStateFactory) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2;
                Function1 function11 = (Function1) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1;
                ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState6 = (ChaloBusUserProfileSurveyDataState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0;
                ResultKt.b(objB3);
                function6 = function11;
                chaloBusUserProfileSurveyDataState5 = chaloBusUserProfileSurveyDataState6;
                dialogUIStateFactory.getClass();
                loadingDialogUIStateA = DialogUIStateFactory.a((String) objB3);
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = loadingDialogUIStateA;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = null;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = null;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 2;
                objC = c(chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                if (objC != obj) {
                    loadingDialogUIState = loadingDialogUIStateA;
                    return new ChaloBusUserProfileSurveyViewState(null, loadingDialogUIState, (ProfileSurveyUIState) objC, null, null, null, null);
                }
                return obj;
            case 2:
                LoadingDialogUIState loadingDialogUIState4 = (LoadingDialogUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0;
                ResultKt.b(objB3);
                loadingDialogUIState = loadingDialogUIState4;
                objC = objB3;
                return new ChaloBusUserProfileSurveyViewState(null, loadingDialogUIState, (ProfileSurveyUIState) objC, null, null, null, null);
            case 3:
                z = true;
                PBUserProfileSurveyInputState pBUserProfileSurveyInputState9 = (PBUserProfileSurveyInputState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2;
                function6 = (Function1) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1;
                ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState7 = (ChaloBusUserProfileSurveyDataState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0;
                ResultKt.b(objB3);
                pBUserProfileSurveyInputState = pBUserProfileSurveyInputState9;
                chaloBusUserProfileSurveyDataState5 = chaloBusUserProfileSurveyDataState7;
                objB = objB3;
                TextUIState.ChaloTextUIState chaloTextUIState16 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                pBUserProfileSurveyInputState2 = pBUserProfileSurveyInputState;
                chaloTextUIState = chaloTextUIState16;
                if (pBUserProfileSurveyInputState2 instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) {
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = pBUserProfileSurveyInputState2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = chaloTextUIState;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 4;
                    objE = e((PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) pBUserProfileSurveyInputState2, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                    if (objE != obj) {
                        chaloBusUserProfileSurveyDataState2 = chaloBusUserProfileSurveyDataState5;
                        chaloTextUIState3 = chaloTextUIState;
                        objB3 = objE;
                        PBUserProfileSurveyInputState pBUserProfileSurveyInputState10 = pBUserProfileSurveyInputState2;
                        function2 = function6;
                        pBUserProfileSurveyInputState4 = pBUserProfileSurveyInputState10;
                        profileSurveyUIState = (ProfileSurveyUIState) objB3;
                        Function1 function12 = function2;
                        chaloTextUIState2 = chaloTextUIState3;
                        chaloBusUserProfileSurveyDataState5 = chaloBusUserProfileSurveyDataState2;
                        pBUserProfileSurveyInputState3 = pBUserProfileSurveyInputState4;
                        function6 = function12;
                        z2 = pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile;
                        if (z2) {
                            z3 = z;
                        } else {
                            z3 = z;
                        }
                        if (z3) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 6;
                        objA = a(pBUserProfileSurveyInputState3, chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objA != obj) {
                            boolean z113 = z3;
                            function3 = function6;
                            z5 = z113;
                            profileSurveyUIState2 = profileSurveyUIState;
                            objB3 = objA;
                            chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState5;
                            z6 = z4;
                            chaloTextUIState4 = chaloTextUIState2;
                            surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                            if (chaloBusUserProfileSurveyDataState3.d) {
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                                objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                if (objB3 == obj) {
                                    dialogUIStateFactory.getClass();
                                    profileSurveyUIState3 = profileSurveyUIState2;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    function4 = function3;
                                    loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                                }
                            } else {
                                black3 = black3;
                                profileSurveyUIState3 = profileSurveyUIState2;
                                chaloTextUIState5 = chaloTextUIState4;
                                function4 = function3;
                                loadingDialogUIStateA2 = null;
                            }
                            z7 = z5;
                            z8 = z6;
                            chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                            black = black3;
                            stringProvider = stringProvider2;
                            imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                            if (!z7) {
                                TextUIState.ChaloTextUIState chaloTextUIState17 = chaloTextUIState5;
                                surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                                loadingDialogUIState2 = loadingDialogUIStateA2;
                                chaloTextUIState6 = chaloTextUIState17;
                                z9 = z8;
                                buttonUIStateD = null;
                                if (z7) {
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                    objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                    if (objB3 != obj) {
                                        function5 = function4;
                                        profileSurveyUIState6 = profileSurveyUIState3;
                                        chaloTextUIState8 = chaloTextUIState6;
                                        imageUIState4 = imageUIState;
                                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                        imageUIState3 = imageUIState4;
                                        profileSurveyUIState5 = profileSurveyUIState6;
                                        chaloTextUIState7 = chaloTextUIState8;
                                        buttonUIState = buttonUIStateD;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    }
                                } else {
                                    profileSurveyUIState5 = profileSurveyUIState3;
                                    chaloTextUIState7 = chaloTextUIState6;
                                    imageUIState3 = imageUIState;
                                    buttonUIStateF = null;
                                    buttonUIState = buttonUIStateD;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                }
                                return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                            }
                            black2 = black;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                            objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objB2 != obj) {
                                surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                                profileSurveyUIState4 = profileSurveyUIState3;
                                buttonUIStateFactory = buttonUIStateFactory2;
                                imageUIState2 = imageUIState;
                                ButtonUIStateFactory buttonUIStateFactory9 = buttonUIStateFactory;
                                boolean z114 = z8;
                                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory9, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                                z9 = z114;
                                imageUIState = imageUIState2;
                                loadingDialogUIState2 = loadingDialogUIStateA2;
                                profileSurveyUIState3 = profileSurveyUIState4;
                                chaloTextUIState6 = chaloTextUIState5;
                                surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                                if (z7) {
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                    objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                    if (objB3 != obj) {
                                        function5 = function4;
                                        profileSurveyUIState6 = profileSurveyUIState3;
                                        chaloTextUIState8 = chaloTextUIState6;
                                        imageUIState4 = imageUIState;
                                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                        imageUIState3 = imageUIState4;
                                        profileSurveyUIState5 = profileSurveyUIState6;
                                        chaloTextUIState7 = chaloTextUIState8;
                                        buttonUIState = buttonUIStateD;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    }
                                } else {
                                    profileSurveyUIState5 = profileSurveyUIState3;
                                    chaloTextUIState7 = chaloTextUIState6;
                                    imageUIState3 = imageUIState;
                                    buttonUIStateF = null;
                                    buttonUIState = buttonUIStateD;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                }
                                return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                            }
                        }
                    }
                    return obj;
                }
                if (pBUserProfileSurveyInputState2 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) {
                    if (pBUserProfileSurveyInputState2 instanceof PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) {
                        break;
                    }
                    pBUserProfileSurveyInputState3 = pBUserProfileSurveyInputState2;
                    chaloTextUIState2 = chaloTextUIState;
                    profileSurveyUIState = null;
                    z2 = pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile;
                    if (z2) {
                        z3 = z;
                    } else {
                        z3 = z;
                    }
                    if (z3) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z3;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z4;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 6;
                    objA = a(pBUserProfileSurveyInputState3, chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                    if (objA != obj) {
                        boolean z115 = z3;
                        function3 = function6;
                        z5 = z115;
                        profileSurveyUIState2 = profileSurveyUIState;
                        objB3 = objA;
                        chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState5;
                        z6 = z4;
                        chaloTextUIState4 = chaloTextUIState2;
                        surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                        if (chaloBusUserProfileSurveyDataState3.d) {
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                            objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objB3 == obj) {
                                dialogUIStateFactory.getClass();
                                profileSurveyUIState3 = profileSurveyUIState2;
                                chaloTextUIState5 = chaloTextUIState4;
                                function4 = function3;
                                loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                            }
                        } else {
                            black3 = black3;
                            profileSurveyUIState3 = profileSurveyUIState2;
                            chaloTextUIState5 = chaloTextUIState4;
                            function4 = function3;
                            loadingDialogUIStateA2 = null;
                        }
                        z7 = z5;
                        z8 = z6;
                        chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                        black = black3;
                        stringProvider = stringProvider2;
                        imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                        if (!z7) {
                            TextUIState.ChaloTextUIState chaloTextUIState18 = chaloTextUIState5;
                            surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                            loadingDialogUIState2 = loadingDialogUIStateA2;
                            chaloTextUIState6 = chaloTextUIState18;
                            z9 = z8;
                            buttonUIStateD = null;
                            if (z7) {
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                if (objB3 != obj) {
                                    function5 = function4;
                                    profileSurveyUIState6 = profileSurveyUIState3;
                                    chaloTextUIState8 = chaloTextUIState6;
                                    imageUIState4 = imageUIState;
                                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                    imageUIState3 = imageUIState4;
                                    profileSurveyUIState5 = profileSurveyUIState6;
                                    chaloTextUIState7 = chaloTextUIState8;
                                    buttonUIState = buttonUIStateD;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                }
                            } else {
                                profileSurveyUIState5 = profileSurveyUIState3;
                                chaloTextUIState7 = chaloTextUIState6;
                                imageUIState3 = imageUIState;
                                buttonUIStateF = null;
                                buttonUIState = buttonUIStateD;
                                surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                loadingDialogUIState3 = loadingDialogUIState2;
                            }
                            return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                        }
                        black2 = black;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                        objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objB2 != obj) {
                            surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                            profileSurveyUIState4 = profileSurveyUIState3;
                            buttonUIStateFactory = buttonUIStateFactory2;
                            imageUIState2 = imageUIState;
                            ButtonUIStateFactory buttonUIStateFactory10 = buttonUIStateFactory;
                            boolean z116 = z8;
                            buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory10, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                            z9 = z116;
                            imageUIState = imageUIState2;
                            loadingDialogUIState2 = loadingDialogUIStateA2;
                            profileSurveyUIState3 = profileSurveyUIState4;
                            chaloTextUIState6 = chaloTextUIState5;
                            surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                            if (z7) {
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                if (objB3 != obj) {
                                    function5 = function4;
                                    profileSurveyUIState6 = profileSurveyUIState3;
                                    chaloTextUIState8 = chaloTextUIState6;
                                    imageUIState4 = imageUIState;
                                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                    imageUIState3 = imageUIState4;
                                    profileSurveyUIState5 = profileSurveyUIState6;
                                    chaloTextUIState7 = chaloTextUIState8;
                                    buttonUIState = buttonUIStateD;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                }
                            } else {
                                profileSurveyUIState5 = profileSurveyUIState3;
                                chaloTextUIState7 = chaloTextUIState6;
                                imageUIState3 = imageUIState;
                                buttonUIStateF = null;
                                buttonUIState = buttonUIStateD;
                                surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                loadingDialogUIState3 = loadingDialogUIState2;
                            }
                            return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                        }
                    }
                    return obj;
                }
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = pBUserProfileSurveyInputState2;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = chaloTextUIState;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 5;
                objD = d((PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) pBUserProfileSurveyInputState2, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                if (objD != obj) {
                    chaloBusUserProfileSurveyDataState2 = chaloBusUserProfileSurveyDataState5;
                    chaloTextUIState3 = chaloTextUIState;
                    objB3 = objD;
                    PBUserProfileSurveyInputState pBUserProfileSurveyInputState11 = pBUserProfileSurveyInputState2;
                    function2 = function6;
                    pBUserProfileSurveyInputState4 = pBUserProfileSurveyInputState11;
                    profileSurveyUIState = (ProfileSurveyUIState) objB3;
                    Function1 function13 = function2;
                    chaloTextUIState2 = chaloTextUIState3;
                    chaloBusUserProfileSurveyDataState5 = chaloBusUserProfileSurveyDataState2;
                    pBUserProfileSurveyInputState3 = pBUserProfileSurveyInputState4;
                    function6 = function13;
                    z2 = pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile;
                    if (z2) {
                        z3 = z;
                    } else {
                        z3 = z;
                    }
                    if (z3) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z3;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z4;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 6;
                    objA = a(pBUserProfileSurveyInputState3, chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                    if (objA != obj) {
                        boolean z117 = z3;
                        function3 = function6;
                        z5 = z117;
                        profileSurveyUIState2 = profileSurveyUIState;
                        objB3 = objA;
                        chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState5;
                        z6 = z4;
                        chaloTextUIState4 = chaloTextUIState2;
                        surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                        if (chaloBusUserProfileSurveyDataState3.d) {
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                            objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objB3 == obj) {
                                dialogUIStateFactory.getClass();
                                profileSurveyUIState3 = profileSurveyUIState2;
                                chaloTextUIState5 = chaloTextUIState4;
                                function4 = function3;
                                loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                            }
                        } else {
                            black3 = black3;
                            profileSurveyUIState3 = profileSurveyUIState2;
                            chaloTextUIState5 = chaloTextUIState4;
                            function4 = function3;
                            loadingDialogUIStateA2 = null;
                        }
                        z7 = z5;
                        z8 = z6;
                        chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                        black = black3;
                        stringProvider = stringProvider2;
                        imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                        if (!z7) {
                            TextUIState.ChaloTextUIState chaloTextUIState19 = chaloTextUIState5;
                            surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                            loadingDialogUIState2 = loadingDialogUIStateA2;
                            chaloTextUIState6 = chaloTextUIState19;
                            z9 = z8;
                            buttonUIStateD = null;
                            if (z7) {
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                if (objB3 != obj) {
                                    function5 = function4;
                                    profileSurveyUIState6 = profileSurveyUIState3;
                                    chaloTextUIState8 = chaloTextUIState6;
                                    imageUIState4 = imageUIState;
                                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                    imageUIState3 = imageUIState4;
                                    profileSurveyUIState5 = profileSurveyUIState6;
                                    chaloTextUIState7 = chaloTextUIState8;
                                    buttonUIState = buttonUIStateD;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                }
                            } else {
                                profileSurveyUIState5 = profileSurveyUIState3;
                                chaloTextUIState7 = chaloTextUIState6;
                                imageUIState3 = imageUIState;
                                buttonUIStateF = null;
                                buttonUIState = buttonUIStateD;
                                surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                loadingDialogUIState3 = loadingDialogUIState2;
                            }
                            return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                        }
                        black2 = black;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                        objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objB2 != obj) {
                            surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                            profileSurveyUIState4 = profileSurveyUIState3;
                            buttonUIStateFactory = buttonUIStateFactory2;
                            imageUIState2 = imageUIState;
                            ButtonUIStateFactory buttonUIStateFactory11 = buttonUIStateFactory;
                            boolean z118 = z8;
                            buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory11, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                            z9 = z118;
                            imageUIState = imageUIState2;
                            loadingDialogUIState2 = loadingDialogUIStateA2;
                            profileSurveyUIState3 = profileSurveyUIState4;
                            chaloTextUIState6 = chaloTextUIState5;
                            surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                            if (z7) {
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                                objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                                if (objB3 != obj) {
                                    function5 = function4;
                                    profileSurveyUIState6 = profileSurveyUIState3;
                                    chaloTextUIState8 = chaloTextUIState6;
                                    imageUIState4 = imageUIState;
                                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                    imageUIState3 = imageUIState4;
                                    profileSurveyUIState5 = profileSurveyUIState6;
                                    chaloTextUIState7 = chaloTextUIState8;
                                    buttonUIState = buttonUIStateD;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                }
                            } else {
                                profileSurveyUIState5 = profileSurveyUIState3;
                                chaloTextUIState7 = chaloTextUIState6;
                                imageUIState3 = imageUIState;
                                buttonUIStateF = null;
                                buttonUIState = buttonUIStateD;
                                surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                                loadingDialogUIState3 = loadingDialogUIState2;
                            }
                            return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                        }
                    }
                }
                return obj;
                return obj;
            case 4:
                z = true;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3;
                pBUserProfileSurveyInputState4 = (PBUserProfileSurveyInputState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2;
                function2 = (Function1) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1;
                chaloBusUserProfileSurveyDataState2 = (ChaloBusUserProfileSurveyDataState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0;
                ResultKt.b(objB3);
                profileSurveyUIState = (ProfileSurveyUIState) objB3;
                Function1 function14 = function2;
                chaloTextUIState2 = chaloTextUIState3;
                chaloBusUserProfileSurveyDataState5 = chaloBusUserProfileSurveyDataState2;
                pBUserProfileSurveyInputState3 = pBUserProfileSurveyInputState4;
                function6 = function14;
                z2 = pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile;
                if (z2) {
                    z3 = z;
                } else {
                    z3 = z;
                }
                if (z3) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState2;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z3;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z4;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 6;
                objA = a(pBUserProfileSurveyInputState3, chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                if (objA != obj) {
                    boolean z119 = z3;
                    function3 = function6;
                    z5 = z119;
                    profileSurveyUIState2 = profileSurveyUIState;
                    objB3 = objA;
                    chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState5;
                    z6 = z4;
                    chaloTextUIState4 = chaloTextUIState2;
                    surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                    if (chaloBusUserProfileSurveyDataState3.d) {
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                        objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objB3 == obj) {
                            dialogUIStateFactory.getClass();
                            profileSurveyUIState3 = profileSurveyUIState2;
                            chaloTextUIState5 = chaloTextUIState4;
                            function4 = function3;
                            loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                        }
                    } else {
                        black3 = black3;
                        profileSurveyUIState3 = profileSurveyUIState2;
                        chaloTextUIState5 = chaloTextUIState4;
                        function4 = function3;
                        loadingDialogUIStateA2 = null;
                    }
                    z7 = z5;
                    z8 = z6;
                    chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                    black = black3;
                    stringProvider = stringProvider2;
                    imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                    if (!z7) {
                        TextUIState.ChaloTextUIState chaloTextUIState110 = chaloTextUIState5;
                        surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                        loadingDialogUIState2 = loadingDialogUIStateA2;
                        chaloTextUIState6 = chaloTextUIState110;
                        z9 = z8;
                        buttonUIStateD = null;
                        if (z7) {
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                            objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objB3 != obj) {
                                function5 = function4;
                                profileSurveyUIState6 = profileSurveyUIState3;
                                chaloTextUIState8 = chaloTextUIState6;
                                imageUIState4 = imageUIState;
                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                imageUIState3 = imageUIState4;
                                profileSurveyUIState5 = profileSurveyUIState6;
                                chaloTextUIState7 = chaloTextUIState8;
                                buttonUIState = buttonUIStateD;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                            }
                        } else {
                            profileSurveyUIState5 = profileSurveyUIState3;
                            chaloTextUIState7 = chaloTextUIState6;
                            imageUIState3 = imageUIState;
                            buttonUIStateF = null;
                            buttonUIState = buttonUIStateD;
                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                            loadingDialogUIState3 = loadingDialogUIState2;
                        }
                        return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                    }
                    black2 = black;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                    objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                    if (objB2 != obj) {
                        surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                        profileSurveyUIState4 = profileSurveyUIState3;
                        buttonUIStateFactory = buttonUIStateFactory2;
                        imageUIState2 = imageUIState;
                        ButtonUIStateFactory buttonUIStateFactory12 = buttonUIStateFactory;
                        boolean z1110 = z8;
                        buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory12, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                        z9 = z1110;
                        imageUIState = imageUIState2;
                        loadingDialogUIState2 = loadingDialogUIStateA2;
                        profileSurveyUIState3 = profileSurveyUIState4;
                        chaloTextUIState6 = chaloTextUIState5;
                        surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                        if (z7) {
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                            objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objB3 != obj) {
                                function5 = function4;
                                profileSurveyUIState6 = profileSurveyUIState3;
                                chaloTextUIState8 = chaloTextUIState6;
                                imageUIState4 = imageUIState;
                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                imageUIState3 = imageUIState4;
                                profileSurveyUIState5 = profileSurveyUIState6;
                                chaloTextUIState7 = chaloTextUIState8;
                                buttonUIState = buttonUIStateD;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                            }
                        } else {
                            profileSurveyUIState5 = profileSurveyUIState3;
                            chaloTextUIState7 = chaloTextUIState6;
                            imageUIState3 = imageUIState;
                            buttonUIStateF = null;
                            buttonUIState = buttonUIStateD;
                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                            loadingDialogUIState3 = loadingDialogUIState2;
                        }
                        return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                    }
                }
                return obj;
            case 5:
                z = true;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3;
                pBUserProfileSurveyInputState4 = (PBUserProfileSurveyInputState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2;
                function2 = (Function1) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1;
                chaloBusUserProfileSurveyDataState2 = (ChaloBusUserProfileSurveyDataState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0;
                ResultKt.b(objB3);
                profileSurveyUIState = (ProfileSurveyUIState) objB3;
                Function1 function15 = function2;
                chaloTextUIState2 = chaloTextUIState3;
                chaloBusUserProfileSurveyDataState5 = chaloBusUserProfileSurveyDataState2;
                pBUserProfileSurveyInputState3 = pBUserProfileSurveyInputState4;
                function6 = function15;
                z2 = pBUserProfileSurveyInputState3 instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile;
                if (z2) {
                    z3 = z;
                } else {
                    z3 = z;
                }
                if (z3) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState5;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function6;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState2;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z3;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z4;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 6;
                objA = a(pBUserProfileSurveyInputState3, chaloBusUserProfileSurveyDataState5, function6, chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                if (objA != obj) {
                    boolean z1111 = z3;
                    function3 = function6;
                    z5 = z1111;
                    profileSurveyUIState2 = profileSurveyUIState;
                    objB3 = objA;
                    chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState5;
                    z6 = z4;
                    chaloTextUIState4 = chaloTextUIState2;
                    surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                    if (chaloBusUserProfileSurveyDataState3.d) {
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                        objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objB3 == obj) {
                            dialogUIStateFactory.getClass();
                            profileSurveyUIState3 = profileSurveyUIState2;
                            chaloTextUIState5 = chaloTextUIState4;
                            function4 = function3;
                            loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                        }
                    } else {
                        black3 = black3;
                        profileSurveyUIState3 = profileSurveyUIState2;
                        chaloTextUIState5 = chaloTextUIState4;
                        function4 = function3;
                        loadingDialogUIStateA2 = null;
                    }
                    z7 = z5;
                    z8 = z6;
                    chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                    black = black3;
                    stringProvider = stringProvider2;
                    imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                    if (!z7) {
                        TextUIState.ChaloTextUIState chaloTextUIState111 = chaloTextUIState5;
                        surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                        loadingDialogUIState2 = loadingDialogUIStateA2;
                        chaloTextUIState6 = chaloTextUIState111;
                        z9 = z8;
                        buttonUIStateD = null;
                        if (z7) {
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                            objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objB3 != obj) {
                                function5 = function4;
                                profileSurveyUIState6 = profileSurveyUIState3;
                                chaloTextUIState8 = chaloTextUIState6;
                                imageUIState4 = imageUIState;
                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                imageUIState3 = imageUIState4;
                                profileSurveyUIState5 = profileSurveyUIState6;
                                chaloTextUIState7 = chaloTextUIState8;
                                buttonUIState = buttonUIStateD;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                            }
                        } else {
                            profileSurveyUIState5 = profileSurveyUIState3;
                            chaloTextUIState7 = chaloTextUIState6;
                            imageUIState3 = imageUIState;
                            buttonUIStateF = null;
                            buttonUIState = buttonUIStateD;
                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                            loadingDialogUIState3 = loadingDialogUIState2;
                        }
                        return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                    }
                    black2 = black;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                    objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                    if (objB2 != obj) {
                        surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                        profileSurveyUIState4 = profileSurveyUIState3;
                        buttonUIStateFactory = buttonUIStateFactory2;
                        imageUIState2 = imageUIState;
                        ButtonUIStateFactory buttonUIStateFactory13 = buttonUIStateFactory;
                        boolean z1112 = z8;
                        buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory13, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                        z9 = z1112;
                        imageUIState = imageUIState2;
                        loadingDialogUIState2 = loadingDialogUIStateA2;
                        profileSurveyUIState3 = profileSurveyUIState4;
                        chaloTextUIState6 = chaloTextUIState5;
                        surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                        if (z7) {
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                            chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                            objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                            if (objB3 != obj) {
                                function5 = function4;
                                profileSurveyUIState6 = profileSurveyUIState3;
                                chaloTextUIState8 = chaloTextUIState6;
                                imageUIState4 = imageUIState;
                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                                imageUIState3 = imageUIState4;
                                profileSurveyUIState5 = profileSurveyUIState6;
                                chaloTextUIState7 = chaloTextUIState8;
                                buttonUIState = buttonUIStateD;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                            }
                        } else {
                            profileSurveyUIState5 = profileSurveyUIState3;
                            chaloTextUIState7 = chaloTextUIState6;
                            imageUIState3 = imageUIState;
                            buttonUIStateF = null;
                            buttonUIState = buttonUIStateD;
                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                            loadingDialogUIState3 = loadingDialogUIState2;
                        }
                        return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                    }
                }
                return obj;
            case 6:
                z = true;
                z6 = chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1;
                z5 = chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0;
                ProfileSurveyUIState profileSurveyUIState7 = (ProfileSurveyUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState20 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2;
                Function1 function16 = (Function1) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1;
                ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState8 = (ChaloBusUserProfileSurveyDataState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0;
                ResultKt.b(objB3);
                chaloBusUserProfileSurveyDataState3 = chaloBusUserProfileSurveyDataState8;
                function3 = function16;
                chaloTextUIState4 = chaloTextUIState20;
                profileSurveyUIState2 = profileSurveyUIState7;
                surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) objB3;
                if (chaloBusUserProfileSurveyDataState3.d) {
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState3;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function3;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState4;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = dialogUIStateFactory;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z5;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z6;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 7;
                    objB3 = stringProvider2.b(StringEnum.LOADING_THREE_DOTS, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                    if (objB3 == obj) {
                        dialogUIStateFactory.getClass();
                        profileSurveyUIState3 = profileSurveyUIState2;
                        chaloTextUIState5 = chaloTextUIState4;
                        function4 = function3;
                        loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                    }
                    return obj;
                }
                black3 = black3;
                profileSurveyUIState3 = profileSurveyUIState2;
                chaloTextUIState5 = chaloTextUIState4;
                function4 = function3;
                loadingDialogUIStateA2 = null;
                z7 = z5;
                z8 = z6;
                chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                black = black3;
                stringProvider = stringProvider2;
                imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                if (!z7) {
                    TextUIState.ChaloTextUIState chaloTextUIState112 = chaloTextUIState5;
                    surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                    loadingDialogUIState2 = loadingDialogUIStateA2;
                    chaloTextUIState6 = chaloTextUIState112;
                    z9 = z8;
                    buttonUIStateD = null;
                    if (z7) {
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                        objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objB3 != obj) {
                            function5 = function4;
                            profileSurveyUIState6 = profileSurveyUIState3;
                            chaloTextUIState8 = chaloTextUIState6;
                            imageUIState4 = imageUIState;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                            imageUIState3 = imageUIState4;
                            profileSurveyUIState5 = profileSurveyUIState6;
                            chaloTextUIState7 = chaloTextUIState8;
                            buttonUIState = buttonUIStateD;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                        }
                    } else {
                        profileSurveyUIState5 = profileSurveyUIState3;
                        chaloTextUIState7 = chaloTextUIState6;
                        imageUIState3 = imageUIState;
                        buttonUIStateF = null;
                        buttonUIState = buttonUIStateD;
                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                        loadingDialogUIState3 = loadingDialogUIState2;
                    }
                    return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                }
                black2 = black;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                if (objB2 != obj) {
                    surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                    profileSurveyUIState4 = profileSurveyUIState3;
                    buttonUIStateFactory = buttonUIStateFactory2;
                    imageUIState2 = imageUIState;
                    ButtonUIStateFactory buttonUIStateFactory14 = buttonUIStateFactory;
                    boolean z1113 = z8;
                    buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory14, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                    z9 = z1113;
                    imageUIState = imageUIState2;
                    loadingDialogUIState2 = loadingDialogUIStateA2;
                    profileSurveyUIState3 = profileSurveyUIState4;
                    chaloTextUIState6 = chaloTextUIState5;
                    surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                    if (z7) {
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                        objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objB3 != obj) {
                            function5 = function4;
                            profileSurveyUIState6 = profileSurveyUIState3;
                            chaloTextUIState8 = chaloTextUIState6;
                            imageUIState4 = imageUIState;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                            imageUIState3 = imageUIState4;
                            profileSurveyUIState5 = profileSurveyUIState6;
                            chaloTextUIState7 = chaloTextUIState8;
                            buttonUIState = buttonUIStateD;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                        }
                    } else {
                        profileSurveyUIState5 = profileSurveyUIState3;
                        chaloTextUIState7 = chaloTextUIState6;
                        imageUIState3 = imageUIState;
                        buttonUIStateF = null;
                        buttonUIState = buttonUIStateD;
                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                        loadingDialogUIState3 = loadingDialogUIState2;
                    }
                    return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                }
                return obj;
            case 7:
                z = true;
                z6 = chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1;
                z5 = chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0;
                dialogUIStateFactory = (DialogUIStateFactory) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5;
                surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4;
                profileSurveyUIState2 = (ProfileSurveyUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2;
                function3 = (Function1) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1;
                chaloBusUserProfileSurveyDataState3 = (ChaloBusUserProfileSurveyDataState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0;
                ResultKt.b(objB3);
                dialogUIStateFactory.getClass();
                profileSurveyUIState3 = profileSurveyUIState2;
                chaloTextUIState5 = chaloTextUIState4;
                function4 = function3;
                loadingDialogUIStateA2 = DialogUIStateFactory.a((String) objB3);
                z7 = z5;
                z8 = z6;
                chaloBusUserProfileSurveyDataState4 = chaloBusUserProfileSurveyDataState3;
                black = black3;
                stringProvider = stringProvider2;
                imageUIState = new ImageUIState(IconType.IC_ARROW_BACK, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ii(function4, 4)), 122);
                if (!z7) {
                    TextUIState.ChaloTextUIState chaloTextUIState113 = chaloTextUIState5;
                    surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState;
                    loadingDialogUIState2 = loadingDialogUIStateA2;
                    chaloTextUIState6 = chaloTextUIState113;
                    z9 = z8;
                    buttonUIStateD = null;
                    if (z7) {
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                        objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objB3 != obj) {
                            function5 = function4;
                            profileSurveyUIState6 = profileSurveyUIState3;
                            chaloTextUIState8 = chaloTextUIState6;
                            imageUIState4 = imageUIState;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                            imageUIState3 = imageUIState4;
                            profileSurveyUIState5 = profileSurveyUIState6;
                            chaloTextUIState7 = chaloTextUIState8;
                            buttonUIState = buttonUIStateD;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                        }
                    } else {
                        profileSurveyUIState5 = profileSurveyUIState3;
                        chaloTextUIState7 = chaloTextUIState6;
                        imageUIState3 = imageUIState;
                        buttonUIStateF = null;
                        buttonUIState = buttonUIStateD;
                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                        loadingDialogUIState3 = loadingDialogUIState2;
                    }
                    return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                }
                black2 = black;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = chaloBusUserProfileSurveyDataState4;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = function4;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = chaloTextUIState5;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = profileSurveyUIState3;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = surveyTimePickerDialogUIState;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = loadingDialogUIStateA2;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = imageUIState;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z7;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1 = z8;
                chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 8;
                objB2 = stringProvider.b(StringEnum.SKIP, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                if (objB2 != obj) {
                    surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState;
                    profileSurveyUIState4 = profileSurveyUIState3;
                    buttonUIStateFactory = buttonUIStateFactory2;
                    imageUIState2 = imageUIState;
                    ButtonUIStateFactory buttonUIStateFactory15 = buttonUIStateFactory;
                    boolean z1114 = z8;
                    buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory15, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                    z9 = z1114;
                    imageUIState = imageUIState2;
                    loadingDialogUIState2 = loadingDialogUIStateA2;
                    profileSurveyUIState3 = profileSurveyUIState4;
                    chaloTextUIState6 = chaloTextUIState5;
                    surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                    if (z7) {
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                        chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                        objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                        if (objB3 != obj) {
                            function5 = function4;
                            profileSurveyUIState6 = profileSurveyUIState3;
                            chaloTextUIState8 = chaloTextUIState6;
                            imageUIState4 = imageUIState;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                            imageUIState3 = imageUIState4;
                            profileSurveyUIState5 = profileSurveyUIState6;
                            chaloTextUIState7 = chaloTextUIState8;
                            buttonUIState = buttonUIStateD;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                        }
                    } else {
                        profileSurveyUIState5 = profileSurveyUIState3;
                        chaloTextUIState7 = chaloTextUIState6;
                        imageUIState3 = imageUIState;
                        buttonUIStateF = null;
                        buttonUIState = buttonUIStateD;
                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                        loadingDialogUIState3 = loadingDialogUIState2;
                    }
                    return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
                }
                return obj;
            case 8:
                boolean z20 = chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$1;
                boolean z21 = chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0;
                buttonUIStateFactory = (ButtonUIStateFactory) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7;
                imageUIState2 = (ImageUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6;
                loadingDialogUIStateA2 = (LoadingDialogUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5;
                SurveyTimePickerDialogUIState surveyTimePickerDialogUIState5 = (SurveyTimePickerDialogUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4;
                ProfileSurveyUIState profileSurveyUIState8 = (ProfileSurveyUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3;
                chaloTextUIState5 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2;
                function4 = (Function1) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1;
                chaloBusUserProfileSurveyDataState4 = (ChaloBusUserProfileSurveyDataState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0;
                ResultKt.b(objB3);
                surveyTimePickerDialogUIState3 = surveyTimePickerDialogUIState5;
                profileSurveyUIState4 = profileSurveyUIState8;
                stringProvider = stringProvider2;
                black2 = black3;
                objB2 = objB3;
                z7 = z21;
                z8 = z20;
                ButtonUIStateFactory buttonUIStateFactory16 = buttonUIStateFactory;
                boolean z1115 = z8;
                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory16, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, black2, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function4, 5), UIShape.e, !chaloBusUserProfileSurveyDataState4.d, 20);
                z9 = z1115;
                imageUIState = imageUIState2;
                loadingDialogUIState2 = loadingDialogUIStateA2;
                profileSurveyUIState3 = profileSurveyUIState4;
                chaloTextUIState6 = chaloTextUIState5;
                surveyTimePickerDialogUIState2 = surveyTimePickerDialogUIState3;
                if (z7) {
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0 = function4;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1 = chaloTextUIState6;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2 = profileSurveyUIState3;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3 = surveyTimePickerDialogUIState2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4 = loadingDialogUIState2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5 = imageUIState;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6 = buttonUIStateD;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7 = buttonUIStateFactory2;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0 = z9;
                    chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.label = 9;
                    objB3 = stringProvider.b(StringEnum.NEXT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$buildUiState$1);
                    if (objB3 != obj) {
                        function5 = function4;
                        profileSurveyUIState6 = profileSurveyUIState3;
                        chaloTextUIState8 = chaloTextUIState6;
                        imageUIState4 = imageUIState;
                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                        imageUIState3 = imageUIState4;
                        profileSurveyUIState5 = profileSurveyUIState6;
                        chaloTextUIState7 = chaloTextUIState8;
                        buttonUIState = buttonUIStateD;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                    }
                    return obj;
                }
                profileSurveyUIState5 = profileSurveyUIState3;
                chaloTextUIState7 = chaloTextUIState6;
                imageUIState3 = imageUIState;
                buttonUIStateF = null;
                buttonUIState = buttonUIStateD;
                surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                loadingDialogUIState3 = loadingDialogUIState2;
                return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
            case 9:
                z9 = chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.Z$0;
                buttonUIStateFactory2 = (ButtonUIStateFactory) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$7;
                buttonUIStateD = (ButtonUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$6;
                imageUIState4 = (ImageUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$5;
                loadingDialogUIState2 = (LoadingDialogUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$4;
                surveyTimePickerDialogUIState2 = (SurveyTimePickerDialogUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$3;
                profileSurveyUIState6 = (ProfileSurveyUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$2;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$1;
                function5 = (Function1) chaloBusUserProfileSurveyUiStateFactory$buildUiState$1.L$0;
                ResultKt.b(objB3);
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ii(function5, 6), UIShape.e, z9, 0.0f, 36);
                imageUIState3 = imageUIState4;
                profileSurveyUIState5 = profileSurveyUIState6;
                chaloTextUIState7 = chaloTextUIState8;
                buttonUIState = buttonUIStateD;
                loadingDialogUIState3 = loadingDialogUIState2;
                surveyTimePickerDialogUIState4 = surveyTimePickerDialogUIState2;
                return new ChaloBusUserProfileSurveyViewState(chaloTextUIState7, loadingDialogUIState3, profileSurveyUIState5, buttonUIState, buttonUIStateF, imageUIState3, surveyTimePickerDialogUIState4);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x017c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0195  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:55:0x0206  */
    /* JADX WARN: Code duplicated, block: B:58:0x0220  */
    /* JADX WARN: Code duplicated, block: B:62:0x025e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0278  */
    /* JADX WARN: Code duplicated, block: B:68:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0129, code lost:
    
        if (r3 == r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0143, code lost:
    
        if (r3 == r5) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState r31, kotlin.jvm.functions.Function1 r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyUiStateFactory.c(app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:25:0x0102  */
    /* JADX WARN: Code duplicated, block: B:26:0x0104  */
    /* JADX WARN: Code duplicated, block: B:29:0x0110  */
    /* JADX WARN: Code duplicated, block: B:31:0x0113  */
    /* JADX WARN: Code duplicated, block: B:33:0x0116  */
    /* JADX WARN: Code duplicated, block: B:35:0x0119  */
    /* JADX WARN: Code duplicated, block: B:36:0x011c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0122  */
    /* JADX WARN: Code duplicated, block: B:39:0x0125  */
    /* JADX WARN: Code duplicated, block: B:40:0x0128  */
    /* JADX WARN: Code duplicated, block: B:44:0x014a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Code duplicated, block: B:49:0x0177  */
    /* JADX WARN: Code duplicated, block: B:52:0x017f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0182  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x014a -> B:45:0x014b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile r33, kotlin.jvm.functions.Function1 r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyUiStateFactory.d(app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyInputState$TravelFrequencyInputPBUserProfile, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x019f  */
    /* JADX WARN: Code duplicated, block: B:32:0x01df  */
    /* JADX WARN: Code duplicated, block: B:36:0x0204  */
    /* JADX WARN: Code duplicated, block: B:40:0x0234  */
    /* JADX WARN: Code duplicated, block: B:44:0x0259  */
    /* JADX WARN: Code duplicated, block: B:48:0x027e  */
    /* JADX WARN: Code duplicated, block: B:52:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object e(PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile, Function1 function1, ContinuationImpl continuationImpl) {
        ChaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1 chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1;
        ImageUIState imageUIState;
        PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile2;
        Function1 function2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile3;
        ImageUIState imageUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TimePickerType timePickerType;
        Object objB;
        TimePickerType timePickerType2;
        Function1 function3;
        ImageUIState imageUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        String str;
        Object objB2;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        String str2;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile4;
        Function1 function4;
        ImageUIState imageUIState4;
        PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile5;
        PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile6;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        ImageUIState imageUIState5;
        OfficeInfoUIState officeInfoUIState;
        TimePickerType timePickerType3;
        TimePickerType timePickerType4;
        Function1 function5;
        PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile7;
        String str3;
        OfficeInfoUIState officeInfoUIState2;
        TimePickerType timePickerType5;
        Function1 function6;
        PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile8;
        TextUIState.ChaloTextUIState chaloTextUIState10;
        TextUIState.ChaloTextUIState chaloTextUIState11;
        String str4;
        ImageUIState imageUIState6;
        OfficeInfoUIState officeInfoUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState12;
        TextUIState.ChaloTextUIState chaloTextUIState13;
        ImageUIState imageUIState7;
        if (continuationImpl instanceof ChaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1) {
            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1 = (ChaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1) continuationImpl;
            int i = chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1 = new ChaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1(this, continuationImpl);
            }
        } else {
            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1 = new ChaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1(this, continuationImpl);
        }
        ChaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1 chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2 = chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1;
        Object objB3 = chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label;
        StringProvider stringProvider = this.f1225a;
        switch (i2) {
            case 0:
                ResultKt.b(objB3);
                imageUIState = new ImageUIState(IconType.CHALO_IC_TIME, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().W), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                workTimingInputPBUserProfile2 = workTimingInputPBUserProfile;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile2;
                function2 = function1;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function2;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = imageUIState;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 1;
                objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_HOURS_TITLE, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                if (objB3 != obj) {
                    chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile2;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function2;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = imageUIState;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = chaloTextUIState;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 2;
                    objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_HOURS_SUBTITLE, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                    if (objB3 != obj) {
                        workTimingInputPBUserProfile3 = workTimingInputPBUserProfile2;
                        imageUIState2 = imageUIState;
                        chaloTextUIState2 = chaloTextUIState;
                        chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        timePickerType = TimePickerType.WORK_START_TIME;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile3;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function2;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = imageUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState3;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 3;
                        objB = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_REACH_OFFICE_BY, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                        if (objB != obj) {
                            timePickerType2 = timePickerType;
                            objB3 = objB;
                            function3 = function2;
                            imageUIState3 = imageUIState2;
                            chaloTextUIState4 = chaloTextUIState2;
                            chaloTextUIState5 = chaloTextUIState3;
                            str = (String) objB3;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile3;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function3;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType2;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = str;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = imageUIState3;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState4;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = chaloTextUIState5;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 4;
                            objB2 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_START_TIME_PLACEHOLDER, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                            if (objB2 != obj) {
                                chaloTextUIState6 = chaloTextUIState4;
                                str2 = str;
                                objB3 = objB2;
                                chaloTextUIState7 = chaloTextUIState5;
                                workTimingInputPBUserProfile4 = workTimingInputPBUserProfile3;
                                function4 = function3;
                                imageUIState4 = imageUIState3;
                                String str5 = (String) objB3;
                                Long l = workTimingInputPBUserProfile4.c;
                                TimePickerType timePickerType6 = timePickerType2;
                                TimingVariability timingVariability = workTimingInputPBUserProfile4.d;
                                IconType iconType = IconType.IC_GREEN_ARROW_WITH_BACKGROUND;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile4;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function4;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = imageUIState4;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = chaloTextUIState6;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState7;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 5;
                                workTimingInputPBUserProfile5 = workTimingInputPBUserProfile4;
                                objB3 = f(iconType, timePickerType6, str2, str5, l, timingVariability, function4, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                                if (objB3 != obj) {
                                    workTimingInputPBUserProfile6 = workTimingInputPBUserProfile5;
                                    chaloTextUIState8 = chaloTextUIState7;
                                    chaloTextUIState9 = chaloTextUIState6;
                                    imageUIState5 = imageUIState4;
                                    officeInfoUIState = (OfficeInfoUIState) objB3;
                                    timePickerType3 = TimePickerType.WORK_END_TIME;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile6;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function4;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType3;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = imageUIState5;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState9;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState8;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = officeInfoUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 6;
                                    objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_LEAVE_OFFICE_BY, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                                    if (objB3 != obj) {
                                        Function1 function7 = function4;
                                        timePickerType4 = timePickerType3;
                                        function5 = function7;
                                        workTimingInputPBUserProfile7 = workTimingInputPBUserProfile6;
                                        str3 = (String) objB3;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile7;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function5;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType4;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = str3;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = imageUIState5;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState9;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = chaloTextUIState8;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = officeInfoUIState;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 7;
                                        objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_END_TIME_PLACEHOLDER, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                                        if (objB3 != obj) {
                                            officeInfoUIState2 = officeInfoUIState;
                                            timePickerType5 = timePickerType4;
                                            function6 = function5;
                                            workTimingInputPBUserProfile8 = workTimingInputPBUserProfile7;
                                            chaloTextUIState10 = chaloTextUIState8;
                                            chaloTextUIState11 = chaloTextUIState9;
                                            str4 = str3;
                                            imageUIState6 = imageUIState5;
                                            String str6 = (String) objB3;
                                            Long l2 = workTimingInputPBUserProfile8.e;
                                            TimingVariability timingVariability2 = workTimingInputPBUserProfile8.f;
                                            IconType iconType2 = IconType.IC_RED_ARROW_WITH_BACKGROUND;
                                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = imageUIState6;
                                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = chaloTextUIState11;
                                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = chaloTextUIState10;
                                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = officeInfoUIState2;
                                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = null;
                                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = null;
                                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 8;
                                            objB3 = f(iconType2, timePickerType5, str4, str6, l2, timingVariability2, function6, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                                            if (objB3 != obj) {
                                                officeInfoUIState3 = officeInfoUIState2;
                                                chaloTextUIState12 = chaloTextUIState10;
                                                chaloTextUIState13 = chaloTextUIState11;
                                                imageUIState7 = imageUIState6;
                                                return new ProfileSurveyUIState.WorkTimingUIState(imageUIState7, chaloTextUIState13, chaloTextUIState12, officeInfoUIState3, (OfficeInfoUIState) objB3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                ImageUIState imageUIState8 = (ImageUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2;
                Function1 function8 = (Function1) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1;
                PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile9 = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0;
                ResultKt.b(objB3);
                function2 = function8;
                workTimingInputPBUserProfile2 = workTimingInputPBUserProfile9;
                imageUIState = imageUIState8;
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile2;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function2;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = imageUIState;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = chaloTextUIState;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 2;
                objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_HOURS_SUBTITLE, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                if (objB3 != obj) {
                    workTimingInputPBUserProfile3 = workTimingInputPBUserProfile2;
                    imageUIState2 = imageUIState;
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    timePickerType = TimePickerType.WORK_START_TIME;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile3;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function2;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = imageUIState2;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState2;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState3;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 3;
                    objB = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_REACH_OFFICE_BY, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                    if (objB != obj) {
                        timePickerType2 = timePickerType;
                        objB3 = objB;
                        function3 = function2;
                        imageUIState3 = imageUIState2;
                        chaloTextUIState4 = chaloTextUIState2;
                        chaloTextUIState5 = chaloTextUIState3;
                        str = (String) objB3;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile3;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function3;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType2;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = str;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = imageUIState3;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState4;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = chaloTextUIState5;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 4;
                        objB2 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_START_TIME_PLACEHOLDER, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                        if (objB2 != obj) {
                            chaloTextUIState6 = chaloTextUIState4;
                            str2 = str;
                            objB3 = objB2;
                            chaloTextUIState7 = chaloTextUIState5;
                            workTimingInputPBUserProfile4 = workTimingInputPBUserProfile3;
                            function4 = function3;
                            imageUIState4 = imageUIState3;
                            String str7 = (String) objB3;
                            Long l3 = workTimingInputPBUserProfile4.c;
                            TimePickerType timePickerType7 = timePickerType2;
                            TimingVariability timingVariability3 = workTimingInputPBUserProfile4.d;
                            IconType iconType3 = IconType.IC_GREEN_ARROW_WITH_BACKGROUND;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile4;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function4;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = imageUIState4;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = chaloTextUIState6;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState7;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 5;
                            workTimingInputPBUserProfile5 = workTimingInputPBUserProfile4;
                            objB3 = f(iconType3, timePickerType7, str2, str7, l3, timingVariability3, function4, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                            if (objB3 != obj) {
                                workTimingInputPBUserProfile6 = workTimingInputPBUserProfile5;
                                chaloTextUIState8 = chaloTextUIState7;
                                chaloTextUIState9 = chaloTextUIState6;
                                imageUIState5 = imageUIState4;
                                officeInfoUIState = (OfficeInfoUIState) objB3;
                                timePickerType3 = TimePickerType.WORK_END_TIME;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile6;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function4;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType3;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = imageUIState5;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState9;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState8;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = officeInfoUIState;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 6;
                                objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_LEAVE_OFFICE_BY, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                                if (objB3 != obj) {
                                    Function1 function9 = function4;
                                    timePickerType4 = timePickerType3;
                                    function5 = function9;
                                    workTimingInputPBUserProfile7 = workTimingInputPBUserProfile6;
                                    str3 = (String) objB3;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile7;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function5;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType4;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = str3;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = imageUIState5;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState9;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = chaloTextUIState8;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = officeInfoUIState;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 7;
                                    objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_END_TIME_PLACEHOLDER, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                                    if (objB3 != obj) {
                                        officeInfoUIState2 = officeInfoUIState;
                                        timePickerType5 = timePickerType4;
                                        function6 = function5;
                                        workTimingInputPBUserProfile8 = workTimingInputPBUserProfile7;
                                        chaloTextUIState10 = chaloTextUIState8;
                                        chaloTextUIState11 = chaloTextUIState9;
                                        str4 = str3;
                                        imageUIState6 = imageUIState5;
                                        String str8 = (String) objB3;
                                        Long l4 = workTimingInputPBUserProfile8.e;
                                        TimingVariability timingVariability4 = workTimingInputPBUserProfile8.f;
                                        IconType iconType4 = IconType.IC_RED_ARROW_WITH_BACKGROUND;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = imageUIState6;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = chaloTextUIState11;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = chaloTextUIState10;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = officeInfoUIState2;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = null;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = null;
                                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 8;
                                        objB3 = f(iconType4, timePickerType5, str4, str8, l4, timingVariability4, function6, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                                        if (objB3 != obj) {
                                            officeInfoUIState3 = officeInfoUIState2;
                                            chaloTextUIState12 = chaloTextUIState10;
                                            chaloTextUIState13 = chaloTextUIState11;
                                            imageUIState7 = imageUIState6;
                                            return new ProfileSurveyUIState.WorkTimingUIState(imageUIState7, chaloTextUIState13, chaloTextUIState12, officeInfoUIState3, (OfficeInfoUIState) objB3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3;
                imageUIState2 = (ImageUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2;
                function2 = (Function1) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1;
                PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile10 = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0;
                ResultKt.b(objB3);
                workTimingInputPBUserProfile3 = workTimingInputPBUserProfile10;
                chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB3, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                timePickerType = TimePickerType.WORK_START_TIME;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile3;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function2;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = imageUIState2;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState2;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState3;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 3;
                objB = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_REACH_OFFICE_BY, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                if (objB != obj) {
                    timePickerType2 = timePickerType;
                    objB3 = objB;
                    function3 = function2;
                    imageUIState3 = imageUIState2;
                    chaloTextUIState4 = chaloTextUIState2;
                    chaloTextUIState5 = chaloTextUIState3;
                    str = (String) objB3;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile3;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function3;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType2;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = str;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = imageUIState3;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState4;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = chaloTextUIState5;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 4;
                    objB2 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_START_TIME_PLACEHOLDER, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                    if (objB2 != obj) {
                        chaloTextUIState6 = chaloTextUIState4;
                        str2 = str;
                        objB3 = objB2;
                        chaloTextUIState7 = chaloTextUIState5;
                        workTimingInputPBUserProfile4 = workTimingInputPBUserProfile3;
                        function4 = function3;
                        imageUIState4 = imageUIState3;
                        String str9 = (String) objB3;
                        Long l5 = workTimingInputPBUserProfile4.c;
                        TimePickerType timePickerType8 = timePickerType2;
                        TimingVariability timingVariability5 = workTimingInputPBUserProfile4.d;
                        IconType iconType5 = IconType.IC_GREEN_ARROW_WITH_BACKGROUND;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile4;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function4;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = imageUIState4;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = chaloTextUIState6;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState7;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 5;
                        workTimingInputPBUserProfile5 = workTimingInputPBUserProfile4;
                        objB3 = f(iconType5, timePickerType8, str2, str9, l5, timingVariability5, function4, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                        if (objB3 != obj) {
                            workTimingInputPBUserProfile6 = workTimingInputPBUserProfile5;
                            chaloTextUIState8 = chaloTextUIState7;
                            chaloTextUIState9 = chaloTextUIState6;
                            imageUIState5 = imageUIState4;
                            officeInfoUIState = (OfficeInfoUIState) objB3;
                            timePickerType3 = TimePickerType.WORK_END_TIME;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile6;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function4;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType3;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = imageUIState5;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState9;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState8;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = officeInfoUIState;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 6;
                            objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_LEAVE_OFFICE_BY, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                            if (objB3 != obj) {
                                Function1 function10 = function4;
                                timePickerType4 = timePickerType3;
                                function5 = function10;
                                workTimingInputPBUserProfile7 = workTimingInputPBUserProfile6;
                                str3 = (String) objB3;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile7;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function5;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType4;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = str3;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = imageUIState5;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState9;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = chaloTextUIState8;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = officeInfoUIState;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 7;
                                objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_END_TIME_PLACEHOLDER, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                                if (objB3 != obj) {
                                    officeInfoUIState2 = officeInfoUIState;
                                    timePickerType5 = timePickerType4;
                                    function6 = function5;
                                    workTimingInputPBUserProfile8 = workTimingInputPBUserProfile7;
                                    chaloTextUIState10 = chaloTextUIState8;
                                    chaloTextUIState11 = chaloTextUIState9;
                                    str4 = str3;
                                    imageUIState6 = imageUIState5;
                                    String str10 = (String) objB3;
                                    Long l6 = workTimingInputPBUserProfile8.e;
                                    TimingVariability timingVariability6 = workTimingInputPBUserProfile8.f;
                                    IconType iconType6 = IconType.IC_RED_ARROW_WITH_BACKGROUND;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = imageUIState6;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = chaloTextUIState11;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = chaloTextUIState10;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = officeInfoUIState2;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = null;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = null;
                                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 8;
                                    objB3 = f(iconType6, timePickerType5, str4, str10, l6, timingVariability6, function6, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                                    if (objB3 != obj) {
                                        officeInfoUIState3 = officeInfoUIState2;
                                        chaloTextUIState12 = chaloTextUIState10;
                                        chaloTextUIState13 = chaloTextUIState11;
                                        imageUIState7 = imageUIState6;
                                        return new ProfileSurveyUIState.WorkTimingUIState(imageUIState7, chaloTextUIState13, chaloTextUIState12, officeInfoUIState3, (OfficeInfoUIState) objB3);
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 3:
                chaloTextUIState5 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4;
                imageUIState3 = (ImageUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3;
                TimePickerType timePickerType9 = (TimePickerType) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2;
                Function1 function11 = (Function1) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1;
                workTimingInputPBUserProfile3 = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0;
                ResultKt.b(objB3);
                timePickerType2 = timePickerType9;
                function3 = function11;
                str = (String) objB3;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile3;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function3;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType2;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = str;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = imageUIState3;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState4;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = chaloTextUIState5;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 4;
                objB2 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_START_TIME_PLACEHOLDER, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                if (objB2 != obj) {
                    chaloTextUIState6 = chaloTextUIState4;
                    str2 = str;
                    objB3 = objB2;
                    chaloTextUIState7 = chaloTextUIState5;
                    workTimingInputPBUserProfile4 = workTimingInputPBUserProfile3;
                    function4 = function3;
                    imageUIState4 = imageUIState3;
                    String str11 = (String) objB3;
                    Long l7 = workTimingInputPBUserProfile4.c;
                    TimePickerType timePickerType10 = timePickerType2;
                    TimingVariability timingVariability7 = workTimingInputPBUserProfile4.d;
                    IconType iconType7 = IconType.IC_GREEN_ARROW_WITH_BACKGROUND;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile4;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function4;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = imageUIState4;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = chaloTextUIState6;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState7;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 5;
                    workTimingInputPBUserProfile5 = workTimingInputPBUserProfile4;
                    objB3 = f(iconType7, timePickerType10, str2, str11, l7, timingVariability7, function4, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                    if (objB3 != obj) {
                        workTimingInputPBUserProfile6 = workTimingInputPBUserProfile5;
                        chaloTextUIState8 = chaloTextUIState7;
                        chaloTextUIState9 = chaloTextUIState6;
                        imageUIState5 = imageUIState4;
                        officeInfoUIState = (OfficeInfoUIState) objB3;
                        timePickerType3 = TimePickerType.WORK_END_TIME;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile6;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function4;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType3;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = imageUIState5;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState9;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState8;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = officeInfoUIState;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 6;
                        objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_LEAVE_OFFICE_BY, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                        if (objB3 != obj) {
                            Function1 function12 = function4;
                            timePickerType4 = timePickerType3;
                            function5 = function12;
                            workTimingInputPBUserProfile7 = workTimingInputPBUserProfile6;
                            str3 = (String) objB3;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile7;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function5;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType4;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = str3;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = imageUIState5;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState9;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = chaloTextUIState8;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = officeInfoUIState;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 7;
                            objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_END_TIME_PLACEHOLDER, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                            if (objB3 != obj) {
                                officeInfoUIState2 = officeInfoUIState;
                                timePickerType5 = timePickerType4;
                                function6 = function5;
                                workTimingInputPBUserProfile8 = workTimingInputPBUserProfile7;
                                chaloTextUIState10 = chaloTextUIState8;
                                chaloTextUIState11 = chaloTextUIState9;
                                str4 = str3;
                                imageUIState6 = imageUIState5;
                                String str12 = (String) objB3;
                                Long l8 = workTimingInputPBUserProfile8.e;
                                TimingVariability timingVariability8 = workTimingInputPBUserProfile8.f;
                                IconType iconType8 = IconType.IC_RED_ARROW_WITH_BACKGROUND;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = imageUIState6;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = chaloTextUIState11;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = chaloTextUIState10;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = officeInfoUIState2;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = null;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = null;
                                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 8;
                                objB3 = f(iconType8, timePickerType5, str4, str12, l8, timingVariability8, function6, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                                if (objB3 != obj) {
                                    officeInfoUIState3 = officeInfoUIState2;
                                    chaloTextUIState12 = chaloTextUIState10;
                                    chaloTextUIState13 = chaloTextUIState11;
                                    imageUIState7 = imageUIState6;
                                    return new ProfileSurveyUIState.WorkTimingUIState(imageUIState7, chaloTextUIState13, chaloTextUIState12, officeInfoUIState3, (OfficeInfoUIState) objB3);
                                }
                            }
                        }
                    }
                }
                return obj;
            case 4:
                TextUIState.ChaloTextUIState chaloTextUIState14 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6;
                TextUIState.ChaloTextUIState chaloTextUIState15 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5;
                imageUIState3 = (ImageUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4;
                String str13 = (String) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3;
                timePickerType2 = (TimePickerType) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2;
                function4 = (Function1) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1;
                PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile11 = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0;
                ResultKt.b(objB3);
                chaloTextUIState7 = chaloTextUIState14;
                workTimingInputPBUserProfile4 = workTimingInputPBUserProfile11;
                chaloTextUIState6 = chaloTextUIState15;
                str2 = str13;
                imageUIState4 = imageUIState3;
                String str14 = (String) objB3;
                Long l9 = workTimingInputPBUserProfile4.c;
                TimePickerType timePickerType11 = timePickerType2;
                TimingVariability timingVariability9 = workTimingInputPBUserProfile4.d;
                IconType iconType9 = IconType.IC_GREEN_ARROW_WITH_BACKGROUND;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile4;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function4;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = imageUIState4;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = chaloTextUIState6;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState7;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 5;
                workTimingInputPBUserProfile5 = workTimingInputPBUserProfile4;
                objB3 = f(iconType9, timePickerType11, str2, str14, l9, timingVariability9, function4, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                if (objB3 != obj) {
                    workTimingInputPBUserProfile6 = workTimingInputPBUserProfile5;
                    chaloTextUIState8 = chaloTextUIState7;
                    chaloTextUIState9 = chaloTextUIState6;
                    imageUIState5 = imageUIState4;
                    officeInfoUIState = (OfficeInfoUIState) objB3;
                    timePickerType3 = TimePickerType.WORK_END_TIME;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile6;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function4;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType3;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = imageUIState5;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState9;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState8;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = officeInfoUIState;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 6;
                    objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_LEAVE_OFFICE_BY, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                    if (objB3 != obj) {
                        Function1 function13 = function4;
                        timePickerType4 = timePickerType3;
                        function5 = function13;
                        workTimingInputPBUserProfile7 = workTimingInputPBUserProfile6;
                        str3 = (String) objB3;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile7;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function5;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType4;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = str3;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = imageUIState5;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState9;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = chaloTextUIState8;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = officeInfoUIState;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 7;
                        objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_END_TIME_PLACEHOLDER, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                        if (objB3 != obj) {
                            officeInfoUIState2 = officeInfoUIState;
                            timePickerType5 = timePickerType4;
                            function6 = function5;
                            workTimingInputPBUserProfile8 = workTimingInputPBUserProfile7;
                            chaloTextUIState10 = chaloTextUIState8;
                            chaloTextUIState11 = chaloTextUIState9;
                            str4 = str3;
                            imageUIState6 = imageUIState5;
                            String str15 = (String) objB3;
                            Long l10 = workTimingInputPBUserProfile8.e;
                            TimingVariability timingVariability10 = workTimingInputPBUserProfile8.f;
                            IconType iconType10 = IconType.IC_RED_ARROW_WITH_BACKGROUND;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = imageUIState6;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = chaloTextUIState11;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = chaloTextUIState10;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = officeInfoUIState2;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = null;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = null;
                            chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 8;
                            objB3 = f(iconType10, timePickerType5, str4, str15, l10, timingVariability10, function6, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                            if (objB3 != obj) {
                                officeInfoUIState3 = officeInfoUIState2;
                                chaloTextUIState12 = chaloTextUIState10;
                                chaloTextUIState13 = chaloTextUIState11;
                                imageUIState7 = imageUIState6;
                                return new ProfileSurveyUIState.WorkTimingUIState(imageUIState7, chaloTextUIState13, chaloTextUIState12, officeInfoUIState3, (OfficeInfoUIState) objB3);
                            }
                        }
                    }
                }
                return obj;
            case 5:
                TextUIState.ChaloTextUIState chaloTextUIState16 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState17 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3;
                ImageUIState imageUIState9 = (ImageUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2;
                Function1 function14 = (Function1) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1;
                workTimingInputPBUserProfile6 = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0;
                ResultKt.b(objB3);
                function4 = function14;
                imageUIState5 = imageUIState9;
                chaloTextUIState9 = chaloTextUIState17;
                chaloTextUIState8 = chaloTextUIState16;
                officeInfoUIState = (OfficeInfoUIState) objB3;
                timePickerType3 = TimePickerType.WORK_END_TIME;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile6;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function4;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType3;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = imageUIState5;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = chaloTextUIState9;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState8;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = officeInfoUIState;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 6;
                objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_LEAVE_OFFICE_BY, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                if (objB3 != obj) {
                    Function1 function15 = function4;
                    timePickerType4 = timePickerType3;
                    function5 = function15;
                    workTimingInputPBUserProfile7 = workTimingInputPBUserProfile6;
                    str3 = (String) objB3;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile7;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function5;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType4;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = str3;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = imageUIState5;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState9;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = chaloTextUIState8;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = officeInfoUIState;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 7;
                    objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_END_TIME_PLACEHOLDER, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                    if (objB3 != obj) {
                        officeInfoUIState2 = officeInfoUIState;
                        timePickerType5 = timePickerType4;
                        function6 = function5;
                        workTimingInputPBUserProfile8 = workTimingInputPBUserProfile7;
                        chaloTextUIState10 = chaloTextUIState8;
                        chaloTextUIState11 = chaloTextUIState9;
                        str4 = str3;
                        imageUIState6 = imageUIState5;
                        String str16 = (String) objB3;
                        Long l11 = workTimingInputPBUserProfile8.e;
                        TimingVariability timingVariability11 = workTimingInputPBUserProfile8.f;
                        IconType iconType11 = IconType.IC_RED_ARROW_WITH_BACKGROUND;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = imageUIState6;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = chaloTextUIState11;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = chaloTextUIState10;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = officeInfoUIState2;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = null;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = null;
                        chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 8;
                        objB3 = f(iconType11, timePickerType5, str4, str16, l11, timingVariability11, function6, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                        if (objB3 != obj) {
                            officeInfoUIState3 = officeInfoUIState2;
                            chaloTextUIState12 = chaloTextUIState10;
                            chaloTextUIState13 = chaloTextUIState11;
                            imageUIState7 = imageUIState6;
                            return new ProfileSurveyUIState.WorkTimingUIState(imageUIState7, chaloTextUIState13, chaloTextUIState12, officeInfoUIState3, (OfficeInfoUIState) objB3);
                        }
                    }
                }
                return obj;
            case 6:
                officeInfoUIState = (OfficeInfoUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5;
                chaloTextUIState9 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4;
                imageUIState5 = (ImageUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3;
                TimePickerType timePickerType12 = (TimePickerType) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2;
                Function1 function16 = (Function1) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1;
                workTimingInputPBUserProfile7 = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0;
                ResultKt.b(objB3);
                function5 = function16;
                timePickerType4 = timePickerType12;
                str3 = (String) objB3;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = workTimingInputPBUserProfile7;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = function5;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = timePickerType4;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = str3;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = imageUIState5;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = chaloTextUIState9;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = chaloTextUIState8;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = officeInfoUIState;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 7;
                objB3 = stringProvider.b(StringEnum.PB_USER_PROFILE_SURVEY_OFFICE_END_TIME_PLACEHOLDER, new Object[0], chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                if (objB3 != obj) {
                    officeInfoUIState2 = officeInfoUIState;
                    timePickerType5 = timePickerType4;
                    function6 = function5;
                    workTimingInputPBUserProfile8 = workTimingInputPBUserProfile7;
                    chaloTextUIState10 = chaloTextUIState8;
                    chaloTextUIState11 = chaloTextUIState9;
                    str4 = str3;
                    imageUIState6 = imageUIState5;
                    String str17 = (String) objB3;
                    Long l12 = workTimingInputPBUserProfile8.e;
                    TimingVariability timingVariability12 = workTimingInputPBUserProfile8.f;
                    IconType iconType12 = IconType.IC_RED_ARROW_WITH_BACKGROUND;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = imageUIState6;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = chaloTextUIState11;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = chaloTextUIState10;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = officeInfoUIState2;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = null;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = null;
                    chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 8;
                    objB3 = f(iconType12, timePickerType5, str4, str17, l12, timingVariability12, function6, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                    if (objB3 != obj) {
                        officeInfoUIState3 = officeInfoUIState2;
                        chaloTextUIState12 = chaloTextUIState10;
                        chaloTextUIState13 = chaloTextUIState11;
                        imageUIState7 = imageUIState6;
                        return new ProfileSurveyUIState.WorkTimingUIState(imageUIState7, chaloTextUIState13, chaloTextUIState12, officeInfoUIState3, (OfficeInfoUIState) objB3);
                    }
                }
                return obj;
            case 7:
                OfficeInfoUIState officeInfoUIState4 = (OfficeInfoUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7;
                TextUIState.ChaloTextUIState chaloTextUIState18 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6;
                TextUIState.ChaloTextUIState chaloTextUIState19 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5;
                ImageUIState imageUIState10 = (ImageUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4;
                String str18 = (String) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3;
                TimePickerType timePickerType13 = (TimePickerType) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2;
                Function1 function17 = (Function1) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1;
                PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile12 = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0;
                ResultKt.b(objB3);
                officeInfoUIState2 = officeInfoUIState4;
                timePickerType5 = timePickerType13;
                function6 = function17;
                workTimingInputPBUserProfile8 = workTimingInputPBUserProfile12;
                chaloTextUIState11 = chaloTextUIState19;
                imageUIState6 = imageUIState10;
                chaloTextUIState10 = chaloTextUIState18;
                str4 = str18;
                String str19 = (String) objB3;
                Long l13 = workTimingInputPBUserProfile8.e;
                TimingVariability timingVariability13 = workTimingInputPBUserProfile8.f;
                IconType iconType13 = IconType.IC_RED_ARROW_WITH_BACKGROUND;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0 = imageUIState6;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1 = chaloTextUIState11;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2 = chaloTextUIState10;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3 = officeInfoUIState2;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$4 = null;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$5 = null;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$6 = null;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$7 = null;
                chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.label = 8;
                objB3 = f(iconType13, timePickerType5, str4, str19, l13, timingVariability13, function6, chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2);
                if (objB3 != obj) {
                    officeInfoUIState3 = officeInfoUIState2;
                    chaloTextUIState12 = chaloTextUIState10;
                    chaloTextUIState13 = chaloTextUIState11;
                    imageUIState7 = imageUIState6;
                    return new ProfileSurveyUIState.WorkTimingUIState(imageUIState7, chaloTextUIState13, chaloTextUIState12, officeInfoUIState3, (OfficeInfoUIState) objB3);
                }
                return obj;
            case 8:
                OfficeInfoUIState officeInfoUIState5 = (OfficeInfoUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState20 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$2;
                chaloTextUIState13 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$1;
                ImageUIState imageUIState11 = (ImageUIState) chaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$2.L$0;
                ResultKt.b(objB3);
                chaloTextUIState12 = chaloTextUIState20;
                imageUIState7 = imageUIState11;
                officeInfoUIState3 = officeInfoUIState5;
                return new ProfileSurveyUIState.WorkTimingUIState(imageUIState7, chaloTextUIState13, chaloTextUIState12, officeInfoUIState3, (OfficeInfoUIState) objB3);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0158  */
    /* JADX WARN: Code duplicated, block: B:34:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(IconType iconType, TimePickerType timePickerType, String str, String str2, Long l, TimingVariability timingVariability, Function1 function1, ContinuationImpl continuationImpl) {
        ChaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1 chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1;
        IconType iconType2;
        TimePickerType timePickerType2;
        Function1 function2;
        TextUIState textUIState;
        String str3;
        TimingVariability timingVariability2;
        String str4;
        TimePickerType timePickerType3;
        String str5;
        IconType iconType3;
        String str6;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TimingVariability timingVariability3;
        Function1 function3;
        TextUIState textUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Object objB;
        Object obj;
        Function1 function4;
        IconType iconType4;
        TimingVariability timingVariability4;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TimePickerType timePickerType4;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        Object obj2;
        TimePickerType timePickerType5;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        Function1 function5;
        Object objH;
        TextUIState textUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        IconType iconType5;
        TimePickerType timePickerType6;
        Function1 function6;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        TimingVariability timingVariability5 = timingVariability;
        if (continuationImpl instanceof ChaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1) {
            chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1 = (ChaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1) continuationImpl;
            int i = chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1 = new ChaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1(this, continuationImpl);
            }
        } else {
            chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1 = new ChaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1(this, continuationImpl);
        }
        Object obj3 = chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.result;
        Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.label;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        if (i2 != 0) {
            if (i2 == 1) {
                Function1 function7 = (Function1) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$5;
                TimingVariability timingVariability6 = (TimingVariability) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$4;
                str6 = (String) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$3;
                str5 = (String) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$2;
                timePickerType3 = (TimePickerType) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$1;
                iconType3 = (IconType) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$0;
                ResultKt.b(obj3);
                function2 = function7;
                timingVariability5 = timingVariability6;
            } else if (i2 == 2) {
                TextUIState.ChaloTextUIState chaloTextUIState9 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$6;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$5;
                TextUIState textUIState4 = (TextUIState) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$4;
                Function1 function8 = (Function1) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$3;
                timingVariability4 = (TimingVariability) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$2;
                TimePickerType timePickerType7 = (TimePickerType) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$1;
                IconType iconType6 = (IconType) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$0;
                ResultKt.b(obj3);
                chaloTextUIState3 = chaloTextUIState9;
                textUIState2 = textUIState4;
                function4 = function8;
                obj = obj4;
                timePickerType4 = timePickerType7;
                iconType4 = iconType6;
                obj2 = obj;
                timePickerType5 = timePickerType4;
                chaloTextUIState6 = chaloTextUIState3;
                function5 = function4;
                chaloTextUIState5 = new TextUIState.ChaloTextUIState((String) obj3, UITextStyle.BodyMedium, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$0 = iconType4;
                chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$1 = timePickerType5;
                chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$2 = function5;
                chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$3 = textUIState2;
                chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$4 = chaloTextUIState4;
                chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$5 = chaloTextUIState6;
                chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$6 = chaloTextUIState5;
                chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.label = 3;
                objH = h(timingVariability4, timePickerType5, function5, chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1);
                if (objH == obj2) {
                    return obj2;
                }
                textUIState3 = textUIState2;
                chaloTextUIState7 = chaloTextUIState5;
                iconType5 = iconType4;
                timePickerType6 = timePickerType5;
                obj3 = objH;
                function6 = function5;
                chaloTextUIState8 = chaloTextUIState6;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloTextUIState7 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$6;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$5;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$4;
                textUIState3 = (TextUIState) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$3;
                function6 = (Function1) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$2;
                timePickerType6 = (TimePickerType) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$1;
                IconType iconType7 = (IconType) chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$0;
                ResultKt.b(obj3);
                iconType5 = iconType7;
            }
            return new OfficeInfoUIState(new ImageUIState(iconType5, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIState4, textUIState3, chaloTextUIState8, chaloTextUIState7, (List) obj3, UiEventHandler.Companion.a(new l3(27, function6, timePickerType6)));
        }
        ResultKt.b(obj3);
        if (l != null) {
            long jLongValue = l.longValue();
            chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$0 = iconType;
            chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$1 = timePickerType;
            chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$2 = str;
            chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$3 = str2;
            chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$4 = timingVariability5;
            function2 = function1;
            chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$5 = function2;
            chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.label = 1;
            Object objG = g(jLongValue, timingVariability5, chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1);
            if (objG == obj4) {
                return obj4;
            }
            timePickerType3 = timePickerType;
            str5 = str;
            iconType3 = iconType;
            obj3 = objG;
            str6 = str2;
        } else {
            iconType2 = iconType;
            timePickerType2 = timePickerType;
            function2 = function1;
            textUIState = null;
            str3 = str;
            timingVariability2 = timingVariability5;
            str4 = str2;
        }
        timingVariability3 = timingVariability2;
        UITextStyle uITextStyle = UITextStyle.BodyMedium;
        function3 = function2;
        String str7 = str4;
        textUIState2 = textUIState;
        chaloTextUIState = new TextUIState.ChaloTextUIState(str3, uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        chaloTextUIState2 = new TextUIState.ChaloTextUIState(str7, uITextStyle, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$0 = iconType2;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$1 = timePickerType2;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$2 = timingVariability3;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$3 = function3;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$4 = textUIState2;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$5 = chaloTextUIState;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$6 = chaloTextUIState2;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.label = 2;
        objB = this.f1225a.b(StringEnum.PB_USER_PROFILE_SURVEY_TIME_VARIABILITY_PROMPT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1);
        obj = obj4;
        if (objB == obj) {
            return obj;
        }
        function4 = function3;
        iconType4 = iconType2;
        obj3 = objB;
        timingVariability4 = timingVariability3;
        chaloTextUIState3 = chaloTextUIState2;
        timePickerType4 = timePickerType2;
        chaloTextUIState4 = chaloTextUIState;
        obj2 = obj;
        timePickerType5 = timePickerType4;
        chaloTextUIState6 = chaloTextUIState3;
        function5 = function4;
        chaloTextUIState5 = new TextUIState.ChaloTextUIState((String) obj3, UITextStyle.BodyMedium, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$0 = iconType4;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$1 = timePickerType5;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$2 = function5;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$3 = textUIState2;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$4 = chaloTextUIState4;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$5 = chaloTextUIState6;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$6 = chaloTextUIState5;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.label = 3;
        objH = h(timingVariability4, timePickerType5, function5, chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1);
        if (objH == obj2) {
            return obj2;
        }
        textUIState3 = textUIState2;
        chaloTextUIState7 = chaloTextUIState5;
        iconType5 = iconType4;
        timePickerType6 = timePickerType5;
        obj3 = objH;
        function6 = function5;
        chaloTextUIState8 = chaloTextUIState6;
        return new OfficeInfoUIState(new ImageUIState(iconType5, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIState4, textUIState3, chaloTextUIState8, chaloTextUIState7, (List) obj3, UiEventHandler.Companion.a(new l3(27, function6, timePickerType6)));
        String str8 = str6;
        timingVariability2 = timingVariability5;
        str4 = str8;
        timePickerType2 = timePickerType3;
        str3 = str5;
        textUIState = (TextUIState) obj3;
        iconType2 = iconType3;
        timingVariability3 = timingVariability2;
        UITextStyle uITextStyle2 = UITextStyle.BodyMedium;
        function3 = function2;
        String str9 = str4;
        textUIState2 = textUIState;
        chaloTextUIState = new TextUIState.ChaloTextUIState(str3, uITextStyle2, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        chaloTextUIState2 = new TextUIState.ChaloTextUIState(str9, uITextStyle2, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$0 = iconType2;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$1 = timePickerType2;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$2 = timingVariability3;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$3 = function3;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$4 = textUIState2;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$5 = chaloTextUIState;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$6 = chaloTextUIState2;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.label = 2;
        objB = this.f1225a.b(StringEnum.PB_USER_PROFILE_SURVEY_TIME_VARIABILITY_PROMPT, new Object[0], chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1);
        obj = obj4;
        if (objB == obj) {
            return obj;
        }
        function4 = function3;
        iconType4 = iconType2;
        obj3 = objB;
        timingVariability4 = timingVariability3;
        chaloTextUIState3 = chaloTextUIState2;
        timePickerType4 = timePickerType2;
        chaloTextUIState4 = chaloTextUIState;
        obj2 = obj;
        timePickerType5 = timePickerType4;
        chaloTextUIState6 = chaloTextUIState3;
        function5 = function4;
        chaloTextUIState5 = new TextUIState.ChaloTextUIState((String) obj3, UITextStyle.BodyMedium, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$0 = iconType4;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$1 = timePickerType5;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$2 = function5;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$3 = textUIState2;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$4 = chaloTextUIState4;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$5 = chaloTextUIState6;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.L$6 = chaloTextUIState5;
        chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1.label = 3;
        objH = h(timingVariability4, timePickerType5, function5, chaloBusUserProfileSurveyUiStateFactory$officeInfoUIState$1);
        if (objH == obj2) {
            return obj2;
        }
        textUIState3 = textUIState2;
        chaloTextUIState7 = chaloTextUIState5;
        iconType5 = iconType4;
        timePickerType6 = timePickerType5;
        obj3 = objH;
        function6 = function5;
        chaloTextUIState8 = chaloTextUIState6;
        return new OfficeInfoUIState(new ImageUIState(iconType5, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), chaloTextUIState4, textUIState3, chaloTextUIState8, chaloTextUIState7, (List) obj3, UiEventHandler.Companion.a(new l3(27, function6, timePickerType6)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object g(long j, TimingVariability timingVariability, ContinuationImpl continuationImpl) {
        ChaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1 chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1;
        String strL;
        if (continuationImpl instanceof ChaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1) {
            chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1 = (ChaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1) continuationImpl;
            int i = chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1 = new ChaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1(this, continuationImpl);
            }
        } else {
            chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1 = new ChaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1(this, continuationImpl);
        }
        Object objB = chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1.label;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        if (i2 == 0) {
            ResultKt.b(objB);
            TimeUtilsContract timeUtilsContract = this.b;
            strL = timeUtilsContract.l(j);
            if (timingVariability == TimingVariability.EXACT) {
                return new TextUIState.ChaloTextUIState(strL, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            }
            String strL2 = timeUtilsContract.l(j - timingVariability.getTime());
            String strL3 = timeUtilsContract.l(timingVariability.getTime() + j);
            chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1.L$0 = strL;
            chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1.label = 1;
            objB = this.f1225a.b(StringEnum.PB_USER_PROFILE_SURVEY_TIME_RANGE_FORMAT, new Object[]{strL2, strL3}, chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) chaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1.L$0;
            ResultKt.b(objB);
            strL = str;
        }
        return new TextUIState.StyledTextUIState(CollectionsKt.S(new StyledTextDataUIState(strL, almostBlackColor, null, UITextStyle.BodyMedium, null, null, null, 1012), new StyledTextDataUIState((String) objB, ChaloColorToken.Black_60.f9766a, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0181  */
    /* JADX WARN: Code duplicated, block: B:50:0x019d  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x01de  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0117 -> B:32:0x0120). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(app.chalo.chalobususerprofile.data.model.TimingVariability r31, app.chalo.chalobususerprofile.ui.compose.TimePickerType r32, kotlin.jvm.functions.Function1 r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyUiStateFactory.h(app.chalo.chalobususerprofile.data.model.TimingVariability, app.chalo.chalobususerprofile.ui.compose.TimePickerType, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
