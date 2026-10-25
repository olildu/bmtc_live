package app.chalo.appsupport.uistate;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.extensions.StringExtsKt;
import app.chalo.models.bookinghelp.BookingHelpFaqActionType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetContentUiSpecs;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUiSpec;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.bottomsheet.DrawType;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontWeight;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.ub;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/uistate/BookingHelpUIStateFactory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BookingHelpUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f991a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f992a;

        static {
            int[] iArr = new int[BookingHelpFaqActionType.values().length];
            try {
                iArr[BookingHelpFaqActionType.CANCEL_BOOKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f992a = iArr;
        }
    }

    public BookingHelpUIStateFactory(StringProvider stringProvider) {
        this.f991a = stringProvider;
    }

    public static ButtonUIState a(String str, Function0 function0) {
        return ButtonUIStateFactory.d(ButtonUIStateFactory.f9921a, ChaloTextStyleHelper.f(ChaloTextStyleHelper.f10078a, str, ChaloColorToken.Black_87.f9768a, null, null, 124), function0, UIShape.d, false, 52);
    }

    public static ButtonUIState b(String str, Function0 function0) {
        return ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, ChaloTextStyleHelper.f(ChaloTextStyleHelper.f10078a, str, ChaloColorToken.White.f9870a, null, null, 124), function0, UIShape.d, false, 0.0f, 52);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00da  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:38:0x0133  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        if (r2 == r4) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.appsupport.BookingHelpScreenDataState r24, kotlin.jvm.functions.Function1 r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.appsupport.uistate.BookingHelpUIStateFactory.c(app.chalo.appsupport.BookingHelpScreenDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Code duplicated, block: B:59:0x0185  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        if (r12 == r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014c, code lost:
    
        if (r12 == r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a2, code lost:
    
        if (r12 == r0) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v20, types: [ub] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ub] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ub] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ub] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ub] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ub] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final app.chalo.appsupport.BookingHelpBottomSheetType r10, final kotlin.jvm.functions.Function1 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.appsupport.uistate.BookingHelpUIStateFactory.d(app.chalo.appsupport.BookingHelpBottomSheetType, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(ub ubVar, ub ubVar2, ub ubVar3, ContinuationImpl continuationImpl) {
        BookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1 bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1;
        DrawType.Icon icon;
        Function0 function0;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs;
        ChaloTextStyleHelper chaloTextStyleHelper;
        Function0 function1;
        BottomSheetUiState bottomSheetUiState;
        TextUIState.ChaloTextUIState chaloTextUIStateE;
        DrawType.Icon icon2;
        Function0 function2;
        Function0 function3;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs2;
        Function0 function4;
        TextUIState.ChaloTextUIState chaloTextUIStateC;
        Object objB;
        Function0 function5;
        Function0 function6;
        DrawType.Icon icon3;
        BottomSheetUiState bottomSheetUiState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        BookingHelpUIStateFactory bookingHelpUIStateFactory;
        ButtonUIState buttonUIStateB;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        BottomSheetUiState bottomSheetUiState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs4;
        BookingHelpUIStateFactory bookingHelpUIStateFactory2;
        Function0 function7;
        if (continuationImpl instanceof BookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1) {
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1 = (BookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1) continuationImpl;
            int i = bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.label = i - Integer.MIN_VALUE;
            } else {
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1 = new BookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1(this, continuationImpl);
            }
        } else {
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1 = new BookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1(this, continuationImpl);
        }
        Object objB2 = bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.label;
        ChaloTextStyleHelper chaloTextStyleHelper3 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider = this.f991a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            BottomSheetContentUiSpecs bottomSheetContentUiSpecs5 = new BottomSheetContentUiSpecs(null, UiAlignment.Horizontal.Start.f9886a, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y);
            BottomSheetUiState bottomSheetUiState4 = new BottomSheetUiState(new BottomSheetUiSpec(UIShape.d, 14), new BottomSheetEventHandler(false, false, BottomSheetRequestHandler.Companion.a(ubVar3), 63));
            icon = new DrawType.Icon(new ImageUIState(IconType.IC_DAILY_LIMIT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
            function0 = ubVar;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$0 = function0;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$1 = ubVar2;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$2 = bottomSheetContentUiSpecs5;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$3 = bottomSheetUiState4;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$4 = icon;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$5 = chaloTextStyleHelper3;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.label = 1;
            Object objB3 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1);
            if (objB3 != coroutineSingletons) {
                bottomSheetContentUiSpecs = bottomSheetContentUiSpecs5;
                chaloTextStyleHelper = chaloTextStyleHelper3;
                function1 = ubVar2;
                objB2 = objB3;
                bottomSheetUiState = bottomSheetUiState4;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper4 = (ChaloTextStyleHelper) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$5;
            DrawType.Icon icon4 = (DrawType.Icon) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$4;
            BottomSheetUiState bottomSheetUiState5 = (BottomSheetUiState) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$3;
            bottomSheetContentUiSpecs = (BottomSheetContentUiSpecs) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$2;
            function1 = (Function0) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$1;
            function0 = (Function0) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$0;
            ResultKt.b(objB2);
            icon = icon4;
            bottomSheetUiState = bottomSheetUiState5;
            chaloTextStyleHelper = chaloTextStyleHelper4;
        } else {
            if (i2 == 2) {
                ChaloTextStyleHelper chaloTextStyleHelper5 = (ChaloTextStyleHelper) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$6;
                chaloTextUIStateE = (TextUIState.ChaloTextUIState) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$5;
                icon2 = (DrawType.Icon) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$4;
                bottomSheetUiState = (BottomSheetUiState) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$3;
                BottomSheetContentUiSpecs bottomSheetContentUiSpecs6 = (BottomSheetContentUiSpecs) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$2;
                Function0 function8 = (Function0) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$1;
                function3 = (Function0) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$0;
                ResultKt.b(objB2);
                chaloTextStyleHelper2 = chaloTextStyleHelper5;
                bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs6;
                function2 = function8;
                function4 = function3;
                chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) objB2, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$0 = function4;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$1 = function2;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$2 = bottomSheetContentUiSpecs2;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$3 = bottomSheetUiState;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$4 = icon2;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$5 = chaloTextUIStateE;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$6 = chaloTextUIStateC;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$7 = this;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.label = 3;
                objB = stringProvider.b(StringEnum.TRY_AGAIN, new Object[0], bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1);
                if (objB != coroutineSingletons) {
                    function5 = function4;
                    function6 = function2;
                    objB2 = objB;
                    icon3 = icon2;
                    bottomSheetUiState2 = bottomSheetUiState;
                    chaloTextUIState = chaloTextUIStateE;
                    bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs2;
                    chaloTextUIState2 = chaloTextUIStateC;
                    bookingHelpUIStateFactory = this;
                    bookingHelpUIStateFactory.getClass();
                    buttonUIStateB = b((String) objB2, function5);
                    bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$0 = function6;
                    bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$1 = bottomSheetContentUiSpecs3;
                    bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$2 = bottomSheetUiState2;
                    bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$3 = icon3;
                    bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$4 = chaloTextUIState;
                    bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$5 = chaloTextUIState2;
                    bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$6 = buttonUIStateB;
                    bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$7 = this;
                    bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.GO_BACK, new Object[0], bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1);
                    if (objB2 != coroutineSingletons) {
                        BottomSheetContentUiSpecs bottomSheetContentUiSpecs7 = bottomSheetContentUiSpecs3;
                        chaloTextUIState3 = chaloTextUIState2;
                        bottomSheetUiState3 = bottomSheetUiState2;
                        chaloTextUIState4 = chaloTextUIState;
                        bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs7;
                        bookingHelpUIStateFactory2 = this;
                        function7 = function6;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                bookingHelpUIStateFactory = (BookingHelpUIStateFactory) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$7;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$6;
                TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$5;
                DrawType.Icon icon5 = (DrawType.Icon) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$4;
                BottomSheetUiState bottomSheetUiState6 = (BottomSheetUiState) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$3;
                BottomSheetContentUiSpecs bottomSheetContentUiSpecs8 = (BottomSheetContentUiSpecs) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$2;
                function6 = (Function0) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$1;
                function5 = (Function0) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$0;
                ResultKt.b(objB2);
                chaloTextUIState = chaloTextUIState5;
                icon3 = icon5;
                bottomSheetUiState2 = bottomSheetUiState6;
                bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs8;
                bookingHelpUIStateFactory.getClass();
                buttonUIStateB = b((String) objB2, function5);
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$0 = function6;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$1 = bottomSheetContentUiSpecs3;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$2 = bottomSheetUiState2;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$3 = icon3;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$4 = chaloTextUIState;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$5 = chaloTextUIState2;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$6 = buttonUIStateB;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$7 = this;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.GO_BACK, new Object[0], bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1);
                if (objB2 != coroutineSingletons) {
                    BottomSheetContentUiSpecs bottomSheetContentUiSpecs9 = bottomSheetContentUiSpecs3;
                    chaloTextUIState3 = chaloTextUIState2;
                    bottomSheetUiState3 = bottomSheetUiState2;
                    chaloTextUIState4 = chaloTextUIState;
                    bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs9;
                    bookingHelpUIStateFactory2 = this;
                    function7 = function6;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bookingHelpUIStateFactory2 = (BookingHelpUIStateFactory) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$7;
            buttonUIStateB = (ButtonUIState) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$6;
            TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$5;
            TextUIState.ChaloTextUIState chaloTextUIState7 = (TextUIState.ChaloTextUIState) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$4;
            icon3 = (DrawType.Icon) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$3;
            BottomSheetUiState bottomSheetUiState7 = (BottomSheetUiState) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$2;
            BottomSheetContentUiSpecs bottomSheetContentUiSpecs10 = (BottomSheetContentUiSpecs) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$1;
            function7 = (Function0) bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$0;
            ResultKt.b(objB2);
            chaloTextUIState3 = chaloTextUIState6;
            bottomSheetUiState3 = bottomSheetUiState7;
            chaloTextUIState4 = chaloTextUIState7;
            bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs10;
        }
        ButtonUIState buttonUIState = buttonUIStateB;
        bookingHelpUIStateFactory2.getClass();
        return new BookingHelpBottomSheetUIStateType.Generic(new BottomSheetStandardContentUiState(bottomSheetUiState3, bottomSheetContentUiSpecs4, icon3, chaloTextUIState4, chaloTextUIState3, buttonUIState, a((String) objB2, function7), null, 128));
        chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB2, null, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
        bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$0 = function0;
        bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$1 = function1;
        bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$2 = bottomSheetContentUiSpecs;
        bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$3 = bottomSheetUiState;
        bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$4 = icon;
        bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$5 = chaloTextUIStateE;
        bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$6 = chaloTextStyleHelper3;
        bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.label = 2;
        objB2 = stringProvider.b(StringEnum.BOOKING_CANCELLATION_ERROR, new Object[0], bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1);
        if (objB2 != coroutineSingletons) {
            icon2 = icon;
            function2 = function1;
            function3 = function0;
            chaloTextStyleHelper2 = chaloTextStyleHelper3;
            bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs;
            function4 = function3;
            chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) objB2, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$0 = function4;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$1 = function2;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$2 = bottomSheetContentUiSpecs2;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$3 = bottomSheetUiState;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$4 = icon2;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$5 = chaloTextUIStateE;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$6 = chaloTextUIStateC;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$7 = this;
            bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.label = 3;
            objB = stringProvider.b(StringEnum.TRY_AGAIN, new Object[0], bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1);
            if (objB != coroutineSingletons) {
                function5 = function4;
                function6 = function2;
                objB2 = objB;
                icon3 = icon2;
                bottomSheetUiState2 = bottomSheetUiState;
                chaloTextUIState = chaloTextUIStateE;
                bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs2;
                chaloTextUIState2 = chaloTextUIStateC;
                bookingHelpUIStateFactory = this;
                bookingHelpUIStateFactory.getClass();
                buttonUIStateB = b((String) objB2, function5);
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$0 = function6;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$1 = bottomSheetContentUiSpecs3;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$2 = bottomSheetUiState2;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$3 = icon3;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$4 = chaloTextUIState;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$5 = chaloTextUIState2;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$6 = buttonUIStateB;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.L$7 = this;
                bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.GO_BACK, new Object[0], bookingHelpUIStateFactory$getCancellationErrorBottomSheetState$1);
                if (objB2 != coroutineSingletons) {
                    BottomSheetContentUiSpecs bottomSheetContentUiSpecs11 = bottomSheetContentUiSpecs3;
                    chaloTextUIState3 = chaloTextUIState2;
                    bottomSheetUiState3 = bottomSheetUiState2;
                    chaloTextUIState4 = chaloTextUIState;
                    bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs11;
                    bookingHelpUIStateFactory2 = this;
                    function7 = function6;
                    ButtonUIState buttonUIState2 = buttonUIStateB;
                    bookingHelpUIStateFactory2.getClass();
                    return new BookingHelpBottomSheetUIStateType.Generic(new BottomSheetStandardContentUiState(bottomSheetUiState3, bottomSheetContentUiSpecs4, icon3, chaloTextUIState4, chaloTextUIState3, buttonUIState2, a((String) objB2, function7), null, 128));
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:36:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(String str, ub ubVar, ub ubVar2, ub ubVar3, ContinuationImpl continuationImpl) {
        BookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1 bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1;
        Function0 function0;
        String str2;
        Function0 function1;
        Function0 function2;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs;
        DrawType.Gif gif;
        String str3;
        ChaloTextStyleHelper chaloTextStyleHelper;
        BottomSheetUiState bottomSheetUiState;
        Function0 function3;
        Function0 function4;
        Function0 function5;
        TextUIState.ChaloTextUIState chaloTextUIStateE;
        StringProvider stringProvider;
        BottomSheetUiState bottomSheetUiState2;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs2;
        TextUIState.ChaloTextUIState chaloTextUIStateC;
        Function0 function6;
        Object objB;
        CoroutineSingletons coroutineSingletons;
        Function0 function7;
        DrawType.Gif gif2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs3;
        BookingHelpUIStateFactory bookingHelpUIStateFactory;
        ButtonUIState buttonUIStateB;
        BookingHelpUIStateFactory bookingHelpUIStateFactory2;
        DrawType.Gif gif3;
        Function0 function8;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs4;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        BottomSheetUiState bottomSheetUiState3;
        if (continuationImpl instanceof BookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1) {
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1 = (BookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1) continuationImpl;
            int i = bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.label = i - Integer.MIN_VALUE;
            } else {
                bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1 = new BookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1(this, continuationImpl);
            }
        } else {
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1 = new BookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1(this, continuationImpl);
        }
        Object objB2 = bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.label;
        ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider2 = this.f991a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$0 = ubVar;
            function0 = ubVar2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$1 = function0;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$2 = ubVar3;
            str2 = str;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$3 = str2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.label = 1;
            objB2 = stringProvider2.b(StringEnum.BOOKING_CANCELLATION_ERROR, new Object[0], bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1);
            if (objB2 != coroutineSingletons2) {
                function1 = ubVar;
                function2 = ubVar3;
            }
            return coroutineSingletons2;
        }
        if (i2 == 1) {
            String str4 = (String) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$3;
            function2 = (Function0) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$2;
            function0 = (Function0) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$1;
            function1 = (Function0) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$0;
            ResultKt.b(objB2);
            str2 = str4;
        } else if (i2 == 2) {
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$6;
            DrawType.Gif gif4 = (DrawType.Gif) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$5;
            bottomSheetUiState = (BottomSheetUiState) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$4;
            BottomSheetContentUiSpecs bottomSheetContentUiSpecs5 = (BottomSheetContentUiSpecs) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$3;
            String str5 = (String) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$2;
            function4 = (Function0) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$1;
            function3 = (Function0) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$0;
            ResultKt.b(objB2);
            chaloTextStyleHelper = chaloTextStyleHelper3;
            gif = gif4;
            bottomSheetContentUiSpecs = bottomSheetContentUiSpecs5;
            str3 = str5;
            function5 = function3;
            chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB2, null, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
            stringProvider = stringProvider2;
            bottomSheetUiState2 = bottomSheetUiState;
            bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs;
            chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper2, str3, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$0 = function5;
            function6 = function4;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$1 = function6;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$2 = bottomSheetContentUiSpecs2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$3 = bottomSheetUiState2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$4 = gif;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$5 = chaloTextUIStateE;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$6 = chaloTextUIStateC;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$7 = this;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.label = 3;
            objB = stringProvider.b(StringEnum.TRY_AGAIN, new Object[0], bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1);
            coroutineSingletons = coroutineSingletons2;
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            function7 = function5;
            gif2 = gif;
            objB2 = objB;
            chaloTextUIState = chaloTextUIStateE;
            bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs2;
            bookingHelpUIStateFactory = this;
            bookingHelpUIStateFactory.getClass();
            buttonUIStateB = b((String) objB2, function7);
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$0 = function6;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$1 = bottomSheetContentUiSpecs3;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$2 = bottomSheetUiState2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$3 = gif2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$4 = chaloTextUIState;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$5 = chaloTextUIStateC;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$6 = buttonUIStateB;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$7 = this;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.label = 4;
            objB2 = stringProvider.b(StringEnum.GO_BACK, new Object[0], bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1);
            if (objB2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            bookingHelpUIStateFactory2 = this;
            gif3 = gif2;
            function8 = function6;
            chaloTextUIState2 = chaloTextUIState;
            bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs3;
            chaloTextUIState3 = chaloTextUIStateC;
            bottomSheetUiState3 = bottomSheetUiState2;
        } else if (i2 == 3) {
            bookingHelpUIStateFactory = (BookingHelpUIStateFactory) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$7;
            chaloTextUIStateC = (TextUIState.ChaloTextUIState) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$6;
            chaloTextUIState = (TextUIState.ChaloTextUIState) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$5;
            DrawType.Gif gif5 = (DrawType.Gif) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$4;
            BottomSheetUiState bottomSheetUiState4 = (BottomSheetUiState) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$3;
            BottomSheetContentUiSpecs bottomSheetContentUiSpecs6 = (BottomSheetContentUiSpecs) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$2;
            Function0 function9 = (Function0) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$1;
            function7 = (Function0) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$0;
            ResultKt.b(objB2);
            coroutineSingletons = coroutineSingletons2;
            stringProvider = stringProvider2;
            gif2 = gif5;
            bottomSheetUiState2 = bottomSheetUiState4;
            bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs6;
            function6 = function9;
            bookingHelpUIStateFactory.getClass();
            buttonUIStateB = b((String) objB2, function7);
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$0 = function6;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$1 = bottomSheetContentUiSpecs3;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$2 = bottomSheetUiState2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$3 = gif2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$4 = chaloTextUIState;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$5 = chaloTextUIStateC;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$6 = buttonUIStateB;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$7 = this;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.label = 4;
            objB2 = stringProvider.b(StringEnum.GO_BACK, new Object[0], bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1);
            if (objB2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            bookingHelpUIStateFactory2 = this;
            gif3 = gif2;
            function8 = function6;
            chaloTextUIState2 = chaloTextUIState;
            bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs3;
            chaloTextUIState3 = chaloTextUIStateC;
            bottomSheetUiState3 = bottomSheetUiState2;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bookingHelpUIStateFactory2 = (BookingHelpUIStateFactory) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$7;
            buttonUIStateB = (ButtonUIState) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$6;
            TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$5;
            TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$4;
            gif3 = (DrawType.Gif) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$3;
            BottomSheetUiState bottomSheetUiState5 = (BottomSheetUiState) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$2;
            BottomSheetContentUiSpecs bottomSheetContentUiSpecs7 = (BottomSheetContentUiSpecs) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$1;
            function8 = (Function0) bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$0;
            ResultKt.b(objB2);
            chaloTextUIState3 = chaloTextUIState4;
            bottomSheetUiState3 = bottomSheetUiState5;
            chaloTextUIState2 = chaloTextUIState5;
            bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs7;
        }
        ButtonUIState buttonUIState = buttonUIStateB;
        bookingHelpUIStateFactory2.getClass();
        return new BookingHelpBottomSheetUIStateType.Generic(new BottomSheetStandardContentUiState(bottomSheetUiState3, bottomSheetContentUiSpecs4, gif3, chaloTextUIState2, chaloTextUIState3, buttonUIState, a((String) objB2, function8), null, 128));
        String strB = StringExtsKt.b(str2, (String) objB2);
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs8 = new BottomSheetContentUiSpecs(null, UiAlignment.Horizontal.Start.f9886a, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y);
        BottomSheetUiState bottomSheetUiState6 = new BottomSheetUiState(new BottomSheetUiSpec(UIShape.d, 14), new BottomSheetEventHandler(false, false, BottomSheetRequestHandler.Companion.a(function2), 63));
        DrawType.Gif gif6 = new DrawType.Gif(new GifImageUIState(LottieType.CHALO_RED_ERROR, 1, new ImageUISize(ChaloThemeHelper.a().b0)));
        bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$0 = function1;
        bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$1 = function0;
        bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$2 = strB;
        bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$3 = bottomSheetContentUiSpecs8;
        bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$4 = bottomSheetUiState6;
        bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$5 = gif6;
        bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$6 = chaloTextStyleHelper2;
        bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.label = 2;
        Object objB3 = stringProvider2.b(StringEnum.CANCELLATION_FAILED, new Object[0], bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1);
        if (objB3 != coroutineSingletons2) {
            bottomSheetContentUiSpecs = bottomSheetContentUiSpecs8;
            gif = gif6;
            str3 = strB;
            chaloTextStyleHelper = chaloTextStyleHelper2;
            objB2 = objB3;
            bottomSheetUiState = bottomSheetUiState6;
            function3 = function1;
            function4 = function0;
            function5 = function3;
            chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB2, null, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
            stringProvider = stringProvider2;
            bottomSheetUiState2 = bottomSheetUiState;
            bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs;
            chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper2, str3, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$0 = function5;
            function6 = function4;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$1 = function6;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$2 = bottomSheetContentUiSpecs2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$3 = bottomSheetUiState2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$4 = gif;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$5 = chaloTextUIStateE;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$6 = chaloTextUIStateC;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$7 = this;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.label = 3;
            objB = stringProvider.b(StringEnum.TRY_AGAIN, new Object[0], bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1);
            coroutineSingletons = coroutineSingletons2;
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            function7 = function5;
            gif2 = gif;
            objB2 = objB;
            chaloTextUIState = chaloTextUIStateE;
            bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs2;
            bookingHelpUIStateFactory = this;
            bookingHelpUIStateFactory.getClass();
            buttonUIStateB = b((String) objB2, function7);
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$0 = function6;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$1 = bottomSheetContentUiSpecs3;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$2 = bottomSheetUiState2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$3 = gif2;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$4 = chaloTextUIState;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$5 = chaloTextUIStateC;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$6 = buttonUIStateB;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.L$7 = this;
            bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1.label = 4;
            objB2 = stringProvider.b(StringEnum.GO_BACK, new Object[0], bookingHelpUIStateFactory$getCancellationFailedBottomSheetState$1);
            if (objB2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            bookingHelpUIStateFactory2 = this;
            gif3 = gif2;
            function8 = function6;
            chaloTextUIState2 = chaloTextUIState;
            bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs3;
            chaloTextUIState3 = chaloTextUIStateC;
            bottomSheetUiState3 = bottomSheetUiState2;
            ButtonUIState buttonUIState2 = buttonUIStateB;
            bookingHelpUIStateFactory2.getClass();
            return new BookingHelpBottomSheetUIStateType.Generic(new BottomSheetStandardContentUiState(bottomSheetUiState3, bottomSheetContentUiSpecs4, gif3, chaloTextUIState2, chaloTextUIState3, buttonUIState2, a((String) objB2, function8), null, 128));
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(String str, String str2, Function0 function0, ContinuationImpl continuationImpl) {
        BookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1 bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1;
        BottomSheetUiState bottomSheetUiState;
        DrawType.Gif gif;
        TextUIState.ChaloTextUIState chaloTextUIStateC;
        Function0 function1;
        BookingHelpUIStateFactory bookingHelpUIStateFactory;
        TextUIState.ChaloTextUIState chaloTextUIState;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs;
        if (continuationImpl instanceof BookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1) {
            bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1 = (BookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1) continuationImpl;
            int i = bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.label = i - Integer.MIN_VALUE;
            } else {
                bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1 = new BookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1(this, continuationImpl);
            }
        } else {
            bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1 = new BookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1(this, continuationImpl);
        }
        Object obj = bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(UIShape.d, 14), new BottomSheetEventHandler(false, false, null, 99));
            BottomSheetContentUiSpecs bottomSheetContentUiSpecs2 = new BottomSheetContentUiSpecs(null, UiAlignment.Horizontal.Start.f9886a, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y);
            gif = new DrawType.Gif(new GifImageUIState(LottieType.PAYMENT_SUCCESS, 1, new ImageUISize(ChaloThemeHelper.a().b0)));
            UIFontWeight uIFontWeight = UIFontWeight.Bold;
            ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
            TextUIState.ChaloTextUIState chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, str, null, null, uIFontWeight, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
            chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper, str2, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124);
            function1 = function0;
            bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$0 = function1;
            bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$1 = bottomSheetUiState;
            bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$2 = bottomSheetContentUiSpecs2;
            bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$3 = gif;
            bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$4 = chaloTextUIStateE;
            bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$5 = chaloTextUIStateC;
            bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$6 = this;
            bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.label = 1;
            Object objB = this.f991a.b(StringEnum.OKAY, new Object[0], bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            bookingHelpUIStateFactory = this;
            chaloTextUIState = chaloTextUIStateE;
            obj = objB;
            bottomSheetContentUiSpecs = bottomSheetContentUiSpecs2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bookingHelpUIStateFactory = (BookingHelpUIStateFactory) bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$6;
            chaloTextUIStateC = (TextUIState.ChaloTextUIState) bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$5;
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$4;
            gif = (DrawType.Gif) bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$3;
            BottomSheetContentUiSpecs bottomSheetContentUiSpecs3 = (BottomSheetContentUiSpecs) bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$2;
            bottomSheetUiState = (BottomSheetUiState) bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$1;
            Function0 function2 = (Function0) bookingHelpUIStateFactory$getCancellationSuccessBottomSheetState$1.L$0;
            ResultKt.b(obj);
            function1 = function2;
            chaloTextUIState = chaloTextUIState2;
            bottomSheetContentUiSpecs = bottomSheetContentUiSpecs3;
        }
        TextUIState.ChaloTextUIState chaloTextUIState3 = chaloTextUIStateC;
        DrawType.Gif gif2 = gif;
        BottomSheetUiState bottomSheetUiState2 = bottomSheetUiState;
        bookingHelpUIStateFactory.getClass();
        return new BookingHelpBottomSheetUIStateType.Generic(new BottomSheetStandardContentUiState(bottomSheetUiState2, bottomSheetContentUiSpecs, gif2, chaloTextUIState, chaloTextUIState3, b((String) obj, function1), null, null, 128));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0084  */
    /* JADX WARN: Code duplicated, block: B:19:0x008d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x010d  */
    /* JADX WARN: Code duplicated, block: B:35:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x010d -> B:33:0x0116). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x013a -> B:34:0x0137). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(java.util.List r43, kotlin.jvm.functions.Function1 r44, kotlin.coroutines.jvm.internal.ContinuationImpl r45) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.appsupport.uistate.BookingHelpUIStateFactory.h(java.util.List, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
