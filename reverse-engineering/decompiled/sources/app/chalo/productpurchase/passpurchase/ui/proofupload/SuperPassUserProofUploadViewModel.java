package app.chalo.productpurchase.passpurchase.ui.proofupload;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.fileupload.picker.ImagePicker;
import app.chalo.fileupload.picker.ImagePickerProvider;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargeProofImageEventHandler;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargedProofImageUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewNextBtnUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperProofImageUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.superpass.data.models.app.ProofDocumentProps;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogUIStateFactory;
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
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gf;
import defpackage.lg1;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadViewModel;", "Lapp/chalo/productpurchase/passpurchase/ui/decompose/SuperPassScreenBaseComponent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadDataState;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadUIState;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassUserProofUploadViewModel extends SuperPassScreenBaseComponent<SuperPassUserProofUploadIntent, SuperPassUserProofUploadDataState, SuperPassUserProofUploadUIState, SuperPassUserProofUploadEffect> {
    public final SuperPassPurchaseArgs.ProofUploadInternalArgs k;
    public final SuperPassProofUploadManager l;
    public final ChaloNavigationManager m;
    public final PermissionHandlerProvider n;
    public final ImagePickerProvider o;
    public final AnalyticsContract p;
    public final UrlOpenHelper q;
    public final StringProvider r;
    public final SystemHelper s;
    public final ChaloBuildConfig t;
    public SuperPassUserProofUploadRestoredState u;
    public final Lazy v;
    public Job w;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadViewModel$Companion;", "", "", "SUPER_PASS_USER_PROOF_UPLOAD_STATE_KEEPER_KEY", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SuperPassUserProofUploadViewModel(SuperPassPurchaseArgs.ProofUploadInternalArgs proofUploadInternalArgs, ComponentContext componentContext, SuperPassProofUploadManager superPassProofUploadManager, ChaloNavigationManager chaloNavigationManager, PermissionHandlerProvider permissionHandlerProvider, ImagePickerProvider imagePickerProvider, AnalyticsContract analyticsContract, UrlOpenHelper urlOpenHelper, StringProvider stringProvider, SystemHelper systemHelper, ChaloBuildConfig chaloBuildConfig) {
        super(componentContext, superPassProofUploadManager);
        this.k = proofUploadInternalArgs;
        this.l = superPassProofUploadManager;
        this.m = chaloNavigationManager;
        this.n = permissionHandlerProvider;
        this.o = imagePickerProvider;
        this.p = analyticsContract;
        this.q = urlOpenHelper;
        this.r = stringProvider;
        this.s = systemHelper;
        this.t = chaloBuildConfig;
        this.v = LazyKt.b(new Function0() { // from class: app.chalo.productpurchase.passpurchase.ui.proofupload.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new ToolbarUIState(null, null, null, null, CollectionsKt.R(new ToolbarActionsUIState(UiEventHandler.Companion.a(new SuperPassUserProofUploadViewModel$toolbar$2$1(0, this.f8513a.l, SuperPassProofUploadManager.class, "reportProblem", "reportProblem()V", 0)), new ImageUIState(IconType.ICON_HELP, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().j), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null, null, 12)), 0.0f, null, null, 239);
            }
        });
        componentContext.getB().d("superPassUserProofUploadStateKeeperKey", SuperPassUserProofUploadRestoredState.INSTANCE.serializer(), new lg1(this, 6));
        n(new lg1(this, 7));
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent
    public final /* bridge */ /* synthetic */ Object a(SuperPassPurchaseSharedState superPassPurchaseSharedState, Object obj, SuspendLambda suspendLambda) {
        return q((SuperPassUserProofUploadDataState) obj, suspendLambda);
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent
    public final Object m() {
        if (this.u == null) {
            this.u = (SuperPassUserProofUploadRestoredState) this.f8402a.getB().a("superPassUserProofUploadStateKeeperKey", SuperPassUserProofUploadRestoredState.INSTANCE.serializer());
        }
        SuperPassUserProofUploadRestoredState superPassUserProofUploadRestoredState = this.u;
        return superPassUserProofUploadRestoredState != null ? new SuperPassUserProofUploadDataState(superPassUserProofUploadRestoredState.f8508a, superPassUserProofUploadRestoredState.b, superPassUserProofUploadRestoredState.c) : new SuperPassUserProofUploadDataState(null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0236  */
    /* JADX WARN: Code duplicated, block: B:65:0x0262  */
    /* JADX WARN: Code duplicated, block: B:66:0x0266  */
    /* JADX WARN: Code duplicated, block: B:69:0x027e  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0330  */
    /* JADX WARN: Code duplicated, block: B:85:0x033e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0344  */
    /* JADX WARN: Code duplicated, block: B:88:0x0349  */
    /* JADX WARN: Code duplicated, block: B:90:0x036f  */
    public final Object q(SuperPassUserProofUploadDataState superPassUserProofUploadDataState, ContinuationImpl continuationImpl) {
        SuperPassUserProofUploadViewModel$convertToUiState$1 superPassUserProofUploadViewModel$convertToUiState$1;
        ProofDocumentProps proofDocumentProps;
        ToolbarUIState toolbarUIState;
        String str;
        TextUIState chaloTextUIState;
        int i;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        SuperPassUserProofUploadViewModel superPassUserProofUploadViewModel;
        StringProvider stringProvider;
        TextUIState textUIState;
        SuperPassProofTutorialUIState superPassProofTutorialUIState;
        StringProvider stringProvider2;
        Object objB;
        ProofDocumentProps proofDocumentProps2;
        ToolbarUIState toolbarUIState2;
        TextUIState textUIState2;
        TextUIState textUIState3;
        String str2;
        ButtonUIStateFactory buttonUIStateFactory;
        StringProvider stringProvider3;
        Object objB2;
        TextUIState textUIState4;
        TextUIState textUIState5;
        ButtonUIStateFactory buttonUIStateFactory2;
        ToolbarUIState toolbarUIState3;
        SuperPassUserProofUploadDataState superPassUserProofUploadDataState2;
        ProofDocumentProps proofDocumentProps3;
        SuperPassProofTutorialUIState superPassProofTutorialUIState2;
        SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState;
        SuperProofImageUIState superProofImageUIState;
        String str3;
        SuperPassUserProofUploadViewModel superPassUserProofUploadViewModel2;
        SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState2;
        ToolbarUIState toolbarUIState4;
        SuperPassProofTutorialUIState superPassProofTutorialUIState3;
        TextUIState textUIState6;
        TextUIState textUIState7;
        SuperProofImageUIState superProofImageUIState2;
        ConfirmationDialogUiState confirmationDialogUiState;
        DialogUIStateFactory dialogUIStateFactory;
        TextUIState textUIState8;
        SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState3;
        ProofDocumentProps proofDocumentProps4;
        DialogUIStateFactory dialogUIStateFactory2;
        SuperPassUserProofUploadDataState superPassUserProofUploadDataState3;
        SuperProofImageUIState superProofImageUIState3;
        String str4;
        Object objB3;
        ProofDocumentProps proofDocumentProps5;
        SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState4;
        SuperProofImageUIState superProofImageUIState4;
        DialogUIStateFactory dialogUIStateFactory3;
        String str5;
        String str6;
        ProofDocumentProps proofDocumentProps6;
        Object objB4;
        String str7;
        String str8;
        SuperPassUserProofUploadDataState superPassUserProofUploadDataState4;
        ProofDocumentProps proofDocumentProps7;
        EnlargedProofImageUIState enlargedProofImageUIState;
        String str9;
        SuperPassUserProofUploadDataState superPassUserProofUploadDataState5 = superPassUserProofUploadDataState;
        if (continuationImpl instanceof SuperPassUserProofUploadViewModel$convertToUiState$1) {
            superPassUserProofUploadViewModel$convertToUiState$1 = (SuperPassUserProofUploadViewModel$convertToUiState$1) continuationImpl;
            int i2 = superPassUserProofUploadViewModel$convertToUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superPassUserProofUploadViewModel$convertToUiState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                superPassUserProofUploadViewModel$convertToUiState$1 = new SuperPassUserProofUploadViewModel$convertToUiState$1(this, continuationImpl);
            }
        } else {
            superPassUserProofUploadViewModel$convertToUiState$1 = new SuperPassUserProofUploadViewModel$convertToUiState$1(this, continuationImpl);
        }
        Object objB5 = superPassUserProofUploadViewModel$convertToUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = superPassUserProofUploadViewModel$convertToUiState$1.label;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        StringProvider stringProvider4 = this.r;
        if (i3 == 0) {
            ResultKt.b(objB5);
            proofDocumentProps = superPassUserProofUploadDataState5.f8501a;
            toolbarUIState = (ToolbarUIState) this.v.getValue();
            ProofDocumentProps proofDocumentProps8 = superPassUserProofUploadDataState5.f8501a;
            if (proofDocumentProps8 == null || (str = proofDocumentProps8.b) == null) {
                str = "";
            }
            i = 0;
            chaloTextUIState = new TextUIState.ChaloTextUIState(str, UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
            String str10 = proofDocumentProps != null ? proofDocumentProps.d : null;
            if (str10 == null || str10.length() == 0) {
                chaloTextUIState2 = null;
            } else {
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((proofDocumentProps == null || (str2 = proofDocumentProps.d) == null) ? "" : str2, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            }
            String str11 = proofDocumentProps != null ? proofDocumentProps.g : null;
            if (str11 == null || str11.length() == 0) {
                superPassUserProofUploadViewModel = this;
                stringProvider = stringProvider4;
                textUIState = chaloTextUIState2;
                superPassProofTutorialUIState = null;
                superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState5;
                superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps;
                superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState;
                superPassUserProofUploadViewModel$convertToUiState$1.L$3 = chaloTextUIState;
                superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState;
                superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                superPassUserProofUploadViewModel$convertToUiState$1.L$6 = buttonUIStateFactory;
                superPassUserProofUploadViewModel$convertToUiState$1.label = 2;
                stringProvider3 = stringProvider;
                objB2 = stringProvider3.b(StringEnum.UPLOAD_CAPS, new Object[i], superPassUserProofUploadViewModel$convertToUiState$1);
                if (objB2 != coroutineSingletons) {
                    textUIState4 = chaloTextUIState;
                    textUIState5 = textUIState;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    toolbarUIState3 = toolbarUIState;
                    superPassUserProofUploadDataState2 = superPassUserProofUploadDataState5;
                    proofDocumentProps3 = proofDocumentProps;
                    objB5 = objB2;
                    superPassProofTutorialUIState2 = superPassProofTutorialUIState;
                    superPassProofOverviewNextBtnUIState = new SuperPassProofOverviewNextBtnUIState(ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB5, new lg1(superPassUserProofUploadViewModel, 1), null, null, false, 0.0f, 60), null, null);
                    if (proofDocumentProps3 != null) {
                        str3 = proofDocumentProps3.e;
                    } else {
                        str3 = null;
                    }
                    superProofImageUIState = new SuperProofImageUIState(str3, (BitmapImage) null, UiEventHandler.Companion.a(new lg1(superPassUserProofUploadViewModel, 2)), UIContentScale.Fit, 16);
                    if (superPassUserProofUploadDataState2.b) {
                        superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState2;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps3;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState5;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState;
                        dialogUIStateFactory = DialogUIStateFactory.f9989a;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory;
                        superPassUserProofUploadViewModel$convertToUiState$1.label = 3;
                        objB5 = stringProvider3.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[i], superPassUserProofUploadViewModel$convertToUiState$1);
                        if (objB5 != coroutineSingletons) {
                            textUIState8 = textUIState5;
                            superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                            proofDocumentProps4 = proofDocumentProps3;
                            dialogUIStateFactory2 = dialogUIStateFactory;
                            superPassUserProofUploadDataState3 = superPassUserProofUploadDataState2;
                            superProofImageUIState3 = superProofImageUIState;
                            str4 = (String) objB5;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState3;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps4;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState8;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState3;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState3;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory2;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$9 = str4;
                            superPassUserProofUploadViewModel$convertToUiState$1.label = 4;
                            objB3 = stringProvider3.b(StringEnum.SETTINGS, new Object[0], superPassUserProofUploadViewModel$convertToUiState$1);
                            if (objB3 != coroutineSingletons) {
                                textUIState7 = textUIState8;
                                proofDocumentProps5 = proofDocumentProps4;
                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState3;
                                superProofImageUIState4 = superProofImageUIState3;
                                dialogUIStateFactory3 = dialogUIStateFactory2;
                                str5 = str4;
                                objB5 = objB3;
                                str6 = (String) objB5;
                                superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState3;
                                superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps5;
                                superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                                superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                                superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState7;
                                superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                                superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState4;
                                superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState4;
                                superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory3;
                                superPassUserProofUploadViewModel$convertToUiState$1.L$9 = str5;
                                superPassUserProofUploadViewModel$convertToUiState$1.L$10 = str6;
                                proofDocumentProps6 = proofDocumentProps5;
                                superPassUserProofUploadViewModel$convertToUiState$1.label = 5;
                                objB4 = stringProvider3.b(StringEnum.CANCEL, new Object[0], superPassUserProofUploadViewModel$convertToUiState$1);
                                if (objB4 != coroutineSingletons) {
                                    str7 = str5;
                                    str8 = str6;
                                    superPassUserProofUploadDataState4 = superPassUserProofUploadDataState3;
                                    proofDocumentProps7 = proofDocumentProps6;
                                    objB5 = objB4;
                                    String str12 = (String) objB5;
                                    superPassUserProofUploadViewModel2 = this;
                                    lg1 lg1Var = new lg1(superPassUserProofUploadViewModel2, 3);
                                    lg1 lg1Var2 = new lg1(superPassUserProofUploadViewModel2, 4);
                                    dialogUIStateFactory3.getClass();
                                    ConfirmationDialogUiState confirmationDialogUiStateB = DialogUIStateFactory.b(null, str7, str8, str12, lg1Var, lg1Var2);
                                    ToolbarUIState toolbarUIState5 = toolbarUIState3;
                                    superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState4;
                                    toolbarUIState4 = toolbarUIState5;
                                    TextUIState textUIState9 = textUIState4;
                                    superPassProofTutorialUIState3 = superPassProofTutorialUIState2;
                                    textUIState6 = textUIState9;
                                    superPassUserProofUploadDataState2 = superPassUserProofUploadDataState4;
                                    proofDocumentProps3 = proofDocumentProps7;
                                    confirmationDialogUiState = confirmationDialogUiStateB;
                                    superProofImageUIState2 = superProofImageUIState4;
                                }
                            }
                        }
                    } else {
                        superPassUserProofUploadViewModel2 = superPassUserProofUploadViewModel;
                        ToolbarUIState toolbarUIState6 = toolbarUIState3;
                        superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                        toolbarUIState4 = toolbarUIState6;
                        TextUIState textUIState10 = textUIState4;
                        superPassProofTutorialUIState3 = superPassProofTutorialUIState2;
                        textUIState6 = textUIState10;
                        textUIState7 = textUIState5;
                        superProofImageUIState2 = superProofImageUIState;
                        confirmationDialogUiState = null;
                    }
                    if (superPassUserProofUploadDataState2.c) {
                        if (proofDocumentProps3 != null) {
                            str9 = proofDocumentProps3.e;
                        } else {
                            str9 = null;
                        }
                        SuperProofImageUIState superProofImageUIState5 = new SuperProofImageUIState(str9, (BitmapImage) null, UiEventHandler.Companion.a(new lg1(superPassUserProofUploadViewModel2, 5)), UIContentScale.Fit, 16);
                        EnlargeProofImageEventHandler.f8456a.getClass();
                        enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState5, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
                    } else {
                        enlargedProofImageUIState = null;
                    }
                    return new SuperPassUserProofUploadUIState(toolbarUIState4, textUIState6, textUIState7, superPassProofTutorialUIState3, superPassProofOverviewNextBtnUIState2, superProofImageUIState2, confirmationDialogUiState, enlargedProofImageUIState);
                }
            } else {
                superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState5;
                superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps;
                superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState;
                superPassUserProofUploadViewModel$convertToUiState$1.L$3 = chaloTextUIState;
                superPassUserProofUploadViewModel$convertToUiState$1.L$4 = chaloTextUIState2;
                superPassUserProofUploadViewModel$convertToUiState$1.label = 1;
                stringProvider2 = stringProvider4;
                objB = stringProvider2.b(StringEnum.WATCH_VIDEO, new Object[0], superPassUserProofUploadViewModel$convertToUiState$1);
                if (objB != coroutineSingletons) {
                    proofDocumentProps2 = proofDocumentProps;
                    toolbarUIState2 = toolbarUIState;
                    textUIState2 = chaloTextUIState;
                    textUIState3 = chaloTextUIState2;
                }
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            TextUIState textUIState11 = (TextUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$4;
            textUIState2 = (TextUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$3;
            ToolbarUIState toolbarUIState7 = (ToolbarUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$2;
            ProofDocumentProps proofDocumentProps9 = (ProofDocumentProps) superPassUserProofUploadViewModel$convertToUiState$1.L$1;
            SuperPassUserProofUploadDataState superPassUserProofUploadDataState6 = (SuperPassUserProofUploadDataState) superPassUserProofUploadViewModel$convertToUiState$1.L$0;
            ResultKt.b(objB5);
            objB = objB5;
            toolbarUIState2 = toolbarUIState7;
            proofDocumentProps2 = proofDocumentProps9;
            stringProvider2 = stringProvider4;
            i = 0;
            textUIState3 = textUIState11;
            superPassUserProofUploadDataState5 = superPassUserProofUploadDataState6;
        } else {
            if (i3 == 2) {
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) superPassUserProofUploadViewModel$convertToUiState$1.L$6;
                SuperPassProofTutorialUIState superPassProofTutorialUIState4 = (SuperPassProofTutorialUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$5;
                textUIState5 = (TextUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$4;
                TextUIState textUIState12 = (TextUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$3;
                ToolbarUIState toolbarUIState8 = (ToolbarUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$2;
                ProofDocumentProps proofDocumentProps10 = (ProofDocumentProps) superPassUserProofUploadViewModel$convertToUiState$1.L$1;
                SuperPassUserProofUploadDataState superPassUserProofUploadDataState7 = (SuperPassUserProofUploadDataState) superPassUserProofUploadViewModel$convertToUiState$1.L$0;
                ResultKt.b(objB5);
                buttonUIStateFactory2 = buttonUIStateFactory3;
                superPassProofTutorialUIState2 = superPassProofTutorialUIState4;
                proofDocumentProps3 = proofDocumentProps10;
                superPassUserProofUploadDataState2 = superPassUserProofUploadDataState7;
                stringProvider3 = stringProvider4;
                toolbarUIState3 = toolbarUIState8;
                textUIState4 = textUIState12;
                superPassUserProofUploadViewModel = this;
                i = 0;
                superPassProofOverviewNextBtnUIState = new SuperPassProofOverviewNextBtnUIState(ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB5, new lg1(superPassUserProofUploadViewModel, 1), null, null, false, 0.0f, 60), null, null);
                if (proofDocumentProps3 != null) {
                    str3 = proofDocumentProps3.e;
                } else {
                    str3 = null;
                }
                superProofImageUIState = new SuperProofImageUIState(str3, (BitmapImage) null, UiEventHandler.Companion.a(new lg1(superPassUserProofUploadViewModel, 2)), UIContentScale.Fit, 16);
                if (superPassUserProofUploadDataState2.b) {
                    superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState2;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps3;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState5;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState;
                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory;
                    superPassUserProofUploadViewModel$convertToUiState$1.label = 3;
                    objB5 = stringProvider3.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[i], superPassUserProofUploadViewModel$convertToUiState$1);
                    if (objB5 != coroutineSingletons) {
                        textUIState8 = textUIState5;
                        superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                        proofDocumentProps4 = proofDocumentProps3;
                        dialogUIStateFactory2 = dialogUIStateFactory;
                        superPassUserProofUploadDataState3 = superPassUserProofUploadDataState2;
                        superProofImageUIState3 = superProofImageUIState;
                        str4 = (String) objB5;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState3;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps4;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState8;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState3;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState3;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory2;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$9 = str4;
                        superPassUserProofUploadViewModel$convertToUiState$1.label = 4;
                        objB3 = stringProvider3.b(StringEnum.SETTINGS, new Object[0], superPassUserProofUploadViewModel$convertToUiState$1);
                        if (objB3 != coroutineSingletons) {
                            textUIState7 = textUIState8;
                            proofDocumentProps5 = proofDocumentProps4;
                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState3;
                            superProofImageUIState4 = superProofImageUIState3;
                            dialogUIStateFactory3 = dialogUIStateFactory2;
                            str5 = str4;
                            objB5 = objB3;
                            str6 = (String) objB5;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState3;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps5;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState7;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState4;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState4;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory3;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$9 = str5;
                            superPassUserProofUploadViewModel$convertToUiState$1.L$10 = str6;
                            proofDocumentProps6 = proofDocumentProps5;
                            superPassUserProofUploadViewModel$convertToUiState$1.label = 5;
                            objB4 = stringProvider3.b(StringEnum.CANCEL, new Object[0], superPassUserProofUploadViewModel$convertToUiState$1);
                            if (objB4 != coroutineSingletons) {
                                str7 = str5;
                                str8 = str6;
                                superPassUserProofUploadDataState4 = superPassUserProofUploadDataState3;
                                proofDocumentProps7 = proofDocumentProps6;
                                objB5 = objB4;
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                superPassUserProofUploadViewModel2 = superPassUserProofUploadViewModel;
                ToolbarUIState toolbarUIState9 = toolbarUIState3;
                superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                toolbarUIState4 = toolbarUIState9;
                TextUIState textUIState13 = textUIState4;
                superPassProofTutorialUIState3 = superPassProofTutorialUIState2;
                textUIState6 = textUIState13;
                textUIState7 = textUIState5;
                superProofImageUIState2 = superProofImageUIState;
                confirmationDialogUiState = null;
                if (superPassUserProofUploadDataState2.c) {
                    if (proofDocumentProps3 != null) {
                        str9 = proofDocumentProps3.e;
                    } else {
                        str9 = null;
                    }
                    SuperProofImageUIState superProofImageUIState6 = new SuperProofImageUIState(str9, (BitmapImage) null, UiEventHandler.Companion.a(new lg1(superPassUserProofUploadViewModel2, 5)), UIContentScale.Fit, 16);
                    EnlargeProofImageEventHandler.f8456a.getClass();
                    enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState6, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
                } else {
                    enlargedProofImageUIState = null;
                }
                return new SuperPassUserProofUploadUIState(toolbarUIState4, textUIState6, textUIState7, superPassProofTutorialUIState3, superPassProofOverviewNextBtnUIState2, superProofImageUIState2, confirmationDialogUiState, enlargedProofImageUIState);
            }
            if (i3 == 3) {
                dialogUIStateFactory2 = (DialogUIStateFactory) superPassUserProofUploadViewModel$convertToUiState$1.L$8;
                superProofImageUIState3 = (SuperProofImageUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$7;
                superPassProofOverviewNextBtnUIState3 = (SuperPassProofOverviewNextBtnUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$6;
                superPassProofTutorialUIState2 = (SuperPassProofTutorialUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$5;
                TextUIState textUIState14 = (TextUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$4;
                textUIState4 = (TextUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$3;
                toolbarUIState3 = (ToolbarUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$2;
                ProofDocumentProps proofDocumentProps11 = (ProofDocumentProps) superPassUserProofUploadViewModel$convertToUiState$1.L$1;
                superPassUserProofUploadDataState3 = (SuperPassUserProofUploadDataState) superPassUserProofUploadViewModel$convertToUiState$1.L$0;
                ResultKt.b(objB5);
                textUIState8 = textUIState14;
                proofDocumentProps4 = proofDocumentProps11;
                stringProvider3 = stringProvider4;
                str4 = (String) objB5;
                superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState3;
                superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps4;
                superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState8;
                superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState3;
                superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState3;
                superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory2;
                superPassUserProofUploadViewModel$convertToUiState$1.L$9 = str4;
                superPassUserProofUploadViewModel$convertToUiState$1.label = 4;
                objB3 = stringProvider3.b(StringEnum.SETTINGS, new Object[0], superPassUserProofUploadViewModel$convertToUiState$1);
                if (objB3 != coroutineSingletons) {
                    textUIState7 = textUIState8;
                    proofDocumentProps5 = proofDocumentProps4;
                    superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState3;
                    superProofImageUIState4 = superProofImageUIState3;
                    dialogUIStateFactory3 = dialogUIStateFactory2;
                    str5 = str4;
                    objB5 = objB3;
                    str6 = (String) objB5;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState3;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps5;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState7;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState4;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState4;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory3;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$9 = str5;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$10 = str6;
                    proofDocumentProps6 = proofDocumentProps5;
                    superPassUserProofUploadViewModel$convertToUiState$1.label = 5;
                    objB4 = stringProvider3.b(StringEnum.CANCEL, new Object[0], superPassUserProofUploadViewModel$convertToUiState$1);
                    if (objB4 != coroutineSingletons) {
                        str7 = str5;
                        str8 = str6;
                        superPassUserProofUploadDataState4 = superPassUserProofUploadDataState3;
                        proofDocumentProps7 = proofDocumentProps6;
                        objB5 = objB4;
                    }
                }
                return coroutineSingletons;
            }
            if (i3 == 4) {
                str5 = (String) superPassUserProofUploadViewModel$convertToUiState$1.L$9;
                dialogUIStateFactory3 = (DialogUIStateFactory) superPassUserProofUploadViewModel$convertToUiState$1.L$8;
                SuperProofImageUIState superProofImageUIState7 = (SuperProofImageUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$7;
                SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState5 = (SuperPassProofOverviewNextBtnUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$6;
                SuperPassProofTutorialUIState superPassProofTutorialUIState5 = (SuperPassProofTutorialUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$5;
                TextUIState textUIState15 = (TextUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$4;
                TextUIState textUIState16 = (TextUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$3;
                ToolbarUIState toolbarUIState10 = (ToolbarUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$2;
                ProofDocumentProps proofDocumentProps12 = (ProofDocumentProps) superPassUserProofUploadViewModel$convertToUiState$1.L$1;
                SuperPassUserProofUploadDataState superPassUserProofUploadDataState8 = (SuperPassUserProofUploadDataState) superPassUserProofUploadViewModel$convertToUiState$1.L$0;
                ResultKt.b(objB5);
                proofDocumentProps5 = proofDocumentProps12;
                superProofImageUIState4 = superProofImageUIState7;
                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                superPassProofTutorialUIState2 = superPassProofTutorialUIState5;
                textUIState7 = textUIState15;
                textUIState4 = textUIState16;
                toolbarUIState3 = toolbarUIState10;
                superPassUserProofUploadDataState3 = superPassUserProofUploadDataState8;
                stringProvider3 = stringProvider4;
                str6 = (String) objB5;
                superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState3;
                superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps5;
                superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState7;
                superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState4;
                superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState4;
                superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory3;
                superPassUserProofUploadViewModel$convertToUiState$1.L$9 = str5;
                superPassUserProofUploadViewModel$convertToUiState$1.L$10 = str6;
                proofDocumentProps6 = proofDocumentProps5;
                superPassUserProofUploadViewModel$convertToUiState$1.label = 5;
                objB4 = stringProvider3.b(StringEnum.CANCEL, new Object[0], superPassUserProofUploadViewModel$convertToUiState$1);
                if (objB4 != coroutineSingletons) {
                    str7 = str5;
                    str8 = str6;
                    superPassUserProofUploadDataState4 = superPassUserProofUploadDataState3;
                    proofDocumentProps7 = proofDocumentProps6;
                    objB5 = objB4;
                }
                return coroutineSingletons;
            }
            if (i3 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str13 = (String) superPassUserProofUploadViewModel$convertToUiState$1.L$10;
            String str14 = (String) superPassUserProofUploadViewModel$convertToUiState$1.L$9;
            dialogUIStateFactory3 = (DialogUIStateFactory) superPassUserProofUploadViewModel$convertToUiState$1.L$8;
            superProofImageUIState4 = (SuperProofImageUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$7;
            superPassProofOverviewNextBtnUIState4 = (SuperPassProofOverviewNextBtnUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$6;
            superPassProofTutorialUIState2 = (SuperPassProofTutorialUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$5;
            textUIState7 = (TextUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$4;
            textUIState4 = (TextUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$3;
            toolbarUIState3 = (ToolbarUIState) superPassUserProofUploadViewModel$convertToUiState$1.L$2;
            proofDocumentProps7 = (ProofDocumentProps) superPassUserProofUploadViewModel$convertToUiState$1.L$1;
            superPassUserProofUploadDataState4 = (SuperPassUserProofUploadDataState) superPassUserProofUploadViewModel$convertToUiState$1.L$0;
            ResultKt.b(objB5);
            str8 = str13;
            str7 = str14;
        }
        String str15 = (String) objB5;
        superPassUserProofUploadViewModel2 = this;
        lg1 lg1Var3 = new lg1(superPassUserProofUploadViewModel2, 3);
        lg1 lg1Var4 = new lg1(superPassUserProofUploadViewModel2, 4);
        dialogUIStateFactory3.getClass();
        ConfirmationDialogUiState confirmationDialogUiStateB2 = DialogUIStateFactory.b(null, str7, str8, str15, lg1Var3, lg1Var4);
        ToolbarUIState toolbarUIState11 = toolbarUIState3;
        superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState4;
        toolbarUIState4 = toolbarUIState11;
        TextUIState textUIState17 = textUIState4;
        superPassProofTutorialUIState3 = superPassProofTutorialUIState2;
        textUIState6 = textUIState17;
        superPassUserProofUploadDataState2 = superPassUserProofUploadDataState4;
        proofDocumentProps3 = proofDocumentProps7;
        confirmationDialogUiState = confirmationDialogUiStateB2;
        superProofImageUIState2 = superProofImageUIState4;
        if (superPassUserProofUploadDataState2.c) {
            if (proofDocumentProps3 != null) {
                str9 = proofDocumentProps3.e;
            } else {
                str9 = null;
            }
            SuperProofImageUIState superProofImageUIState8 = new SuperProofImageUIState(str9, (BitmapImage) null, UiEventHandler.Companion.a(new lg1(superPassUserProofUploadViewModel2, 5)), UIContentScale.Fit, 16);
            EnlargeProofImageEventHandler.f8456a.getClass();
            enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState8, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
        } else {
            enlargedProofImageUIState = null;
        }
        return new SuperPassUserProofUploadUIState(toolbarUIState4, textUIState6, textUIState7, superPassProofTutorialUIState3, superPassProofOverviewNextBtnUIState2, superProofImageUIState2, confirmationDialogUiState, enlargedProofImageUIState);
        stringProvider = stringProvider2;
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        superPassUserProofUploadViewModel = this;
        superPassProofTutorialUIState = new SuperPassProofTutorialUIState(chaloTextUIState3, UiEventHandler.Companion.a(new lg1(superPassUserProofUploadViewModel, 0)));
        textUIState = textUIState3;
        chaloTextUIState = textUIState2;
        toolbarUIState = toolbarUIState2;
        proofDocumentProps = proofDocumentProps2;
        superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState5;
        superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps;
        superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState;
        superPassUserProofUploadViewModel$convertToUiState$1.L$3 = chaloTextUIState;
        superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState;
        superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState;
        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
        superPassUserProofUploadViewModel$convertToUiState$1.L$6 = buttonUIStateFactory;
        superPassUserProofUploadViewModel$convertToUiState$1.label = 2;
        stringProvider3 = stringProvider;
        objB2 = stringProvider3.b(StringEnum.UPLOAD_CAPS, new Object[i], superPassUserProofUploadViewModel$convertToUiState$1);
        if (objB2 != coroutineSingletons) {
            textUIState4 = chaloTextUIState;
            textUIState5 = textUIState;
            buttonUIStateFactory2 = buttonUIStateFactory;
            toolbarUIState3 = toolbarUIState;
            superPassUserProofUploadDataState2 = superPassUserProofUploadDataState5;
            proofDocumentProps3 = proofDocumentProps;
            objB5 = objB2;
            superPassProofTutorialUIState2 = superPassProofTutorialUIState;
            superPassProofOverviewNextBtnUIState = new SuperPassProofOverviewNextBtnUIState(ButtonUIStateFactory.g(buttonUIStateFactory2, (String) objB5, new lg1(superPassUserProofUploadViewModel, 1), null, null, false, 0.0f, 60), null, null);
            if (proofDocumentProps3 != null) {
                str3 = proofDocumentProps3.e;
            } else {
                str3 = null;
            }
            superProofImageUIState = new SuperProofImageUIState(str3, (BitmapImage) null, UiEventHandler.Companion.a(new lg1(superPassUserProofUploadViewModel, 2)), UIContentScale.Fit, 16);
            if (superPassUserProofUploadDataState2.b) {
                superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState2;
                superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps3;
                superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState5;
                superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState;
                superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState;
                dialogUIStateFactory = DialogUIStateFactory.f9989a;
                superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory;
                superPassUserProofUploadViewModel$convertToUiState$1.label = 3;
                objB5 = stringProvider3.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[i], superPassUserProofUploadViewModel$convertToUiState$1);
                if (objB5 != coroutineSingletons) {
                    textUIState8 = textUIState5;
                    superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                    proofDocumentProps4 = proofDocumentProps3;
                    dialogUIStateFactory2 = dialogUIStateFactory;
                    superPassUserProofUploadDataState3 = superPassUserProofUploadDataState2;
                    superProofImageUIState3 = superProofImageUIState;
                    str4 = (String) objB5;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState3;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps4;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState8;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState3;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState3;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory2;
                    superPassUserProofUploadViewModel$convertToUiState$1.L$9 = str4;
                    superPassUserProofUploadViewModel$convertToUiState$1.label = 4;
                    objB3 = stringProvider3.b(StringEnum.SETTINGS, new Object[0], superPassUserProofUploadViewModel$convertToUiState$1);
                    if (objB3 != coroutineSingletons) {
                        textUIState7 = textUIState8;
                        proofDocumentProps5 = proofDocumentProps4;
                        superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState3;
                        superProofImageUIState4 = superProofImageUIState3;
                        dialogUIStateFactory3 = dialogUIStateFactory2;
                        str5 = str4;
                        objB5 = objB3;
                        str6 = (String) objB5;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$0 = superPassUserProofUploadDataState3;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$1 = proofDocumentProps5;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$2 = toolbarUIState3;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$3 = textUIState4;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$4 = textUIState7;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$5 = superPassProofTutorialUIState2;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$6 = superPassProofOverviewNextBtnUIState4;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$7 = superProofImageUIState4;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$8 = dialogUIStateFactory3;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$9 = str5;
                        superPassUserProofUploadViewModel$convertToUiState$1.L$10 = str6;
                        proofDocumentProps6 = proofDocumentProps5;
                        superPassUserProofUploadViewModel$convertToUiState$1.label = 5;
                        objB4 = stringProvider3.b(StringEnum.CANCEL, new Object[0], superPassUserProofUploadViewModel$convertToUiState$1);
                        if (objB4 != coroutineSingletons) {
                            str7 = str5;
                            str8 = str6;
                            superPassUserProofUploadDataState4 = superPassUserProofUploadDataState3;
                            proofDocumentProps7 = proofDocumentProps6;
                            objB5 = objB4;
                            String str16 = (String) objB5;
                            superPassUserProofUploadViewModel2 = this;
                            lg1 lg1Var5 = new lg1(superPassUserProofUploadViewModel2, 3);
                            lg1 lg1Var6 = new lg1(superPassUserProofUploadViewModel2, 4);
                            dialogUIStateFactory3.getClass();
                            ConfirmationDialogUiState confirmationDialogUiStateB3 = DialogUIStateFactory.b(null, str7, str8, str16, lg1Var5, lg1Var6);
                            ToolbarUIState toolbarUIState12 = toolbarUIState3;
                            superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState4;
                            toolbarUIState4 = toolbarUIState12;
                            TextUIState textUIState18 = textUIState4;
                            superPassProofTutorialUIState3 = superPassProofTutorialUIState2;
                            textUIState6 = textUIState18;
                            superPassUserProofUploadDataState2 = superPassUserProofUploadDataState4;
                            proofDocumentProps3 = proofDocumentProps7;
                            confirmationDialogUiState = confirmationDialogUiStateB3;
                            superProofImageUIState2 = superProofImageUIState4;
                        }
                    }
                }
            } else {
                superPassUserProofUploadViewModel2 = superPassUserProofUploadViewModel;
                ToolbarUIState toolbarUIState13 = toolbarUIState3;
                superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                toolbarUIState4 = toolbarUIState13;
                TextUIState textUIState19 = textUIState4;
                superPassProofTutorialUIState3 = superPassProofTutorialUIState2;
                textUIState6 = textUIState19;
                textUIState7 = textUIState5;
                superProofImageUIState2 = superProofImageUIState;
                confirmationDialogUiState = null;
            }
            if (superPassUserProofUploadDataState2.c) {
                if (proofDocumentProps3 != null) {
                    str9 = proofDocumentProps3.e;
                } else {
                    str9 = null;
                }
                SuperProofImageUIState superProofImageUIState9 = new SuperProofImageUIState(str9, (BitmapImage) null, UiEventHandler.Companion.a(new lg1(superPassUserProofUploadViewModel2, 5)), UIContentScale.Fit, 16);
                EnlargeProofImageEventHandler.f8456a.getClass();
                enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState9, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
            } else {
                enlargedProofImageUIState = null;
            }
            return new SuperPassUserProofUploadUIState(toolbarUIState4, textUIState6, textUIState7, superPassProofTutorialUIState3, superPassProofOverviewNextBtnUIState2, superProofImageUIState2, confirmationDialogUiState, enlargedProofImageUIState);
        }
        return coroutineSingletons;
    }

    public final void r(SuperPassUserProofUploadIntent superPassUserProofUploadIntent) {
        Object value;
        SuperPassUserProofUploadDataState it;
        Object value2;
        SuperPassUserProofUploadDataState it2;
        String str;
        Object value3;
        SuperPassUserProofUploadDataState it3;
        String str2;
        PermissionHandler permissionHandlerC;
        ProofDocumentProps proofDocumentProps;
        Object value4;
        SuperPassUserProofUploadDataState it4;
        o(superPassUserProofUploadIntent);
        boolean z = superPassUserProofUploadIntent instanceof SuperPassUserProofUploadIntent.InitializationIntent;
        MutableStateFlow mutableStateFlow = this.e;
        if (z) {
            SuperPassUserProofUploadIntent.InitializationIntent initializationIntent = (SuperPassUserProofUploadIntent.InitializationIntent) superPassUserProofUploadIntent;
            try {
                ProofDocumentProps.Companion companion = ProofDocumentProps.INSTANCE;
                String str3 = initializationIntent.f8504a.c;
                companion.getClass();
                ProofDocumentProps proofDocumentPropsA = ProofDocumentProps.Companion.a(str3);
                do {
                    value4 = mutableStateFlow.getValue();
                    it4 = (SuperPassUserProofUploadDataState) value4;
                    Intrinsics.i(it4, "it");
                } while (!mutableStateFlow.c(value4, SuperPassUserProofUploadDataState.a(it4, proofDocumentPropsA, false, false, 6)));
                return;
            } catch (Exception unused) {
                gf.u(null, this.m);
                return;
            }
        }
        boolean zEquals = superPassUserProofUploadIntent.equals(SuperPassUserProofUploadIntent.NextBtnClickedIntent.f8505a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            Job job = this.w;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            s("upload proof button clicked", new LinkedHashMap());
            ImagePicker imagePickerC = this.o.c();
            if (imagePickerC == null || (permissionHandlerC = this.n.c()) == null || (proofDocumentProps = ((SuperPassUserProofUploadDataState) stateFlow.getValue()).f8501a) == null) {
                return;
            }
            this.w = BuildersKt.d(this.j, null, null, new SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1(imagePickerC, permissionHandlerC, this, proofDocumentProps, null), 3);
            return;
        }
        if (superPassUserProofUploadIntent.equals(SuperPassUserProofUploadIntent.WatchTutorialClickedIntent.f8506a)) {
            ProofDocumentProps proofDocumentProps2 = ((SuperPassUserProofUploadDataState) stateFlow.getValue()).f8501a;
            if (proofDocumentProps2 == null || (str2 = proofDocumentProps2.g) == null) {
                return;
            }
            s("watch tutorial video clicked", MapsKt.k(new Pair("url", str2)));
            this.q.a(str2, null);
            return;
        }
        if (!superPassUserProofUploadIntent.equals(SuperPassUserProofUploadIntent.ZoomPlaceholderImageIntent.f8507a)) {
            if (superPassUserProofUploadIntent.equals(SuperPassUserProofUploadIntent.DismissCameraRationaleDialogIntent.f8502a)) {
                do {
                    value2 = mutableStateFlow.getValue();
                    it2 = (SuperPassUserProofUploadDataState) value2;
                    Intrinsics.i(it2, "it");
                } while (!mutableStateFlow.c(value2, SuperPassUserProofUploadDataState.a(it2, null, false, false, 5)));
                return;
            }
            if (!superPassUserProofUploadIntent.equals(SuperPassUserProofUploadIntent.DismissZoomedImageIntent.f8503a)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value = mutableStateFlow.getValue();
                it = (SuperPassUserProofUploadDataState) value;
                Intrinsics.i(it, "it");
            } while (!mutableStateFlow.c(value, SuperPassUserProofUploadDataState.a(it, null, false, false, 3)));
            return;
        }
        ProofDocumentProps proofDocumentProps3 = ((SuperPassUserProofUploadDataState) stateFlow.getValue()).f8501a;
        if (proofDocumentProps3 == null || (str = proofDocumentProps3.e) == null) {
            return;
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            s("sample proof image zoomed", MapsKt.k(new Pair("url", str)));
            do {
                value3 = mutableStateFlow.getValue();
                it3 = (SuperPassUserProofUploadDataState) value3;
                Intrinsics.i(it3, "it");
            } while (!mutableStateFlow.c(value3, SuperPassUserProofUploadDataState.a(it3, null, false, true, 3)));
        }
    }

    public final void s(String str, LinkedHashMap linkedHashMap) {
        linkedHashMap.put("flow", String.valueOf(((SuperPassPurchaseSharedState) this.l.getState().getValue()).d));
        linkedHashMap.put("isSuperPass", Boolean.TRUE);
        AnalyticsContract.DefaultImpls.a(this.p, str, "userProofUploadFragment", linkedHashMap, null, false, 24);
    }
}
