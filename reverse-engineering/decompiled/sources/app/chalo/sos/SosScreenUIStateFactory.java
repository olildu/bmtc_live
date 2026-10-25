package app.chalo.sos;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.DialogDismissRequest;
import app.chalo.uistate.dialog.DialogUIEventHandler;
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
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper$basic$3;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIStateFactory;
import defpackage.fa1;
import defpackage.s01;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SosScreenUIStateFactory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SosScreenUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f9422a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9423a;

        static {
            int[] iArr = new int[SosScreenType.values().length];
            try {
                iArr[SosScreenType.DISPLAY_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SosScreenType.MSG_EDIT_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9423a = iArr;
        }
    }

    public SosScreenUIStateFactory(StringProvider stringProvider) {
        this.f9422a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r13 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r13 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        if (r13 == r0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.sos.SosScreenDataState r11, kotlin.jvm.functions.Function1 r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.sos.SosScreenUIStateFactory.a(app.chalo.sos.SosScreenDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x0318  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0318 -> B:51:0x0327). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(app.chalo.sos.SosScreenDataState r35, kotlin.jvm.functions.Function1 r36, kotlin.coroutines.jvm.internal.ContinuationImpl r37) {
        /*
            Method dump skipped, instruction units count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.sos.SosScreenUIStateFactory.b(app.chalo.sos.SosScreenDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(SosScreenDataState sosScreenDataState, Function1 function1, ContinuationImpl continuationImpl) {
        SosScreenUIStateFactory$msgEditScreen$1 sosScreenUIStateFactory$msgEditScreen$1;
        SosScreenDataState sosScreenDataState2;
        Function1 function2;
        ToolbarUIStateFactory toolbarUIStateFactory;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Function1 function3;
        SosScreenDataState sosScreenDataState3;
        String str;
        if (continuationImpl instanceof SosScreenUIStateFactory$msgEditScreen$1) {
            sosScreenUIStateFactory$msgEditScreen$1 = (SosScreenUIStateFactory$msgEditScreen$1) continuationImpl;
            int i = sosScreenUIStateFactory$msgEditScreen$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sosScreenUIStateFactory$msgEditScreen$1.label = i - Integer.MIN_VALUE;
            } else {
                sosScreenUIStateFactory$msgEditScreen$1 = new SosScreenUIStateFactory$msgEditScreen$1(this, continuationImpl);
            }
        } else {
            sosScreenUIStateFactory$msgEditScreen$1 = new SosScreenUIStateFactory$msgEditScreen$1(this, continuationImpl);
        }
        Object objB = sosScreenUIStateFactory$msgEditScreen$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sosScreenUIStateFactory$msgEditScreen$1.label;
        StringProvider stringProvider = this.f9422a;
        if (i2 == 0) {
            ResultKt.b(objB);
            sosScreenDataState2 = sosScreenDataState;
            sosScreenUIStateFactory$msgEditScreen$1.L$0 = sosScreenDataState2;
            sosScreenUIStateFactory$msgEditScreen$1.L$1 = function1;
            ToolbarUIStateFactory toolbarUIStateFactory2 = ToolbarUIStateFactory.f10120a;
            sosScreenUIStateFactory$msgEditScreen$1.L$2 = toolbarUIStateFactory2;
            sosScreenUIStateFactory$msgEditScreen$1.label = 1;
            objB = stringProvider.b(StringEnum.EDIT_MESSAGE, new Object[0], sosScreenUIStateFactory$msgEditScreen$1);
            if (objB != coroutineSingletons) {
                function2 = function1;
                toolbarUIStateFactory = toolbarUIStateFactory2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            toolbarUIStateFactory = (ToolbarUIStateFactory) sosScreenUIStateFactory$msgEditScreen$1.L$2;
            function2 = (Function1) sosScreenUIStateFactory$msgEditScreen$1.L$1;
            sosScreenDataState2 = (SosScreenDataState) sosScreenUIStateFactory$msgEditScreen$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) sosScreenUIStateFactory$msgEditScreen$1.L$2;
            function3 = (Function1) sosScreenUIStateFactory$msgEditScreen$1.L$1;
            sosScreenDataState3 = (SosScreenDataState) sosScreenUIStateFactory$msgEditScreen$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState = chaloTextUIState2;
        }
        ToolbarUIState toolbarUIState = new ToolbarUIState(null, chaloTextUIState, null, UiEventHandler.Companion.a(new fa1(function3, 4)), CollectionsKt.R(new ToolbarActionsUIState(UiEventHandler.Companion.a(new fa1(function3, 1)), null, new TextUIState.ChaloTextUIState((String) objB, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190), null, 10)), 0.0f, null, null, 229);
        str = sosScreenDataState3.d;
        if (str == null) {
            str = sosScreenDataState3.f9406a;
        }
        String str2 = str;
        TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B = TextFieldEventHandlerHelper.b(2, new s01(function3, 22), null);
        UITextStyle uITextStyle = UITextStyle.BodyLarge;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        return new SosScreenTypeUIState.EditMsgUIState(toolbarUIState, new BaseTextFieldUIState.TextFieldUIState(str2, textFieldEventHandlerHelper$basic$3B, uITextStyle, null, null, null, false, null, 0, null, new UITextFieldColors(null, null, null, null, null, null, orangePrimary, orangePrimary, orangePrimary, null, null, null, 4187135), 0.0f, 98284));
        TextUIState.ChaloTextUIState chaloTextUIStateA = ToolbarUIStateFactory.a(toolbarUIStateFactory, (String) objB, 14);
        sosScreenUIStateFactory$msgEditScreen$1.L$0 = sosScreenDataState2;
        sosScreenUIStateFactory$msgEditScreen$1.L$1 = function2;
        sosScreenUIStateFactory$msgEditScreen$1.L$2 = chaloTextUIStateA;
        sosScreenUIStateFactory$msgEditScreen$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.SAVE, new Object[0], sosScreenUIStateFactory$msgEditScreen$1);
        if (objB2 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIStateA;
            objB = objB2;
            function3 = function2;
            sosScreenDataState3 = sosScreenDataState2;
            ToolbarUIState toolbarUIState2 = new ToolbarUIState(null, chaloTextUIState, null, UiEventHandler.Companion.a(new fa1(function3, 4)), CollectionsKt.R(new ToolbarActionsUIState(UiEventHandler.Companion.a(new fa1(function3, 1)), null, new TextUIState.ChaloTextUIState((String) objB, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190), null, 10)), 0.0f, null, null, 229);
            str = sosScreenDataState3.d;
            if (str == null) {
                str = sosScreenDataState3.f9406a;
            }
            String str3 = str;
            TextFieldEventHandlerHelper$basic$3 textFieldEventHandlerHelper$basic$3B2 = TextFieldEventHandlerHelper.b(2, new s01(function3, 22), null);
            UITextStyle uITextStyle2 = UITextStyle.BodyLarge;
            ChaloColorToken.OrangePrimary orangePrimary2 = ChaloColorToken.OrangePrimary.f9835a;
            return new SosScreenTypeUIState.EditMsgUIState(toolbarUIState2, new BaseTextFieldUIState.TextFieldUIState(str3, textFieldEventHandlerHelper$basic$3B2, uITextStyle2, null, null, null, false, null, 0, null, new UITextFieldColors(null, null, null, null, null, null, orangePrimary2, orangePrimary2, orangePrimary2, null, null, null, 4187135), 0.0f, 98284));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(String str, fa1 fa1Var, fa1 fa1Var2, fa1 fa1Var3, fa1 fa1Var4, ContinuationImpl continuationImpl) {
        SosScreenUIStateFactory$sendSosConfirmationDialog$1 sosScreenUIStateFactory$sendSosConfirmationDialog$1;
        String str2;
        DialogUIEventHandler dialogUIEventHandler;
        ImageUIState imageUIState;
        Function0 function0;
        Function0 function1;
        Object obj;
        Function0 function2;
        TextUIState chaloTextUIState;
        TextUIState chaloTextUIState2;
        DialogUIEventHandler dialogUIEventHandler2;
        ImageUIState imageUIState2;
        Function0 function3;
        ImageUIState imageUIState3;
        ButtonUIStateFactory buttonUIStateFactory;
        ButtonUIState buttonUIStateG;
        Object objB;
        ImageUIState imageUIState4;
        DialogUIEventHandler dialogUIEventHandler3;
        ButtonUIState buttonUIState;
        ImageUIState imageUIState5;
        Function0 function4;
        TextUIState textUIState;
        if (continuationImpl instanceof SosScreenUIStateFactory$sendSosConfirmationDialog$1) {
            sosScreenUIStateFactory$sendSosConfirmationDialog$1 = (SosScreenUIStateFactory$sendSosConfirmationDialog$1) continuationImpl;
            int i = sosScreenUIStateFactory$sendSosConfirmationDialog$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sosScreenUIStateFactory$sendSosConfirmationDialog$1.label = i - Integer.MIN_VALUE;
            } else {
                sosScreenUIStateFactory$sendSosConfirmationDialog$1 = new SosScreenUIStateFactory$sendSosConfirmationDialog$1(this, continuationImpl);
            }
        } else {
            sosScreenUIStateFactory$sendSosConfirmationDialog$1 = new SosScreenUIStateFactory$sendSosConfirmationDialog$1(this, continuationImpl);
        }
        Object objB2 = sosScreenUIStateFactory$sendSosConfirmationDialog$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sosScreenUIStateFactory$sendSosConfirmationDialog$1.label;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        StringProvider stringProvider = this.f9422a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            DialogUIEventHandler dialogUIEventHandler4 = new DialogUIEventHandler(true, true, DialogDismissRequest.Companion.a(fa1Var2));
            ImageUIState imageUIState6 = new ImageUIState(IconType.IC_ALERT_TRIANGLE, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().k), Dp.m7276boximpl(ChaloThemeHelper.a().k)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            str2 = str;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$0 = str2;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$1 = fa1Var;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$2 = fa1Var3;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$3 = fa1Var4;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$4 = dialogUIEventHandler4;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$5 = imageUIState6;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.label = 1;
            Object objB3 = stringProvider.b(StringEnum.SOS_ALERT, new Object[0], sosScreenUIStateFactory$sendSosConfirmationDialog$1);
            if (objB3 != coroutineSingletons) {
                dialogUIEventHandler = dialogUIEventHandler4;
                imageUIState = imageUIState6;
                function0 = fa1Var;
                function1 = fa1Var4;
                obj = objB3;
                function2 = fa1Var3;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ImageUIState imageUIState7 = (ImageUIState) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$5;
            DialogUIEventHandler dialogUIEventHandler5 = (DialogUIEventHandler) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$4;
            function1 = (Function0) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$3;
            Function0 function5 = (Function0) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$2;
            Function0 function6 = (Function0) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$1;
            String str3 = (String) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$0;
            ResultKt.b(objB2);
            imageUIState = imageUIState7;
            function2 = function5;
            dialogUIEventHandler = dialogUIEventHandler5;
            obj = objB2;
            function0 = function6;
            str2 = str3;
        } else {
            if (i2 == 2) {
                imageUIState3 = (ImageUIState) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$7;
                TextUIState textUIState2 = (TextUIState) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$6;
                TextUIState textUIState3 = (TextUIState) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$5;
                ImageUIState imageUIState8 = (ImageUIState) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$4;
                DialogUIEventHandler dialogUIEventHandler6 = (DialogUIEventHandler) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$3;
                buttonUIStateFactory = (ButtonUIStateFactory) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$2;
                Function0 function7 = (Function0) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$1;
                function3 = (Function0) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$0;
                ResultKt.b(objB2);
                chaloTextUIState = textUIState3;
                dialogUIEventHandler2 = dialogUIEventHandler6;
                chaloTextUIState2 = textUIState2;
                imageUIState2 = imageUIState8;
                function1 = function7;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB2, function3, null, UIShape.e, false, 0.0f, 52);
                sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$0 = function1;
                sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$1 = buttonUIStateFactory2;
                sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$2 = dialogUIEventHandler2;
                sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$3 = imageUIState2;
                sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$4 = chaloTextUIState;
                sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$5 = chaloTextUIState2;
                sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$6 = imageUIState3;
                sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$7 = buttonUIStateG;
                sosScreenUIStateFactory$sendSosConfirmationDialog$1.label = 3;
                objB = stringProvider.b(StringEnum.CANCEL, new Object[0], sosScreenUIStateFactory$sendSosConfirmationDialog$1);
                if (objB != coroutineSingletons) {
                    DialogUIEventHandler dialogUIEventHandler7 = dialogUIEventHandler2;
                    imageUIState4 = imageUIState3;
                    dialogUIEventHandler3 = dialogUIEventHandler7;
                    buttonUIState = buttonUIStateG;
                    objB2 = objB;
                    imageUIState5 = imageUIState2;
                    function4 = function1;
                    textUIState = chaloTextUIState2;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ButtonUIState buttonUIState2 = (ButtonUIState) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$7;
            ImageUIState imageUIState9 = (ImageUIState) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$6;
            TextUIState textUIState4 = (TextUIState) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$5;
            chaloTextUIState = (TextUIState) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$4;
            ImageUIState imageUIState10 = (ImageUIState) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$3;
            DialogUIEventHandler dialogUIEventHandler8 = (DialogUIEventHandler) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$2;
            ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$1;
            function4 = (Function0) sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$0;
            ResultKt.b(objB2);
            buttonUIState = buttonUIState2;
            imageUIState5 = imageUIState10;
            textUIState = textUIState4;
            buttonUIStateFactory2 = buttonUIStateFactory3;
            imageUIState4 = imageUIState9;
            dialogUIEventHandler3 = dialogUIEventHandler8;
        }
        ButtonUIStateFactory buttonUIStateFactory4 = buttonUIStateFactory2;
        return new SendSosConfirmationDialog(dialogUIEventHandler3, imageUIState5, chaloTextUIState, textUIState, imageUIState4, buttonUIState, ButtonUIStateFactory.b(buttonUIStateFactory4, (String) objB2, function4, UIShape.e, false, 52));
        chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        DialogUIEventHandler dialogUIEventHandler9 = dialogUIEventHandler;
        chaloTextUIState2 = new TextUIState.ChaloTextUIState(str2, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        ImageUIState imageUIState11 = new ImageUIState(IconType.IC_CLOSE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(function0), WebSocketProtocol.PAYLOAD_SHORT);
        sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$0 = function2;
        sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$1 = function1;
        sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$2 = buttonUIStateFactory2;
        sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$3 = dialogUIEventHandler9;
        sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$4 = imageUIState;
        sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$5 = chaloTextUIState;
        sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$6 = chaloTextUIState2;
        sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$7 = imageUIState11;
        sosScreenUIStateFactory$sendSosConfirmationDialog$1.label = 2;
        objB2 = stringProvider.b(StringEnum.SEND_ALERT_RUNNING_CASE, new Object[0], sosScreenUIStateFactory$sendSosConfirmationDialog$1);
        if (objB2 != coroutineSingletons) {
            ImageUIState imageUIState12 = imageUIState;
            dialogUIEventHandler2 = dialogUIEventHandler9;
            imageUIState2 = imageUIState12;
            function3 = function2;
            imageUIState3 = imageUIState11;
            buttonUIStateFactory = buttonUIStateFactory2;
            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB2, function3, null, UIShape.e, false, 0.0f, 52);
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$0 = function1;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$1 = buttonUIStateFactory2;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$2 = dialogUIEventHandler2;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$3 = imageUIState2;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$4 = chaloTextUIState;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$5 = chaloTextUIState2;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$6 = imageUIState3;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.L$7 = buttonUIStateG;
            sosScreenUIStateFactory$sendSosConfirmationDialog$1.label = 3;
            objB = stringProvider.b(StringEnum.CANCEL, new Object[0], sosScreenUIStateFactory$sendSosConfirmationDialog$1);
            if (objB != coroutineSingletons) {
                DialogUIEventHandler dialogUIEventHandler10 = dialogUIEventHandler2;
                imageUIState4 = imageUIState3;
                dialogUIEventHandler3 = dialogUIEventHandler10;
                buttonUIState = buttonUIStateG;
                objB2 = objB;
                imageUIState5 = imageUIState2;
                function4 = function1;
                textUIState = chaloTextUIState2;
                ButtonUIStateFactory buttonUIStateFactory5 = buttonUIStateFactory2;
                return new SendSosConfirmationDialog(dialogUIEventHandler3, imageUIState5, chaloTextUIState, textUIState, imageUIState4, buttonUIState, ButtonUIStateFactory.b(buttonUIStateFactory5, (String) objB2, function4, UIShape.e, false, 52));
            }
        }
        return coroutineSingletons;
    }
}
