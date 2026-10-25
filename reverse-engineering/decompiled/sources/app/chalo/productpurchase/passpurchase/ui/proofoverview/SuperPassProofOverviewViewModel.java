package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.fileupload.picker.ImagePicker;
import app.chalo.fileupload.picker.ImagePickerProvider;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.data.ProofUploadStatus;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewIntent;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassProofUploadManager;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.superpass.data.models.app.ProofDocumentProps;
import app.chalo.superpass.data.models.entities.ProfileRejectionReason;
import app.chalo.superpass.data.models.entities.ProofRejectionReason;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.StyledTextClickHandler;
import app.chalo.uistate.text.StyledTextDataUIState;
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
import com.google.firebase.messaging.ServiceStarter;
import defpackage.cb0;
import defpackage.da1;
import defpackage.eg1;
import defpackage.py;
import defpackage.r30;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import org.apache.commons.io.IOUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewViewModel;", "Lapp/chalo/productpurchase/passpurchase/ui/decompose/SuperPassScreenBaseComponent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewDataState;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewUIState;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassProofOverviewViewModel extends SuperPassScreenBaseComponent<SuperPassProofOverviewIntent, SuperPassProofOverviewDataState, SuperPassProofOverviewUIState, SuperPassProofOverviewEffect> {
    public final SuperPassPurchaseArgs.UserProofsOverviewArgs k;
    public final SuperPassProofUploadManager l;
    public final ChaloNavigationManager m;
    public final ChaloAppFeatureHelper n;
    public final UrlOpenHelper o;
    public final PermissionHandlerProvider p;
    public final ImagePickerProvider q;
    public final StringProvider r;
    public final SystemHelper s;
    public final AnalyticsContract t;
    public final ChaloBuildConfig u;
    public final Lazy v;
    public SuperPassProofOverviewRestoreState w;
    public Job x;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewViewModel$Companion;", "", "", "SUPER_PASS_PROOF_OVERVIEW_VIEW_MODEL_STATE_KEY", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8485a;

        static {
            int[] iArr = new int[ProofUploadStatus.values().length];
            try {
                iArr[ProofUploadStatus.NOT_UPLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProofUploadStatus.UPLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProofUploadStatus.UPLOAD_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProofUploadStatus.UPLOAD_SUCCESSFUL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8485a = iArr;
        }
    }

    public SuperPassProofOverviewViewModel(SuperPassPurchaseArgs.UserProofsOverviewArgs userProofsOverviewArgs, ComponentContext componentContext, SuperPassProofUploadManager superPassProofUploadManager, ChaloNavigationManager chaloNavigationManager, ChaloAppFeatureHelper chaloAppFeatureHelper, UrlOpenHelper urlOpenHelper, PermissionHandlerProvider permissionHandlerProvider, ImagePickerProvider imagePickerProvider, StringProvider stringProvider, SystemHelper systemHelper, AnalyticsContract analyticsContract, ChaloBuildConfig chaloBuildConfig) {
        super(componentContext, superPassProofUploadManager);
        this.k = userProofsOverviewArgs;
        this.l = superPassProofUploadManager;
        this.m = chaloNavigationManager;
        this.n = chaloAppFeatureHelper;
        this.o = urlOpenHelper;
        this.p = permissionHandlerProvider;
        this.q = imagePickerProvider;
        this.r = stringProvider;
        this.s = systemHelper;
        this.t = analyticsContract;
        this.u = chaloBuildConfig;
        this.v = LazyKt.b(new Function0() { // from class: app.chalo.productpurchase.passpurchase.ui.proofoverview.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new ToolbarUIState(null, null, null, null, CollectionsKt.R(new ToolbarActionsUIState(UiEventHandler.Companion.a(new SuperPassProofOverviewViewModel$toolbar$2$1(0, this.f8499a.l, SuperPassProofUploadManager.class, "reportProblem", "reportProblem()V", 0)), new ImageUIState(IconType.ICON_HELP, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().j), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null, null, 12)), 0.0f, null, null, 239);
            }
        });
        componentContext.getB().d("superPassProofOverviewViewModelStateKey", SuperPassProofOverviewRestoreState.INSTANCE.serializer(), new eg1(this, 2));
        n(new eg1(this, 3));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0167  */
    /* JADX WARN: Code duplicated, block: B:64:0x016f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0171  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c  */
    /* JADX WARN: Code duplicated, block: B:69:0x018e  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x010c -> B:44:0x0115). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x011d -> B:46:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01a7 -> B:74:0x01ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object B(java.util.List r24, java.util.Map r25, boolean r26, java.util.List r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel.B(java.util.List, java.util.Map, boolean, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void C(String str, LinkedHashMap linkedHashMap) {
        linkedHashMap.put("flow", String.valueOf(((SuperPassPurchaseSharedState) this.l.getF().getValue()).d));
        linkedHashMap.put("isSuperPass", Boolean.TRUE);
        AnalyticsContract.DefaultImpls.a(this.t, str, "userProofOverviewFragment", linkedHashMap, null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0181  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object D(ProofRejectionReason proofRejectionReason, ProofDocumentProps proofDocumentProps, ContinuationImpl continuationImpl) {
        SuperPassProofOverviewViewModel$rejectionListText$1 superPassProofOverviewViewModel$rejectionListText$1;
        int i;
        int i2;
        ProofDocumentProps proofDocumentProps2;
        List list;
        List list2;
        List list3;
        String str;
        List list4;
        ProofDocumentProps proofDocumentProps3;
        List list5;
        Object objB;
        List list6;
        final ProofDocumentProps proofDocumentProps4;
        List list7;
        if (continuationImpl instanceof SuperPassProofOverviewViewModel$rejectionListText$1) {
            superPassProofOverviewViewModel$rejectionListText$1 = (SuperPassProofOverviewViewModel$rejectionListText$1) continuationImpl;
            int i3 = superPassProofOverviewViewModel$rejectionListText$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                superPassProofOverviewViewModel$rejectionListText$1.label = i3 - Integer.MIN_VALUE;
            } else {
                superPassProofOverviewViewModel$rejectionListText$1 = new SuperPassProofOverviewViewModel$rejectionListText$1(this, continuationImpl);
            }
        } else {
            superPassProofOverviewViewModel$rejectionListText$1 = new SuperPassProofOverviewViewModel$rejectionListText$1(this, continuationImpl);
        }
        Object objB2 = superPassProofOverviewViewModel$rejectionListText$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = superPassProofOverviewViewModel$rejectionListText$1.label;
        StringProvider stringProvider = this.r;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        int i5 = 0;
        if (i4 == 0) {
            ArrayList arrayListL = py.l(objB2);
            List list8 = proofRejectionReason.d;
            int size = list8.size();
            String str2 = IOUtils.LINE_SEPARATOR_UNIX;
            if (size == 1) {
                Object obj = list8.get(0);
                i = 1;
                arrayListL.add(new StyledTextDataUIState(obj + IOUtils.LINE_SEPARATOR_UNIX, black_87, null, UITextStyle.BodyMedium, null, null, null, 1012));
                i2 = 0;
            } else {
                i = 1;
                int i6 = 0;
                for (Object obj2 : list8) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    arrayListL.add(new StyledTextDataUIState(i7 + ". " + ((String) obj2) + str2, black_87, null, UITextStyle.BodyMedium, null, null, null, 1012));
                    i5 = 0;
                    i6 = i7;
                    str2 = str2;
                }
                i2 = i5;
            }
            proofDocumentProps2 = proofDocumentProps;
            superPassProofOverviewViewModel$rejectionListText$1.L$0 = proofDocumentProps2;
            superPassProofOverviewViewModel$rejectionListText$1.L$1 = arrayListL;
            superPassProofOverviewViewModel$rejectionListText$1.L$2 = arrayListL;
            superPassProofOverviewViewModel$rejectionListText$1.label = i;
            objB2 = stringProvider.b(StringEnum.REUPLOAD_GUIDELINE, new Object[i2], superPassProofOverviewViewModel$rejectionListText$1);
            if (objB2 != coroutineSingletons) {
                list = arrayListL;
                list2 = arrayListL;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            List list9 = (List) superPassProofOverviewViewModel$rejectionListText$1.L$2;
            List list10 = (List) superPassProofOverviewViewModel$rejectionListText$1.L$1;
            proofDocumentProps2 = (ProofDocumentProps) superPassProofOverviewViewModel$rejectionListText$1.L$0;
            ResultKt.b(objB2);
            i2 = 0;
            list2 = list9;
            list = list10;
        } else {
            if (i4 == 2) {
                String str3 = (String) superPassProofOverviewViewModel$rejectionListText$1.L$3;
                List list11 = (List) superPassProofOverviewViewModel$rejectionListText$1.L$2;
                List list12 = (List) superPassProofOverviewViewModel$rejectionListText$1.L$1;
                proofDocumentProps2 = (ProofDocumentProps) superPassProofOverviewViewModel$rejectionListText$1.L$0;
                ResultKt.b(objB2);
                i2 = 0;
                list3 = list12;
                str = str3;
                list4 = list11;
                proofDocumentProps3 = proofDocumentProps2;
                String strSubstring = str.substring(i2, str.length() - ((String) objB2).length());
                Intrinsics.h(strSubstring, "substring(...)");
                list5 = list3;
                list4.add(new StyledTextDataUIState(strSubstring, black_87, null, UITextStyle.BodyMedium, null, null, null, 1012));
                superPassProofOverviewViewModel$rejectionListText$1.L$0 = proofDocumentProps3;
                superPassProofOverviewViewModel$rejectionListText$1.L$1 = list5;
                superPassProofOverviewViewModel$rejectionListText$1.L$2 = list4;
                superPassProofOverviewViewModel$rejectionListText$1.L$3 = null;
                superPassProofOverviewViewModel$rejectionListText$1.label = 3;
                objB = stringProvider.b(StringEnum.GUIDELINES, new Object[i2], superPassProofOverviewViewModel$rejectionListText$1);
                if (objB != coroutineSingletons) {
                    list6 = list5;
                    objB2 = objB;
                    proofDocumentProps4 = proofDocumentProps3;
                    list7 = list4;
                }
                return coroutineSingletons;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list13 = (List) superPassProofOverviewViewModel$rejectionListText$1.L$2;
            List list14 = (List) superPassProofOverviewViewModel$rejectionListText$1.L$1;
            proofDocumentProps4 = (ProofDocumentProps) superPassProofOverviewViewModel$rejectionListText$1.L$0;
            ResultKt.b(objB2);
            list7 = list13;
            list6 = list14;
        }
        list7.add(new StyledTextDataUIState((String) objB2, ChaloColorToken.OrangePrimary.f9835a, null, UITextStyle.BodyMedium, null, null, new StyledTextClickHandler() { // from class: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$rejectionListText$2$2
            @Override // app.chalo.uistate.text.StyledTextClickHandler
            public final void a() {
                this.f8491a.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps4, true));
            }

            @Override // app.chalo.uistate.text.StyledTextClickHandler
            /* JADX INFO: renamed from: b */
            public final String getF10090a() {
                return "Annotation";
            }

            @Override // app.chalo.uistate.text.StyledTextClickHandler
            /* JADX INFO: renamed from: getTag */
            public final String getF10085a() {
                return "TAG";
            }
        }, ServiceStarter.ERROR_UNKNOWN));
        return new TextUIState.StyledTextUIState(list6, null, null, 30);
        String str4 = (String) objB2;
        superPassProofOverviewViewModel$rejectionListText$1.L$0 = proofDocumentProps2;
        superPassProofOverviewViewModel$rejectionListText$1.L$1 = list;
        superPassProofOverviewViewModel$rejectionListText$1.L$2 = list2;
        superPassProofOverviewViewModel$rejectionListText$1.L$3 = str4;
        superPassProofOverviewViewModel$rejectionListText$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.GUIDELINES, new Object[i2], superPassProofOverviewViewModel$rejectionListText$1);
        if (objB3 != coroutineSingletons) {
            list3 = list;
            str = str4;
            objB2 = objB3;
            list4 = list2;
            proofDocumentProps3 = proofDocumentProps2;
            String strSubstring2 = str.substring(i2, str.length() - ((String) objB2).length());
            Intrinsics.h(strSubstring2, "substring(...)");
            list5 = list3;
            list4.add(new StyledTextDataUIState(strSubstring2, black_87, null, UITextStyle.BodyMedium, null, null, null, 1012));
            superPassProofOverviewViewModel$rejectionListText$1.L$0 = proofDocumentProps3;
            superPassProofOverviewViewModel$rejectionListText$1.L$1 = list5;
            superPassProofOverviewViewModel$rejectionListText$1.L$2 = list4;
            superPassProofOverviewViewModel$rejectionListText$1.L$3 = null;
            superPassProofOverviewViewModel$rejectionListText$1.label = 3;
            objB = stringProvider.b(StringEnum.GUIDELINES, new Object[i2], superPassProofOverviewViewModel$rejectionListText$1);
            if (objB != coroutineSingletons) {
                list6 = list5;
                objB2 = objB;
                proofDocumentProps4 = proofDocumentProps3;
                list7 = list4;
                list7.add(new StyledTextDataUIState((String) objB2, ChaloColorToken.OrangePrimary.f9835a, null, UITextStyle.BodyMedium, null, null, new StyledTextClickHandler() { // from class: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$rejectionListText$2$2
                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    public final void a() {
                        this.f8491a.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps4, true));
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: b */
                    public final String getF10090a() {
                        return "Annotation";
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: getTag */
                    public final String getF10085a() {
                        return "TAG";
                    }
                }, ServiceStarter.ERROR_UNKNOWN));
                return new TextUIState.StyledTextUIState(list6, null, null, 30);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(ProofUploadDetails proofUploadDetails, final ProofDocumentProps proofDocumentProps, ContinuationImpl continuationImpl) {
        SuperPassProofOverviewViewModel$uploadedImage$1 superPassProofOverviewViewModel$uploadedImage$1;
        SuperPassProofUploadedImageStageUIState.Companion companion;
        SuperPassProofUploadedImageStageUIState.Companion companion2;
        if (continuationImpl instanceof SuperPassProofOverviewViewModel$uploadedImage$1) {
            superPassProofOverviewViewModel$uploadedImage$1 = (SuperPassProofOverviewViewModel$uploadedImage$1) continuationImpl;
            int i = superPassProofOverviewViewModel$uploadedImage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassProofOverviewViewModel$uploadedImage$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassProofOverviewViewModel$uploadedImage$1 = new SuperPassProofOverviewViewModel$uploadedImage$1(this, continuationImpl);
            }
        } else {
            superPassProofOverviewViewModel$uploadedImage$1 = new SuperPassProofOverviewViewModel$uploadedImage$1(this, continuationImpl);
        }
        Object objB = superPassProofOverviewViewModel$uploadedImage$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassProofOverviewViewModel$uploadedImage$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                companion = (SuperPassProofUploadedImageStageUIState.Companion) superPassProofOverviewViewModel$uploadedImage$1.L$1;
                proofDocumentProps = (ProofDocumentProps) superPassProofOverviewViewModel$uploadedImage$1.L$0;
                ResultKt.b(objB);
                final int i3 = 0;
                Function0 function0 = new Function0(this) { // from class: fg1
                    public final /* synthetic */ SuperPassProofOverviewViewModel b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                                break;
                            case 1:
                                this.b.t(new SuperPassProofOverviewIntent.CancelProofUploadButtonClicked(proofDocumentProps));
                                break;
                            case 2:
                                this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                                break;
                            default:
                                this.b.t(new SuperPassProofOverviewIntent.EditPhotoButtonClicked(proofDocumentProps));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                companion.getClass();
                return SuperPassProofOverviewContractKt.a(SuperPassProofUploadedImageStageUIState.Companion.a((String) objB, function0), null, null);
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion2 = (SuperPassProofUploadedImageStageUIState.Companion) superPassProofOverviewViewModel$uploadedImage$1.L$1;
            proofDocumentProps = (ProofDocumentProps) superPassProofOverviewViewModel$uploadedImage$1.L$0;
            ResultKt.b(objB);
            final int i4 = 2;
            Function0 function1 = new Function0(this) { // from class: fg1
                public final /* synthetic */ SuperPassProofOverviewViewModel b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                            break;
                        case 1:
                            this.b.t(new SuperPassProofOverviewIntent.CancelProofUploadButtonClicked(proofDocumentProps));
                            break;
                        case 2:
                            this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                            break;
                        default:
                            this.b.t(new SuperPassProofOverviewIntent.EditPhotoButtonClicked(proofDocumentProps));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            companion2.getClass();
            return SuperPassProofOverviewContractKt.a(SuperPassProofUploadedImageStageUIState.Companion.a((String) objB, function1), null, null);
        }
        ResultKt.b(objB);
        int i5 = WhenMappings.f8485a[proofUploadDetails.d.ordinal()];
        StringProvider stringProvider = this.r;
        SuperPassProofUploadedImageStageUIState.Companion companion3 = SuperPassProofUploadedImageStageUIState.f8495a;
        if (i5 == 1) {
            superPassProofOverviewViewModel$uploadedImage$1.L$0 = proofDocumentProps;
            superPassProofOverviewViewModel$uploadedImage$1.L$1 = companion3;
            superPassProofOverviewViewModel$uploadedImage$1.label = 1;
            objB = stringProvider.b(StringEnum.ADD_PHOTO, new Object[0], superPassProofOverviewViewModel$uploadedImage$1);
            if (objB != coroutineSingletons) {
                companion = companion3;
                final int i6 = 0;
                Function0 function2 = new Function0(this) { // from class: fg1
                    public final /* synthetic */ SuperPassProofOverviewViewModel b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                                break;
                            case 1:
                                this.b.t(new SuperPassProofOverviewIntent.CancelProofUploadButtonClicked(proofDocumentProps));
                                break;
                            case 2:
                                this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                                break;
                            default:
                                this.b.t(new SuperPassProofOverviewIntent.EditPhotoButtonClicked(proofDocumentProps));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                companion.getClass();
                return SuperPassProofOverviewContractKt.a(SuperPassProofUploadedImageStageUIState.Companion.a((String) objB, function2), null, null);
            }
        } else {
            if (i5 == 2) {
                final int i7 = 1;
                return SuperPassProofOverviewContractKt.a(new SuperPassProofUploadedImageStageUIState.Loader(new CircularProgressIndicatorUIState(0.0f, 6)), IconType.IC_CANCEL, new Function0(this) { // from class: fg1
                    public final /* synthetic */ SuperPassProofOverviewViewModel b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                                break;
                            case 1:
                                this.b.t(new SuperPassProofOverviewIntent.CancelProofUploadButtonClicked(proofDocumentProps));
                                break;
                            case 2:
                                this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                                break;
                            default:
                                this.b.t(new SuperPassProofOverviewIntent.EditPhotoButtonClicked(proofDocumentProps));
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
            }
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                String str = proofUploadDetails.f8316a;
                final int i8 = 3;
                return SuperPassProofOverviewContractKt.a(new SuperPassProofUploadedImageStageUIState.Proof(new SuperProofImageUIState(str.length() > 0 ? str : null, proofUploadDetails.b, UiEventHandler.Companion.a(new da1(15, this, proofUploadDetails)), (UIContentScale) null, 24)), IconType.IC_EDIT, new Function0(this) { // from class: fg1
                    public final /* synthetic */ SuperPassProofOverviewViewModel b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                                break;
                            case 1:
                                this.b.t(new SuperPassProofOverviewIntent.CancelProofUploadButtonClicked(proofDocumentProps));
                                break;
                            case 2:
                                this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                                break;
                            default:
                                this.b.t(new SuperPassProofOverviewIntent.EditPhotoButtonClicked(proofDocumentProps));
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
            }
            superPassProofOverviewViewModel$uploadedImage$1.L$0 = proofDocumentProps;
            superPassProofOverviewViewModel$uploadedImage$1.L$1 = companion3;
            superPassProofOverviewViewModel$uploadedImage$1.label = 2;
            objB = stringProvider.b(StringEnum.ADD_PHOTO, new Object[0], superPassProofOverviewViewModel$uploadedImage$1);
            if (objB != coroutineSingletons) {
                companion2 = companion3;
                final int i9 = 2;
                Function0 function3 = new Function0(this) { // from class: fg1
                    public final /* synthetic */ SuperPassProofOverviewViewModel b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                                break;
                            case 1:
                                this.b.t(new SuperPassProofOverviewIntent.CancelProofUploadButtonClicked(proofDocumentProps));
                                break;
                            case 2:
                                this.b.t(new SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent(proofDocumentProps, false));
                                break;
                            default:
                                this.b.t(new SuperPassProofOverviewIntent.EditPhotoButtonClicked(proofDocumentProps));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                companion2.getClass();
                return SuperPassProofOverviewContractKt.a(SuperPassProofUploadedImageStageUIState.Companion.a((String) objB, function3), null, null);
            }
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent
    public final /* bridge */ /* synthetic */ Object a(SuperPassPurchaseSharedState superPassPurchaseSharedState, Object obj, SuspendLambda suspendLambda) {
        return r((SuperPassProofOverviewDataState) obj, suspendLambda);
    }

    @Override // app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent
    public final Object m() {
        if (this.w == null) {
            this.w = (SuperPassProofOverviewRestoreState) this.f8402a.getB().a("superPassProofOverviewViewModelStateKey", SuperPassProofOverviewRestoreState.INSTANCE.serializer());
        }
        SuperPassProofOverviewRestoreState superPassProofOverviewRestoreState = this.w;
        return superPassProofOverviewRestoreState != null ? SuperPassProofOverviewContractKt.b(superPassProofOverviewRestoreState) : new SuperPassProofOverviewDataState(false, false, false, null, null, false, false, false, false, null, 32767);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object q(boolean z, ContinuationImpl continuationImpl) {
        SuperPassProofOverviewViewModel$consentSection$1 superPassProofOverviewViewModel$consentSection$1;
        boolean z2;
        if (continuationImpl instanceof SuperPassProofOverviewViewModel$consentSection$1) {
            superPassProofOverviewViewModel$consentSection$1 = (SuperPassProofOverviewViewModel$consentSection$1) continuationImpl;
            int i = superPassProofOverviewViewModel$consentSection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassProofOverviewViewModel$consentSection$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassProofOverviewViewModel$consentSection$1 = new SuperPassProofOverviewViewModel$consentSection$1(this, continuationImpl);
            }
        } else {
            superPassProofOverviewViewModel$consentSection$1 = new SuperPassProofOverviewViewModel$consentSection$1(this, continuationImpl);
        }
        Object objB = superPassProofOverviewViewModel$consentSection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassProofOverviewViewModel$consentSection$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            superPassProofOverviewViewModel$consentSection$1.Z$0 = z;
            superPassProofOverviewViewModel$consentSection$1.label = 1;
            objB = this.r.b(StringEnum.PASS_PROOF_CONSENT, new Object[0], superPassProofOverviewViewModel$consentSection$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            z2 = z;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = superPassProofOverviewViewModel$consentSection$1.Z$0;
            ResultKt.b(objB);
        }
        return new SuperPassProofOverviewConsentUIState(z2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(new eg1(this, 5)));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:104:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:107:0x0300  */
    /* JADX WARN: Code duplicated, block: B:108:0x0302  */
    /* JADX WARN: Code duplicated, block: B:110:0x0306  */
    /* JADX WARN: Code duplicated, block: B:112:0x030c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0315  */
    /* JADX WARN: Code duplicated, block: B:120:0x031b  */
    /* JADX WARN: Code duplicated, block: B:122:0x032d  */
    /* JADX WARN: Code duplicated, block: B:126:0x034f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0360  */
    /* JADX WARN: Code duplicated, block: B:25:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x0188  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x01af  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8 A[PHI: r2 r11 r12
      0x01e8: PHI (r2v25 java.lang.Object) = (r2v22 java.lang.Object), (r2v1 java.lang.Object) binds: [B:66:0x01e4, B:19:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r11v14 app.chalo.uistate.toolbar.ToolbarUIState) = (r11v10 app.chalo.uistate.toolbar.ToolbarUIState), (r11v16 app.chalo.uistate.toolbar.ToolbarUIState) binds: [B:66:0x01e4, B:19:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r12v14 app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewDataState) = 
      (r12v10 app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewDataState)
      (r12v16 app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewDataState)
     binds: [B:66:0x01e4, B:19:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x0225  */
    /* JADX WARN: Code duplicated, block: B:81:0x0240  */
    /* JADX WARN: Code duplicated, block: B:85:0x025e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0286  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:94:0x02bb  */
    public final Object r(SuperPassProofOverviewDataState superPassProofOverviewDataState, ContinuationImpl continuationImpl) throws Throwable {
        SuperPassProofOverviewViewModel$convertToUiState$1 superPassProofOverviewViewModel$convertToUiState$1;
        int i;
        ToolbarUIState toolbarUIState;
        SuperPassProofOverviewConsentUIState superPassProofOverviewConsentUIState;
        SuperPassProofOverviewViewModel superPassProofOverviewViewModel;
        Object objQ;
        Object objB;
        SuperPassProofOverviewDataState superPassProofOverviewDataState2;
        int i2;
        Object objB2;
        int i3;
        boolean z;
        String str;
        SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState;
        EnlargeProofImage enlargeProofImage;
        BitmapImage bitmapImage;
        EnlargedProofImageUIState enlargedProofImageUIState;
        ToolbarUIState toolbarUIState2;
        SuperPassProofOverviewDataState superPassProofOverviewDataState3;
        ConfirmationDialogUiState confirmationDialogUiStateB;
        EnlargedProofImageUIState enlargedProofImageUIState2;
        SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState2;
        DialogUIStateFactory dialogUIStateFactory;
        DialogUIStateFactory dialogUIStateFactory2;
        String str2;
        Object objB3;
        String str3;
        SuperPassProofOverviewDataState superPassProofOverviewDataState4;
        ToolbarUIState toolbarUIState3;
        SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState3;
        EnlargedProofImageUIState enlargedProofImageUIState3;
        String str4;
        Object objB4;
        String str5;
        DialogUIStateFactory dialogUIStateFactory3;
        SuperPassProofItemsUIState[] superPassProofItemsUIStateArr;
        boolean z2;
        ConfirmationDialogUiState confirmationDialogUiState;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        List list;
        ArrayList arrayListB0;
        boolean z3;
        List list2;
        boolean z4;
        SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState4;
        ToolbarUIState toolbarUIState4;
        ConfirmationDialogUiState confirmationDialogUiState2;
        EnlargedProofImageUIState enlargedProofImageUIState4;
        List list3;
        Map mapD;
        ConfirmationDialogUiState confirmationDialogUiState3;
        List list4;
        List list5;
        EnlargedProofImageUIState enlargedProofImageUIState5;
        SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState5;
        ToolbarUIState toolbarUIState5;
        SuperPassProofOverviewDataState superPassProofOverviewDataState5 = superPassProofOverviewDataState;
        if (continuationImpl instanceof SuperPassProofOverviewViewModel$convertToUiState$1) {
            superPassProofOverviewViewModel$convertToUiState$1 = (SuperPassProofOverviewViewModel$convertToUiState$1) continuationImpl;
            int i5 = superPassProofOverviewViewModel$convertToUiState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                superPassProofOverviewViewModel$convertToUiState$1.label = i5 - Integer.MIN_VALUE;
            } else {
                superPassProofOverviewViewModel$convertToUiState$1 = new SuperPassProofOverviewViewModel$convertToUiState$1(this, continuationImpl);
            }
        } else {
            superPassProofOverviewViewModel$convertToUiState$1 = new SuperPassProofOverviewViewModel$convertToUiState$1(this, continuationImpl);
        }
        SuperPassProofOverviewViewModel$convertToUiState$1 superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$1;
        Object objS = superPassProofOverviewViewModel$convertToUiState$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = superPassProofOverviewViewModel$convertToUiState$2.label;
        StringProvider stringProvider = this.r;
        switch (i6) {
            case 0:
                ResultKt.b(objS);
                if (superPassProofOverviewDataState5.f8466a) {
                    i = 1;
                } else {
                    if (superPassProofOverviewDataState5.k && superPassProofOverviewDataState5.l) {
                        StateFlow stateFlow = this.f;
                        if (!((SuperPassProofOverviewDataState) stateFlow.getValue()).m ? true : ((SuperPassProofOverviewDataState) stateFlow.getValue()).n) {
                            i = 1;
                        }
                    }
                    i = 0;
                }
                ToolbarUIState toolbarUIState6 = (ToolbarUIState) this.v.getValue();
                if (!superPassProofOverviewDataState5.m || superPassProofOverviewDataState5.f8466a) {
                    toolbarUIState = toolbarUIState6;
                    superPassProofOverviewConsentUIState = null;
                    superPassProofOverviewViewModel = this;
                    if (superPassProofOverviewDataState5.f8466a) {
                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState5;
                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewViewModel;
                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = superPassProofOverviewConsentUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.I$0 = i;
                        superPassProofOverviewViewModel$convertToUiState$2.label = 2;
                        objB2 = stringProvider.b(StringEnum.REAPPLY_CAPS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                        if (objB2 != coroutineSingletons) {
                            superPassProofOverviewDataState2 = superPassProofOverviewDataState5;
                            i3 = i;
                            objS = objB2;
                            if (i3 != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            str = (String) objS;
                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = null;
                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = null;
                            superPassProofOverviewViewModel$convertToUiState$2.label = 4;
                            objS = superPassProofOverviewViewModel.s(z, superPassProofOverviewConsentUIState, str, superPassProofOverviewViewModel$convertToUiState$2);
                            if (objS != coroutineSingletons) {
                                superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) objS;
                                enlargeProofImage = superPassProofOverviewDataState2.o;
                                if (enlargeProofImage == null && !((bitmapImage = enlargeProofImage.b) == null && enlargeProofImage.f8455a == null)) {
                                    SuperProofImageUIState superProofImageUIState = new SuperProofImageUIState(enlargeProofImage.f8455a, bitmapImage, UiEventHandler.Companion.a(new eg1(this, 6)), UIContentScale.Fit, 16);
                                    EnlargeProofImageEventHandler.f8456a.getClass();
                                    enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
                                } else {
                                    enlargedProofImageUIState = null;
                                }
                                if (superPassProofOverviewDataState2.j) {
                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory;
                                    superPassProofOverviewViewModel$convertToUiState$2.label = 5;
                                    objS = stringProvider.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                    if (objS != coroutineSingletons) {
                                        dialogUIStateFactory2 = dialogUIStateFactory;
                                        str2 = (String) objS;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = str2;
                                        superPassProofOverviewViewModel$convertToUiState$2.label = 6;
                                        objB3 = stringProvider.b(StringEnum.SETTINGS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                        if (objB3 != coroutineSingletons) {
                                            EnlargedProofImageUIState enlargedProofImageUIState6 = enlargedProofImageUIState;
                                            str3 = str2;
                                            objS = objB3;
                                            superPassProofOverviewDataState4 = superPassProofOverviewDataState2;
                                            toolbarUIState3 = toolbarUIState;
                                            superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                                            enlargedProofImageUIState3 = enlargedProofImageUIState6;
                                            str4 = (String) objS;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState4;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState3;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState3;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = str3;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = str4;
                                            superPassProofOverviewViewModel$convertToUiState$2.label = 7;
                                            objB4 = stringProvider.b(StringEnum.CANCEL, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                            if (objB4 != coroutineSingletons) {
                                                str5 = str4;
                                                objS = objB4;
                                                dialogUIStateFactory3 = dialogUIStateFactory2;
                                                String str6 = str3;
                                                String str7 = (String) objS;
                                                eg1 eg1Var = new eg1(this, 0);
                                                eg1 eg1Var2 = new eg1(this, 1);
                                                dialogUIStateFactory3.getClass();
                                                confirmationDialogUiStateB = DialogUIStateFactory.b(null, str6, str5, str7, eg1Var, eg1Var2);
                                                superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                                                toolbarUIState2 = toolbarUIState3;
                                                superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                                                enlargedProofImageUIState2 = enlargedProofImageUIState3;
                                                superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                                boolean z5 = superPassProofOverviewDataState3.e;
                                                if (superPassProofOverviewDataState3.b || (list = superPassProofOverviewDataState3.g) == null || list.isEmpty()) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                List list6 = superPassProofOverviewDataState3.f;
                                                ProfileRejectionReason profileRejectionReason = superPassProofOverviewDataState3.h;
                                                String str8 = superPassProofOverviewDataState3.d;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                                superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                                superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                                objS = u(z5, z2, list6, profileRejectionReason, str8, superPassProofOverviewViewModel$convertToUiState$2);
                                                superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                                if (objS != coroutineSingletons) {
                                                    confirmationDialogUiState = confirmationDialogUiStateB;
                                                    i4 = 0;
                                                    objArr = superPassProofItemsUIStateArr;
                                                    objArr2 = objArr;
                                                    objArr[i4] = objS;
                                                    arrayListB0 = CollectionsKt.b0(objArr2);
                                                    if (superPassProofOverviewDataState3.f8466a) {
                                                        z3 = false;
                                                    } else {
                                                        if (superPassProofOverviewDataState3.b) {
                                                            list2 = superPassProofOverviewDataState3.g;
                                                            if (list2 != null || list2.isEmpty()) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            if (!z4) {
                                                                z3 = false;
                                                            }
                                                        }
                                                        z3 = true;
                                                    }
                                                    if (z3) {
                                                        List list7 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                                        mapD = superPassProofOverviewDataState3.i;
                                                        if (mapD == null) {
                                                            mapD = MapsKt.d();
                                                        }
                                                        boolean z6 = superPassProofOverviewDataState3.b;
                                                        List list8 = superPassProofOverviewDataState3.g;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                                        superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                                        objS = B(list7, mapD, z6, list8, superPassProofOverviewViewModel$convertToUiState$2);
                                                        if (objS != coroutineSingletons) {
                                                            confirmationDialogUiState3 = confirmationDialogUiState;
                                                            list4 = arrayListB0;
                                                            list5 = list4;
                                                            enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                            superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                            toolbarUIState5 = toolbarUIState2;
                                                            list4.addAll((Collection) objS);
                                                            list3 = list5;
                                                            confirmationDialogUiState2 = confirmationDialogUiState3;
                                                            toolbarUIState4 = toolbarUIState5;
                                                            enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                                        }
                                                    } else {
                                                        superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                                        toolbarUIState4 = toolbarUIState2;
                                                        confirmationDialogUiState2 = confirmationDialogUiState;
                                                        enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                                        list3 = arrayListB0;
                                                    }
                                                    return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    toolbarUIState2 = toolbarUIState;
                                    superPassProofOverviewDataState3 = superPassProofOverviewDataState2;
                                    confirmationDialogUiStateB = null;
                                    enlargedProofImageUIState2 = enlargedProofImageUIState;
                                    superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                                    superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                    boolean z7 = superPassProofOverviewDataState3.e;
                                    if (superPassProofOverviewDataState3.b) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    List list9 = superPassProofOverviewDataState3.f;
                                    ProfileRejectionReason profileRejectionReason2 = superPassProofOverviewDataState3.h;
                                    String str9 = superPassProofOverviewDataState3.d;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                    superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                    superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                    objS = u(z7, z2, list9, profileRejectionReason2, str9, superPassProofOverviewViewModel$convertToUiState$2);
                                    superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                    if (objS != coroutineSingletons) {
                                        confirmationDialogUiState = confirmationDialogUiStateB;
                                        i4 = 0;
                                        objArr = superPassProofItemsUIStateArr;
                                        objArr2 = objArr;
                                        objArr[i4] = objS;
                                        arrayListB0 = CollectionsKt.b0(objArr2);
                                        if (superPassProofOverviewDataState3.f8466a) {
                                            if (superPassProofOverviewDataState3.b) {
                                                list2 = superPassProofOverviewDataState3.g;
                                                if (list2 != null) {
                                                    z4 = true;
                                                } else {
                                                    z4 = true;
                                                }
                                                if (!z4) {
                                                    z3 = false;
                                                }
                                            }
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            List list10 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                            mapD = superPassProofOverviewDataState3.i;
                                            if (mapD == null) {
                                                mapD = MapsKt.d();
                                            }
                                            boolean z8 = superPassProofOverviewDataState3.b;
                                            List list11 = superPassProofOverviewDataState3.g;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                            superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                            objS = B(list10, mapD, z8, list11, superPassProofOverviewViewModel$convertToUiState$2);
                                            if (objS != coroutineSingletons) {
                                                confirmationDialogUiState3 = confirmationDialogUiState;
                                                list4 = arrayListB0;
                                                list5 = list4;
                                                enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                toolbarUIState5 = toolbarUIState2;
                                                list4.addAll((Collection) objS);
                                                list3 = list5;
                                                confirmationDialogUiState2 = confirmationDialogUiState3;
                                                toolbarUIState4 = toolbarUIState5;
                                                enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                            }
                                        } else {
                                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                            toolbarUIState4 = toolbarUIState2;
                                            confirmationDialogUiState2 = confirmationDialogUiState;
                                            enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                            list3 = arrayListB0;
                                        }
                                        return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                    }
                                }
                            }
                        }
                    } else {
                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState5;
                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewViewModel;
                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = superPassProofOverviewConsentUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.I$0 = i;
                        superPassProofOverviewViewModel$convertToUiState$2.label = 3;
                        objB = stringProvider.b(StringEnum.NEXT_CAPS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                        if (objB != coroutineSingletons) {
                            superPassProofOverviewDataState2 = superPassProofOverviewDataState5;
                            i2 = i;
                            objS = objB;
                            if (i2 != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            str = (String) objS;
                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = null;
                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = null;
                            superPassProofOverviewViewModel$convertToUiState$2.label = 4;
                            objS = superPassProofOverviewViewModel.s(z, superPassProofOverviewConsentUIState, str, superPassProofOverviewViewModel$convertToUiState$2);
                            if (objS != coroutineSingletons) {
                                superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) objS;
                                enlargeProofImage = superPassProofOverviewDataState2.o;
                                if (enlargeProofImage == null) {
                                    enlargedProofImageUIState = null;
                                } else {
                                    SuperProofImageUIState superProofImageUIState2 = new SuperProofImageUIState(enlargeProofImage.f8455a, bitmapImage, UiEventHandler.Companion.a(new eg1(this, 6)), UIContentScale.Fit, 16);
                                    EnlargeProofImageEventHandler.f8456a.getClass();
                                    enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState2, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
                                }
                                if (superPassProofOverviewDataState2.j) {
                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory;
                                    superPassProofOverviewViewModel$convertToUiState$2.label = 5;
                                    objS = stringProvider.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                    if (objS != coroutineSingletons) {
                                        dialogUIStateFactory2 = dialogUIStateFactory;
                                        str2 = (String) objS;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = str2;
                                        superPassProofOverviewViewModel$convertToUiState$2.label = 6;
                                        objB3 = stringProvider.b(StringEnum.SETTINGS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                        if (objB3 != coroutineSingletons) {
                                            EnlargedProofImageUIState enlargedProofImageUIState7 = enlargedProofImageUIState;
                                            str3 = str2;
                                            objS = objB3;
                                            superPassProofOverviewDataState4 = superPassProofOverviewDataState2;
                                            toolbarUIState3 = toolbarUIState;
                                            superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                                            enlargedProofImageUIState3 = enlargedProofImageUIState7;
                                            str4 = (String) objS;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState4;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState3;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState3;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = str3;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = str4;
                                            superPassProofOverviewViewModel$convertToUiState$2.label = 7;
                                            objB4 = stringProvider.b(StringEnum.CANCEL, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                            if (objB4 != coroutineSingletons) {
                                                str5 = str4;
                                                objS = objB4;
                                                dialogUIStateFactory3 = dialogUIStateFactory2;
                                                String str10 = str3;
                                                String str11 = (String) objS;
                                                eg1 eg1Var3 = new eg1(this, 0);
                                                eg1 eg1Var4 = new eg1(this, 1);
                                                dialogUIStateFactory3.getClass();
                                                confirmationDialogUiStateB = DialogUIStateFactory.b(null, str10, str5, str11, eg1Var3, eg1Var4);
                                                superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                                                toolbarUIState2 = toolbarUIState3;
                                                superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                                                enlargedProofImageUIState2 = enlargedProofImageUIState3;
                                                superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                                boolean z9 = superPassProofOverviewDataState3.e;
                                                if (superPassProofOverviewDataState3.b) {
                                                    z2 = false;
                                                } else {
                                                    z2 = false;
                                                }
                                                List list12 = superPassProofOverviewDataState3.f;
                                                ProfileRejectionReason profileRejectionReason3 = superPassProofOverviewDataState3.h;
                                                String str12 = superPassProofOverviewDataState3.d;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                                superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                                superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                                objS = u(z9, z2, list12, profileRejectionReason3, str12, superPassProofOverviewViewModel$convertToUiState$2);
                                                superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                                if (objS != coroutineSingletons) {
                                                    confirmationDialogUiState = confirmationDialogUiStateB;
                                                    i4 = 0;
                                                    objArr = superPassProofItemsUIStateArr;
                                                    objArr2 = objArr;
                                                    objArr[i4] = objS;
                                                    arrayListB0 = CollectionsKt.b0(objArr2);
                                                    if (superPassProofOverviewDataState3.f8466a) {
                                                        if (superPassProofOverviewDataState3.b) {
                                                            list2 = superPassProofOverviewDataState3.g;
                                                            if (list2 != null) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = true;
                                                            }
                                                            if (!z4) {
                                                                z3 = false;
                                                            }
                                                        }
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (z3) {
                                                        List list13 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                                        mapD = superPassProofOverviewDataState3.i;
                                                        if (mapD == null) {
                                                            mapD = MapsKt.d();
                                                        }
                                                        boolean z10 = superPassProofOverviewDataState3.b;
                                                        List list14 = superPassProofOverviewDataState3.g;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                                        superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                                        objS = B(list13, mapD, z10, list14, superPassProofOverviewViewModel$convertToUiState$2);
                                                        if (objS != coroutineSingletons) {
                                                            confirmationDialogUiState3 = confirmationDialogUiState;
                                                            list4 = arrayListB0;
                                                            list5 = list4;
                                                            enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                            superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                            toolbarUIState5 = toolbarUIState2;
                                                            list4.addAll((Collection) objS);
                                                            list3 = list5;
                                                            confirmationDialogUiState2 = confirmationDialogUiState3;
                                                            toolbarUIState4 = toolbarUIState5;
                                                            enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                                        }
                                                    } else {
                                                        superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                                        toolbarUIState4 = toolbarUIState2;
                                                        confirmationDialogUiState2 = confirmationDialogUiState;
                                                        enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                                        list3 = arrayListB0;
                                                    }
                                                    return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    toolbarUIState2 = toolbarUIState;
                                    superPassProofOverviewDataState3 = superPassProofOverviewDataState2;
                                    confirmationDialogUiStateB = null;
                                    enlargedProofImageUIState2 = enlargedProofImageUIState;
                                    superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                                    superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                    boolean z11 = superPassProofOverviewDataState3.e;
                                    if (superPassProofOverviewDataState3.b) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    List list15 = superPassProofOverviewDataState3.f;
                                    ProfileRejectionReason profileRejectionReason4 = superPassProofOverviewDataState3.h;
                                    String str13 = superPassProofOverviewDataState3.d;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                    superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                    superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                    objS = u(z11, z2, list15, profileRejectionReason4, str13, superPassProofOverviewViewModel$convertToUiState$2);
                                    superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                    if (objS != coroutineSingletons) {
                                        confirmationDialogUiState = confirmationDialogUiStateB;
                                        i4 = 0;
                                        objArr = superPassProofItemsUIStateArr;
                                        objArr2 = objArr;
                                        objArr[i4] = objS;
                                        arrayListB0 = CollectionsKt.b0(objArr2);
                                        if (superPassProofOverviewDataState3.f8466a) {
                                            if (superPassProofOverviewDataState3.b) {
                                                list2 = superPassProofOverviewDataState3.g;
                                                if (list2 != null) {
                                                    z4 = true;
                                                } else {
                                                    z4 = true;
                                                }
                                                if (!z4) {
                                                    z3 = false;
                                                }
                                            }
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            List list16 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                            mapD = superPassProofOverviewDataState3.i;
                                            if (mapD == null) {
                                                mapD = MapsKt.d();
                                            }
                                            boolean z12 = superPassProofOverviewDataState3.b;
                                            List list17 = superPassProofOverviewDataState3.g;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                            superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                            objS = B(list16, mapD, z12, list17, superPassProofOverviewViewModel$convertToUiState$2);
                                            if (objS != coroutineSingletons) {
                                                confirmationDialogUiState3 = confirmationDialogUiState;
                                                list4 = arrayListB0;
                                                list5 = list4;
                                                enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                toolbarUIState5 = toolbarUIState2;
                                                list4.addAll((Collection) objS);
                                                list3 = list5;
                                                confirmationDialogUiState2 = confirmationDialogUiState3;
                                                toolbarUIState4 = toolbarUIState5;
                                                enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                            }
                                        } else {
                                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                            toolbarUIState4 = toolbarUIState2;
                                            confirmationDialogUiState2 = confirmationDialogUiState;
                                            enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                            list3 = arrayListB0;
                                        }
                                        return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    boolean z13 = superPassProofOverviewDataState5.n;
                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState5;
                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState6;
                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = this;
                    superPassProofOverviewViewModel$convertToUiState$2.I$0 = i;
                    superPassProofOverviewViewModel$convertToUiState$2.label = 1;
                    objQ = q(z13, superPassProofOverviewViewModel$convertToUiState$2);
                    if (objQ != coroutineSingletons) {
                        toolbarUIState = toolbarUIState6;
                        superPassProofOverviewViewModel = this;
                        superPassProofOverviewConsentUIState = (SuperPassProofOverviewConsentUIState) objQ;
                        if (superPassProofOverviewDataState5.f8466a) {
                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState5;
                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewViewModel;
                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = superPassProofOverviewConsentUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.I$0 = i;
                            superPassProofOverviewViewModel$convertToUiState$2.label = 2;
                            objB2 = stringProvider.b(StringEnum.REAPPLY_CAPS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                            if (objB2 != coroutineSingletons) {
                                superPassProofOverviewDataState2 = superPassProofOverviewDataState5;
                                i3 = i;
                                objS = objB2;
                                if (i3 != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                str = (String) objS;
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = null;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = null;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 4;
                                objS = superPassProofOverviewViewModel.s(z, superPassProofOverviewConsentUIState, str, superPassProofOverviewViewModel$convertToUiState$2);
                                if (objS != coroutineSingletons) {
                                    superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) objS;
                                    enlargeProofImage = superPassProofOverviewDataState2.o;
                                    if (enlargeProofImage == null) {
                                        enlargedProofImageUIState = null;
                                    } else {
                                        SuperProofImageUIState superProofImageUIState3 = new SuperProofImageUIState(enlargeProofImage.f8455a, bitmapImage, UiEventHandler.Companion.a(new eg1(this, 6)), UIContentScale.Fit, 16);
                                        EnlargeProofImageEventHandler.f8456a.getClass();
                                        enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState3, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
                                    }
                                    if (superPassProofOverviewDataState2.j) {
                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                        dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory;
                                        superPassProofOverviewViewModel$convertToUiState$2.label = 5;
                                        objS = stringProvider.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                        if (objS != coroutineSingletons) {
                                            dialogUIStateFactory2 = dialogUIStateFactory;
                                            str2 = (String) objS;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = str2;
                                            superPassProofOverviewViewModel$convertToUiState$2.label = 6;
                                            objB3 = stringProvider.b(StringEnum.SETTINGS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                            if (objB3 != coroutineSingletons) {
                                                EnlargedProofImageUIState enlargedProofImageUIState8 = enlargedProofImageUIState;
                                                str3 = str2;
                                                objS = objB3;
                                                superPassProofOverviewDataState4 = superPassProofOverviewDataState2;
                                                toolbarUIState3 = toolbarUIState;
                                                superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                                                enlargedProofImageUIState3 = enlargedProofImageUIState8;
                                                str4 = (String) objS;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState4;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState3;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState3;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = str3;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = str4;
                                                superPassProofOverviewViewModel$convertToUiState$2.label = 7;
                                                objB4 = stringProvider.b(StringEnum.CANCEL, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                                if (objB4 != coroutineSingletons) {
                                                    str5 = str4;
                                                    objS = objB4;
                                                    dialogUIStateFactory3 = dialogUIStateFactory2;
                                                    String str14 = str3;
                                                    String str15 = (String) objS;
                                                    eg1 eg1Var5 = new eg1(this, 0);
                                                    eg1 eg1Var6 = new eg1(this, 1);
                                                    dialogUIStateFactory3.getClass();
                                                    confirmationDialogUiStateB = DialogUIStateFactory.b(null, str14, str5, str15, eg1Var5, eg1Var6);
                                                    superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                                                    toolbarUIState2 = toolbarUIState3;
                                                    superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                                                    enlargedProofImageUIState2 = enlargedProofImageUIState3;
                                                    superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                                    boolean z14 = superPassProofOverviewDataState3.e;
                                                    if (superPassProofOverviewDataState3.b) {
                                                        z2 = false;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    List list18 = superPassProofOverviewDataState3.f;
                                                    ProfileRejectionReason profileRejectionReason5 = superPassProofOverviewDataState3.h;
                                                    String str16 = superPassProofOverviewDataState3.d;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                                    superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                                    superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                                    objS = u(z14, z2, list18, profileRejectionReason5, str16, superPassProofOverviewViewModel$convertToUiState$2);
                                                    superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                                    if (objS != coroutineSingletons) {
                                                        confirmationDialogUiState = confirmationDialogUiStateB;
                                                        i4 = 0;
                                                        objArr = superPassProofItemsUIStateArr;
                                                        objArr2 = objArr;
                                                        objArr[i4] = objS;
                                                        arrayListB0 = CollectionsKt.b0(objArr2);
                                                        if (superPassProofOverviewDataState3.f8466a) {
                                                            if (superPassProofOverviewDataState3.b) {
                                                                list2 = superPassProofOverviewDataState3.g;
                                                                if (list2 != null) {
                                                                    z4 = true;
                                                                } else {
                                                                    z4 = true;
                                                                }
                                                                if (!z4) {
                                                                    z3 = false;
                                                                }
                                                            }
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        if (z3) {
                                                            List list19 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                                            mapD = superPassProofOverviewDataState3.i;
                                                            if (mapD == null) {
                                                                mapD = MapsKt.d();
                                                            }
                                                            boolean z15 = superPassProofOverviewDataState3.b;
                                                            List list110 = superPassProofOverviewDataState3.g;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                                            superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                                            objS = B(list19, mapD, z15, list110, superPassProofOverviewViewModel$convertToUiState$2);
                                                            if (objS != coroutineSingletons) {
                                                                confirmationDialogUiState3 = confirmationDialogUiState;
                                                                list4 = arrayListB0;
                                                                list5 = list4;
                                                                enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                                superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                                toolbarUIState5 = toolbarUIState2;
                                                                list4.addAll((Collection) objS);
                                                                list3 = list5;
                                                                confirmationDialogUiState2 = confirmationDialogUiState3;
                                                                toolbarUIState4 = toolbarUIState5;
                                                                enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                                            }
                                                        } else {
                                                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                                            toolbarUIState4 = toolbarUIState2;
                                                            confirmationDialogUiState2 = confirmationDialogUiState;
                                                            enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                                            list3 = arrayListB0;
                                                        }
                                                        return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        toolbarUIState2 = toolbarUIState;
                                        superPassProofOverviewDataState3 = superPassProofOverviewDataState2;
                                        confirmationDialogUiStateB = null;
                                        enlargedProofImageUIState2 = enlargedProofImageUIState;
                                        superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                                        superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                        boolean z16 = superPassProofOverviewDataState3.e;
                                        if (superPassProofOverviewDataState3.b) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        List list111 = superPassProofOverviewDataState3.f;
                                        ProfileRejectionReason profileRejectionReason6 = superPassProofOverviewDataState3.h;
                                        String str17 = superPassProofOverviewDataState3.d;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                        superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                        superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                        objS = u(z16, z2, list111, profileRejectionReason6, str17, superPassProofOverviewViewModel$convertToUiState$2);
                                        superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                        if (objS != coroutineSingletons) {
                                            confirmationDialogUiState = confirmationDialogUiStateB;
                                            i4 = 0;
                                            objArr = superPassProofItemsUIStateArr;
                                            objArr2 = objArr;
                                            objArr[i4] = objS;
                                            arrayListB0 = CollectionsKt.b0(objArr2);
                                            if (superPassProofOverviewDataState3.f8466a) {
                                                if (superPassProofOverviewDataState3.b) {
                                                    list2 = superPassProofOverviewDataState3.g;
                                                    if (list2 != null) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = true;
                                                    }
                                                    if (!z4) {
                                                        z3 = false;
                                                    }
                                                }
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                List list112 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                                mapD = superPassProofOverviewDataState3.i;
                                                if (mapD == null) {
                                                    mapD = MapsKt.d();
                                                }
                                                boolean z17 = superPassProofOverviewDataState3.b;
                                                List list113 = superPassProofOverviewDataState3.g;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                                superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                                objS = B(list112, mapD, z17, list113, superPassProofOverviewViewModel$convertToUiState$2);
                                                if (objS != coroutineSingletons) {
                                                    confirmationDialogUiState3 = confirmationDialogUiState;
                                                    list4 = arrayListB0;
                                                    list5 = list4;
                                                    enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                    superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                    toolbarUIState5 = toolbarUIState2;
                                                    list4.addAll((Collection) objS);
                                                    list3 = list5;
                                                    confirmationDialogUiState2 = confirmationDialogUiState3;
                                                    toolbarUIState4 = toolbarUIState5;
                                                    enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                    superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                                }
                                            } else {
                                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                                toolbarUIState4 = toolbarUIState2;
                                                confirmationDialogUiState2 = confirmationDialogUiState;
                                                enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                                list3 = arrayListB0;
                                            }
                                            return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                        }
                                    }
                                }
                            }
                        } else {
                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState5;
                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewViewModel;
                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = superPassProofOverviewConsentUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.I$0 = i;
                            superPassProofOverviewViewModel$convertToUiState$2.label = 3;
                            objB = stringProvider.b(StringEnum.NEXT_CAPS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                            if (objB != coroutineSingletons) {
                                superPassProofOverviewDataState2 = superPassProofOverviewDataState5;
                                i2 = i;
                                objS = objB;
                                if (i2 != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                str = (String) objS;
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = null;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = null;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 4;
                                objS = superPassProofOverviewViewModel.s(z, superPassProofOverviewConsentUIState, str, superPassProofOverviewViewModel$convertToUiState$2);
                                if (objS != coroutineSingletons) {
                                    superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) objS;
                                    enlargeProofImage = superPassProofOverviewDataState2.o;
                                    if (enlargeProofImage == null) {
                                        enlargedProofImageUIState = null;
                                    } else {
                                        SuperProofImageUIState superProofImageUIState4 = new SuperProofImageUIState(enlargeProofImage.f8455a, bitmapImage, UiEventHandler.Companion.a(new eg1(this, 6)), UIContentScale.Fit, 16);
                                        EnlargeProofImageEventHandler.f8456a.getClass();
                                        enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState4, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
                                    }
                                    if (superPassProofOverviewDataState2.j) {
                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                        dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory;
                                        superPassProofOverviewViewModel$convertToUiState$2.label = 5;
                                        objS = stringProvider.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                        if (objS != coroutineSingletons) {
                                            dialogUIStateFactory2 = dialogUIStateFactory;
                                            str2 = (String) objS;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = str2;
                                            superPassProofOverviewViewModel$convertToUiState$2.label = 6;
                                            objB3 = stringProvider.b(StringEnum.SETTINGS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                            if (objB3 != coroutineSingletons) {
                                                EnlargedProofImageUIState enlargedProofImageUIState9 = enlargedProofImageUIState;
                                                str3 = str2;
                                                objS = objB3;
                                                superPassProofOverviewDataState4 = superPassProofOverviewDataState2;
                                                toolbarUIState3 = toolbarUIState;
                                                superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                                                enlargedProofImageUIState3 = enlargedProofImageUIState9;
                                                str4 = (String) objS;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState4;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState3;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState3;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = str3;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = str4;
                                                superPassProofOverviewViewModel$convertToUiState$2.label = 7;
                                                objB4 = stringProvider.b(StringEnum.CANCEL, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                                if (objB4 != coroutineSingletons) {
                                                    str5 = str4;
                                                    objS = objB4;
                                                    dialogUIStateFactory3 = dialogUIStateFactory2;
                                                    String str18 = str3;
                                                    String str19 = (String) objS;
                                                    eg1 eg1Var7 = new eg1(this, 0);
                                                    eg1 eg1Var8 = new eg1(this, 1);
                                                    dialogUIStateFactory3.getClass();
                                                    confirmationDialogUiStateB = DialogUIStateFactory.b(null, str18, str5, str19, eg1Var7, eg1Var8);
                                                    superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                                                    toolbarUIState2 = toolbarUIState3;
                                                    superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                                                    enlargedProofImageUIState2 = enlargedProofImageUIState3;
                                                    superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                                    boolean z18 = superPassProofOverviewDataState3.e;
                                                    if (superPassProofOverviewDataState3.b) {
                                                        z2 = false;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    List list114 = superPassProofOverviewDataState3.f;
                                                    ProfileRejectionReason profileRejectionReason7 = superPassProofOverviewDataState3.h;
                                                    String str110 = superPassProofOverviewDataState3.d;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                                    superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                                    superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                                    objS = u(z18, z2, list114, profileRejectionReason7, str110, superPassProofOverviewViewModel$convertToUiState$2);
                                                    superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                                    if (objS != coroutineSingletons) {
                                                        confirmationDialogUiState = confirmationDialogUiStateB;
                                                        i4 = 0;
                                                        objArr = superPassProofItemsUIStateArr;
                                                        objArr2 = objArr;
                                                        objArr[i4] = objS;
                                                        arrayListB0 = CollectionsKt.b0(objArr2);
                                                        if (superPassProofOverviewDataState3.f8466a) {
                                                            if (superPassProofOverviewDataState3.b) {
                                                                list2 = superPassProofOverviewDataState3.g;
                                                                if (list2 != null) {
                                                                    z4 = true;
                                                                } else {
                                                                    z4 = true;
                                                                }
                                                                if (!z4) {
                                                                    z3 = false;
                                                                }
                                                            }
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        if (z3) {
                                                            List list115 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                                            mapD = superPassProofOverviewDataState3.i;
                                                            if (mapD == null) {
                                                                mapD = MapsKt.d();
                                                            }
                                                            boolean z19 = superPassProofOverviewDataState3.b;
                                                            List list116 = superPassProofOverviewDataState3.g;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                                            superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                                            objS = B(list115, mapD, z19, list116, superPassProofOverviewViewModel$convertToUiState$2);
                                                            if (objS != coroutineSingletons) {
                                                                confirmationDialogUiState3 = confirmationDialogUiState;
                                                                list4 = arrayListB0;
                                                                list5 = list4;
                                                                enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                                superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                                toolbarUIState5 = toolbarUIState2;
                                                                list4.addAll((Collection) objS);
                                                                list3 = list5;
                                                                confirmationDialogUiState2 = confirmationDialogUiState3;
                                                                toolbarUIState4 = toolbarUIState5;
                                                                enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                                            }
                                                        } else {
                                                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                                            toolbarUIState4 = toolbarUIState2;
                                                            confirmationDialogUiState2 = confirmationDialogUiState;
                                                            enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                                            list3 = arrayListB0;
                                                        }
                                                        return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        toolbarUIState2 = toolbarUIState;
                                        superPassProofOverviewDataState3 = superPassProofOverviewDataState2;
                                        confirmationDialogUiStateB = null;
                                        enlargedProofImageUIState2 = enlargedProofImageUIState;
                                        superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                                        superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                        boolean z110 = superPassProofOverviewDataState3.e;
                                        if (superPassProofOverviewDataState3.b) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        List list117 = superPassProofOverviewDataState3.f;
                                        ProfileRejectionReason profileRejectionReason8 = superPassProofOverviewDataState3.h;
                                        String str111 = superPassProofOverviewDataState3.d;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                        superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                        superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                        objS = u(z110, z2, list117, profileRejectionReason8, str111, superPassProofOverviewViewModel$convertToUiState$2);
                                        superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                        if (objS != coroutineSingletons) {
                                            confirmationDialogUiState = confirmationDialogUiStateB;
                                            i4 = 0;
                                            objArr = superPassProofItemsUIStateArr;
                                            objArr2 = objArr;
                                            objArr[i4] = objS;
                                            arrayListB0 = CollectionsKt.b0(objArr2);
                                            if (superPassProofOverviewDataState3.f8466a) {
                                                if (superPassProofOverviewDataState3.b) {
                                                    list2 = superPassProofOverviewDataState3.g;
                                                    if (list2 != null) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = true;
                                                    }
                                                    if (!z4) {
                                                        z3 = false;
                                                    }
                                                }
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                List list118 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                                mapD = superPassProofOverviewDataState3.i;
                                                if (mapD == null) {
                                                    mapD = MapsKt.d();
                                                }
                                                boolean z111 = superPassProofOverviewDataState3.b;
                                                List list119 = superPassProofOverviewDataState3.g;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                                superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                                objS = B(list118, mapD, z111, list119, superPassProofOverviewViewModel$convertToUiState$2);
                                                if (objS != coroutineSingletons) {
                                                    confirmationDialogUiState3 = confirmationDialogUiState;
                                                    list4 = arrayListB0;
                                                    list5 = list4;
                                                    enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                    superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                    toolbarUIState5 = toolbarUIState2;
                                                    list4.addAll((Collection) objS);
                                                    list3 = list5;
                                                    confirmationDialogUiState2 = confirmationDialogUiState3;
                                                    toolbarUIState4 = toolbarUIState5;
                                                    enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                    superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                                }
                                            } else {
                                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                                toolbarUIState4 = toolbarUIState2;
                                                confirmationDialogUiState2 = confirmationDialogUiState;
                                                enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                                list3 = arrayListB0;
                                            }
                                            return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                int i7 = superPassProofOverviewViewModel$convertToUiState$2.I$0;
                SuperPassProofOverviewViewModel superPassProofOverviewViewModel2 = (SuperPassProofOverviewViewModel) superPassProofOverviewViewModel$convertToUiState$2.L$2;
                ToolbarUIState toolbarUIState7 = (ToolbarUIState) superPassProofOverviewViewModel$convertToUiState$2.L$1;
                SuperPassProofOverviewDataState superPassProofOverviewDataState6 = (SuperPassProofOverviewDataState) superPassProofOverviewViewModel$convertToUiState$2.L$0;
                ResultKt.b(objS);
                i = i7;
                superPassProofOverviewDataState5 = superPassProofOverviewDataState6;
                toolbarUIState = toolbarUIState7;
                superPassProofOverviewViewModel = superPassProofOverviewViewModel2;
                objQ = objS;
                superPassProofOverviewConsentUIState = (SuperPassProofOverviewConsentUIState) objQ;
                if (superPassProofOverviewDataState5.f8466a) {
                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState5;
                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewViewModel;
                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = superPassProofOverviewConsentUIState;
                    superPassProofOverviewViewModel$convertToUiState$2.I$0 = i;
                    superPassProofOverviewViewModel$convertToUiState$2.label = 2;
                    objB2 = stringProvider.b(StringEnum.REAPPLY_CAPS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                    if (objB2 != coroutineSingletons) {
                        superPassProofOverviewDataState2 = superPassProofOverviewDataState5;
                        i3 = i;
                        objS = objB2;
                        if (i3 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        str = (String) objS;
                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = null;
                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = null;
                        superPassProofOverviewViewModel$convertToUiState$2.label = 4;
                        objS = superPassProofOverviewViewModel.s(z, superPassProofOverviewConsentUIState, str, superPassProofOverviewViewModel$convertToUiState$2);
                        if (objS != coroutineSingletons) {
                            superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) objS;
                            enlargeProofImage = superPassProofOverviewDataState2.o;
                            if (enlargeProofImage == null) {
                                enlargedProofImageUIState = null;
                            } else {
                                SuperProofImageUIState superProofImageUIState5 = new SuperProofImageUIState(enlargeProofImage.f8455a, bitmapImage, UiEventHandler.Companion.a(new eg1(this, 6)), UIContentScale.Fit, 16);
                                EnlargeProofImageEventHandler.f8456a.getClass();
                                enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState5, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
                            }
                            if (superPassProofOverviewDataState2.j) {
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 5;
                                objS = stringProvider.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                if (objS != coroutineSingletons) {
                                    dialogUIStateFactory2 = dialogUIStateFactory;
                                    str2 = (String) objS;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = str2;
                                    superPassProofOverviewViewModel$convertToUiState$2.label = 6;
                                    objB3 = stringProvider.b(StringEnum.SETTINGS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                    if (objB3 != coroutineSingletons) {
                                        EnlargedProofImageUIState enlargedProofImageUIState10 = enlargedProofImageUIState;
                                        str3 = str2;
                                        objS = objB3;
                                        superPassProofOverviewDataState4 = superPassProofOverviewDataState2;
                                        toolbarUIState3 = toolbarUIState;
                                        superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                                        enlargedProofImageUIState3 = enlargedProofImageUIState10;
                                        str4 = (String) objS;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState4;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState3;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState3;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = str3;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = str4;
                                        superPassProofOverviewViewModel$convertToUiState$2.label = 7;
                                        objB4 = stringProvider.b(StringEnum.CANCEL, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                        if (objB4 != coroutineSingletons) {
                                            str5 = str4;
                                            objS = objB4;
                                            dialogUIStateFactory3 = dialogUIStateFactory2;
                                            String str112 = str3;
                                            String str113 = (String) objS;
                                            eg1 eg1Var9 = new eg1(this, 0);
                                            eg1 eg1Var10 = new eg1(this, 1);
                                            dialogUIStateFactory3.getClass();
                                            confirmationDialogUiStateB = DialogUIStateFactory.b(null, str112, str5, str113, eg1Var9, eg1Var10);
                                            superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                                            toolbarUIState2 = toolbarUIState3;
                                            superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                                            enlargedProofImageUIState2 = enlargedProofImageUIState3;
                                            superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                            boolean z112 = superPassProofOverviewDataState3.e;
                                            if (superPassProofOverviewDataState3.b) {
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                            }
                                            List list1110 = superPassProofOverviewDataState3.f;
                                            ProfileRejectionReason profileRejectionReason9 = superPassProofOverviewDataState3.h;
                                            String str114 = superPassProofOverviewDataState3.d;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                            superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                            superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                            objS = u(z112, z2, list1110, profileRejectionReason9, str114, superPassProofOverviewViewModel$convertToUiState$2);
                                            superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                            if (objS != coroutineSingletons) {
                                                confirmationDialogUiState = confirmationDialogUiStateB;
                                                i4 = 0;
                                                objArr = superPassProofItemsUIStateArr;
                                                objArr2 = objArr;
                                                objArr[i4] = objS;
                                                arrayListB0 = CollectionsKt.b0(objArr2);
                                                if (superPassProofOverviewDataState3.f8466a) {
                                                    if (superPassProofOverviewDataState3.b) {
                                                        list2 = superPassProofOverviewDataState3.g;
                                                        if (list2 != null) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = true;
                                                        }
                                                        if (!z4) {
                                                            z3 = false;
                                                        }
                                                    }
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    List list1111 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                                    mapD = superPassProofOverviewDataState3.i;
                                                    if (mapD == null) {
                                                        mapD = MapsKt.d();
                                                    }
                                                    boolean z113 = superPassProofOverviewDataState3.b;
                                                    List list1112 = superPassProofOverviewDataState3.g;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                                    superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                                    objS = B(list1111, mapD, z113, list1112, superPassProofOverviewViewModel$convertToUiState$2);
                                                    if (objS != coroutineSingletons) {
                                                        confirmationDialogUiState3 = confirmationDialogUiState;
                                                        list4 = arrayListB0;
                                                        list5 = list4;
                                                        enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                        superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                        toolbarUIState5 = toolbarUIState2;
                                                        list4.addAll((Collection) objS);
                                                        list3 = list5;
                                                        confirmationDialogUiState2 = confirmationDialogUiState3;
                                                        toolbarUIState4 = toolbarUIState5;
                                                        enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                        superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                                    }
                                                } else {
                                                    superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                                    toolbarUIState4 = toolbarUIState2;
                                                    confirmationDialogUiState2 = confirmationDialogUiState;
                                                    enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                                    list3 = arrayListB0;
                                                }
                                                return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                            }
                                        }
                                    }
                                }
                            } else {
                                toolbarUIState2 = toolbarUIState;
                                superPassProofOverviewDataState3 = superPassProofOverviewDataState2;
                                confirmationDialogUiStateB = null;
                                enlargedProofImageUIState2 = enlargedProofImageUIState;
                                superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                                superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                boolean z114 = superPassProofOverviewDataState3.e;
                                if (superPassProofOverviewDataState3.b) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                List list1113 = superPassProofOverviewDataState3.f;
                                ProfileRejectionReason profileRejectionReason10 = superPassProofOverviewDataState3.h;
                                String str115 = superPassProofOverviewDataState3.d;
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                objS = u(z114, z2, list1113, profileRejectionReason10, str115, superPassProofOverviewViewModel$convertToUiState$2);
                                superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                if (objS != coroutineSingletons) {
                                    confirmationDialogUiState = confirmationDialogUiStateB;
                                    i4 = 0;
                                    objArr = superPassProofItemsUIStateArr;
                                    objArr2 = objArr;
                                    objArr[i4] = objS;
                                    arrayListB0 = CollectionsKt.b0(objArr2);
                                    if (superPassProofOverviewDataState3.f8466a) {
                                        if (superPassProofOverviewDataState3.b) {
                                            list2 = superPassProofOverviewDataState3.g;
                                            if (list2 != null) {
                                                z4 = true;
                                            } else {
                                                z4 = true;
                                            }
                                            if (!z4) {
                                                z3 = false;
                                            }
                                        }
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        List list1114 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                        mapD = superPassProofOverviewDataState3.i;
                                        if (mapD == null) {
                                            mapD = MapsKt.d();
                                        }
                                        boolean z115 = superPassProofOverviewDataState3.b;
                                        List list1115 = superPassProofOverviewDataState3.g;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                        superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                        objS = B(list1114, mapD, z115, list1115, superPassProofOverviewViewModel$convertToUiState$2);
                                        if (objS != coroutineSingletons) {
                                            confirmationDialogUiState3 = confirmationDialogUiState;
                                            list4 = arrayListB0;
                                            list5 = list4;
                                            enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                            superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                            toolbarUIState5 = toolbarUIState2;
                                            list4.addAll((Collection) objS);
                                            list3 = list5;
                                            confirmationDialogUiState2 = confirmationDialogUiState3;
                                            toolbarUIState4 = toolbarUIState5;
                                            enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                        }
                                    } else {
                                        superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                        toolbarUIState4 = toolbarUIState2;
                                        confirmationDialogUiState2 = confirmationDialogUiState;
                                        enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                        list3 = arrayListB0;
                                    }
                                    return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                }
                            }
                        }
                    }
                } else {
                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState5;
                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewViewModel;
                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = superPassProofOverviewConsentUIState;
                    superPassProofOverviewViewModel$convertToUiState$2.I$0 = i;
                    superPassProofOverviewViewModel$convertToUiState$2.label = 3;
                    objB = stringProvider.b(StringEnum.NEXT_CAPS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                    if (objB != coroutineSingletons) {
                        superPassProofOverviewDataState2 = superPassProofOverviewDataState5;
                        i2 = i;
                        objS = objB;
                        if (i2 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        str = (String) objS;
                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = null;
                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = null;
                        superPassProofOverviewViewModel$convertToUiState$2.label = 4;
                        objS = superPassProofOverviewViewModel.s(z, superPassProofOverviewConsentUIState, str, superPassProofOverviewViewModel$convertToUiState$2);
                        if (objS != coroutineSingletons) {
                            superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) objS;
                            enlargeProofImage = superPassProofOverviewDataState2.o;
                            if (enlargeProofImage == null) {
                                enlargedProofImageUIState = null;
                            } else {
                                SuperProofImageUIState superProofImageUIState6 = new SuperProofImageUIState(enlargeProofImage.f8455a, bitmapImage, UiEventHandler.Companion.a(new eg1(this, 6)), UIContentScale.Fit, 16);
                                EnlargeProofImageEventHandler.f8456a.getClass();
                                enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState6, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
                            }
                            if (superPassProofOverviewDataState2.j) {
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                dialogUIStateFactory = DialogUIStateFactory.f9989a;
                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 5;
                                objS = stringProvider.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                if (objS != coroutineSingletons) {
                                    dialogUIStateFactory2 = dialogUIStateFactory;
                                    str2 = (String) objS;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = str2;
                                    superPassProofOverviewViewModel$convertToUiState$2.label = 6;
                                    objB3 = stringProvider.b(StringEnum.SETTINGS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                    if (objB3 != coroutineSingletons) {
                                        EnlargedProofImageUIState enlargedProofImageUIState11 = enlargedProofImageUIState;
                                        str3 = str2;
                                        objS = objB3;
                                        superPassProofOverviewDataState4 = superPassProofOverviewDataState2;
                                        toolbarUIState3 = toolbarUIState;
                                        superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                                        enlargedProofImageUIState3 = enlargedProofImageUIState11;
                                        str4 = (String) objS;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState4;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState3;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState3;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = str3;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = str4;
                                        superPassProofOverviewViewModel$convertToUiState$2.label = 7;
                                        objB4 = stringProvider.b(StringEnum.CANCEL, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                        if (objB4 != coroutineSingletons) {
                                            str5 = str4;
                                            objS = objB4;
                                            dialogUIStateFactory3 = dialogUIStateFactory2;
                                            String str116 = str3;
                                            String str117 = (String) objS;
                                            eg1 eg1Var11 = new eg1(this, 0);
                                            eg1 eg1Var12 = new eg1(this, 1);
                                            dialogUIStateFactory3.getClass();
                                            confirmationDialogUiStateB = DialogUIStateFactory.b(null, str116, str5, str117, eg1Var11, eg1Var12);
                                            superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                                            toolbarUIState2 = toolbarUIState3;
                                            superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                                            enlargedProofImageUIState2 = enlargedProofImageUIState3;
                                            superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                            boolean z116 = superPassProofOverviewDataState3.e;
                                            if (superPassProofOverviewDataState3.b) {
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                            }
                                            List list1116 = superPassProofOverviewDataState3.f;
                                            ProfileRejectionReason profileRejectionReason11 = superPassProofOverviewDataState3.h;
                                            String str118 = superPassProofOverviewDataState3.d;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                            superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                            superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                            objS = u(z116, z2, list1116, profileRejectionReason11, str118, superPassProofOverviewViewModel$convertToUiState$2);
                                            superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                            if (objS != coroutineSingletons) {
                                                confirmationDialogUiState = confirmationDialogUiStateB;
                                                i4 = 0;
                                                objArr = superPassProofItemsUIStateArr;
                                                objArr2 = objArr;
                                                objArr[i4] = objS;
                                                arrayListB0 = CollectionsKt.b0(objArr2);
                                                if (superPassProofOverviewDataState3.f8466a) {
                                                    if (superPassProofOverviewDataState3.b) {
                                                        list2 = superPassProofOverviewDataState3.g;
                                                        if (list2 != null) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = true;
                                                        }
                                                        if (!z4) {
                                                            z3 = false;
                                                        }
                                                    }
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    List list1117 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                                    mapD = superPassProofOverviewDataState3.i;
                                                    if (mapD == null) {
                                                        mapD = MapsKt.d();
                                                    }
                                                    boolean z117 = superPassProofOverviewDataState3.b;
                                                    List list1118 = superPassProofOverviewDataState3.g;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                                    superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                                    objS = B(list1117, mapD, z117, list1118, superPassProofOverviewViewModel$convertToUiState$2);
                                                    if (objS != coroutineSingletons) {
                                                        confirmationDialogUiState3 = confirmationDialogUiState;
                                                        list4 = arrayListB0;
                                                        list5 = list4;
                                                        enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                        superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                        toolbarUIState5 = toolbarUIState2;
                                                        list4.addAll((Collection) objS);
                                                        list3 = list5;
                                                        confirmationDialogUiState2 = confirmationDialogUiState3;
                                                        toolbarUIState4 = toolbarUIState5;
                                                        enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                        superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                                    }
                                                } else {
                                                    superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                                    toolbarUIState4 = toolbarUIState2;
                                                    confirmationDialogUiState2 = confirmationDialogUiState;
                                                    enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                                    list3 = arrayListB0;
                                                }
                                                return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                            }
                                        }
                                    }
                                }
                            } else {
                                toolbarUIState2 = toolbarUIState;
                                superPassProofOverviewDataState3 = superPassProofOverviewDataState2;
                                confirmationDialogUiStateB = null;
                                enlargedProofImageUIState2 = enlargedProofImageUIState;
                                superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                                superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                boolean z118 = superPassProofOverviewDataState3.e;
                                if (superPassProofOverviewDataState3.b) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                List list1119 = superPassProofOverviewDataState3.f;
                                ProfileRejectionReason profileRejectionReason12 = superPassProofOverviewDataState3.h;
                                String str119 = superPassProofOverviewDataState3.d;
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                objS = u(z118, z2, list1119, profileRejectionReason12, str119, superPassProofOverviewViewModel$convertToUiState$2);
                                superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                if (objS != coroutineSingletons) {
                                    confirmationDialogUiState = confirmationDialogUiStateB;
                                    i4 = 0;
                                    objArr = superPassProofItemsUIStateArr;
                                    objArr2 = objArr;
                                    objArr[i4] = objS;
                                    arrayListB0 = CollectionsKt.b0(objArr2);
                                    if (superPassProofOverviewDataState3.f8466a) {
                                        if (superPassProofOverviewDataState3.b) {
                                            list2 = superPassProofOverviewDataState3.g;
                                            if (list2 != null) {
                                                z4 = true;
                                            } else {
                                                z4 = true;
                                            }
                                            if (!z4) {
                                                z3 = false;
                                            }
                                        }
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        List list11110 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                        mapD = superPassProofOverviewDataState3.i;
                                        if (mapD == null) {
                                            mapD = MapsKt.d();
                                        }
                                        boolean z119 = superPassProofOverviewDataState3.b;
                                        List list11111 = superPassProofOverviewDataState3.g;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                        superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                        objS = B(list11110, mapD, z119, list11111, superPassProofOverviewViewModel$convertToUiState$2);
                                        if (objS != coroutineSingletons) {
                                            confirmationDialogUiState3 = confirmationDialogUiState;
                                            list4 = arrayListB0;
                                            list5 = list4;
                                            enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                            superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                            toolbarUIState5 = toolbarUIState2;
                                            list4.addAll((Collection) objS);
                                            list3 = list5;
                                            confirmationDialogUiState2 = confirmationDialogUiState3;
                                            toolbarUIState4 = toolbarUIState5;
                                            enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                        }
                                    } else {
                                        superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                        toolbarUIState4 = toolbarUIState2;
                                        confirmationDialogUiState2 = confirmationDialogUiState;
                                        enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                        list3 = arrayListB0;
                                    }
                                    return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                i3 = superPassProofOverviewViewModel$convertToUiState$2.I$0;
                superPassProofOverviewConsentUIState = (SuperPassProofOverviewConsentUIState) superPassProofOverviewViewModel$convertToUiState$2.L$3;
                superPassProofOverviewViewModel = (SuperPassProofOverviewViewModel) superPassProofOverviewViewModel$convertToUiState$2.L$2;
                toolbarUIState = (ToolbarUIState) superPassProofOverviewViewModel$convertToUiState$2.L$1;
                superPassProofOverviewDataState2 = (SuperPassProofOverviewDataState) superPassProofOverviewViewModel$convertToUiState$2.L$0;
                ResultKt.b(objS);
                if (i3 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                str = (String) objS;
                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                superPassProofOverviewViewModel$convertToUiState$2.L$2 = null;
                superPassProofOverviewViewModel$convertToUiState$2.L$3 = null;
                superPassProofOverviewViewModel$convertToUiState$2.label = 4;
                objS = superPassProofOverviewViewModel.s(z, superPassProofOverviewConsentUIState, str, superPassProofOverviewViewModel$convertToUiState$2);
                if (objS != coroutineSingletons) {
                    superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) objS;
                    enlargeProofImage = superPassProofOverviewDataState2.o;
                    if (enlargeProofImage == null) {
                        enlargedProofImageUIState = null;
                    } else {
                        SuperProofImageUIState superProofImageUIState7 = new SuperProofImageUIState(enlargeProofImage.f8455a, bitmapImage, UiEventHandler.Companion.a(new eg1(this, 6)), UIContentScale.Fit, 16);
                        EnlargeProofImageEventHandler.f8456a.getClass();
                        enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState7, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
                    }
                    if (superPassProofOverviewDataState2.j) {
                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                        dialogUIStateFactory = DialogUIStateFactory.f9989a;
                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory;
                        superPassProofOverviewViewModel$convertToUiState$2.label = 5;
                        objS = stringProvider.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                        if (objS != coroutineSingletons) {
                            dialogUIStateFactory2 = dialogUIStateFactory;
                            str2 = (String) objS;
                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = str2;
                            superPassProofOverviewViewModel$convertToUiState$2.label = 6;
                            objB3 = stringProvider.b(StringEnum.SETTINGS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                            if (objB3 != coroutineSingletons) {
                                EnlargedProofImageUIState enlargedProofImageUIState12 = enlargedProofImageUIState;
                                str3 = str2;
                                objS = objB3;
                                superPassProofOverviewDataState4 = superPassProofOverviewDataState2;
                                toolbarUIState3 = toolbarUIState;
                                superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                                enlargedProofImageUIState3 = enlargedProofImageUIState12;
                                str4 = (String) objS;
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState4;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState3;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState3;
                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = str3;
                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = str4;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 7;
                                objB4 = stringProvider.b(StringEnum.CANCEL, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                if (objB4 != coroutineSingletons) {
                                    str5 = str4;
                                    objS = objB4;
                                    dialogUIStateFactory3 = dialogUIStateFactory2;
                                    String str1110 = str3;
                                    String str1111 = (String) objS;
                                    eg1 eg1Var13 = new eg1(this, 0);
                                    eg1 eg1Var14 = new eg1(this, 1);
                                    dialogUIStateFactory3.getClass();
                                    confirmationDialogUiStateB = DialogUIStateFactory.b(null, str1110, str5, str1111, eg1Var13, eg1Var14);
                                    superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                                    toolbarUIState2 = toolbarUIState3;
                                    superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                                    enlargedProofImageUIState2 = enlargedProofImageUIState3;
                                    superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                    boolean z1110 = superPassProofOverviewDataState3.e;
                                    if (superPassProofOverviewDataState3.b) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    List list11112 = superPassProofOverviewDataState3.f;
                                    ProfileRejectionReason profileRejectionReason13 = superPassProofOverviewDataState3.h;
                                    String str1112 = superPassProofOverviewDataState3.d;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                    superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                    superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                    objS = u(z1110, z2, list11112, profileRejectionReason13, str1112, superPassProofOverviewViewModel$convertToUiState$2);
                                    superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                    if (objS != coroutineSingletons) {
                                        confirmationDialogUiState = confirmationDialogUiStateB;
                                        i4 = 0;
                                        objArr = superPassProofItemsUIStateArr;
                                        objArr2 = objArr;
                                        objArr[i4] = objS;
                                        arrayListB0 = CollectionsKt.b0(objArr2);
                                        if (superPassProofOverviewDataState3.f8466a) {
                                            if (superPassProofOverviewDataState3.b) {
                                                list2 = superPassProofOverviewDataState3.g;
                                                if (list2 != null) {
                                                    z4 = true;
                                                } else {
                                                    z4 = true;
                                                }
                                                if (!z4) {
                                                    z3 = false;
                                                }
                                            }
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            List list11113 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                            mapD = superPassProofOverviewDataState3.i;
                                            if (mapD == null) {
                                                mapD = MapsKt.d();
                                            }
                                            boolean z1111 = superPassProofOverviewDataState3.b;
                                            List list11114 = superPassProofOverviewDataState3.g;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                            superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                            objS = B(list11113, mapD, z1111, list11114, superPassProofOverviewViewModel$convertToUiState$2);
                                            if (objS != coroutineSingletons) {
                                                confirmationDialogUiState3 = confirmationDialogUiState;
                                                list4 = arrayListB0;
                                                list5 = list4;
                                                enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                toolbarUIState5 = toolbarUIState2;
                                                list4.addAll((Collection) objS);
                                                list3 = list5;
                                                confirmationDialogUiState2 = confirmationDialogUiState3;
                                                toolbarUIState4 = toolbarUIState5;
                                                enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                            }
                                        } else {
                                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                            toolbarUIState4 = toolbarUIState2;
                                            confirmationDialogUiState2 = confirmationDialogUiState;
                                            enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                            list3 = arrayListB0;
                                        }
                                        return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                    }
                                }
                            }
                        }
                    } else {
                        toolbarUIState2 = toolbarUIState;
                        superPassProofOverviewDataState3 = superPassProofOverviewDataState2;
                        confirmationDialogUiStateB = null;
                        enlargedProofImageUIState2 = enlargedProofImageUIState;
                        superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                        superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                        boolean z1112 = superPassProofOverviewDataState3.e;
                        if (superPassProofOverviewDataState3.b) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        List list11115 = superPassProofOverviewDataState3.f;
                        ProfileRejectionReason profileRejectionReason14 = superPassProofOverviewDataState3.h;
                        String str1113 = superPassProofOverviewDataState3.d;
                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                        superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                        superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                        objS = u(z1112, z2, list11115, profileRejectionReason14, str1113, superPassProofOverviewViewModel$convertToUiState$2);
                        superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                        if (objS != coroutineSingletons) {
                            confirmationDialogUiState = confirmationDialogUiStateB;
                            i4 = 0;
                            objArr = superPassProofItemsUIStateArr;
                            objArr2 = objArr;
                            objArr[i4] = objS;
                            arrayListB0 = CollectionsKt.b0(objArr2);
                            if (superPassProofOverviewDataState3.f8466a) {
                                if (superPassProofOverviewDataState3.b) {
                                    list2 = superPassProofOverviewDataState3.g;
                                    if (list2 != null) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                List list11116 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                mapD = superPassProofOverviewDataState3.i;
                                if (mapD == null) {
                                    mapD = MapsKt.d();
                                }
                                boolean z1113 = superPassProofOverviewDataState3.b;
                                List list11117 = superPassProofOverviewDataState3.g;
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                objS = B(list11116, mapD, z1113, list11117, superPassProofOverviewViewModel$convertToUiState$2);
                                if (objS != coroutineSingletons) {
                                    confirmationDialogUiState3 = confirmationDialogUiState;
                                    list4 = arrayListB0;
                                    list5 = list4;
                                    enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                    superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                    toolbarUIState5 = toolbarUIState2;
                                    list4.addAll((Collection) objS);
                                    list3 = list5;
                                    confirmationDialogUiState2 = confirmationDialogUiState3;
                                    toolbarUIState4 = toolbarUIState5;
                                    enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                    superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                }
                            } else {
                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                toolbarUIState4 = toolbarUIState2;
                                confirmationDialogUiState2 = confirmationDialogUiState;
                                enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                list3 = arrayListB0;
                            }
                            return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                i2 = superPassProofOverviewViewModel$convertToUiState$2.I$0;
                superPassProofOverviewConsentUIState = (SuperPassProofOverviewConsentUIState) superPassProofOverviewViewModel$convertToUiState$2.L$3;
                superPassProofOverviewViewModel = (SuperPassProofOverviewViewModel) superPassProofOverviewViewModel$convertToUiState$2.L$2;
                toolbarUIState = (ToolbarUIState) superPassProofOverviewViewModel$convertToUiState$2.L$1;
                superPassProofOverviewDataState2 = (SuperPassProofOverviewDataState) superPassProofOverviewViewModel$convertToUiState$2.L$0;
                ResultKt.b(objS);
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                str = (String) objS;
                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                superPassProofOverviewViewModel$convertToUiState$2.L$2 = null;
                superPassProofOverviewViewModel$convertToUiState$2.L$3 = null;
                superPassProofOverviewViewModel$convertToUiState$2.label = 4;
                objS = superPassProofOverviewViewModel.s(z, superPassProofOverviewConsentUIState, str, superPassProofOverviewViewModel$convertToUiState$2);
                if (objS != coroutineSingletons) {
                    superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) objS;
                    enlargeProofImage = superPassProofOverviewDataState2.o;
                    if (enlargeProofImage == null) {
                        enlargedProofImageUIState = null;
                    } else {
                        SuperProofImageUIState superProofImageUIState8 = new SuperProofImageUIState(enlargeProofImage.f8455a, bitmapImage, UiEventHandler.Companion.a(new eg1(this, 6)), UIContentScale.Fit, 16);
                        EnlargeProofImageEventHandler.f8456a.getClass();
                        enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState8, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
                    }
                    if (superPassProofOverviewDataState2.j) {
                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                        dialogUIStateFactory = DialogUIStateFactory.f9989a;
                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory;
                        superPassProofOverviewViewModel$convertToUiState$2.label = 5;
                        objS = stringProvider.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                        if (objS != coroutineSingletons) {
                            dialogUIStateFactory2 = dialogUIStateFactory;
                            str2 = (String) objS;
                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = str2;
                            superPassProofOverviewViewModel$convertToUiState$2.label = 6;
                            objB3 = stringProvider.b(StringEnum.SETTINGS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                            if (objB3 != coroutineSingletons) {
                                EnlargedProofImageUIState enlargedProofImageUIState13 = enlargedProofImageUIState;
                                str3 = str2;
                                objS = objB3;
                                superPassProofOverviewDataState4 = superPassProofOverviewDataState2;
                                toolbarUIState3 = toolbarUIState;
                                superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                                enlargedProofImageUIState3 = enlargedProofImageUIState13;
                                str4 = (String) objS;
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState4;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState3;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState3;
                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = str3;
                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = str4;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 7;
                                objB4 = stringProvider.b(StringEnum.CANCEL, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                                if (objB4 != coroutineSingletons) {
                                    str5 = str4;
                                    objS = objB4;
                                    dialogUIStateFactory3 = dialogUIStateFactory2;
                                    String str1114 = str3;
                                    String str1115 = (String) objS;
                                    eg1 eg1Var15 = new eg1(this, 0);
                                    eg1 eg1Var16 = new eg1(this, 1);
                                    dialogUIStateFactory3.getClass();
                                    confirmationDialogUiStateB = DialogUIStateFactory.b(null, str1114, str5, str1115, eg1Var15, eg1Var16);
                                    superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                                    toolbarUIState2 = toolbarUIState3;
                                    superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                                    enlargedProofImageUIState2 = enlargedProofImageUIState3;
                                    superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                    boolean z1114 = superPassProofOverviewDataState3.e;
                                    if (superPassProofOverviewDataState3.b) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    List list11118 = superPassProofOverviewDataState3.f;
                                    ProfileRejectionReason profileRejectionReason15 = superPassProofOverviewDataState3.h;
                                    String str1116 = superPassProofOverviewDataState3.d;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                    superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                    superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                    objS = u(z1114, z2, list11118, profileRejectionReason15, str1116, superPassProofOverviewViewModel$convertToUiState$2);
                                    superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                    if (objS != coroutineSingletons) {
                                        confirmationDialogUiState = confirmationDialogUiStateB;
                                        i4 = 0;
                                        objArr = superPassProofItemsUIStateArr;
                                        objArr2 = objArr;
                                        objArr[i4] = objS;
                                        arrayListB0 = CollectionsKt.b0(objArr2);
                                        if (superPassProofOverviewDataState3.f8466a) {
                                            if (superPassProofOverviewDataState3.b) {
                                                list2 = superPassProofOverviewDataState3.g;
                                                if (list2 != null) {
                                                    z4 = true;
                                                } else {
                                                    z4 = true;
                                                }
                                                if (!z4) {
                                                    z3 = false;
                                                }
                                            }
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            List list11119 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                            mapD = superPassProofOverviewDataState3.i;
                                            if (mapD == null) {
                                                mapD = MapsKt.d();
                                            }
                                            boolean z1115 = superPassProofOverviewDataState3.b;
                                            List list111110 = superPassProofOverviewDataState3.g;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                            superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                            objS = B(list11119, mapD, z1115, list111110, superPassProofOverviewViewModel$convertToUiState$2);
                                            if (objS != coroutineSingletons) {
                                                confirmationDialogUiState3 = confirmationDialogUiState;
                                                list4 = arrayListB0;
                                                list5 = list4;
                                                enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                                superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                                toolbarUIState5 = toolbarUIState2;
                                                list4.addAll((Collection) objS);
                                                list3 = list5;
                                                confirmationDialogUiState2 = confirmationDialogUiState3;
                                                toolbarUIState4 = toolbarUIState5;
                                                enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                            }
                                        } else {
                                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                            toolbarUIState4 = toolbarUIState2;
                                            confirmationDialogUiState2 = confirmationDialogUiState;
                                            enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                            list3 = arrayListB0;
                                        }
                                        return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                    }
                                }
                            }
                        }
                    } else {
                        toolbarUIState2 = toolbarUIState;
                        superPassProofOverviewDataState3 = superPassProofOverviewDataState2;
                        confirmationDialogUiStateB = null;
                        enlargedProofImageUIState2 = enlargedProofImageUIState;
                        superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                        superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                        boolean z1116 = superPassProofOverviewDataState3.e;
                        if (superPassProofOverviewDataState3.b) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        List list111111 = superPassProofOverviewDataState3.f;
                        ProfileRejectionReason profileRejectionReason16 = superPassProofOverviewDataState3.h;
                        String str1117 = superPassProofOverviewDataState3.d;
                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                        superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                        superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                        objS = u(z1116, z2, list111111, profileRejectionReason16, str1117, superPassProofOverviewViewModel$convertToUiState$2);
                        superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                        if (objS != coroutineSingletons) {
                            confirmationDialogUiState = confirmationDialogUiStateB;
                            i4 = 0;
                            objArr = superPassProofItemsUIStateArr;
                            objArr2 = objArr;
                            objArr[i4] = objS;
                            arrayListB0 = CollectionsKt.b0(objArr2);
                            if (superPassProofOverviewDataState3.f8466a) {
                                if (superPassProofOverviewDataState3.b) {
                                    list2 = superPassProofOverviewDataState3.g;
                                    if (list2 != null) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                List list111112 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                mapD = superPassProofOverviewDataState3.i;
                                if (mapD == null) {
                                    mapD = MapsKt.d();
                                }
                                boolean z1117 = superPassProofOverviewDataState3.b;
                                List list111113 = superPassProofOverviewDataState3.g;
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                objS = B(list111112, mapD, z1117, list111113, superPassProofOverviewViewModel$convertToUiState$2);
                                if (objS != coroutineSingletons) {
                                    confirmationDialogUiState3 = confirmationDialogUiState;
                                    list4 = arrayListB0;
                                    list5 = list4;
                                    enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                    superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                    toolbarUIState5 = toolbarUIState2;
                                    list4.addAll((Collection) objS);
                                    list3 = list5;
                                    confirmationDialogUiState2 = confirmationDialogUiState3;
                                    toolbarUIState4 = toolbarUIState5;
                                    enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                    superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                }
                            } else {
                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                toolbarUIState4 = toolbarUIState2;
                                confirmationDialogUiState2 = confirmationDialogUiState;
                                enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                list3 = arrayListB0;
                            }
                            return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                ToolbarUIState toolbarUIState8 = (ToolbarUIState) superPassProofOverviewViewModel$convertToUiState$2.L$1;
                SuperPassProofOverviewDataState superPassProofOverviewDataState7 = (SuperPassProofOverviewDataState) superPassProofOverviewViewModel$convertToUiState$2.L$0;
                ResultKt.b(objS);
                toolbarUIState = toolbarUIState8;
                superPassProofOverviewDataState2 = superPassProofOverviewDataState7;
                superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) objS;
                enlargeProofImage = superPassProofOverviewDataState2.o;
                if (enlargeProofImage == null) {
                    enlargedProofImageUIState = null;
                } else {
                    SuperProofImageUIState superProofImageUIState9 = new SuperProofImageUIState(enlargeProofImage.f8455a, bitmapImage, UiEventHandler.Companion.a(new eg1(this, 6)), UIContentScale.Fit, 16);
                    EnlargeProofImageEventHandler.f8456a.getClass();
                    enlargedProofImageUIState = new EnlargedProofImageUIState(superProofImageUIState9, (EnlargeProofImageEventHandler) EnlargeProofImageEventHandler.Companion.b.getValue());
                }
                if (superPassProofOverviewDataState2.j) {
                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                    dialogUIStateFactory = DialogUIStateFactory.f9989a;
                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory;
                    superPassProofOverviewViewModel$convertToUiState$2.label = 5;
                    objS = stringProvider.b(StringEnum.CAMERA_STORAGE_PROMPT, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                    if (objS != coroutineSingletons) {
                        dialogUIStateFactory2 = dialogUIStateFactory;
                        str2 = (String) objS;
                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = str2;
                        superPassProofOverviewViewModel$convertToUiState$2.label = 6;
                        objB3 = stringProvider.b(StringEnum.SETTINGS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                        if (objB3 != coroutineSingletons) {
                            EnlargedProofImageUIState enlargedProofImageUIState14 = enlargedProofImageUIState;
                            str3 = str2;
                            objS = objB3;
                            superPassProofOverviewDataState4 = superPassProofOverviewDataState2;
                            toolbarUIState3 = toolbarUIState;
                            superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                            enlargedProofImageUIState3 = enlargedProofImageUIState14;
                            str4 = (String) objS;
                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState4;
                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState3;
                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState3;
                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = str3;
                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = str4;
                            superPassProofOverviewViewModel$convertToUiState$2.label = 7;
                            objB4 = stringProvider.b(StringEnum.CANCEL, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                            if (objB4 != coroutineSingletons) {
                                str5 = str4;
                                objS = objB4;
                                dialogUIStateFactory3 = dialogUIStateFactory2;
                                String str1118 = str3;
                                String str1119 = (String) objS;
                                eg1 eg1Var17 = new eg1(this, 0);
                                eg1 eg1Var18 = new eg1(this, 1);
                                dialogUIStateFactory3.getClass();
                                confirmationDialogUiStateB = DialogUIStateFactory.b(null, str1118, str5, str1119, eg1Var17, eg1Var18);
                                superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                                toolbarUIState2 = toolbarUIState3;
                                superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                                enlargedProofImageUIState2 = enlargedProofImageUIState3;
                                superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                                boolean z1118 = superPassProofOverviewDataState3.e;
                                if (superPassProofOverviewDataState3.b) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                List list111114 = superPassProofOverviewDataState3.f;
                                ProfileRejectionReason profileRejectionReason17 = superPassProofOverviewDataState3.h;
                                String str11110 = superPassProofOverviewDataState3.d;
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                                superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                                objS = u(z1118, z2, list111114, profileRejectionReason17, str11110, superPassProofOverviewViewModel$convertToUiState$2);
                                superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                                if (objS != coroutineSingletons) {
                                    confirmationDialogUiState = confirmationDialogUiStateB;
                                    i4 = 0;
                                    objArr = superPassProofItemsUIStateArr;
                                    objArr2 = objArr;
                                    objArr[i4] = objS;
                                    arrayListB0 = CollectionsKt.b0(objArr2);
                                    if (superPassProofOverviewDataState3.f8466a) {
                                        if (superPassProofOverviewDataState3.b) {
                                            list2 = superPassProofOverviewDataState3.g;
                                            if (list2 != null) {
                                                z4 = true;
                                            } else {
                                                z4 = true;
                                            }
                                            if (!z4) {
                                                z3 = false;
                                            }
                                        }
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        List list111115 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                        mapD = superPassProofOverviewDataState3.i;
                                        if (mapD == null) {
                                            mapD = MapsKt.d();
                                        }
                                        boolean z1119 = superPassProofOverviewDataState3.b;
                                        List list111116 = superPassProofOverviewDataState3.g;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                        superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                        objS = B(list111115, mapD, z1119, list111116, superPassProofOverviewViewModel$convertToUiState$2);
                                        if (objS != coroutineSingletons) {
                                            confirmationDialogUiState3 = confirmationDialogUiState;
                                            list4 = arrayListB0;
                                            list5 = list4;
                                            enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                            superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                            toolbarUIState5 = toolbarUIState2;
                                            list4.addAll((Collection) objS);
                                            list3 = list5;
                                            confirmationDialogUiState2 = confirmationDialogUiState3;
                                            toolbarUIState4 = toolbarUIState5;
                                            enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                        }
                                    } else {
                                        superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                        toolbarUIState4 = toolbarUIState2;
                                        confirmationDialogUiState2 = confirmationDialogUiState;
                                        enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                        list3 = arrayListB0;
                                    }
                                    return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                                }
                            }
                        }
                    }
                } else {
                    toolbarUIState2 = toolbarUIState;
                    superPassProofOverviewDataState3 = superPassProofOverviewDataState2;
                    confirmationDialogUiStateB = null;
                    enlargedProofImageUIState2 = enlargedProofImageUIState;
                    superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState;
                    superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                    boolean z11110 = superPassProofOverviewDataState3.e;
                    if (superPassProofOverviewDataState3.b) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    List list111117 = superPassProofOverviewDataState3.f;
                    ProfileRejectionReason profileRejectionReason18 = superPassProofOverviewDataState3.h;
                    String str11111 = superPassProofOverviewDataState3.d;
                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                    superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                    superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                    objS = u(z11110, z2, list111117, profileRejectionReason18, str11111, superPassProofOverviewViewModel$convertToUiState$2);
                    superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                    if (objS != coroutineSingletons) {
                        confirmationDialogUiState = confirmationDialogUiStateB;
                        i4 = 0;
                        objArr = superPassProofItemsUIStateArr;
                        objArr2 = objArr;
                        objArr[i4] = objS;
                        arrayListB0 = CollectionsKt.b0(objArr2);
                        if (superPassProofOverviewDataState3.f8466a) {
                            if (superPassProofOverviewDataState3.b) {
                                list2 = superPassProofOverviewDataState3.g;
                                if (list2 != null) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (!z4) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            List list111118 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                            mapD = superPassProofOverviewDataState3.i;
                            if (mapD == null) {
                                mapD = MapsKt.d();
                            }
                            boolean z11111 = superPassProofOverviewDataState3.b;
                            List list111119 = superPassProofOverviewDataState3.g;
                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                            superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                            objS = B(list111118, mapD, z11111, list111119, superPassProofOverviewViewModel$convertToUiState$2);
                            if (objS != coroutineSingletons) {
                                confirmationDialogUiState3 = confirmationDialogUiState;
                                list4 = arrayListB0;
                                list5 = list4;
                                enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                toolbarUIState5 = toolbarUIState2;
                                list4.addAll((Collection) objS);
                                list3 = list5;
                                confirmationDialogUiState2 = confirmationDialogUiState3;
                                toolbarUIState4 = toolbarUIState5;
                                enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                            }
                        } else {
                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                            toolbarUIState4 = toolbarUIState2;
                            confirmationDialogUiState2 = confirmationDialogUiState;
                            enlargedProofImageUIState4 = enlargedProofImageUIState2;
                            list3 = arrayListB0;
                        }
                        return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                    }
                }
                return coroutineSingletons;
            case 5:
                dialogUIStateFactory2 = (DialogUIStateFactory) superPassProofOverviewViewModel$convertToUiState$2.L$4;
                enlargedProofImageUIState = (EnlargedProofImageUIState) superPassProofOverviewViewModel$convertToUiState$2.L$3;
                superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) superPassProofOverviewViewModel$convertToUiState$2.L$2;
                toolbarUIState = (ToolbarUIState) superPassProofOverviewViewModel$convertToUiState$2.L$1;
                superPassProofOverviewDataState2 = (SuperPassProofOverviewDataState) superPassProofOverviewViewModel$convertToUiState$2.L$0;
                ResultKt.b(objS);
                str2 = (String) objS;
                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState2;
                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState;
                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState;
                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState;
                superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                superPassProofOverviewViewModel$convertToUiState$2.L$5 = str2;
                superPassProofOverviewViewModel$convertToUiState$2.label = 6;
                objB3 = stringProvider.b(StringEnum.SETTINGS, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                if (objB3 != coroutineSingletons) {
                    EnlargedProofImageUIState enlargedProofImageUIState15 = enlargedProofImageUIState;
                    str3 = str2;
                    objS = objB3;
                    superPassProofOverviewDataState4 = superPassProofOverviewDataState2;
                    toolbarUIState3 = toolbarUIState;
                    superPassProofOverviewNextBtnUIState3 = superPassProofOverviewNextBtnUIState;
                    enlargedProofImageUIState3 = enlargedProofImageUIState15;
                    str4 = (String) objS;
                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState4;
                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState3;
                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState3;
                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = str3;
                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = str4;
                    superPassProofOverviewViewModel$convertToUiState$2.label = 7;
                    objB4 = stringProvider.b(StringEnum.CANCEL, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                    if (objB4 != coroutineSingletons) {
                        str5 = str4;
                        objS = objB4;
                        dialogUIStateFactory3 = dialogUIStateFactory2;
                        String str11112 = str3;
                        String str11113 = (String) objS;
                        eg1 eg1Var19 = new eg1(this, 0);
                        eg1 eg1Var110 = new eg1(this, 1);
                        dialogUIStateFactory3.getClass();
                        confirmationDialogUiStateB = DialogUIStateFactory.b(null, str11112, str5, str11113, eg1Var19, eg1Var110);
                        superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                        toolbarUIState2 = toolbarUIState3;
                        superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                        enlargedProofImageUIState2 = enlargedProofImageUIState3;
                        superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                        boolean z11112 = superPassProofOverviewDataState3.e;
                        if (superPassProofOverviewDataState3.b) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        List list1111110 = superPassProofOverviewDataState3.f;
                        ProfileRejectionReason profileRejectionReason19 = superPassProofOverviewDataState3.h;
                        String str11114 = superPassProofOverviewDataState3.d;
                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                        superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                        superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                        objS = u(z11112, z2, list1111110, profileRejectionReason19, str11114, superPassProofOverviewViewModel$convertToUiState$2);
                        superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                        if (objS != coroutineSingletons) {
                            confirmationDialogUiState = confirmationDialogUiStateB;
                            i4 = 0;
                            objArr = superPassProofItemsUIStateArr;
                            objArr2 = objArr;
                            objArr[i4] = objS;
                            arrayListB0 = CollectionsKt.b0(objArr2);
                            if (superPassProofOverviewDataState3.f8466a) {
                                if (superPassProofOverviewDataState3.b) {
                                    list2 = superPassProofOverviewDataState3.g;
                                    if (list2 != null) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    if (!z4) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                List list1111111 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                                mapD = superPassProofOverviewDataState3.i;
                                if (mapD == null) {
                                    mapD = MapsKt.d();
                                }
                                boolean z11113 = superPassProofOverviewDataState3.b;
                                List list1111112 = superPassProofOverviewDataState3.g;
                                superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                                superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                                superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                                superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                                superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                                superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                                objS = B(list1111111, mapD, z11113, list1111112, superPassProofOverviewViewModel$convertToUiState$2);
                                if (objS != coroutineSingletons) {
                                    confirmationDialogUiState3 = confirmationDialogUiState;
                                    list4 = arrayListB0;
                                    list5 = list4;
                                    enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                    superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                    toolbarUIState5 = toolbarUIState2;
                                    list4.addAll((Collection) objS);
                                    list3 = list5;
                                    confirmationDialogUiState2 = confirmationDialogUiState3;
                                    toolbarUIState4 = toolbarUIState5;
                                    enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                    superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                                }
                            } else {
                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                                toolbarUIState4 = toolbarUIState2;
                                confirmationDialogUiState2 = confirmationDialogUiState;
                                enlargedProofImageUIState4 = enlargedProofImageUIState2;
                                list3 = arrayListB0;
                            }
                            return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                String str20 = (String) superPassProofOverviewViewModel$convertToUiState$2.L$5;
                DialogUIStateFactory dialogUIStateFactory4 = (DialogUIStateFactory) superPassProofOverviewViewModel$convertToUiState$2.L$4;
                enlargedProofImageUIState3 = (EnlargedProofImageUIState) superPassProofOverviewViewModel$convertToUiState$2.L$3;
                superPassProofOverviewNextBtnUIState3 = (SuperPassProofOverviewNextBtnUIState) superPassProofOverviewViewModel$convertToUiState$2.L$2;
                toolbarUIState3 = (ToolbarUIState) superPassProofOverviewViewModel$convertToUiState$2.L$1;
                superPassProofOverviewDataState4 = (SuperPassProofOverviewDataState) superPassProofOverviewViewModel$convertToUiState$2.L$0;
                ResultKt.b(objS);
                str3 = str20;
                dialogUIStateFactory2 = dialogUIStateFactory4;
                str4 = (String) objS;
                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState4;
                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState3;
                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState3;
                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState3;
                superPassProofOverviewViewModel$convertToUiState$2.L$4 = dialogUIStateFactory2;
                superPassProofOverviewViewModel$convertToUiState$2.L$5 = str3;
                superPassProofOverviewViewModel$convertToUiState$2.L$6 = str4;
                superPassProofOverviewViewModel$convertToUiState$2.label = 7;
                objB4 = stringProvider.b(StringEnum.CANCEL, new Object[0], superPassProofOverviewViewModel$convertToUiState$2);
                if (objB4 != coroutineSingletons) {
                    str5 = str4;
                    objS = objB4;
                    dialogUIStateFactory3 = dialogUIStateFactory2;
                    String str11115 = str3;
                    String str11116 = (String) objS;
                    eg1 eg1Var111 = new eg1(this, 0);
                    eg1 eg1Var112 = new eg1(this, 1);
                    dialogUIStateFactory3.getClass();
                    confirmationDialogUiStateB = DialogUIStateFactory.b(null, str11115, str5, str11116, eg1Var111, eg1Var112);
                    superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                    toolbarUIState2 = toolbarUIState3;
                    superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                    enlargedProofImageUIState2 = enlargedProofImageUIState3;
                    superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                    boolean z11114 = superPassProofOverviewDataState3.e;
                    if (superPassProofOverviewDataState3.b) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    List list1111113 = superPassProofOverviewDataState3.f;
                    ProfileRejectionReason profileRejectionReason110 = superPassProofOverviewDataState3.h;
                    String str11117 = superPassProofOverviewDataState3.d;
                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                    superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                    superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                    objS = u(z11114, z2, list1111113, profileRejectionReason110, str11117, superPassProofOverviewViewModel$convertToUiState$2);
                    superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                    if (objS != coroutineSingletons) {
                        confirmationDialogUiState = confirmationDialogUiStateB;
                        i4 = 0;
                        objArr = superPassProofItemsUIStateArr;
                        objArr2 = objArr;
                        objArr[i4] = objS;
                        arrayListB0 = CollectionsKt.b0(objArr2);
                        if (superPassProofOverviewDataState3.f8466a) {
                            if (superPassProofOverviewDataState3.b) {
                                list2 = superPassProofOverviewDataState3.g;
                                if (list2 != null) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (!z4) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            List list1111114 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                            mapD = superPassProofOverviewDataState3.i;
                            if (mapD == null) {
                                mapD = MapsKt.d();
                            }
                            boolean z11115 = superPassProofOverviewDataState3.b;
                            List list1111115 = superPassProofOverviewDataState3.g;
                            superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                            superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                            superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                            superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                            superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                            superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                            objS = B(list1111114, mapD, z11115, list1111115, superPassProofOverviewViewModel$convertToUiState$2);
                            if (objS != coroutineSingletons) {
                                confirmationDialogUiState3 = confirmationDialogUiState;
                                list4 = arrayListB0;
                                list5 = list4;
                                enlargedProofImageUIState5 = enlargedProofImageUIState2;
                                superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                                toolbarUIState5 = toolbarUIState2;
                                list4.addAll((Collection) objS);
                                list3 = list5;
                                confirmationDialogUiState2 = confirmationDialogUiState3;
                                toolbarUIState4 = toolbarUIState5;
                                enlargedProofImageUIState4 = enlargedProofImageUIState5;
                                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                            }
                        } else {
                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                            toolbarUIState4 = toolbarUIState2;
                            confirmationDialogUiState2 = confirmationDialogUiState;
                            enlargedProofImageUIState4 = enlargedProofImageUIState2;
                            list3 = arrayListB0;
                        }
                        return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                    }
                }
                return coroutineSingletons;
            case 7:
                String str21 = (String) superPassProofOverviewViewModel$convertToUiState$2.L$6;
                str3 = (String) superPassProofOverviewViewModel$convertToUiState$2.L$5;
                dialogUIStateFactory3 = (DialogUIStateFactory) superPassProofOverviewViewModel$convertToUiState$2.L$4;
                enlargedProofImageUIState3 = (EnlargedProofImageUIState) superPassProofOverviewViewModel$convertToUiState$2.L$3;
                superPassProofOverviewNextBtnUIState3 = (SuperPassProofOverviewNextBtnUIState) superPassProofOverviewViewModel$convertToUiState$2.L$2;
                toolbarUIState3 = (ToolbarUIState) superPassProofOverviewViewModel$convertToUiState$2.L$1;
                superPassProofOverviewDataState4 = (SuperPassProofOverviewDataState) superPassProofOverviewViewModel$convertToUiState$2.L$0;
                ResultKt.b(objS);
                str5 = str21;
                String str11118 = str3;
                String str11119 = (String) objS;
                eg1 eg1Var113 = new eg1(this, 0);
                eg1 eg1Var114 = new eg1(this, 1);
                dialogUIStateFactory3.getClass();
                confirmationDialogUiStateB = DialogUIStateFactory.b(null, str11118, str5, str11119, eg1Var113, eg1Var114);
                superPassProofOverviewDataState3 = superPassProofOverviewDataState4;
                toolbarUIState2 = toolbarUIState3;
                superPassProofOverviewNextBtnUIState2 = superPassProofOverviewNextBtnUIState3;
                enlargedProofImageUIState2 = enlargedProofImageUIState3;
                superPassProofItemsUIStateArr = new SuperPassProofItemsUIState[1];
                boolean z11116 = superPassProofOverviewDataState3.e;
                if (superPassProofOverviewDataState3.b) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                List list1111116 = superPassProofOverviewDataState3.f;
                ProfileRejectionReason profileRejectionReason111 = superPassProofOverviewDataState3.h;
                String str111110 = superPassProofOverviewDataState3.d;
                superPassProofOverviewViewModel$convertToUiState$2.L$0 = superPassProofOverviewDataState3;
                superPassProofOverviewViewModel$convertToUiState$2.L$1 = toolbarUIState2;
                superPassProofOverviewViewModel$convertToUiState$2.L$2 = superPassProofOverviewNextBtnUIState2;
                superPassProofOverviewViewModel$convertToUiState$2.L$3 = enlargedProofImageUIState2;
                superPassProofOverviewViewModel$convertToUiState$2.L$4 = confirmationDialogUiStateB;
                superPassProofOverviewViewModel$convertToUiState$2.L$5 = superPassProofItemsUIStateArr;
                superPassProofOverviewViewModel$convertToUiState$2.L$6 = superPassProofItemsUIStateArr;
                superPassProofOverviewViewModel$convertToUiState$2.I$0 = 0;
                superPassProofOverviewViewModel$convertToUiState$2.label = 8;
                objS = u(z11116, z2, list1111116, profileRejectionReason111, str111110, superPassProofOverviewViewModel$convertToUiState$2);
                superPassProofOverviewViewModel$convertToUiState$2 = superPassProofOverviewViewModel$convertToUiState$2;
                if (objS != coroutineSingletons) {
                    confirmationDialogUiState = confirmationDialogUiStateB;
                    i4 = 0;
                    objArr = superPassProofItemsUIStateArr;
                    objArr2 = objArr;
                    objArr[i4] = objS;
                    arrayListB0 = CollectionsKt.b0(objArr2);
                    if (superPassProofOverviewDataState3.f8466a) {
                        if (superPassProofOverviewDataState3.b) {
                            list2 = superPassProofOverviewDataState3.g;
                            if (list2 != null) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (!z4) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        List list1111117 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                        mapD = superPassProofOverviewDataState3.i;
                        if (mapD == null) {
                            mapD = MapsKt.d();
                        }
                        boolean z11117 = superPassProofOverviewDataState3.b;
                        List list1111118 = superPassProofOverviewDataState3.g;
                        superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                        superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                        superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                        superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                        superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                        superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                        objS = B(list1111117, mapD, z11117, list1111118, superPassProofOverviewViewModel$convertToUiState$2);
                        if (objS != coroutineSingletons) {
                            confirmationDialogUiState3 = confirmationDialogUiState;
                            list4 = arrayListB0;
                            list5 = list4;
                            enlargedProofImageUIState5 = enlargedProofImageUIState2;
                            superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                            toolbarUIState5 = toolbarUIState2;
                            list4.addAll((Collection) objS);
                            list3 = list5;
                            confirmationDialogUiState2 = confirmationDialogUiState3;
                            toolbarUIState4 = toolbarUIState5;
                            enlargedProofImageUIState4 = enlargedProofImageUIState5;
                            superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                        }
                    } else {
                        superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                        toolbarUIState4 = toolbarUIState2;
                        confirmationDialogUiState2 = confirmationDialogUiState;
                        enlargedProofImageUIState4 = enlargedProofImageUIState2;
                        list3 = arrayListB0;
                    }
                    return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
                }
                return coroutineSingletons;
            case 8:
                i4 = superPassProofOverviewViewModel$convertToUiState$2.I$0;
                objArr = (SuperPassProofItemsUIState[]) superPassProofOverviewViewModel$convertToUiState$2.L$6;
                objArr2 = (SuperPassProofItemsUIState[]) superPassProofOverviewViewModel$convertToUiState$2.L$5;
                confirmationDialogUiState = (ConfirmationDialogUiState) superPassProofOverviewViewModel$convertToUiState$2.L$4;
                enlargedProofImageUIState2 = (EnlargedProofImageUIState) superPassProofOverviewViewModel$convertToUiState$2.L$3;
                superPassProofOverviewNextBtnUIState2 = (SuperPassProofOverviewNextBtnUIState) superPassProofOverviewViewModel$convertToUiState$2.L$2;
                toolbarUIState2 = (ToolbarUIState) superPassProofOverviewViewModel$convertToUiState$2.L$1;
                superPassProofOverviewDataState3 = (SuperPassProofOverviewDataState) superPassProofOverviewViewModel$convertToUiState$2.L$0;
                ResultKt.b(objS);
                objArr[i4] = objS;
                arrayListB0 = CollectionsKt.b0(objArr2);
                if (superPassProofOverviewDataState3.f8466a) {
                    if (superPassProofOverviewDataState3.b) {
                        list2 = superPassProofOverviewDataState3.g;
                        if (list2 != null) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (!z4) {
                            z3 = false;
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    List list1111119 = ((SuperPassPurchaseSharedState) this.l.getF().getValue()).o;
                    mapD = superPassProofOverviewDataState3.i;
                    if (mapD == null) {
                        mapD = MapsKt.d();
                    }
                    boolean z11118 = superPassProofOverviewDataState3.b;
                    List list11111110 = superPassProofOverviewDataState3.g;
                    superPassProofOverviewViewModel$convertToUiState$2.L$0 = toolbarUIState2;
                    superPassProofOverviewViewModel$convertToUiState$2.L$1 = superPassProofOverviewNextBtnUIState2;
                    superPassProofOverviewViewModel$convertToUiState$2.L$2 = enlargedProofImageUIState2;
                    superPassProofOverviewViewModel$convertToUiState$2.L$3 = confirmationDialogUiState;
                    superPassProofOverviewViewModel$convertToUiState$2.L$4 = arrayListB0;
                    superPassProofOverviewViewModel$convertToUiState$2.L$5 = arrayListB0;
                    superPassProofOverviewViewModel$convertToUiState$2.L$6 = null;
                    superPassProofOverviewViewModel$convertToUiState$2.label = 9;
                    objS = B(list1111119, mapD, z11118, list11111110, superPassProofOverviewViewModel$convertToUiState$2);
                    if (objS != coroutineSingletons) {
                        confirmationDialogUiState3 = confirmationDialogUiState;
                        list4 = arrayListB0;
                        list5 = list4;
                        enlargedProofImageUIState5 = enlargedProofImageUIState2;
                        superPassProofOverviewNextBtnUIState5 = superPassProofOverviewNextBtnUIState2;
                        toolbarUIState5 = toolbarUIState2;
                        list4.addAll((Collection) objS);
                        list3 = list5;
                        confirmationDialogUiState2 = confirmationDialogUiState3;
                        toolbarUIState4 = toolbarUIState5;
                        enlargedProofImageUIState4 = enlargedProofImageUIState5;
                        superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                    }
                    return coroutineSingletons;
                }
                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState2;
                toolbarUIState4 = toolbarUIState2;
                confirmationDialogUiState2 = confirmationDialogUiState;
                enlargedProofImageUIState4 = enlargedProofImageUIState2;
                list3 = arrayListB0;
                return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
            case 9:
                list4 = (List) superPassProofOverviewViewModel$convertToUiState$2.L$5;
                list5 = (List) superPassProofOverviewViewModel$convertToUiState$2.L$4;
                confirmationDialogUiState3 = (ConfirmationDialogUiState) superPassProofOverviewViewModel$convertToUiState$2.L$3;
                enlargedProofImageUIState5 = (EnlargedProofImageUIState) superPassProofOverviewViewModel$convertToUiState$2.L$2;
                superPassProofOverviewNextBtnUIState5 = (SuperPassProofOverviewNextBtnUIState) superPassProofOverviewViewModel$convertToUiState$2.L$1;
                toolbarUIState5 = (ToolbarUIState) superPassProofOverviewViewModel$convertToUiState$2.L$0;
                ResultKt.b(objS);
                list4.addAll((Collection) objS);
                list3 = list5;
                confirmationDialogUiState2 = confirmationDialogUiState3;
                toolbarUIState4 = toolbarUIState5;
                enlargedProofImageUIState4 = enlargedProofImageUIState5;
                superPassProofOverviewNextBtnUIState4 = superPassProofOverviewNextBtnUIState5;
                return new SuperPassProofOverviewUIState(toolbarUIState4, superPassProofOverviewNextBtnUIState4, list3, enlargedProofImageUIState4, confirmationDialogUiState2);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object s(boolean z, SuperPassProofOverviewConsentUIState superPassProofOverviewConsentUIState, String str, ContinuationImpl continuationImpl) {
        SuperPassProofOverviewViewModel$nextBtn$1 superPassProofOverviewViewModel$nextBtn$1;
        ButtonUIState buttonUIState;
        SuperPassProofOverviewConsentUIState superPassProofOverviewConsentUIState2;
        if (continuationImpl instanceof SuperPassProofOverviewViewModel$nextBtn$1) {
            superPassProofOverviewViewModel$nextBtn$1 = (SuperPassProofOverviewViewModel$nextBtn$1) continuationImpl;
            int i = superPassProofOverviewViewModel$nextBtn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassProofOverviewViewModel$nextBtn$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassProofOverviewViewModel$nextBtn$1 = new SuperPassProofOverviewViewModel$nextBtn$1(this, continuationImpl);
            }
        } else {
            superPassProofOverviewViewModel$nextBtn$1 = new SuperPassProofOverviewViewModel$nextBtn$1(this, continuationImpl);
        }
        Object obj = superPassProofOverviewViewModel$nextBtn$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassProofOverviewViewModel$nextBtn$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ButtonUIState buttonUIStateG = ButtonUIStateFactory.g(ButtonUIStateFactory.f9921a, str, new eg1(this, 4), null, null, z, 0.0f, 44);
            superPassProofOverviewViewModel$nextBtn$1.L$0 = buttonUIStateG;
            superPassProofOverviewViewModel$nextBtn$1.L$1 = superPassProofOverviewConsentUIState;
            superPassProofOverviewViewModel$nextBtn$1.label = 1;
            Object objB = this.r.b(StringEnum.PROOF_OVERVIEW_INFO_TEXT, new Object[0], superPassProofOverviewViewModel$nextBtn$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            buttonUIState = buttonUIStateG;
            obj = objB;
            superPassProofOverviewConsentUIState2 = superPassProofOverviewConsentUIState;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassProofOverviewConsentUIState2 = (SuperPassProofOverviewConsentUIState) superPassProofOverviewViewModel$nextBtn$1.L$1;
            buttonUIState = (ButtonUIState) superPassProofOverviewViewModel$nextBtn$1.L$0;
            ResultKt.b(obj);
        }
        return new SuperPassProofOverviewNextBtnUIState(buttonUIState, superPassProofOverviewConsentUIState2, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }

    public final void t(SuperPassProofOverviewIntent superPassProofOverviewIntent) {
        Object value;
        SuperPassProofOverviewDataState it;
        Object value2;
        SuperPassProofOverviewDataState it2;
        Object value3;
        SuperPassProofOverviewDataState it3;
        Object value4;
        SuperPassProofOverviewDataState it4;
        PermissionHandler permissionHandlerC;
        Object value5;
        SuperPassProofOverviewDataState it5;
        String str;
        o(superPassProofOverviewIntent);
        boolean z = superPassProofOverviewIntent instanceof SuperPassProofOverviewIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new SuperPassProofOverviewViewModel$handleInitializationIntent$1(this, (SuperPassProofOverviewIntent.InitializationIntent) superPassProofOverviewIntent, null), 3);
            return;
        }
        boolean z2 = superPassProofOverviewIntent instanceof SuperPassProofOverviewIntent.NameEnteredIntent;
        MutableStateFlow mutableStateFlow = this.e;
        if (z2) {
            SuperPassProofOverviewIntent.NameEnteredIntent nameEnteredIntent = (SuperPassProofOverviewIntent.NameEnteredIntent) superPassProofOverviewIntent;
            do {
                value5 = mutableStateFlow.getValue();
                it5 = (SuperPassProofOverviewDataState) value5;
                Intrinsics.i(it5, "it");
                str = nameEnteredIntent.f8476a;
            } while (!mutableStateFlow.c(value5, SuperPassProofOverviewDataState.a(it5, false, false, false, str, false, null, null, null, null, false, false, StringsKt.u0(str).toString().length() > 0, false, false, null, 30711)));
            return;
        }
        boolean z3 = superPassProofOverviewIntent instanceof SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent;
        ChaloNavigationManager chaloNavigationManager = this.m;
        if (z3) {
            SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent addPhotoButtonClickedIntent = (SuperPassProofOverviewIntent.AddPhotoButtonClickedIntent) superPassProofOverviewIntent;
            if (addPhotoButtonClickedIntent.b) {
                C("proof guidelines btn clicked", new LinkedHashMap());
            } else {
                C("add photo btn clicked", new LinkedHashMap());
            }
            ProofDocumentProps.Companion companion = ProofDocumentProps.INSTANCE;
            ProofDocumentProps lProofDocumentProps = addPhotoButtonClickedIntent.f8467a;
            companion.getClass();
            Intrinsics.i(lProofDocumentProps, "lProofDocumentProps");
            String str2 = lProofDocumentProps.f9539a;
            String str3 = lProofDocumentProps.b;
            String str4 = lProofDocumentProps.c;
            String str5 = lProofDocumentProps.d;
            String str6 = lProofDocumentProps.e;
            String str7 = lProofDocumentProps.f;
            String str8 = lProofDocumentProps.g;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("~~~");
            sb.append(str3);
            sb.append("~~~");
            sb.append(str4);
            cb0.t(sb, "~~~", str5, "~~~", str6);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.ProofUploadInternalArgs(r30.i(sb, "~~~", str7, "~~~", str8)), null, null, 6));
            return;
        }
        boolean z4 = superPassProofOverviewIntent instanceof SuperPassProofOverviewIntent.CancelProofUploadButtonClicked;
        SuperPassProofUploadManager superPassProofUploadManager = this.l;
        if (z4) {
            ProofDocumentProps proofDocumentProps = ((SuperPassProofOverviewIntent.CancelProofUploadButtonClicked) superPassProofOverviewIntent).f8468a;
            C("cancel proof image upload clicked", MapsKt.k(new Pair("proofId", proofDocumentProps.f9539a)));
            superPassProofUploadManager.r(proofDocumentProps.f9539a);
            return;
        }
        if (superPassProofOverviewIntent instanceof SuperPassProofOverviewIntent.DownloadFormClicked) {
            ProofDocumentProps proofDocumentProps2 = ((SuperPassProofOverviewIntent.DownloadFormClicked) superPassProofOverviewIntent).f8472a;
            C("download sample form clicked", MapsKt.k(new Pair("url", String.valueOf(proofDocumentProps2.f))));
            this.o.a(proofDocumentProps2.f, null);
            return;
        }
        if (superPassProofOverviewIntent instanceof SuperPassProofOverviewIntent.EditPhotoButtonClicked) {
            SuperPassProofOverviewIntent.EditPhotoButtonClicked editPhotoButtonClicked = (SuperPassProofOverviewIntent.EditPhotoButtonClicked) superPassProofOverviewIntent;
            Job job = this.x;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            ImagePicker imagePickerC = this.q.c();
            if (imagePickerC == null || (permissionHandlerC = this.p.c()) == null) {
                return;
            }
            C("edit uploaded proof image clicked", MapsKt.k(new Pair("proofId", editPhotoButtonClicked.f8473a.f9539a)));
            this.x = BuildersKt.d(contextScope, null, null, new SuperPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1(imagePickerC, permissionHandlerC, this, editPhotoButtonClicked, null), 3);
            return;
        }
        if (superPassProofOverviewIntent.equals(SuperPassProofOverviewIntent.NextButtonClickedIntent.f8477a)) {
            StateFlow stateFlow = this.f;
            if (((SuperPassProofOverviewDataState) stateFlow.getValue()).f8466a) {
                C("userProofsOverview reapply clicked", new LinkedHashMap());
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ProductSelectionArgs(null, null, null, null, false, null, 255), new ChaloNavOptions(new PopUpToConfig.Finish(this.k), 3), null, 4));
                return;
            }
            C("userProofsOverview next clicked", MapsKt.k(new Pair("flow", String.valueOf(((SuperPassPurchaseSharedState) superPassProofUploadManager.getF().getValue()).d))));
            if (!((SuperPassProofOverviewDataState) stateFlow.getValue()).c && ((SuperPassProofOverviewDataState) stateFlow.getValue()).d.length() > 0) {
                superPassProofUploadManager.p(((SuperPassProofOverviewDataState) stateFlow.getValue()).d);
            }
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.INSTANCE, null, null, 6));
            return;
        }
        if (superPassProofOverviewIntent instanceof SuperPassProofOverviewIntent.EnlargeImageIntent) {
            SuperPassProofOverviewIntent.EnlargeImageIntent enlargeImageIntent = (SuperPassProofOverviewIntent.EnlargeImageIntent) superPassProofOverviewIntent;
            C("uploaded proof zoomed", MapsKt.k(new Pair("isRejectedProofImage", Boolean.valueOf(enlargeImageIntent.c))));
            do {
                value4 = mutableStateFlow.getValue();
                it4 = (SuperPassProofOverviewDataState) value4;
                Intrinsics.i(it4, "it");
            } while (!mutableStateFlow.c(value4, SuperPassProofOverviewDataState.a(it4, false, false, false, null, false, null, null, null, null, false, false, false, false, false, new EnlargeProofImage(enlargeImageIntent.f8474a, enlargeImageIntent.b), 16383)));
            return;
        }
        if (superPassProofOverviewIntent.equals(SuperPassProofOverviewIntent.ConsentCheckboxToggledIntent.f8469a)) {
            do {
                value3 = mutableStateFlow.getValue();
                it3 = (SuperPassProofOverviewDataState) value3;
                Intrinsics.i(it3, "it");
            } while (!mutableStateFlow.c(value3, SuperPassProofOverviewDataState.a(it3, false, false, false, null, false, null, null, null, null, false, false, false, false, !it3.n, null, 24575)));
            return;
        }
        if (superPassProofOverviewIntent.equals(SuperPassProofOverviewIntent.DismissEnlargeImageIntent.f8471a)) {
            do {
                value2 = mutableStateFlow.getValue();
                it2 = (SuperPassProofOverviewDataState) value2;
                Intrinsics.i(it2, "it");
            } while (!mutableStateFlow.c(value2, SuperPassProofOverviewDataState.a(it2, false, false, false, null, false, null, null, null, null, false, false, false, false, false, null, 16383)));
            return;
        }
        if (!superPassProofOverviewIntent.equals(SuperPassProofOverviewIntent.DismissCameraRationaleDialogIntent.f8470a)) {
            throw new NoWhenBranchMatchedException();
        }
        do {
            value = mutableStateFlow.getValue();
            it = (SuperPassProofOverviewDataState) value;
            Intrinsics.i(it, "it");
        } while (!mutableStateFlow.c(value, SuperPassProofOverviewDataState.a(it, false, false, false, null, false, null, null, null, null, false, false, false, false, false, null, 32255)));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x030a  */
    /* JADX WARN: Code duplicated, block: B:79:0x034c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0353 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0355  */
    /* JADX WARN: Code duplicated, block: B:87:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:89:0x041c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0429 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0444 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0326, code lost:
    
        if (r8 == r6) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [app.chalo.uistate.textField.UIImeActionHandler, app.chalo.uistate.textField.UIKeyboardType, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(boolean r38, boolean r39, java.util.List r40, app.chalo.superpass.data.models.entities.ProfileRejectionReason r41, java.lang.String r42, kotlin.coroutines.jvm.internal.ContinuationImpl r43) {
        /*
            Method dump skipped, instruction units count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel.u(boolean, boolean, java.util.List, app.chalo.superpass.data.models.entities.ProfileRejectionReason, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        if (r2 == r4) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(boolean r18, boolean r19, java.util.List r20, app.chalo.superpass.data.models.entities.ProfileRejectionReason r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel.w(boolean, boolean, java.util.List, app.chalo.superpass.data.models.entities.ProfileRejectionReason, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r2 == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r2 == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        if (r2 == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        if (r2 == r4) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(boolean r18, java.util.List r19, app.chalo.superpass.data.models.entities.ProfileRejectionReason r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$proofHeaderItemTitle$1
            if (r3 == 0) goto L19
            r3 = r2
            app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$proofHeaderItemTitle$1 r3 = (app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$proofHeaderItemTitle$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L1e
        L19:
            app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$proofHeaderItemTitle$1 r3 = new app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$proofHeaderItemTitle$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L4b
            if (r5 == r9) goto L47
            if (r5 == r8) goto L43
            if (r5 == r7) goto L3f
            if (r5 != r6) goto L37
            kotlin.ResultKt.b(r2)
            goto Laa
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3f:
            kotlin.ResultKt.b(r2)
            goto L9a
        L43:
            kotlin.ResultKt.b(r2)
            goto L88
        L47:
            kotlin.ResultKt.b(r2)
            goto L6b
        L4b:
            kotlin.ResultKt.b(r2)
            r2 = r19
            java.util.Collection r2 = (java.util.Collection) r2
            r5 = 0
            app.chalo.providers.stringprovider.StringProvider r10 = r0.r
            if (r2 == 0) goto L6f
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L5e
            goto L6f
        L5e:
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.PROOFS_REJECTED_TITLE
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r3.label = r9
            java.lang.Object r2 = r10.b(r1, r2, r3)
            if (r2 != r4) goto L6b
            goto La9
        L6b:
            java.lang.String r2 = (java.lang.String) r2
        L6d:
            r4 = r2
            goto Lad
        L6f:
            if (r1 == 0) goto L8b
            java.util.List r1 = r1.c
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L8b
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.PROOFS_REJECTED_TITLE
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r3.label = r8
            java.lang.Object r2 = r10.b(r1, r2, r3)
            if (r2 != r4) goto L88
            goto La9
        L88:
            java.lang.String r2 = (java.lang.String) r2
            goto L6d
        L8b:
            if (r18 == 0) goto L9d
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.PROOFS_REJECTED_TITLE
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r3.label = r7
            java.lang.Object r2 = r10.b(r1, r2, r3)
            if (r2 != r4) goto L9a
            goto La9
        L9a:
            java.lang.String r2 = (java.lang.String) r2
            goto L6d
        L9d:
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.PROOFS_OVERVIEW_FRAGMENT_TITLE
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r3.label = r6
            java.lang.Object r2 = r10.b(r1, r2, r3)
            if (r2 != r4) goto Laa
        La9:
            return r4
        Laa:
            java.lang.String r2 = (java.lang.String) r2
            goto L6d
        Lad:
            app.chalo.uistate.text.UITextStyle r5 = app.chalo.uistate.text.UITextStyle.DisplayMedium
            app.chalo.uistate.text.UIFontWeight r9 = app.chalo.uistate.text.UIFontWeight.Bold
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r3 = new app.chalo.uistate.text.TextUIState$ChaloTextUIState
            r15 = 0
            r16 = 8120(0x1fb8, float:1.1379E-41)
            app.chalo.uistate.base.ChaloColorToken$Black_87 r6 = app.chalo.uistate.base.ChaloColorToken.Black_87.f9768a
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel.x(boolean, java.util.List, app.chalo.superpass.data.models.entities.ProfileRejectionReason, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object y(ProofDocumentProps proofDocumentProps, ContinuationImpl continuationImpl) {
        SuperPassProofOverviewViewModel$proofImageDescription$1 superPassProofOverviewViewModel$proofImageDescription$1;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        Object objB;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        final ProofDocumentProps proofDocumentProps2 = proofDocumentProps;
        if (continuationImpl instanceof SuperPassProofOverviewViewModel$proofImageDescription$1) {
            superPassProofOverviewViewModel$proofImageDescription$1 = (SuperPassProofOverviewViewModel$proofImageDescription$1) continuationImpl;
            int i = superPassProofOverviewViewModel$proofImageDescription$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassProofOverviewViewModel$proofImageDescription$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassProofOverviewViewModel$proofImageDescription$1 = new SuperPassProofOverviewViewModel$proofImageDescription$1(this, continuationImpl);
            }
        } else {
            superPassProofOverviewViewModel$proofImageDescription$1 = new SuperPassProofOverviewViewModel$proofImageDescription$1(this, continuationImpl);
        }
        Object obj = superPassProofOverviewViewModel$proofImageDescription$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassProofOverviewViewModel$proofImageDescription$1.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.b(obj);
            int length = proofDocumentProps2.f.length();
            ChaloColorToken.Black_70 black_70 = ChaloColorToken.Black_70.f9767a;
            if (length <= 0) {
                if (proofDocumentProps2.c.length() > 0) {
                    return new TextUIState.ChaloTextUIState(proofDocumentProps2.c, UITextStyle.BodyMedium, black_70, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                }
                return null;
            }
            styledTextDataUIStateArr = new StyledTextDataUIState[2];
            styledTextDataUIStateArr[0] = new StyledTextDataUIState(proofDocumentProps2.c, black_70, null, UITextStyle.BodyMedium, null, null, null, 1012);
            superPassProofOverviewViewModel$proofImageDescription$1.L$0 = proofDocumentProps2;
            superPassProofOverviewViewModel$proofImageDescription$1.L$1 = styledTextDataUIStateArr;
            superPassProofOverviewViewModel$proofImageDescription$1.L$2 = styledTextDataUIStateArr;
            superPassProofOverviewViewModel$proofImageDescription$1.I$0 = 1;
            superPassProofOverviewViewModel$proofImageDescription$1.label = 1;
            objB = this.r.b(StringEnum.DOWNLOAD_FORM, new Object[0], superPassProofOverviewViewModel$proofImageDescription$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = superPassProofOverviewViewModel$proofImageDescription$1.I$0;
            StyledTextDataUIState[] styledTextDataUIStateArr3 = (StyledTextDataUIState[]) superPassProofOverviewViewModel$proofImageDescription$1.L$2;
            styledTextDataUIStateArr2 = (StyledTextDataUIState[]) superPassProofOverviewViewModel$proofImageDescription$1.L$1;
            ProofDocumentProps proofDocumentProps3 = (ProofDocumentProps) superPassProofOverviewViewModel$proofImageDescription$1.L$0;
            ResultKt.b(obj);
            styledTextDataUIStateArr = styledTextDataUIStateArr3;
            proofDocumentProps2 = proofDocumentProps3;
            objB = obj;
        }
        styledTextDataUIStateArr[i3] = new StyledTextDataUIState((String) objB, ChaloColorToken.OrangePrimary.f9835a, null, UITextStyle.BodyMedium, null, null, new StyledTextClickHandler(this) { // from class: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$proofImageDescription$2
            public final /* synthetic */ SuperPassProofOverviewViewModel b;

            {
                this.b = this;
            }

            @Override // app.chalo.uistate.text.StyledTextClickHandler
            public final void a() {
                this.b.t(new SuperPassProofOverviewIntent.DownloadFormClicked(proofDocumentProps2));
            }

            @Override // app.chalo.uistate.text.StyledTextClickHandler
            /* JADX INFO: renamed from: b */
            public final String getF10090a() {
                return proofDocumentProps2.f;
            }

            @Override // app.chalo.uistate.text.StyledTextClickHandler
            /* JADX INFO: renamed from: getTag */
            public final String getF10085a() {
                return "URL";
            }
        }, ServiceStarter.ERROR_UNKNOWN);
        return new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, null, 30);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x011f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0128  */
    /* JADX WARN: Code duplicated, block: B:37:0x0139  */
    /* JADX WARN: Code duplicated, block: B:40:0x013f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0146  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object z(ProofDocumentProps proofDocumentProps, ProofRejectionReason proofRejectionReason, boolean z, ProofUploadDetails proofUploadDetails, ContinuationImpl continuationImpl) {
        SuperPassProofOverviewViewModel$proofOverviewItem$1 superPassProofOverviewViewModel$proofOverviewItem$1;
        ProofUploadDetails proofUploadDetails2;
        ProofDocumentProps proofDocumentProps2;
        boolean z2;
        ProofRejectionReason proofRejectionReason2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState textUIState;
        TextUIState textUIState2;
        ProofUploadDetails proofUploadDetails3;
        SuperPassProofRejectionImageUIState superPassProofRejectionImageUIState;
        SuperPassProofRejectionReasonUIState superPassProofRejectionReasonUIState;
        Object objE;
        TextUIState textUIState3;
        SuperPassProofRejectionReasonUIState superPassProofRejectionReasonUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        DividerUIState dividerUIState;
        float f;
        if (continuationImpl instanceof SuperPassProofOverviewViewModel$proofOverviewItem$1) {
            superPassProofOverviewViewModel$proofOverviewItem$1 = (SuperPassProofOverviewViewModel$proofOverviewItem$1) continuationImpl;
            int i = superPassProofOverviewViewModel$proofOverviewItem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassProofOverviewViewModel$proofOverviewItem$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassProofOverviewViewModel$proofOverviewItem$1 = new SuperPassProofOverviewViewModel$proofOverviewItem$1(this, continuationImpl);
            }
        } else {
            superPassProofOverviewViewModel$proofOverviewItem$1 = new SuperPassProofOverviewViewModel$proofOverviewItem$1(this, continuationImpl);
        }
        Object obj = superPassProofOverviewViewModel$proofOverviewItem$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassProofOverviewViewModel$proofOverviewItem$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(proofDocumentProps.b, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            superPassProofOverviewViewModel$proofOverviewItem$1.L$0 = proofDocumentProps;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$1 = proofRejectionReason;
            proofUploadDetails2 = proofUploadDetails;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$2 = proofUploadDetails2;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$3 = chaloTextUIState3;
            superPassProofOverviewViewModel$proofOverviewItem$1.Z$0 = z;
            superPassProofOverviewViewModel$proofOverviewItem$1.label = 1;
            Object objY = y(proofDocumentProps, superPassProofOverviewViewModel$proofOverviewItem$1);
            if (objY != obj2) {
                proofDocumentProps2 = proofDocumentProps;
                z2 = z;
                proofRejectionReason2 = proofRejectionReason;
                obj = objY;
                chaloTextUIState = chaloTextUIState3;
            }
            return obj2;
        }
        if (i2 == 1) {
            z2 = superPassProofOverviewViewModel$proofOverviewItem$1.Z$0;
            TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) superPassProofOverviewViewModel$proofOverviewItem$1.L$3;
            ProofUploadDetails proofUploadDetails4 = (ProofUploadDetails) superPassProofOverviewViewModel$proofOverviewItem$1.L$2;
            proofRejectionReason2 = (ProofRejectionReason) superPassProofOverviewViewModel$proofOverviewItem$1.L$1;
            proofDocumentProps2 = (ProofDocumentProps) superPassProofOverviewViewModel$proofOverviewItem$1.L$0;
            ResultKt.b(obj);
            chaloTextUIState = chaloTextUIState4;
            proofUploadDetails2 = proofUploadDetails4;
        } else {
            if (i2 == 2) {
                z2 = superPassProofOverviewViewModel$proofOverviewItem$1.Z$0;
                superPassProofRejectionImageUIState = (SuperPassProofRejectionImageUIState) superPassProofOverviewViewModel$proofOverviewItem$1.L$4;
                textUIState2 = (TextUIState) superPassProofOverviewViewModel$proofOverviewItem$1.L$3;
                chaloTextUIState = (TextUIState.ChaloTextUIState) superPassProofOverviewViewModel$proofOverviewItem$1.L$2;
                proofUploadDetails3 = (ProofUploadDetails) superPassProofOverviewViewModel$proofOverviewItem$1.L$1;
                proofDocumentProps2 = (ProofDocumentProps) superPassProofOverviewViewModel$proofOverviewItem$1.L$0;
                ResultKt.b(obj);
                superPassProofRejectionReasonUIState = new SuperPassProofRejectionReasonUIState(superPassProofRejectionImageUIState, (TextUIState) obj);
                textUIState = textUIState2;
                proofUploadDetails2 = proofUploadDetails3;
                superPassProofOverviewViewModel$proofOverviewItem$1.L$0 = chaloTextUIState;
                superPassProofOverviewViewModel$proofOverviewItem$1.L$1 = textUIState;
                superPassProofOverviewViewModel$proofOverviewItem$1.L$2 = superPassProofRejectionReasonUIState;
                superPassProofOverviewViewModel$proofOverviewItem$1.L$3 = null;
                superPassProofOverviewViewModel$proofOverviewItem$1.L$4 = null;
                superPassProofOverviewViewModel$proofOverviewItem$1.Z$0 = z2;
                superPassProofOverviewViewModel$proofOverviewItem$1.label = 3;
                objE = E(proofUploadDetails2, proofDocumentProps2, superPassProofOverviewViewModel$proofOverviewItem$1);
                if (objE != obj2) {
                    textUIState3 = textUIState;
                    obj = objE;
                    superPassProofRejectionReasonUIState2 = superPassProofRejectionReasonUIState;
                    chaloTextUIState2 = chaloTextUIState;
                }
                return obj2;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = superPassProofOverviewViewModel$proofOverviewItem$1.Z$0;
            SuperPassProofRejectionReasonUIState superPassProofRejectionReasonUIState3 = (SuperPassProofRejectionReasonUIState) superPassProofOverviewViewModel$proofOverviewItem$1.L$2;
            TextUIState textUIState4 = (TextUIState) superPassProofOverviewViewModel$proofOverviewItem$1.L$1;
            TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) superPassProofOverviewViewModel$proofOverviewItem$1.L$0;
            ResultKt.b(obj);
            chaloTextUIState2 = chaloTextUIState5;
            superPassProofRejectionReasonUIState2 = superPassProofRejectionReasonUIState3;
            textUIState3 = textUIState4;
        }
        SuperPassProofUploadedImageUIState superPassProofUploadedImageUIState = (SuperPassProofUploadedImageUIState) obj;
        if (z2) {
            dividerUIState = null;
        } else {
            dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.TextFieldIndicator.f9859a, null, 4);
        }
        if (z2) {
            f = ChaloThemeHelper.a().v;
        } else {
            f = ChaloThemeHelper.a().f1916a;
        }
        return new SuperPassProofItemsUIState.ImageProof(new SuperPassProofImageUISpec(f), chaloTextUIState2, textUIState3, superPassProofRejectionReasonUIState2, superPassProofUploadedImageUIState, dividerUIState);
        textUIState = (TextUIState) obj;
        if (proofRejectionReason2 == null) {
            superPassProofRejectionReasonUIState = null;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$0 = chaloTextUIState;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$1 = textUIState;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$2 = superPassProofRejectionReasonUIState;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$3 = null;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$4 = null;
            superPassProofOverviewViewModel$proofOverviewItem$1.Z$0 = z2;
            superPassProofOverviewViewModel$proofOverviewItem$1.label = 3;
            objE = E(proofUploadDetails2, proofDocumentProps2, superPassProofOverviewViewModel$proofOverviewItem$1);
            if (objE != obj2) {
                textUIState3 = textUIState;
                obj = objE;
                superPassProofRejectionReasonUIState2 = superPassProofRejectionReasonUIState;
                chaloTextUIState2 = chaloTextUIState;
                SuperPassProofUploadedImageUIState superPassProofUploadedImageUIState2 = (SuperPassProofUploadedImageUIState) obj;
                if (z2) {
                    dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.TextFieldIndicator.f9859a, null, 4);
                } else {
                    dividerUIState = null;
                }
                if (z2) {
                    f = ChaloThemeHelper.a().v;
                } else {
                    f = ChaloThemeHelper.a().f1916a;
                }
                return new SuperPassProofItemsUIState.ImageProof(new SuperPassProofImageUISpec(f), chaloTextUIState2, textUIState3, superPassProofRejectionReasonUIState2, superPassProofUploadedImageUIState2, dividerUIState);
            }
        } else {
            SuperPassProofRejectionImageUIState superPassProofRejectionImageUIState2 = new SuperPassProofRejectionImageUIState(new SuperProofImageUIState(proofRejectionReason2.c, (BitmapImage) null, UiEventHandler.Companion.a(new da1(16, this, proofRejectionReason2)), (UIContentScale) null, 24));
            superPassProofOverviewViewModel$proofOverviewItem$1.L$0 = proofDocumentProps2;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$1 = proofUploadDetails2;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$2 = chaloTextUIState;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$3 = textUIState;
            superPassProofOverviewViewModel$proofOverviewItem$1.L$4 = superPassProofRejectionImageUIState2;
            superPassProofOverviewViewModel$proofOverviewItem$1.Z$0 = z2;
            superPassProofOverviewViewModel$proofOverviewItem$1.label = 2;
            Object objD = D(proofRejectionReason2, proofDocumentProps2, superPassProofOverviewViewModel$proofOverviewItem$1);
            if (objD != obj2) {
                textUIState2 = textUIState;
                proofUploadDetails3 = proofUploadDetails2;
                obj = objD;
                superPassProofRejectionImageUIState = superPassProofRejectionImageUIState2;
                superPassProofRejectionReasonUIState = new SuperPassProofRejectionReasonUIState(superPassProofRejectionImageUIState, (TextUIState) obj);
                textUIState = textUIState2;
                proofUploadDetails2 = proofUploadDetails3;
                superPassProofOverviewViewModel$proofOverviewItem$1.L$0 = chaloTextUIState;
                superPassProofOverviewViewModel$proofOverviewItem$1.L$1 = textUIState;
                superPassProofOverviewViewModel$proofOverviewItem$1.L$2 = superPassProofRejectionReasonUIState;
                superPassProofOverviewViewModel$proofOverviewItem$1.L$3 = null;
                superPassProofOverviewViewModel$proofOverviewItem$1.L$4 = null;
                superPassProofOverviewViewModel$proofOverviewItem$1.Z$0 = z2;
                superPassProofOverviewViewModel$proofOverviewItem$1.label = 3;
                objE = E(proofUploadDetails2, proofDocumentProps2, superPassProofOverviewViewModel$proofOverviewItem$1);
                if (objE != obj2) {
                    textUIState3 = textUIState;
                    obj = objE;
                    superPassProofRejectionReasonUIState2 = superPassProofRejectionReasonUIState;
                    chaloTextUIState2 = chaloTextUIState;
                    SuperPassProofUploadedImageUIState superPassProofUploadedImageUIState3 = (SuperPassProofUploadedImageUIState) obj;
                    if (z2) {
                        dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.TextFieldIndicator.f9859a, null, 4);
                    } else {
                        dividerUIState = null;
                    }
                    if (z2) {
                        f = ChaloThemeHelper.a().v;
                    } else {
                        f = ChaloThemeHelper.a().f1916a;
                    }
                    return new SuperPassProofItemsUIState.ImageProof(new SuperPassProofImageUISpec(f), chaloTextUIState2, textUIState3, superPassProofRejectionReasonUIState2, superPassProofUploadedImageUIState3, dividerUIState);
                }
            }
        }
        return obj2;
    }
}
