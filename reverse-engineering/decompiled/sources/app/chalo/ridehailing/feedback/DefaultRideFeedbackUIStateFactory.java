package app.chalo.ridehailing.feedback;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.ridefeedback.data.app.RideFeedbackBookingData;
import app.chalo.ridefeedback.data.app.RideFeedbackEntryPoint;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.bp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/DefaultRideFeedbackUIStateFactory;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultRideFeedbackUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f9132a;
    public final RideFeedbackCommonUIStateFactory b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9133a;

        static {
            int[] iArr = new int[RideFeedbackEntryPoint.values().length];
            try {
                iArr[RideFeedbackEntryPoint.HOME_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RideFeedbackEntryPoint.ACTIVATION_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9133a = iArr;
        }
    }

    public DefaultRideFeedbackUIStateFactory(StringProvider stringProvider, RideFeedbackCommonUIStateFactory rideFeedbackCommonUIStateFactory) {
        this.f9132a = stringProvider;
        this.b = rideFeedbackCommonUIStateFactory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Function1 function1, ContinuationImpl continuationImpl) {
        DefaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1 defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1;
        ImageUIState imageUIState;
        Function1 function2;
        ImageUIState imageUIState2;
        ImageUIState imageUIState3;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState;
        if (continuationImpl instanceof DefaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1) {
            defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1 = (DefaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1) continuationImpl;
            int i = defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1 = new DefaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1(this, continuationImpl);
            }
        } else {
            defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1 = new DefaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1(this, continuationImpl);
        }
        Object objB = defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ImageUIState imageUIState4 = (ImageUIState) defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$2;
                imageUIState2 = (ImageUIState) defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$1;
                function2 = (Function1) defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$0;
                ResultKt.b(objB);
                imageUIState = imageUIState4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState2 = (TextWithLeftAndRightIconUIState) defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$1;
                ImageUIState imageUIState5 = (ImageUIState) defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$0;
                ResultKt.b(objB);
                imageUIState3 = imageUIState5;
                textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState2;
            }
            return new RideFeedbackHeaderUIState(null, imageUIState3, null, null, textWithLeftAndRightIconUIState, null, (RideFeedbackHeaderCtaUISState) objB);
        }
        ResultKt.b(objB);
        ImageUIState imageUIState6 = new ImageUIState(IconType.IC_CHALO_BUS_IMAGE_WITH_SHADOW_WITHOUT_PADDING, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().s), Dp.m7276boximpl(ChaloThemeHelper.a().n0)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        imageUIState = new ImageUIState(IconType.CHECK_CIRCLE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        function2 = function1;
        defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$0 = function2;
        defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$1 = imageUIState6;
        defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$2 = imageUIState;
        defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label = 1;
        objB = this.f9132a.b(StringEnum.COMPLETED, new Object[0], defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1);
        if (objB != coroutineSingletons) {
            imageUIState2 = imageUIState6;
        }
        return coroutineSingletons;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState3 = new TextWithLeftAndRightIconUIState(imageUIState, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), null, 0.0f, null, 28);
        bp bpVar = new bp(function2, 19);
        bp bpVar2 = new bp(function2, 20);
        defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$0 = imageUIState2;
        defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$1 = textWithLeftAndRightIconUIState3;
        defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.L$2 = null;
        defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1.label = 2;
        objB = this.b.c(bpVar, bpVar2, defaultRideFeedbackUIStateFactory$getRideFeedbackHeaderUIState$1);
        if (objB != coroutineSingletons) {
            imageUIState3 = imageUIState2;
            textWithLeftAndRightIconUIState = textWithLeftAndRightIconUIState3;
            return new RideFeedbackHeaderUIState(null, imageUIState3, null, null, textWithLeftAndRightIconUIState, null, (RideFeedbackHeaderCtaUISState) objB);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(RideFeedbackBookingData rideFeedbackBookingData, ContinuationImpl continuationImpl) {
        DefaultRideFeedbackUIStateFactory$getToolbarUiState$1 defaultRideFeedbackUIStateFactory$getToolbarUiState$1;
        StringEnum stringEnum;
        Object[] objArr;
        RideFeedbackBookingData rideFeedbackBookingData2;
        int i;
        StringProvider stringProvider;
        Object[] objArr2;
        RideFeedbackBookingData rideFeedbackBookingData3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        String str;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        if (continuationImpl instanceof DefaultRideFeedbackUIStateFactory$getToolbarUiState$1) {
            defaultRideFeedbackUIStateFactory$getToolbarUiState$1 = (DefaultRideFeedbackUIStateFactory$getToolbarUiState$1) continuationImpl;
            int i2 = defaultRideFeedbackUIStateFactory$getToolbarUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultRideFeedbackUIStateFactory$getToolbarUiState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                defaultRideFeedbackUIStateFactory$getToolbarUiState$1 = new DefaultRideFeedbackUIStateFactory$getToolbarUiState$1(this, continuationImpl);
            }
        } else {
            defaultRideFeedbackUIStateFactory$getToolbarUiState$1 = new DefaultRideFeedbackUIStateFactory$getToolbarUiState$1(this, continuationImpl);
        }
        Object objB = defaultRideFeedbackUIStateFactory$getToolbarUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = defaultRideFeedbackUIStateFactory$getToolbarUiState$1.label;
        StringProvider stringProvider2 = this.f9132a;
        if (i3 == 0) {
            ResultKt.b(objB);
            stringEnum = StringEnum.RATE_YOUR_X_RIDE;
            objArr = new Object[1];
            rideFeedbackBookingData2 = rideFeedbackBookingData;
            defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$0 = rideFeedbackBookingData2;
            defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$1 = objArr;
            defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$2 = stringProvider2;
            defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$3 = stringEnum;
            defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$4 = objArr;
            defaultRideFeedbackUIStateFactory$getToolbarUiState$1.I$0 = 0;
            defaultRideFeedbackUIStateFactory$getToolbarUiState$1.label = 1;
            objB = stringProvider2.b(StringEnum.CHALO_BUS, new Object[0], defaultRideFeedbackUIStateFactory$getToolbarUiState$1);
            if (objB != coroutineSingletons) {
                i = 0;
                stringProvider = stringProvider2;
                objArr2 = objArr;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = defaultRideFeedbackUIStateFactory$getToolbarUiState$1.I$0;
            objArr = (Object[]) defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$4;
            stringEnum = (StringEnum) defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$3;
            StringProvider stringProvider3 = (StringProvider) defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$2;
            Object[] objArr3 = (Object[]) defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$1;
            RideFeedbackBookingData rideFeedbackBookingData4 = (RideFeedbackBookingData) defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$0;
            ResultKt.b(objB);
            stringProvider = stringProvider3;
            rideFeedbackBookingData2 = rideFeedbackBookingData4;
            objArr2 = objArr3;
        } else {
            if (i3 == 2) {
                rideFeedbackBookingData3 = (RideFeedbackBookingData) defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$0;
                ResultKt.b(objB);
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplaySmall, (ChaloColorToken) null, 1, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7092);
                StringEnum stringEnum2 = StringEnum.FROM_X_BULLET_Y;
                if (rideFeedbackBookingData3 != null) {
                    str = rideFeedbackBookingData3.f;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                String str2 = rideFeedbackBookingData3 != null ? rideFeedbackBookingData3.l : null;
                String str3 = str2 != null ? str2 : "";
                defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$0 = chaloTextUIState;
                defaultRideFeedbackUIStateFactory$getToolbarUiState$1.label = 3;
                objB = stringProvider2.b(stringEnum2, new Object[]{str, str3}, defaultRideFeedbackUIStateFactory$getToolbarUiState$1);
                if (objB != coroutineSingletons) {
                    chaloTextUIState2 = chaloTextUIState;
                }
                return coroutineSingletons;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextUIState2 = (TextUIState.ChaloTextUIState) defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$0;
            ResultKt.b(objB);
        }
        return new RideFeedbackToolbarUIState(chaloTextUIState2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.Black_60.f9766a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152));
        objArr[i] = objB;
        defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$0 = rideFeedbackBookingData2;
        defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$1 = null;
        defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$2 = null;
        defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$3 = null;
        defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$4 = null;
        defaultRideFeedbackUIStateFactory$getToolbarUiState$1.label = 2;
        objB = stringProvider.b(stringEnum, objArr2, defaultRideFeedbackUIStateFactory$getToolbarUiState$1);
        if (objB != coroutineSingletons) {
            rideFeedbackBookingData3 = rideFeedbackBookingData2;
            chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplaySmall, (ChaloColorToken) null, 1, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7092);
            StringEnum stringEnum3 = StringEnum.FROM_X_BULLET_Y;
            if (rideFeedbackBookingData3 != null) {
                str = rideFeedbackBookingData3.f;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (rideFeedbackBookingData3 != null) {
            }
            if (str2 != null) {
            }
            defaultRideFeedbackUIStateFactory$getToolbarUiState$1.L$0 = chaloTextUIState;
            defaultRideFeedbackUIStateFactory$getToolbarUiState$1.label = 3;
            objB = stringProvider2.b(stringEnum3, new Object[]{str, str3}, defaultRideFeedbackUIStateFactory$getToolbarUiState$1);
            if (objB != coroutineSingletons) {
                chaloTextUIState2 = chaloTextUIState;
                return new RideFeedbackToolbarUIState(chaloTextUIState2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.Black_60.f9766a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(RideFeedbackDataState rideFeedbackDataState, Function1 function1, ContinuationImpl continuationImpl) {
        DefaultRideFeedbackUIStateFactory$getViewState$1 defaultRideFeedbackUIStateFactory$getViewState$1;
        int i;
        int i2;
        RideFeedbackCommonUIStateFactory rideFeedbackCommonUIStateFactory;
        Function1 function2;
        RideFeedbackToolbarUIState rideFeedbackToolbarUIState;
        RideFeedbackDataState rideFeedbackDataState2;
        int i3;
        Object obj;
        int i4;
        Object objA;
        RideFeedbackDataState rideFeedbackDataState3;
        int i5;
        Function1 function3;
        RideFeedbackCommonUIStateFactory rideFeedbackCommonUIStateFactory2;
        RideFeedbackHeaderUIState rideFeedbackHeaderUIState;
        boolean z;
        RideFeedbackCommonUIStateFactory rideFeedbackCommonUIStateFactory3;
        Object objH;
        if (continuationImpl instanceof DefaultRideFeedbackUIStateFactory$getViewState$1) {
            defaultRideFeedbackUIStateFactory$getViewState$1 = (DefaultRideFeedbackUIStateFactory$getViewState$1) continuationImpl;
            int i6 = defaultRideFeedbackUIStateFactory$getViewState$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                defaultRideFeedbackUIStateFactory$getViewState$1.label = i6 - Integer.MIN_VALUE;
            } else {
                defaultRideFeedbackUIStateFactory$getViewState$1 = new DefaultRideFeedbackUIStateFactory$getViewState$1(this, continuationImpl);
            }
        } else {
            defaultRideFeedbackUIStateFactory$getViewState$1 = new DefaultRideFeedbackUIStateFactory$getViewState$1(this, continuationImpl);
        }
        DefaultRideFeedbackUIStateFactory$getViewState$1 defaultRideFeedbackUIStateFactory$getViewState$2 = defaultRideFeedbackUIStateFactory$getViewState$1;
        Object obj2 = defaultRideFeedbackUIStateFactory$getViewState$2.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = defaultRideFeedbackUIStateFactory$getViewState$2.label;
        if (i7 != 0) {
            if (i7 == 1) {
                i3 = defaultRideFeedbackUIStateFactory$getViewState$2.I$1;
                int i8 = defaultRideFeedbackUIStateFactory$getViewState$2.I$0;
                rideFeedbackDataState2 = (RideFeedbackDataState) defaultRideFeedbackUIStateFactory$getViewState$2.L$2;
                RideFeedbackCommonUIStateFactory rideFeedbackCommonUIStateFactory4 = (RideFeedbackCommonUIStateFactory) defaultRideFeedbackUIStateFactory$getViewState$2.L$1;
                Function1 function4 = (Function1) defaultRideFeedbackUIStateFactory$getViewState$2.L$0;
                ResultKt.b(obj2);
                i4 = i8;
                function1 = function4;
                rideFeedbackCommonUIStateFactory = rideFeedbackCommonUIStateFactory4;
                obj = obj2;
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj2);
                    return obj2;
                }
                i5 = defaultRideFeedbackUIStateFactory$getViewState$2.I$0;
                rideFeedbackToolbarUIState = (RideFeedbackToolbarUIState) defaultRideFeedbackUIStateFactory$getViewState$2.L$3;
                rideFeedbackDataState3 = (RideFeedbackDataState) defaultRideFeedbackUIStateFactory$getViewState$2.L$2;
                rideFeedbackCommonUIStateFactory2 = (RideFeedbackCommonUIStateFactory) defaultRideFeedbackUIStateFactory$getViewState$2.L$1;
                function3 = (Function1) defaultRideFeedbackUIStateFactory$getViewState$2.L$0;
                ResultKt.b(obj2);
            }
            boolean z2 = i5 != 0;
            rideFeedbackHeaderUIState = (RideFeedbackHeaderUIState) obj2;
            rideFeedbackDataState = rideFeedbackDataState3;
            rideFeedbackCommonUIStateFactory3 = rideFeedbackCommonUIStateFactory2;
            function2 = function3;
            z = z2;
            RideFeedbackToolbarUIState rideFeedbackToolbarUIState2 = rideFeedbackToolbarUIState;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$0 = null;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$1 = null;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$2 = null;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$3 = null;
            defaultRideFeedbackUIStateFactory$getViewState$2.label = 3;
            objH = rideFeedbackCommonUIStateFactory3.h(z, rideFeedbackDataState, rideFeedbackToolbarUIState2, rideFeedbackHeaderUIState, function2, defaultRideFeedbackUIStateFactory$getViewState$2);
            if (objH == obj3) {
                return obj3;
            }
            return objH;
        }
        ResultKt.b(obj2);
        BookingContext bookingContext = rideFeedbackDataState.f9141a;
        BookingContext.Default r14 = bookingContext instanceof BookingContext.Default ? (BookingContext.Default) bookingContext : null;
        RideFeedbackBookingData rideFeedbackBookingData = r14 != null ? r14.f9131a : null;
        RideFeedbackEntryPoint rideFeedbackEntryPoint = rideFeedbackBookingData != null ? rideFeedbackBookingData.k : null;
        int i9 = rideFeedbackEntryPoint == null ? -1 : WhenMappings.f9133a[rideFeedbackEntryPoint.ordinal()];
        if (i9 == -1) {
            i = 0;
        } else if (i9 != 1) {
            if (i9 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        } else {
            i = 1;
        }
        i2 = i ^ 1;
        rideFeedbackCommonUIStateFactory = this.b;
        if (i != 0) {
            defaultRideFeedbackUIStateFactory$getViewState$2.L$0 = function1;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$1 = rideFeedbackCommonUIStateFactory;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$2 = rideFeedbackDataState;
            defaultRideFeedbackUIStateFactory$getViewState$2.I$0 = i;
            defaultRideFeedbackUIStateFactory$getViewState$2.I$1 = i2;
            defaultRideFeedbackUIStateFactory$getViewState$2.label = 1;
            Object objB = b(rideFeedbackBookingData, defaultRideFeedbackUIStateFactory$getViewState$2);
            if (objB != obj3) {
                int i10 = i;
                rideFeedbackDataState2 = rideFeedbackDataState;
                i3 = i2;
                obj = objB;
                i4 = i10;
            }
        } else {
            function2 = function1;
            rideFeedbackToolbarUIState = null;
            if (i != 0) {
                rideFeedbackHeaderUIState = null;
                z = i2;
                rideFeedbackCommonUIStateFactory3 = rideFeedbackCommonUIStateFactory;
                RideFeedbackToolbarUIState rideFeedbackToolbarUIState3 = rideFeedbackToolbarUIState;
                defaultRideFeedbackUIStateFactory$getViewState$2.L$0 = null;
                defaultRideFeedbackUIStateFactory$getViewState$2.L$1 = null;
                defaultRideFeedbackUIStateFactory$getViewState$2.L$2 = null;
                defaultRideFeedbackUIStateFactory$getViewState$2.L$3 = null;
                defaultRideFeedbackUIStateFactory$getViewState$2.label = 3;
                objH = rideFeedbackCommonUIStateFactory3.h(z, rideFeedbackDataState, rideFeedbackToolbarUIState3, rideFeedbackHeaderUIState, function2, defaultRideFeedbackUIStateFactory$getViewState$2);
                if (objH == obj3) {
                    return objH;
                }
            } else {
                defaultRideFeedbackUIStateFactory$getViewState$2.L$0 = function2;
                defaultRideFeedbackUIStateFactory$getViewState$2.L$1 = rideFeedbackCommonUIStateFactory;
                defaultRideFeedbackUIStateFactory$getViewState$2.L$2 = rideFeedbackDataState;
                defaultRideFeedbackUIStateFactory$getViewState$2.L$3 = rideFeedbackToolbarUIState;
                defaultRideFeedbackUIStateFactory$getViewState$2.I$0 = i2;
                defaultRideFeedbackUIStateFactory$getViewState$2.label = 2;
                objA = a(function2, defaultRideFeedbackUIStateFactory$getViewState$2);
                if (objA != obj3) {
                    rideFeedbackDataState3 = rideFeedbackDataState;
                    i5 = i2;
                    function3 = function2;
                    obj2 = objA;
                    rideFeedbackCommonUIStateFactory2 = rideFeedbackCommonUIStateFactory;
                    if (i5 != 0) {
                    }
                    rideFeedbackHeaderUIState = (RideFeedbackHeaderUIState) obj2;
                    rideFeedbackDataState = rideFeedbackDataState3;
                    rideFeedbackCommonUIStateFactory3 = rideFeedbackCommonUIStateFactory2;
                    function2 = function3;
                    z = z2;
                    RideFeedbackToolbarUIState rideFeedbackToolbarUIState4 = rideFeedbackToolbarUIState;
                    defaultRideFeedbackUIStateFactory$getViewState$2.L$0 = null;
                    defaultRideFeedbackUIStateFactory$getViewState$2.L$1 = null;
                    defaultRideFeedbackUIStateFactory$getViewState$2.L$2 = null;
                    defaultRideFeedbackUIStateFactory$getViewState$2.L$3 = null;
                    defaultRideFeedbackUIStateFactory$getViewState$2.label = 3;
                    objH = rideFeedbackCommonUIStateFactory3.h(z, rideFeedbackDataState, rideFeedbackToolbarUIState4, rideFeedbackHeaderUIState, function2, defaultRideFeedbackUIStateFactory$getViewState$2);
                    if (objH == obj3) {
                        return objH;
                    }
                }
            }
        }
        return obj3;
        RideFeedbackToolbarUIState rideFeedbackToolbarUIState5 = (RideFeedbackToolbarUIState) obj;
        i2 = i3;
        rideFeedbackDataState = rideFeedbackDataState2;
        i = i4;
        function2 = function1;
        rideFeedbackToolbarUIState = rideFeedbackToolbarUIState5;
        if (i != 0) {
            rideFeedbackHeaderUIState = null;
            z = i2;
            rideFeedbackCommonUIStateFactory3 = rideFeedbackCommonUIStateFactory;
            RideFeedbackToolbarUIState rideFeedbackToolbarUIState6 = rideFeedbackToolbarUIState;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$0 = null;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$1 = null;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$2 = null;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$3 = null;
            defaultRideFeedbackUIStateFactory$getViewState$2.label = 3;
            objH = rideFeedbackCommonUIStateFactory3.h(z, rideFeedbackDataState, rideFeedbackToolbarUIState6, rideFeedbackHeaderUIState, function2, defaultRideFeedbackUIStateFactory$getViewState$2);
            if (objH == obj3) {
                return objH;
            }
        } else {
            defaultRideFeedbackUIStateFactory$getViewState$2.L$0 = function2;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$1 = rideFeedbackCommonUIStateFactory;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$2 = rideFeedbackDataState;
            defaultRideFeedbackUIStateFactory$getViewState$2.L$3 = rideFeedbackToolbarUIState;
            defaultRideFeedbackUIStateFactory$getViewState$2.I$0 = i2;
            defaultRideFeedbackUIStateFactory$getViewState$2.label = 2;
            objA = a(function2, defaultRideFeedbackUIStateFactory$getViewState$2);
            if (objA != obj3) {
                rideFeedbackDataState3 = rideFeedbackDataState;
                i5 = i2;
                function3 = function2;
                obj2 = objA;
                rideFeedbackCommonUIStateFactory2 = rideFeedbackCommonUIStateFactory;
                if (i5 != 0) {
                }
                rideFeedbackHeaderUIState = (RideFeedbackHeaderUIState) obj2;
                rideFeedbackDataState = rideFeedbackDataState3;
                rideFeedbackCommonUIStateFactory3 = rideFeedbackCommonUIStateFactory2;
                function2 = function3;
                z = z2;
                RideFeedbackToolbarUIState rideFeedbackToolbarUIState7 = rideFeedbackToolbarUIState;
                defaultRideFeedbackUIStateFactory$getViewState$2.L$0 = null;
                defaultRideFeedbackUIStateFactory$getViewState$2.L$1 = null;
                defaultRideFeedbackUIStateFactory$getViewState$2.L$2 = null;
                defaultRideFeedbackUIStateFactory$getViewState$2.L$3 = null;
                defaultRideFeedbackUIStateFactory$getViewState$2.label = 3;
                objH = rideFeedbackCommonUIStateFactory3.h(z, rideFeedbackDataState, rideFeedbackToolbarUIState7, rideFeedbackHeaderUIState, function2, defaultRideFeedbackUIStateFactory$getViewState$2);
                if (objH == obj3) {
                    return objH;
                }
            }
        }
        return obj3;
    }
}
