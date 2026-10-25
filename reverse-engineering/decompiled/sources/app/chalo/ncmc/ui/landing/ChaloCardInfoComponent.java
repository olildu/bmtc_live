package app.chalo.ncmc.ui.landing;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.ncmc.data.appmodel.ChaloCardActivePass;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardInfo;
import app.chalo.ncmc.data.appmodel.ChaloCardUnsyncedRechargeDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardsAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardsInfoAppModelKt;
import app.chalo.ncmc.data.appmodel.ClosedCardActivePassAppModel;
import app.chalo.ncmc.data.appmodel.ClosedCardDetailsAppModel;
import app.chalo.ncmc.data.appmodel.ClosedCardInfo;
import app.chalo.ncmc.data.appmodel.IntentHashAppModel;
import app.chalo.ncmc.data.appmodel.IntentHashAppModelKt;
import app.chalo.ncmc.data.appmodel.OpenCardDetailsAppModel;
import app.chalo.ncmc.data.appmodel.OpenCardInfo;
import app.chalo.ncmc.data.appmodel.SemiClosedCardActivePassAppModel;
import app.chalo.ncmc.data.appmodel.SemiClosedCardDetailsAppModel;
import app.chalo.ncmc.data.appmodel.SemiClosedCardInfo;
import app.chalo.ncmc.data.appmodel.UnknownCardDetailsAppModel;
import app.chalo.ncmc.data.appmodel.UnknownCardInfo;
import app.chalo.ncmc.domain.BlockNCMCCardUseCase;
import app.chalo.ncmc.domain.ChangeNCMCPinUseCase;
import app.chalo.ncmc.domain.FetchChaloCardInfoToShowUseCase;
import app.chalo.ncmc.domain.FetchEligibleCardsUseCase;
import app.chalo.ncmc.domain.GenerateUvikIntentHashUseCase;
import app.chalo.ncmc.domain.GetAvailableChaloCardOptionsUseCase;
import app.chalo.ncmc.domain.GetChaloCardPassDescriptionFromPassAttrUseCase;
import app.chalo.ncmc.domain.GetLinkCardConfigUseCase;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.ncmc.domain.GetNcmcCardAndRechargeConfigUseCase;
import app.chalo.ncmc.domain.ProcessUvikResultUseCase;
import app.chalo.ncmc.domain.UnlinkCardUseCase;
import app.chalo.ncmc.ui.CardRechargeEnterAmountArgsModel;
import app.chalo.ncmc.ui.CardTransactionHistoryArgsModel;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType;
import app.chalo.ncmc.ui.landing.ChaloCardActivePassDetailsUiModel;
import app.chalo.ncmc.ui.landing.ChaloCardInfoComponent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoScreenLayoutType;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.landing.SelectedCardDetailsUiModel;
import app.chalo.ncmc.utils.CardsJsonKt;
import app.chalo.ncmc.utils.ChaloCardAnalyticsExtentionsKt;
import app.chalo.ncmc.uvik.UvikSdkHelper;
import app.chalo.ncmc.uvik.UvikServiceRequest;
import app.chalo.ncmc.uvik.UvikServiceType;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.CardLinkingScreenArgs;
import app.chalo.scenes.args.CardRechargeEnterAmountArgs;
import app.chalo.scenes.args.CardTransactionHistoryArgs;
import app.chalo.scenes.args.ChaloCardLandingScreenArgs;
import app.chalo.scenes.args.EnterCardDetailsArgs;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ah;
import defpackage.hq0;
import defpackage.pi;
import defpackage.py;
import defpackage.va;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoIntent;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoViewState;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoDataState;", "Lapp/chalo/ncmc/ui/landing/ChaloCardInfoSideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardInfoComponent extends ChaloBaseStateMviComponent<ChaloCardInfoIntent, ChaloCardInfoViewState, ChaloCardInfoViewState, ChaloCardInfoSideEffect> {
    public final ProcessUvikResultUseCase A;
    public final UvikSdkHelper B;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase C;
    public final ChaloNavigationManager D;
    public final KotlinToastManager E;
    public Job F;
    public List G;
    public ChaloCardsAppModel H;
    public boolean I;
    public boolean J;
    public final ComponentContext k;
    public final CurrencyFeature l;
    public final TimeUtilsContract m;
    public final GetMaskedCardNoFromCardNoUseCase n;
    public final FetchChaloCardInfoToShowUseCase o;
    public final GetChaloCardPassDescriptionFromPassAttrUseCase p;
    public final AnalyticsContract q;
    public final GetAvailableChaloCardOptionsUseCase r;
    public final GetLinkCardConfigUseCase s;
    public final FetchEligibleCardsUseCase t;
    public final GetNcmcCardAndRechargeConfigUseCase u;
    public final UnlinkCardUseCase v;
    public final BlockNCMCCardUseCase w;
    public final ChangeNCMCPinUseCase x;
    public final StringProvider y;
    public final GenerateUvikIntentHashUseCase z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoComponent$Companion;", "", "", "REASON_USER_REQUEST", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6343a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ConfirmationDialogType.values().length];
            try {
                iArr[ConfirmationDialogType.UNLINK_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConfirmationDialogType.BLOCK_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6343a = iArr;
            int[] iArr2 = new int[ChaloCardInfoScreenLayoutType.values().length];
            try {
                iArr2[ChaloCardInfoScreenLayoutType.ALL_CARDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ChaloCardInfoScreenLayoutType.SINGLE_CARD_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChaloCardInfoScreenLayoutType.CARD_LINK_TUTORIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardInfoComponent(ChaloCardLandingScreenArgs args, ComponentContext componentContext, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, GetMaskedCardNoFromCardNoUseCase getMaskedCardNoFromCardNoUseCase, FetchChaloCardInfoToShowUseCase fetchChaloCardInfoToShowUseCase, GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase, AnalyticsContract analyticsContract, GetAvailableChaloCardOptionsUseCase getAvailableChaloCardOptionsUseCase, GetLinkCardConfigUseCase getLinkCardConfigUseCase, FetchEligibleCardsUseCase fetchEligibleCardsUseCase, GetNcmcCardAndRechargeConfigUseCase getNcmcCardAndRechargeConfigUseCase, UnlinkCardUseCase unlinkCardUseCase, BlockNCMCCardUseCase blockNCMCCardUseCase, ChangeNCMCPinUseCase changeNCMCPinUseCase, StringProvider stringProvider, GenerateUvikIntentHashUseCase generateUvikIntentHashUseCase, ProcessUvikResultUseCase processUvikResultUseCase, UvikSdkHelper uvikSdkHelper, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager) {
        super(componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.k = componentContext;
        this.l = currencyFeature;
        this.m = timeUtilsContract;
        this.n = getMaskedCardNoFromCardNoUseCase;
        this.o = fetchChaloCardInfoToShowUseCase;
        this.p = getChaloCardPassDescriptionFromPassAttrUseCase;
        this.q = analyticsContract;
        this.r = getAvailableChaloCardOptionsUseCase;
        this.s = getLinkCardConfigUseCase;
        this.t = fetchEligibleCardsUseCase;
        this.u = getNcmcCardAndRechargeConfigUseCase;
        this.v = unlinkCardUseCase;
        this.w = blockNCMCCardUseCase;
        this.x = changeNCMCPinUseCase;
        this.y = stringProvider;
        this.z = generateUvikIntentHashUseCase;
        this.A = processUvikResultUseCase;
        this.B = uvikSdkHelper;
        this.C = getMiscellaneousCityWiseFlagsConfigUseCase;
        this.D = chaloNavigationManager;
        this.E = kotlinToastManager;
        EmptyList emptyList = EmptyList.f17557a;
        this.G = emptyList;
        L0(new ChaloCardInfoIntent.InitializationIntent(args.b));
        this.H = new ChaloCardsAppModel(emptyList, emptyList);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0162 A[PHI: r0 r1 r5 r9 r12 r13
      0x0162: PHI (r0v6 int) = (r0v4 int), (r0v9 int) binds: [B:29:0x015e, B:22:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v1 java.lang.Object) binds: [B:29:0x015e, B:22:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r5v5 boolean) = (r5v3 boolean), (r5v6 boolean) binds: [B:29:0x015e, B:22:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r9v4 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) = (r9v1 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]), (r9v10 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) binds: [B:29:0x015e, B:22:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r12v4 java.lang.String) = (r12v1 java.lang.String), (r12v6 java.lang.String) binds: [B:29:0x015e, B:22:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r13v3 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) = (r13v1 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]), (r13v5 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) binds: [B:29:0x015e, B:22:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0188  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a6 A[PHI: r0 r1 r5 r9 r12 r13
      0x01a6: PHI (r0v12 int) = (r0v10 int), (r0v15 int) binds: [B:36:0x01a2, B:20:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r1v14 java.lang.Object) = (r1v13 java.lang.Object), (r1v1 java.lang.Object) binds: [B:36:0x01a2, B:20:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r5v9 boolean) = (r5v7 boolean), (r5v10 boolean) binds: [B:36:0x01a2, B:20:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r9v14 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) = (r9v11 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]), (r9v19 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) binds: [B:36:0x01a2, B:20:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r12v11 java.lang.String) = (r12v8 java.lang.String), (r12v13 java.lang.String) binds: [B:36:0x01a2, B:20:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x01a6: PHI (r13v8 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) = (r13v6 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]), (r13v10 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) binds: [B:36:0x01a2, B:20:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e9 A[PHI: r0 r1 r5 r9 r12 r15
      0x01e9: PHI (r0v18 int) = (r0v16 int), (r0v21 int) binds: [B:43:0x01e5, B:18:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r1v21 java.lang.Object) = (r1v20 java.lang.Object), (r1v1 java.lang.Object) binds: [B:43:0x01e5, B:18:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r5v13 boolean) = (r5v11 boolean), (r5v14 boolean) binds: [B:43:0x01e5, B:18:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r9v23 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) = (r9v20 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]), (r9v29 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) binds: [B:43:0x01e5, B:18:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r12v18 java.lang.String) = (r12v15 java.lang.String), (r12v20 java.lang.String) binds: [B:43:0x01e5, B:18:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r15v7 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) = (r15v5 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]), (r15v9 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) binds: [B:43:0x01e5, B:18:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x020d  */
    /* JADX WARN: Code duplicated, block: B:52:0x022c A[PHI: r0 r1 r5 r9 r12 r15
      0x022c: PHI (r0v24 int) = (r0v22 int), (r0v27 int) binds: [B:50:0x0228, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r1v28 java.lang.Object) = (r1v27 java.lang.Object), (r1v1 java.lang.Object) binds: [B:50:0x0228, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r5v17 boolean) = (r5v15 boolean), (r5v18 boolean) binds: [B:50:0x0228, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r9v33 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) = (r9v30 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]), (r9v39 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) binds: [B:50:0x0228, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r12v25 java.lang.String) = (r12v22 java.lang.String), (r12v27 java.lang.String) binds: [B:50:0x0228, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r15v12 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) = 
      (r15v10 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[])
      (r15v14 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[])
     binds: [B:50:0x0228, B:16:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0250  */
    /* JADX WARN: Code duplicated, block: B:59:0x026e A[PHI: r0 r1 r5 r9 r12 r15
      0x026e: PHI (r0v30 int) = (r0v28 int), (r0v33 int) binds: [B:57:0x026b, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r1v35 java.lang.Object) = (r1v34 java.lang.Object), (r1v1 java.lang.Object) binds: [B:57:0x026b, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r5v21 boolean) = (r5v19 boolean), (r5v23 boolean) binds: [B:57:0x026b, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r9v44 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) = (r9v40 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]), (r9v47 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) binds: [B:57:0x026b, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r12v32 java.lang.String) = (r12v29 java.lang.String), (r12v36 java.lang.String) binds: [B:57:0x026b, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r15v17 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[]) = 
      (r15v15 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[])
      (r15v20 app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel[])
     binds: [B:57:0x026b, B:14:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0292  */
    /* JADX WARN: Code duplicated, block: B:66:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x0300 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Serializable F0(ChaloCardInfoComponent chaloCardInfoComponent, ContinuationImpl continuationImpl) {
        ChaloCardInfoComponent$getGenericOperationList$1 chaloCardInfoComponent$getGenericOperationList$1;
        ChaloCardOptionUiModel[] chaloCardOptionUiModelArr;
        ChaloCardOptionUiModel[] chaloCardOptionUiModelArr2;
        int i;
        boolean z;
        String str;
        ChaloCardOptionUiModel[] chaloCardOptionUiModelArr3;
        int i2;
        String str2;
        ChaloCardOptionUiModel[] chaloCardOptionUiModelArr4;
        ChaloCardOptionUiModel[] chaloCardOptionUiModelArr5;
        int i3;
        String str3;
        ChaloCardOptionUiModel[] chaloCardOptionUiModelArr6;
        int i4;
        String str4;
        ChaloCardOptionUiModel[] chaloCardOptionUiModelArr7;
        int i5;
        String str5;
        boolean z2;
        ChaloCardOptionUiModel[] chaloCardOptionUiModelArr8;
        ChaloCardOptionUiModel[] chaloCardOptionUiModelArr9;
        int i6;
        String str6;
        Object objB;
        ChaloCardOptionUiModel[] chaloCardOptionUiModelArr10;
        ChaloCardOptionUiModel[] chaloCardOptionUiModelArr11;
        String str7;
        boolean z3;
        int i7;
        ArrayList arrayList;
        StringProvider stringProvider = chaloCardInfoComponent.y;
        if (continuationImpl instanceof ChaloCardInfoComponent$getGenericOperationList$1) {
            chaloCardInfoComponent$getGenericOperationList$1 = (ChaloCardInfoComponent$getGenericOperationList$1) continuationImpl;
            int i8 = chaloCardInfoComponent$getGenericOperationList$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                chaloCardInfoComponent$getGenericOperationList$1.label = i8 - Integer.MIN_VALUE;
            } else {
                chaloCardInfoComponent$getGenericOperationList$1 = new ChaloCardInfoComponent$getGenericOperationList$1(chaloCardInfoComponent, continuationImpl);
            }
        } else {
            chaloCardInfoComponent$getGenericOperationList$1 = new ChaloCardInfoComponent$getGenericOperationList$1(chaloCardInfoComponent, continuationImpl);
        }
        Object objB2 = chaloCardInfoComponent$getGenericOperationList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = chaloCardInfoComponent$getGenericOperationList$1.label;
        ChaloCardOperationType.AllCardOption.ActivateCardForMetro activateCardForMetro = ChaloCardOperationType.AllCardOption.ActivateCardForMetro.f6360a;
        ChaloCardOperationType.AllCardOption.BalanceEnquiry balanceEnquiry = ChaloCardOperationType.AllCardOption.BalanceEnquiry.f6362a;
        ChaloCardOperationType.AllCardOption.UpdateBalance updateBalance = ChaloCardOperationType.AllCardOption.UpdateBalance.f6367a;
        ChaloCardOperationType.AllCardOption.ActivateNCMCCard activateNCMCCard = ChaloCardOperationType.AllCardOption.ActivateNCMCCard.f6361a;
        switch (i9) {
            case 0:
                ResultKt.b(objB2);
                chaloCardInfoComponent.B.c();
                ChaloCardOptionUiModel[] chaloCardOptionUiModelArr12 = new ChaloCardOptionUiModel[6];
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr12;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr12;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = true;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 0;
                chaloCardInfoComponent$getGenericOperationList$1.label = 1;
                objB2 = stringProvider.b(StringEnum.RECHARGE_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB2 != coroutineSingletons) {
                    chaloCardOptionUiModelArr = chaloCardOptionUiModelArr12;
                    chaloCardOptionUiModelArr2 = chaloCardOptionUiModelArr;
                    i = 0;
                    z = true;
                    str = (String) objB2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str;
                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr;
                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i;
                    chaloCardInfoComponent$getGenericOperationList$1.label = 2;
                    objB2 = stringProvider.b(StringEnum.RECHARGE_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                    if (objB2 != coroutineSingletons) {
                        chaloCardOptionUiModelArr[i] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.Recharge.f6366a, str, (String) objB2);
                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr2;
                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = 1;
                        chaloCardInfoComponent$getGenericOperationList$1.label = 3;
                        objB2 = stringProvider.b(StringEnum.ACTIVATE_NCMC_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                        if (objB2 != coroutineSingletons) {
                            chaloCardOptionUiModelArr3 = chaloCardOptionUiModelArr2;
                            i2 = 1;
                            str2 = (String) objB2;
                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = str2;
                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr3;
                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = i2;
                            chaloCardInfoComponent$getGenericOperationList$1.label = 4;
                            objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                            if (objB2 != coroutineSingletons) {
                                chaloCardOptionUiModelArr3[i2] = new ChaloCardOptionUiModel(activateNCMCCard, str2, (String) objB2);
                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr2;
                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 2;
                                chaloCardInfoComponent$getGenericOperationList$1.label = 5;
                                objB2 = stringProvider.b(StringEnum.UPDATE_NCMC_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                if (objB2 != coroutineSingletons) {
                                    chaloCardOptionUiModelArr4 = chaloCardOptionUiModelArr2;
                                    chaloCardOptionUiModelArr5 = chaloCardOptionUiModelArr4;
                                    i3 = 2;
                                    str3 = (String) objB2;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str3;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr4;
                                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i3;
                                    chaloCardInfoComponent$getGenericOperationList$1.label = 6;
                                    objB2 = stringProvider.b(StringEnum.UPDATE_NCMC_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                    if (objB2 != coroutineSingletons) {
                                        chaloCardOptionUiModelArr4[i3] = new ChaloCardOptionUiModel(updateBalance, str3, (String) objB2);
                                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = 3;
                                        chaloCardInfoComponent$getGenericOperationList$1.label = 7;
                                        objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                        if (objB2 != coroutineSingletons) {
                                            chaloCardOptionUiModelArr6 = chaloCardOptionUiModelArr5;
                                            i4 = 3;
                                            str4 = (String) objB2;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = str4;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr6;
                                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = i4;
                                            chaloCardInfoComponent$getGenericOperationList$1.label = 8;
                                            objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                            if (objB2 != coroutineSingletons) {
                                                chaloCardOptionUiModelArr6[i4] = new ChaloCardOptionUiModel(balanceEnquiry, str4, (String) objB2);
                                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 4;
                                                chaloCardInfoComponent$getGenericOperationList$1.label = 9;
                                                objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                                if (objB2 != coroutineSingletons) {
                                                    chaloCardOptionUiModelArr7 = chaloCardOptionUiModelArr5;
                                                    i5 = 4;
                                                    str5 = (String) objB2;
                                                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str5;
                                                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr5;
                                                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i5;
                                                    chaloCardInfoComponent$getGenericOperationList$1.label = 10;
                                                    objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                                    if (objB2 != coroutineSingletons) {
                                                        chaloCardOptionUiModelArr5[i5] = new ChaloCardOptionUiModel(activateCardForMetro, str5, (String) objB2);
                                                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr7;
                                                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = 5;
                                                        chaloCardInfoComponent$getGenericOperationList$1.label = 11;
                                                        objB2 = stringProvider.b(StringEnum.BUY_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                                        if (objB2 != coroutineSingletons) {
                                                            z2 = z;
                                                            chaloCardOptionUiModelArr8 = chaloCardOptionUiModelArr7;
                                                            chaloCardOptionUiModelArr9 = chaloCardOptionUiModelArr8;
                                                            i6 = 5;
                                                            str6 = (String) objB2;
                                                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                                                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                                                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                                                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                                                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                                                            chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                                                            objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                                            if (objB != coroutineSingletons) {
                                                                chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                                                                chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                                                                str7 = str6;
                                                                objB2 = objB;
                                                                z3 = z2;
                                                                i7 = i6;
                                                                chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                                                                List listS = CollectionsKt.S(chaloCardOptionUiModelArr11);
                                                                arrayList = new ArrayList();
                                                                for (Object obj : listS) {
                                                                    ChaloCardOptionUiModel chaloCardOptionUiModel = (ChaloCardOptionUiModel) obj;
                                                                    if (!z3 || !CollectionsKt.w(CollectionsKt.S(activateNCMCCard, updateBalance, balanceEnquiry, activateCardForMetro), chaloCardOptionUiModel.f6375a)) {
                                                                        arrayList.add(obj);
                                                                    }
                                                                }
                                                                return arrayList;
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
                    }
                }
                return coroutineSingletons;
            case 1:
                i = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                chaloCardOptionUiModelArr = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                ChaloCardOptionUiModel[] chaloCardOptionUiModelArr13 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                chaloCardOptionUiModelArr2 = chaloCardOptionUiModelArr13;
                str = (String) objB2;
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str;
                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i;
                chaloCardInfoComponent$getGenericOperationList$1.label = 2;
                objB2 = stringProvider.b(StringEnum.RECHARGE_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB2 != coroutineSingletons) {
                    chaloCardOptionUiModelArr[i] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.Recharge.f6366a, str, (String) objB2);
                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = 1;
                    chaloCardInfoComponent$getGenericOperationList$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.ACTIVATE_NCMC_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                    if (objB2 != coroutineSingletons) {
                        chaloCardOptionUiModelArr3 = chaloCardOptionUiModelArr2;
                        i2 = 1;
                        str2 = (String) objB2;
                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = str2;
                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr3;
                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = i2;
                        chaloCardInfoComponent$getGenericOperationList$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                        if (objB2 != coroutineSingletons) {
                            chaloCardOptionUiModelArr3[i2] = new ChaloCardOptionUiModel(activateNCMCCard, str2, (String) objB2);
                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr2;
                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = 2;
                            chaloCardInfoComponent$getGenericOperationList$1.label = 5;
                            objB2 = stringProvider.b(StringEnum.UPDATE_NCMC_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                            if (objB2 != coroutineSingletons) {
                                chaloCardOptionUiModelArr4 = chaloCardOptionUiModelArr2;
                                chaloCardOptionUiModelArr5 = chaloCardOptionUiModelArr4;
                                i3 = 2;
                                str3 = (String) objB2;
                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str3;
                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr4;
                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i3;
                                chaloCardInfoComponent$getGenericOperationList$1.label = 6;
                                objB2 = stringProvider.b(StringEnum.UPDATE_NCMC_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                if (objB2 != coroutineSingletons) {
                                    chaloCardOptionUiModelArr4[i3] = new ChaloCardOptionUiModel(updateBalance, str3, (String) objB2);
                                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = 3;
                                    chaloCardInfoComponent$getGenericOperationList$1.label = 7;
                                    objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                    if (objB2 != coroutineSingletons) {
                                        chaloCardOptionUiModelArr6 = chaloCardOptionUiModelArr5;
                                        i4 = 3;
                                        str4 = (String) objB2;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = str4;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr6;
                                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = i4;
                                        chaloCardInfoComponent$getGenericOperationList$1.label = 8;
                                        objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                        if (objB2 != coroutineSingletons) {
                                            chaloCardOptionUiModelArr6[i4] = new ChaloCardOptionUiModel(balanceEnquiry, str4, (String) objB2);
                                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = 4;
                                            chaloCardInfoComponent$getGenericOperationList$1.label = 9;
                                            objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                            if (objB2 != coroutineSingletons) {
                                                chaloCardOptionUiModelArr7 = chaloCardOptionUiModelArr5;
                                                i5 = 4;
                                                str5 = (String) objB2;
                                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str5;
                                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr5;
                                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i5;
                                                chaloCardInfoComponent$getGenericOperationList$1.label = 10;
                                                objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                                if (objB2 != coroutineSingletons) {
                                                    chaloCardOptionUiModelArr5[i5] = new ChaloCardOptionUiModel(activateCardForMetro, str5, (String) objB2);
                                                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr7;
                                                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = 5;
                                                    chaloCardInfoComponent$getGenericOperationList$1.label = 11;
                                                    objB2 = stringProvider.b(StringEnum.BUY_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                                    if (objB2 != coroutineSingletons) {
                                                        z2 = z;
                                                        chaloCardOptionUiModelArr8 = chaloCardOptionUiModelArr7;
                                                        chaloCardOptionUiModelArr9 = chaloCardOptionUiModelArr8;
                                                        i6 = 5;
                                                        str6 = (String) objB2;
                                                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                                                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                                                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                                                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                                                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                                                        chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                                                        objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                                        if (objB != coroutineSingletons) {
                                                            chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                                                            chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                                                            str7 = str6;
                                                            objB2 = objB;
                                                            z3 = z2;
                                                            i7 = i6;
                                                            chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                                                            List listS2 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                                                            arrayList = new ArrayList();
                                                            while (r0.hasNext()) {
                                                                ChaloCardOptionUiModel chaloCardOptionUiModel2 = (ChaloCardOptionUiModel) obj;
                                                                if (!z3) {
                                                                }
                                                                arrayList.add(obj);
                                                            }
                                                            return arrayList;
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
                }
                return coroutineSingletons;
            case 2:
                i = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                chaloCardOptionUiModelArr = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$2;
                str = (String) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                chaloCardOptionUiModelArr2 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                chaloCardOptionUiModelArr[i] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.Recharge.f6366a, str, (String) objB2);
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr2;
                chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 1;
                chaloCardInfoComponent$getGenericOperationList$1.label = 3;
                objB2 = stringProvider.b(StringEnum.ACTIVATE_NCMC_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB2 != coroutineSingletons) {
                    chaloCardOptionUiModelArr3 = chaloCardOptionUiModelArr2;
                    i2 = 1;
                    str2 = (String) objB2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr3;
                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i2;
                    chaloCardInfoComponent$getGenericOperationList$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                    if (objB2 != coroutineSingletons) {
                        chaloCardOptionUiModelArr3[i2] = new ChaloCardOptionUiModel(activateNCMCCard, str2, (String) objB2);
                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr2;
                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = 2;
                        chaloCardInfoComponent$getGenericOperationList$1.label = 5;
                        objB2 = stringProvider.b(StringEnum.UPDATE_NCMC_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                        if (objB2 != coroutineSingletons) {
                            chaloCardOptionUiModelArr4 = chaloCardOptionUiModelArr2;
                            chaloCardOptionUiModelArr5 = chaloCardOptionUiModelArr4;
                            i3 = 2;
                            str3 = (String) objB2;
                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = str3;
                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr4;
                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = i3;
                            chaloCardInfoComponent$getGenericOperationList$1.label = 6;
                            objB2 = stringProvider.b(StringEnum.UPDATE_NCMC_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                            if (objB2 != coroutineSingletons) {
                                chaloCardOptionUiModelArr4[i3] = new ChaloCardOptionUiModel(updateBalance, str3, (String) objB2);
                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 3;
                                chaloCardInfoComponent$getGenericOperationList$1.label = 7;
                                objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                if (objB2 != coroutineSingletons) {
                                    chaloCardOptionUiModelArr6 = chaloCardOptionUiModelArr5;
                                    i4 = 3;
                                    str4 = (String) objB2;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str4;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr6;
                                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i4;
                                    chaloCardInfoComponent$getGenericOperationList$1.label = 8;
                                    objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                    if (objB2 != coroutineSingletons) {
                                        chaloCardOptionUiModelArr6[i4] = new ChaloCardOptionUiModel(balanceEnquiry, str4, (String) objB2);
                                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = 4;
                                        chaloCardInfoComponent$getGenericOperationList$1.label = 9;
                                        objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                        if (objB2 != coroutineSingletons) {
                                            chaloCardOptionUiModelArr7 = chaloCardOptionUiModelArr5;
                                            i5 = 4;
                                            str5 = (String) objB2;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = str5;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr5;
                                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = i5;
                                            chaloCardInfoComponent$getGenericOperationList$1.label = 10;
                                            objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                            if (objB2 != coroutineSingletons) {
                                                chaloCardOptionUiModelArr5[i5] = new ChaloCardOptionUiModel(activateCardForMetro, str5, (String) objB2);
                                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr7;
                                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 5;
                                                chaloCardInfoComponent$getGenericOperationList$1.label = 11;
                                                objB2 = stringProvider.b(StringEnum.BUY_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                                if (objB2 != coroutineSingletons) {
                                                    z2 = z;
                                                    chaloCardOptionUiModelArr8 = chaloCardOptionUiModelArr7;
                                                    chaloCardOptionUiModelArr9 = chaloCardOptionUiModelArr8;
                                                    i6 = 5;
                                                    str6 = (String) objB2;
                                                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                                                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                                                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                                                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                                                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                                                    chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                                                    objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                                    if (objB != coroutineSingletons) {
                                                        chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                                                        chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                                                        str7 = str6;
                                                        objB2 = objB;
                                                        z3 = z2;
                                                        i7 = i6;
                                                        chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                                                        List listS3 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                                                        arrayList = new ArrayList();
                                                        while (r0.hasNext()) {
                                                            ChaloCardOptionUiModel chaloCardOptionUiModel3 = (ChaloCardOptionUiModel) obj;
                                                            if (!z3) {
                                                            }
                                                            arrayList.add(obj);
                                                        }
                                                        return arrayList;
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
                return coroutineSingletons;
            case 3:
                i2 = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                chaloCardOptionUiModelArr3 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                ChaloCardOptionUiModel[] chaloCardOptionUiModelArr14 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                chaloCardOptionUiModelArr2 = chaloCardOptionUiModelArr14;
                str2 = (String) objB2;
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str2;
                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr3;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i2;
                chaloCardInfoComponent$getGenericOperationList$1.label = 4;
                objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB2 != coroutineSingletons) {
                    chaloCardOptionUiModelArr3[i2] = new ChaloCardOptionUiModel(activateNCMCCard, str2, (String) objB2);
                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = 2;
                    chaloCardInfoComponent$getGenericOperationList$1.label = 5;
                    objB2 = stringProvider.b(StringEnum.UPDATE_NCMC_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                    if (objB2 != coroutineSingletons) {
                        chaloCardOptionUiModelArr4 = chaloCardOptionUiModelArr2;
                        chaloCardOptionUiModelArr5 = chaloCardOptionUiModelArr4;
                        i3 = 2;
                        str3 = (String) objB2;
                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = str3;
                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr4;
                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = i3;
                        chaloCardInfoComponent$getGenericOperationList$1.label = 6;
                        objB2 = stringProvider.b(StringEnum.UPDATE_NCMC_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                        if (objB2 != coroutineSingletons) {
                            chaloCardOptionUiModelArr4[i3] = new ChaloCardOptionUiModel(updateBalance, str3, (String) objB2);
                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = 3;
                            chaloCardInfoComponent$getGenericOperationList$1.label = 7;
                            objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                            if (objB2 != coroutineSingletons) {
                                chaloCardOptionUiModelArr6 = chaloCardOptionUiModelArr5;
                                i4 = 3;
                                str4 = (String) objB2;
                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str4;
                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr6;
                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i4;
                                chaloCardInfoComponent$getGenericOperationList$1.label = 8;
                                objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                if (objB2 != coroutineSingletons) {
                                    chaloCardOptionUiModelArr6[i4] = new ChaloCardOptionUiModel(balanceEnquiry, str4, (String) objB2);
                                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = 4;
                                    chaloCardInfoComponent$getGenericOperationList$1.label = 9;
                                    objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                    if (objB2 != coroutineSingletons) {
                                        chaloCardOptionUiModelArr7 = chaloCardOptionUiModelArr5;
                                        i5 = 4;
                                        str5 = (String) objB2;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = str5;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr5;
                                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = i5;
                                        chaloCardInfoComponent$getGenericOperationList$1.label = 10;
                                        objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                        if (objB2 != coroutineSingletons) {
                                            chaloCardOptionUiModelArr5[i5] = new ChaloCardOptionUiModel(activateCardForMetro, str5, (String) objB2);
                                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr7;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = 5;
                                            chaloCardInfoComponent$getGenericOperationList$1.label = 11;
                                            objB2 = stringProvider.b(StringEnum.BUY_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                            if (objB2 != coroutineSingletons) {
                                                z2 = z;
                                                chaloCardOptionUiModelArr8 = chaloCardOptionUiModelArr7;
                                                chaloCardOptionUiModelArr9 = chaloCardOptionUiModelArr8;
                                                i6 = 5;
                                                str6 = (String) objB2;
                                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                                                chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                                                objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                                if (objB != coroutineSingletons) {
                                                    chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                                                    chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                                                    str7 = str6;
                                                    objB2 = objB;
                                                    z3 = z2;
                                                    i7 = i6;
                                                    chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                                                    List listS4 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                                                    arrayList = new ArrayList();
                                                    while (r0.hasNext()) {
                                                        ChaloCardOptionUiModel chaloCardOptionUiModel4 = (ChaloCardOptionUiModel) obj;
                                                        if (!z3) {
                                                        }
                                                        arrayList.add(obj);
                                                    }
                                                    return arrayList;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                i2 = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                chaloCardOptionUiModelArr3 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$2;
                str2 = (String) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                chaloCardOptionUiModelArr2 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                chaloCardOptionUiModelArr3[i2] = new ChaloCardOptionUiModel(activateNCMCCard, str2, (String) objB2);
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr2;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr2;
                chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 2;
                chaloCardInfoComponent$getGenericOperationList$1.label = 5;
                objB2 = stringProvider.b(StringEnum.UPDATE_NCMC_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB2 != coroutineSingletons) {
                    chaloCardOptionUiModelArr4 = chaloCardOptionUiModelArr2;
                    chaloCardOptionUiModelArr5 = chaloCardOptionUiModelArr4;
                    i3 = 2;
                    str3 = (String) objB2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str3;
                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr4;
                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i3;
                    chaloCardInfoComponent$getGenericOperationList$1.label = 6;
                    objB2 = stringProvider.b(StringEnum.UPDATE_NCMC_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                    if (objB2 != coroutineSingletons) {
                        chaloCardOptionUiModelArr4[i3] = new ChaloCardOptionUiModel(updateBalance, str3, (String) objB2);
                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = 3;
                        chaloCardInfoComponent$getGenericOperationList$1.label = 7;
                        objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                        if (objB2 != coroutineSingletons) {
                            chaloCardOptionUiModelArr6 = chaloCardOptionUiModelArr5;
                            i4 = 3;
                            str4 = (String) objB2;
                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = str4;
                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr6;
                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = i4;
                            chaloCardInfoComponent$getGenericOperationList$1.label = 8;
                            objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                            if (objB2 != coroutineSingletons) {
                                chaloCardOptionUiModelArr6[i4] = new ChaloCardOptionUiModel(balanceEnquiry, str4, (String) objB2);
                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 4;
                                chaloCardInfoComponent$getGenericOperationList$1.label = 9;
                                objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                if (objB2 != coroutineSingletons) {
                                    chaloCardOptionUiModelArr7 = chaloCardOptionUiModelArr5;
                                    i5 = 4;
                                    str5 = (String) objB2;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str5;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr5;
                                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i5;
                                    chaloCardInfoComponent$getGenericOperationList$1.label = 10;
                                    objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                    if (objB2 != coroutineSingletons) {
                                        chaloCardOptionUiModelArr5[i5] = new ChaloCardOptionUiModel(activateCardForMetro, str5, (String) objB2);
                                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr7;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = 5;
                                        chaloCardInfoComponent$getGenericOperationList$1.label = 11;
                                        objB2 = stringProvider.b(StringEnum.BUY_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                        if (objB2 != coroutineSingletons) {
                                            z2 = z;
                                            chaloCardOptionUiModelArr8 = chaloCardOptionUiModelArr7;
                                            chaloCardOptionUiModelArr9 = chaloCardOptionUiModelArr8;
                                            i6 = 5;
                                            str6 = (String) objB2;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                                            chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                                            objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                            if (objB != coroutineSingletons) {
                                                chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                                                chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                                                str7 = str6;
                                                objB2 = objB;
                                                z3 = z2;
                                                i7 = i6;
                                                chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                                                List listS5 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                                                arrayList = new ArrayList();
                                                while (r0.hasNext()) {
                                                    ChaloCardOptionUiModel chaloCardOptionUiModel5 = (ChaloCardOptionUiModel) obj;
                                                    if (!z3) {
                                                    }
                                                    arrayList.add(obj);
                                                }
                                                return arrayList;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                i3 = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                chaloCardOptionUiModelArr4 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                ChaloCardOptionUiModel[] chaloCardOptionUiModelArr15 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                chaloCardOptionUiModelArr5 = chaloCardOptionUiModelArr15;
                str3 = (String) objB2;
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str3;
                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr4;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i3;
                chaloCardInfoComponent$getGenericOperationList$1.label = 6;
                objB2 = stringProvider.b(StringEnum.UPDATE_NCMC_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB2 != coroutineSingletons) {
                    chaloCardOptionUiModelArr4[i3] = new ChaloCardOptionUiModel(updateBalance, str3, (String) objB2);
                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = 3;
                    chaloCardInfoComponent$getGenericOperationList$1.label = 7;
                    objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                    if (objB2 != coroutineSingletons) {
                        chaloCardOptionUiModelArr6 = chaloCardOptionUiModelArr5;
                        i4 = 3;
                        str4 = (String) objB2;
                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = str4;
                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr6;
                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = i4;
                        chaloCardInfoComponent$getGenericOperationList$1.label = 8;
                        objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                        if (objB2 != coroutineSingletons) {
                            chaloCardOptionUiModelArr6[i4] = new ChaloCardOptionUiModel(balanceEnquiry, str4, (String) objB2);
                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = 4;
                            chaloCardInfoComponent$getGenericOperationList$1.label = 9;
                            objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                            if (objB2 != coroutineSingletons) {
                                chaloCardOptionUiModelArr7 = chaloCardOptionUiModelArr5;
                                i5 = 4;
                                str5 = (String) objB2;
                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str5;
                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr5;
                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i5;
                                chaloCardInfoComponent$getGenericOperationList$1.label = 10;
                                objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                if (objB2 != coroutineSingletons) {
                                    chaloCardOptionUiModelArr5[i5] = new ChaloCardOptionUiModel(activateCardForMetro, str5, (String) objB2);
                                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr7;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = 5;
                                    chaloCardInfoComponent$getGenericOperationList$1.label = 11;
                                    objB2 = stringProvider.b(StringEnum.BUY_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                    if (objB2 != coroutineSingletons) {
                                        z2 = z;
                                        chaloCardOptionUiModelArr8 = chaloCardOptionUiModelArr7;
                                        chaloCardOptionUiModelArr9 = chaloCardOptionUiModelArr8;
                                        i6 = 5;
                                        str6 = (String) objB2;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                                        chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                                        objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                        if (objB != coroutineSingletons) {
                                            chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                                            chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                                            str7 = str6;
                                            objB2 = objB;
                                            z3 = z2;
                                            i7 = i6;
                                            chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                                            List listS6 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                                            arrayList = new ArrayList();
                                            while (r0.hasNext()) {
                                                ChaloCardOptionUiModel chaloCardOptionUiModel6 = (ChaloCardOptionUiModel) obj;
                                                if (!z3) {
                                                }
                                                arrayList.add(obj);
                                            }
                                            return arrayList;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                i3 = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                chaloCardOptionUiModelArr4 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$2;
                str3 = (String) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                chaloCardOptionUiModelArr5 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                chaloCardOptionUiModelArr4[i3] = new ChaloCardOptionUiModel(updateBalance, str3, (String) objB2);
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 3;
                chaloCardInfoComponent$getGenericOperationList$1.label = 7;
                objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB2 != coroutineSingletons) {
                    chaloCardOptionUiModelArr6 = chaloCardOptionUiModelArr5;
                    i4 = 3;
                    str4 = (String) objB2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str4;
                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr6;
                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i4;
                    chaloCardInfoComponent$getGenericOperationList$1.label = 8;
                    objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                    if (objB2 != coroutineSingletons) {
                        chaloCardOptionUiModelArr6[i4] = new ChaloCardOptionUiModel(balanceEnquiry, str4, (String) objB2);
                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = 4;
                        chaloCardInfoComponent$getGenericOperationList$1.label = 9;
                        objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                        if (objB2 != coroutineSingletons) {
                            chaloCardOptionUiModelArr7 = chaloCardOptionUiModelArr5;
                            i5 = 4;
                            str5 = (String) objB2;
                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = str5;
                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr5;
                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = i5;
                            chaloCardInfoComponent$getGenericOperationList$1.label = 10;
                            objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                            if (objB2 != coroutineSingletons) {
                                chaloCardOptionUiModelArr5[i5] = new ChaloCardOptionUiModel(activateCardForMetro, str5, (String) objB2);
                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr7;
                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 5;
                                chaloCardInfoComponent$getGenericOperationList$1.label = 11;
                                objB2 = stringProvider.b(StringEnum.BUY_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                if (objB2 != coroutineSingletons) {
                                    z2 = z;
                                    chaloCardOptionUiModelArr8 = chaloCardOptionUiModelArr7;
                                    chaloCardOptionUiModelArr9 = chaloCardOptionUiModelArr8;
                                    i6 = 5;
                                    str6 = (String) objB2;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                                    chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                                    objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                    if (objB != coroutineSingletons) {
                                        chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                                        chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                                        str7 = str6;
                                        objB2 = objB;
                                        z3 = z2;
                                        i7 = i6;
                                        chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                                        List listS7 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                                        arrayList = new ArrayList();
                                        while (r0.hasNext()) {
                                            ChaloCardOptionUiModel chaloCardOptionUiModel7 = (ChaloCardOptionUiModel) obj;
                                            if (!z3) {
                                            }
                                            arrayList.add(obj);
                                        }
                                        return arrayList;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 7:
                i4 = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                chaloCardOptionUiModelArr6 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                ChaloCardOptionUiModel[] chaloCardOptionUiModelArr16 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                chaloCardOptionUiModelArr5 = chaloCardOptionUiModelArr16;
                str4 = (String) objB2;
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str4;
                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr6;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i4;
                chaloCardInfoComponent$getGenericOperationList$1.label = 8;
                objB2 = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB2 != coroutineSingletons) {
                    chaloCardOptionUiModelArr6[i4] = new ChaloCardOptionUiModel(balanceEnquiry, str4, (String) objB2);
                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = 4;
                    chaloCardInfoComponent$getGenericOperationList$1.label = 9;
                    objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                    if (objB2 != coroutineSingletons) {
                        chaloCardOptionUiModelArr7 = chaloCardOptionUiModelArr5;
                        i5 = 4;
                        str5 = (String) objB2;
                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = str5;
                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr5;
                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = i5;
                        chaloCardInfoComponent$getGenericOperationList$1.label = 10;
                        objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                        if (objB2 != coroutineSingletons) {
                            chaloCardOptionUiModelArr5[i5] = new ChaloCardOptionUiModel(activateCardForMetro, str5, (String) objB2);
                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr7;
                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = 5;
                            chaloCardInfoComponent$getGenericOperationList$1.label = 11;
                            objB2 = stringProvider.b(StringEnum.BUY_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                            if (objB2 != coroutineSingletons) {
                                z2 = z;
                                chaloCardOptionUiModelArr8 = chaloCardOptionUiModelArr7;
                                chaloCardOptionUiModelArr9 = chaloCardOptionUiModelArr8;
                                i6 = 5;
                                str6 = (String) objB2;
                                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                                chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                                objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                                if (objB != coroutineSingletons) {
                                    chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                                    chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                                    str7 = str6;
                                    objB2 = objB;
                                    z3 = z2;
                                    i7 = i6;
                                    chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                                    List listS8 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                                    arrayList = new ArrayList();
                                    while (r0.hasNext()) {
                                        ChaloCardOptionUiModel chaloCardOptionUiModel8 = (ChaloCardOptionUiModel) obj;
                                        if (!z3) {
                                        }
                                        arrayList.add(obj);
                                    }
                                    return arrayList;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 8:
                i4 = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                chaloCardOptionUiModelArr6 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$2;
                str4 = (String) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                chaloCardOptionUiModelArr5 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                chaloCardOptionUiModelArr6[i4] = new ChaloCardOptionUiModel(balanceEnquiry, str4, (String) objB2);
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr5;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr5;
                chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 4;
                chaloCardInfoComponent$getGenericOperationList$1.label = 9;
                objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB2 != coroutineSingletons) {
                    chaloCardOptionUiModelArr7 = chaloCardOptionUiModelArr5;
                    i5 = 4;
                    str5 = (String) objB2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str5;
                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr5;
                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i5;
                    chaloCardInfoComponent$getGenericOperationList$1.label = 10;
                    objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                    if (objB2 != coroutineSingletons) {
                        chaloCardOptionUiModelArr5[i5] = new ChaloCardOptionUiModel(activateCardForMetro, str5, (String) objB2);
                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr7;
                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = 5;
                        chaloCardInfoComponent$getGenericOperationList$1.label = 11;
                        objB2 = stringProvider.b(StringEnum.BUY_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                        if (objB2 != coroutineSingletons) {
                            z2 = z;
                            chaloCardOptionUiModelArr8 = chaloCardOptionUiModelArr7;
                            chaloCardOptionUiModelArr9 = chaloCardOptionUiModelArr8;
                            i6 = 5;
                            str6 = (String) objB2;
                            chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                            chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                            chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                            chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                            chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                            chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                            objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                            if (objB != coroutineSingletons) {
                                chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                                chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                                str7 = str6;
                                objB2 = objB;
                                z3 = z2;
                                i7 = i6;
                                chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                                List listS9 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                                arrayList = new ArrayList();
                                while (r0.hasNext()) {
                                    ChaloCardOptionUiModel chaloCardOptionUiModel9 = (ChaloCardOptionUiModel) obj;
                                    if (!z3) {
                                    }
                                    arrayList.add(obj);
                                }
                                return arrayList;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 9:
                i5 = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                ChaloCardOptionUiModel[] chaloCardOptionUiModelArr17 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                ChaloCardOptionUiModel[] chaloCardOptionUiModelArr18 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                chaloCardOptionUiModelArr5 = chaloCardOptionUiModelArr17;
                chaloCardOptionUiModelArr7 = chaloCardOptionUiModelArr18;
                str5 = (String) objB2;
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str5;
                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr5;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i5;
                chaloCardInfoComponent$getGenericOperationList$1.label = 10;
                objB2 = stringProvider.b(StringEnum.ACTIVATE_CARD_FOR_METRO_DESC, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB2 != coroutineSingletons) {
                    chaloCardOptionUiModelArr5[i5] = new ChaloCardOptionUiModel(activateCardForMetro, str5, (String) objB2);
                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr7;
                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = 5;
                    chaloCardInfoComponent$getGenericOperationList$1.label = 11;
                    objB2 = stringProvider.b(StringEnum.BUY_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                    if (objB2 != coroutineSingletons) {
                        z2 = z;
                        chaloCardOptionUiModelArr8 = chaloCardOptionUiModelArr7;
                        chaloCardOptionUiModelArr9 = chaloCardOptionUiModelArr8;
                        i6 = 5;
                        str6 = (String) objB2;
                        chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                        chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                        chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                        chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                        chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                        chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                        objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                        if (objB != coroutineSingletons) {
                            chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                            chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                            str7 = str6;
                            objB2 = objB;
                            z3 = z2;
                            i7 = i6;
                            chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                            List listS10 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                            arrayList = new ArrayList();
                            while (r0.hasNext()) {
                                ChaloCardOptionUiModel chaloCardOptionUiModel10 = (ChaloCardOptionUiModel) obj;
                                if (!z3) {
                                }
                                arrayList.add(obj);
                            }
                            return arrayList;
                        }
                    }
                }
                return coroutineSingletons;
            case 10:
                i5 = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                chaloCardOptionUiModelArr5 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$2;
                str5 = (String) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                chaloCardOptionUiModelArr7 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                chaloCardOptionUiModelArr5[i5] = new ChaloCardOptionUiModel(activateCardForMetro, str5, (String) objB2);
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr7;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = chaloCardOptionUiModelArr7;
                chaloCardInfoComponent$getGenericOperationList$1.L$2 = null;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = 5;
                chaloCardInfoComponent$getGenericOperationList$1.label = 11;
                objB2 = stringProvider.b(StringEnum.BUY_NEW_CARD, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB2 != coroutineSingletons) {
                    z2 = z;
                    chaloCardOptionUiModelArr8 = chaloCardOptionUiModelArr7;
                    chaloCardOptionUiModelArr9 = chaloCardOptionUiModelArr8;
                    i6 = 5;
                    str6 = (String) objB2;
                    chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                    chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                    chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                    chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                    chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                    chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                    objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                    if (objB != coroutineSingletons) {
                        chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                        chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                        str7 = str6;
                        objB2 = objB;
                        z3 = z2;
                        i7 = i6;
                        chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                        List listS11 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                        arrayList = new ArrayList();
                        while (r0.hasNext()) {
                            ChaloCardOptionUiModel chaloCardOptionUiModel11 = (ChaloCardOptionUiModel) obj;
                            if (!z3) {
                            }
                            arrayList.add(obj);
                        }
                        return arrayList;
                    }
                }
                return coroutineSingletons;
            case 11:
                i6 = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z2 = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                chaloCardOptionUiModelArr8 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                chaloCardOptionUiModelArr9 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                str6 = (String) objB2;
                chaloCardInfoComponent$getGenericOperationList$1.L$0 = chaloCardOptionUiModelArr9;
                chaloCardInfoComponent$getGenericOperationList$1.L$1 = str6;
                chaloCardInfoComponent$getGenericOperationList$1.L$2 = chaloCardOptionUiModelArr8;
                chaloCardInfoComponent$getGenericOperationList$1.Z$0 = z2;
                chaloCardInfoComponent$getGenericOperationList$1.I$0 = i6;
                chaloCardInfoComponent$getGenericOperationList$1.label = 12;
                objB = stringProvider.b(StringEnum.BUY_NEW_CARD_SUBTITLE, new Object[0], chaloCardInfoComponent$getGenericOperationList$1);
                if (objB != coroutineSingletons) {
                    chaloCardOptionUiModelArr10 = chaloCardOptionUiModelArr8;
                    chaloCardOptionUiModelArr11 = chaloCardOptionUiModelArr9;
                    str7 = str6;
                    objB2 = objB;
                    z3 = z2;
                    i7 = i6;
                    chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                    List listS12 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        ChaloCardOptionUiModel chaloCardOptionUiModel12 = (ChaloCardOptionUiModel) obj;
                        if (!z3) {
                        }
                        arrayList.add(obj);
                    }
                    return arrayList;
                }
                return coroutineSingletons;
            case 12:
                i7 = chaloCardInfoComponent$getGenericOperationList$1.I$0;
                z3 = chaloCardInfoComponent$getGenericOperationList$1.Z$0;
                chaloCardOptionUiModelArr10 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$2;
                str7 = (String) chaloCardInfoComponent$getGenericOperationList$1.L$1;
                chaloCardOptionUiModelArr11 = (ChaloCardOptionUiModel[]) chaloCardInfoComponent$getGenericOperationList$1.L$0;
                ResultKt.b(objB2);
                chaloCardOptionUiModelArr10[i7] = new ChaloCardOptionUiModel(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a, str7, (String) objB2);
                List listS13 = CollectionsKt.S(chaloCardOptionUiModelArr11);
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    ChaloCardOptionUiModel chaloCardOptionUiModel13 = (ChaloCardOptionUiModel) obj;
                    if (!z3) {
                    }
                    arrayList.add(obj);
                }
                return arrayList;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(ChaloCardInfoComponent chaloCardInfoComponent, UvikServiceType uvikServiceType, IntentHashAppModel intentHashAppModel, ContinuationImpl continuationImpl) {
        ChaloCardInfoComponent$initiateUvikTap$1 chaloCardInfoComponent$initiateUvikTap$1;
        KotlinToastManager kotlinToastManager;
        chaloCardInfoComponent.getClass();
        if (continuationImpl instanceof ChaloCardInfoComponent$initiateUvikTap$1) {
            chaloCardInfoComponent$initiateUvikTap$1 = (ChaloCardInfoComponent$initiateUvikTap$1) continuationImpl;
            int i = chaloCardInfoComponent$initiateUvikTap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloCardInfoComponent$initiateUvikTap$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloCardInfoComponent$initiateUvikTap$1 = new ChaloCardInfoComponent$initiateUvikTap$1(chaloCardInfoComponent, continuationImpl);
            }
        } else {
            chaloCardInfoComponent$initiateUvikTap$1 = new ChaloCardInfoComponent$initiateUvikTap$1(chaloCardInfoComponent, continuationImpl);
        }
        Object objB = chaloCardInfoComponent$initiateUvikTap$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloCardInfoComponent$initiateUvikTap$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            UvikServiceRequest uvikServiceRequestA = IntentHashAppModelKt.a(intentHashAppModel, uvikServiceType);
            boolean z = false;
            if (uvikServiceRequestA != null) {
                chaloCardInfoComponent.E0(new va(z, 2));
                Job job = chaloCardInfoComponent.F;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                chaloCardInfoComponent.F = BuildersKt.d(chaloCardInfoComponent.j, null, null, new ChaloCardInfoComponent$initiateAndCheckForUvikTapResult$1(chaloCardInfoComponent, uvikServiceRequestA, null), 3);
            } else {
                chaloCardInfoComponent.E0(new va(z, 2));
                KotlinToastManager kotlinToastManager2 = chaloCardInfoComponent.E;
                chaloCardInfoComponent$initiateUvikTap$1.L$0 = kotlinToastManager2;
                chaloCardInfoComponent$initiateUvikTap$1.label = 1;
                objB = chaloCardInfoComponent.y.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], chaloCardInfoComponent$initiateUvikTap$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kotlinToastManager = kotlinToastManager2;
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) chaloCardInfoComponent$initiateUvikTap$1.L$0;
        ResultKt.b(objB);
        hq0.s(kotlinToastManager, (String) objB);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x019c  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x021b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0226  */
    /* JADX WARN: Code duplicated, block: B:82:0x022a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0250  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object H0(final ChaloCardInfoComponent chaloCardInfoComponent, int i, ContinuationImpl continuationImpl) {
        ChaloCardInfoComponent$setCurrentCardDetail$1 chaloCardInfoComponent$setCurrentCardDetail$1;
        ChaloCardDetails chaloCardDetailsA;
        ChaloCardActivePass chaloCardActivePass;
        List list;
        int i2;
        int i3;
        boolean z;
        ChaloCardDetails chaloCardDetails;
        List list2;
        ChaloCardActivePass chaloCardActivePass2;
        List list3;
        String str;
        ChaloCardActivePass chaloCardActivePass3;
        HashMap map;
        Integer c;
        String strValueOf;
        int i4;
        List list4;
        Object objB;
        String str2;
        List list5;
        Object objB2;
        Object objA;
        final List list6;
        List list7;
        final ChaloCardActivePass chaloCardActivePass4;
        ChaloCardDetails chaloCardDetails2;
        final String str3;
        final String str4;
        int i5 = i;
        StateFlow stateFlow = chaloCardInfoComponent.f;
        StringProvider stringProvider = chaloCardInfoComponent.y;
        if (continuationImpl instanceof ChaloCardInfoComponent$setCurrentCardDetail$1) {
            chaloCardInfoComponent$setCurrentCardDetail$1 = (ChaloCardInfoComponent$setCurrentCardDetail$1) continuationImpl;
            int i6 = chaloCardInfoComponent$setCurrentCardDetail$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                chaloCardInfoComponent$setCurrentCardDetail$1.label = i6 - Integer.MIN_VALUE;
            } else {
                chaloCardInfoComponent$setCurrentCardDetail$1 = new ChaloCardInfoComponent$setCurrentCardDetail$1(chaloCardInfoComponent, continuationImpl);
            }
        } else {
            chaloCardInfoComponent$setCurrentCardDetail$1 = new ChaloCardInfoComponent$setCurrentCardDetail$1(chaloCardInfoComponent, continuationImpl);
        }
        Object obj = chaloCardInfoComponent$setCurrentCardDetail$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = chaloCardInfoComponent$setCurrentCardDetail$1.label;
        Unit unit = Unit.f17538a;
        if (i7 == 0) {
            ResultKt.b(obj);
            if (chaloCardInfoComponent.H.f6136a.isEmpty()) {
                return unit;
            }
            List list8 = ((ChaloCardInfoViewState) stateFlow.getValue()).b;
            ChaloCardInfo chaloCardInfo = (ChaloCardInfo) chaloCardInfoComponent.H.f6136a.get(i5);
            chaloCardDetailsA = chaloCardInfo.a();
            if (chaloCardInfo instanceof ClosedCardInfo) {
                List list9 = ((ClosedCardInfo) chaloCardInfo).b;
                chaloCardActivePass = list9 != null ? (ClosedCardActivePassAppModel) CollectionsKt.L(0, list9) : null;
            } else {
                if (chaloCardInfo instanceof SemiClosedCardInfo) {
                    List list10 = ((SemiClosedCardInfo) chaloCardInfo).b;
                    if (list10 != null) {
                        chaloCardActivePass = (SemiClosedCardActivePassAppModel) CollectionsKt.L(0, list10);
                    }
                } else if (!(chaloCardInfo instanceof OpenCardInfo) && !(chaloCardInfo instanceof UnknownCardInfo)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list8;
            chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetailsA;
            chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass;
            chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i5;
            chaloCardInfoComponent$setCurrentCardDetail$1.label = 1;
            Object objK0 = chaloCardInfoComponent.K0(chaloCardDetailsA, chaloCardInfoComponent$setCurrentCardDetail$1);
            if (objK0 != obj2) {
                list = list8;
                obj = objK0;
            }
            return obj2;
        }
        if (i7 == 1) {
            i5 = chaloCardInfoComponent$setCurrentCardDetail$1.I$0;
            chaloCardActivePass = (ChaloCardActivePass) chaloCardInfoComponent$setCurrentCardDetail$1.L$2;
            chaloCardDetailsA = (ChaloCardDetails) chaloCardInfoComponent$setCurrentCardDetail$1.L$1;
            list = (List) chaloCardInfoComponent$setCurrentCardDetail$1.L$0;
            ResultKt.b(obj);
        } else {
            if (i7 == 2) {
                z = chaloCardInfoComponent$setCurrentCardDetail$1.Z$0;
                i3 = chaloCardInfoComponent$setCurrentCardDetail$1.I$0;
                list3 = (List) chaloCardInfoComponent$setCurrentCardDetail$1.L$3;
                chaloCardActivePass3 = (ChaloCardActivePass) chaloCardInfoComponent$setCurrentCardDetail$1.L$2;
                chaloCardDetailsA = (ChaloCardDetails) chaloCardInfoComponent$setCurrentCardDetail$1.L$1;
                list = (List) chaloCardInfoComponent$setCurrentCardDetail$1.L$0;
                ResultKt.b(obj);
                i2 = 0;
                str = (String) obj;
                chaloCardDetails = chaloCardDetailsA;
                list2 = list;
                chaloCardActivePass2 = chaloCardActivePass3;
                map = new HashMap();
                ChaloCardAnalyticsExtentionsKt.b(chaloCardDetails, map);
                if (chaloCardActivePass2 != null) {
                    ChaloCardAnalyticsExtentionsKt.a(chaloCardActivePass2, map);
                }
                AnalyticsContractImplKt.b(chaloCardInfoComponent.q, "chalo card info fetch success", Source.CHALO_CARD_INFO_SCREEN, ChaloCardInfoContractKt.a((ChaloCardInfoViewState) stateFlow.getValue(), null), false, 24);
                if (chaloCardActivePass2 != null) {
                    c = chaloCardActivePass2.getC();
                } else {
                    c = null;
                }
                if (c == null && c.intValue() == -1) {
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list3;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                    chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i3;
                    chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                    chaloCardInfoComponent$setCurrentCardDetail$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.UNLIMITED, new Object[i2], chaloCardInfoComponent$setCurrentCardDetail$1);
                    if (objB2 != obj2) {
                        str2 = str;
                        obj = objB2;
                        i4 = i3;
                        list4 = list3;
                        list5 = list2;
                        strValueOf = (String) obj;
                        str = str2;
                        list2 = list5;
                        GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase = chaloCardInfoComponent.p;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list4;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$5 = strValueOf;
                        chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i4;
                        chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                        chaloCardInfoComponent$setCurrentCardDetail$1.label = 5;
                        objA = getChaloCardPassDescriptionFromPassAttrUseCase.a(chaloCardActivePass2, chaloCardInfoComponent$setCurrentCardDetail$1);
                        if (objA != obj2) {
                            list6 = list4;
                            list7 = list2;
                            chaloCardActivePass4 = chaloCardActivePass2;
                            chaloCardDetails2 = chaloCardDetails;
                            str3 = strValueOf;
                            str4 = str;
                        }
                    }
                } else if (c != null && c.intValue() == 0) {
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list3;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                    chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i3;
                    chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                    chaloCardInfoComponent$setCurrentCardDetail$1.label = 4;
                    objB = stringProvider.b(StringEnum.NO_SMALL, new Object[0], chaloCardInfoComponent$setCurrentCardDetail$1);
                    if (objB != obj2) {
                        str2 = str;
                        obj = objB;
                        i4 = i3;
                        list4 = list3;
                        list5 = list2;
                        strValueOf = (String) obj;
                        str = str2;
                        list2 = list5;
                        GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase2 = chaloCardInfoComponent.p;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list4;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$5 = strValueOf;
                        chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i4;
                        chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                        chaloCardInfoComponent$setCurrentCardDetail$1.label = 5;
                        objA = getChaloCardPassDescriptionFromPassAttrUseCase2.a(chaloCardActivePass2, chaloCardInfoComponent$setCurrentCardDetail$1);
                        if (objA != obj2) {
                            list6 = list4;
                            list7 = list2;
                            chaloCardActivePass4 = chaloCardActivePass2;
                            chaloCardDetails2 = chaloCardDetails;
                            str3 = strValueOf;
                            str4 = str;
                        }
                    }
                } else {
                    if (c == null) {
                        i4 = i3;
                        list4 = list3;
                        strValueOf = null;
                    } else {
                        strValueOf = String.valueOf(chaloCardActivePass2.getC());
                        i4 = i3;
                        list4 = list3;
                    }
                    GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase3 = chaloCardInfoComponent.p;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list4;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$5 = strValueOf;
                    chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i4;
                    chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                    chaloCardInfoComponent$setCurrentCardDetail$1.label = 5;
                    objA = getChaloCardPassDescriptionFromPassAttrUseCase3.a(chaloCardActivePass2, chaloCardInfoComponent$setCurrentCardDetail$1);
                    if (objA != obj2) {
                        list6 = list4;
                        list7 = list2;
                        chaloCardActivePass4 = chaloCardActivePass2;
                        chaloCardDetails2 = chaloCardDetails;
                        str3 = strValueOf;
                        str4 = str;
                    }
                }
                return obj2;
            }
            if (i7 == 3) {
                z = chaloCardInfoComponent$setCurrentCardDetail$1.Z$0;
                i4 = chaloCardInfoComponent$setCurrentCardDetail$1.I$0;
                str2 = (String) chaloCardInfoComponent$setCurrentCardDetail$1.L$4;
                list4 = (List) chaloCardInfoComponent$setCurrentCardDetail$1.L$3;
                chaloCardActivePass2 = (ChaloCardActivePass) chaloCardInfoComponent$setCurrentCardDetail$1.L$2;
                chaloCardDetails = (ChaloCardDetails) chaloCardInfoComponent$setCurrentCardDetail$1.L$1;
                list5 = (List) chaloCardInfoComponent$setCurrentCardDetail$1.L$0;
                ResultKt.b(obj);
                strValueOf = (String) obj;
                str = str2;
                list2 = list5;
                GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase4 = chaloCardInfoComponent.p;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list4;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$5 = strValueOf;
                chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i4;
                chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                chaloCardInfoComponent$setCurrentCardDetail$1.label = 5;
                objA = getChaloCardPassDescriptionFromPassAttrUseCase4.a(chaloCardActivePass2, chaloCardInfoComponent$setCurrentCardDetail$1);
                if (objA != obj2) {
                    list6 = list4;
                    list7 = list2;
                    chaloCardActivePass4 = chaloCardActivePass2;
                    chaloCardDetails2 = chaloCardDetails;
                    str3 = strValueOf;
                    str4 = str;
                }
                return obj2;
            }
            if (i7 == 4) {
                z = chaloCardInfoComponent$setCurrentCardDetail$1.Z$0;
                i4 = chaloCardInfoComponent$setCurrentCardDetail$1.I$0;
                str2 = (String) chaloCardInfoComponent$setCurrentCardDetail$1.L$4;
                list4 = (List) chaloCardInfoComponent$setCurrentCardDetail$1.L$3;
                chaloCardActivePass2 = (ChaloCardActivePass) chaloCardInfoComponent$setCurrentCardDetail$1.L$2;
                chaloCardDetails = (ChaloCardDetails) chaloCardInfoComponent$setCurrentCardDetail$1.L$1;
                list5 = (List) chaloCardInfoComponent$setCurrentCardDetail$1.L$0;
                ResultKt.b(obj);
                strValueOf = (String) obj;
                str = str2;
                list2 = list5;
                GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase5 = chaloCardInfoComponent.p;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list4;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$5 = strValueOf;
                chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i4;
                chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                chaloCardInfoComponent$setCurrentCardDetail$1.label = 5;
                objA = getChaloCardPassDescriptionFromPassAttrUseCase5.a(chaloCardActivePass2, chaloCardInfoComponent$setCurrentCardDetail$1);
                if (objA != obj2) {
                    list6 = list4;
                    list7 = list2;
                    chaloCardActivePass4 = chaloCardActivePass2;
                    chaloCardDetails2 = chaloCardDetails;
                    str3 = strValueOf;
                    str4 = str;
                }
                return obj2;
            }
            if (i7 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = chaloCardInfoComponent$setCurrentCardDetail$1.Z$0;
            i4 = chaloCardInfoComponent$setCurrentCardDetail$1.I$0;
            String str5 = (String) chaloCardInfoComponent$setCurrentCardDetail$1.L$5;
            String str6 = (String) chaloCardInfoComponent$setCurrentCardDetail$1.L$4;
            List list11 = (List) chaloCardInfoComponent$setCurrentCardDetail$1.L$3;
            ChaloCardActivePass chaloCardActivePass5 = (ChaloCardActivePass) chaloCardInfoComponent$setCurrentCardDetail$1.L$2;
            chaloCardDetails2 = (ChaloCardDetails) chaloCardInfoComponent$setCurrentCardDetail$1.L$1;
            list7 = (List) chaloCardInfoComponent$setCurrentCardDetail$1.L$0;
            ResultKt.b(obj);
            str4 = str6;
            list6 = list11;
            chaloCardActivePass4 = chaloCardActivePass5;
            str3 = str5;
            objA = obj;
        }
        final boolean z2 = z;
        final String str7 = (String) objA;
        final int i8 = i4;
        final List list12 = list7;
        final ChaloCardDetails chaloCardDetails3 = chaloCardDetails2;
        chaloCardInfoComponent.E0(new Function1() { // from class: oi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                ChaloCardActivePassDetailsUiModel chaloCardActivePassDetailsUiModel;
                ChaloCardInfoViewState it = (ChaloCardInfoViewState) obj3;
                Intrinsics.i(it, "it");
                ChaloCardInfoScreenLayoutType chaloCardInfoScreenLayoutType = ChaloCardInfoScreenLayoutType.SINGLE_CARD_DETAILS;
                List list13 = list12;
                int i9 = i8;
                String str8 = (String) list13.get(i9);
                ChaloCardInfoComponent chaloCardInfoComponent2 = chaloCardInfoComponent;
                CurrencyFeature currencyFeature = chaloCardInfoComponent2.l;
                ChaloCardDetails chaloCardDetails4 = chaloCardDetails3;
                String strA = currencyFeature.a(chaloCardDetails4.c().intValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                boolean b = chaloCardDetails4.getB();
                boolean z3 = z2;
                boolean z4 = b && !z3;
                boolean z5 = (chaloCardDetails4 instanceof OpenCardDetailsAppModel) && StringsKt.x(((OpenCardDetailsAppModel) chaloCardDetails4).d, "NCMC", false);
                ChaloCardActivePass chaloCardActivePass6 = chaloCardActivePass4;
                if (chaloCardActivePass6 != null) {
                    String f6155a = chaloCardActivePass6.getF6155a();
                    if (f6155a == null) {
                        f6155a = "";
                    }
                    TimeUtilsContract timeUtilsContract = chaloCardInfoComponent2.m;
                    Long b2 = chaloCardActivePass6.getB();
                    String strP = timeUtilsContract.P(b2 != null ? b2.longValue() : 0L);
                    String g = chaloCardActivePass6.getG();
                    if (g == null) {
                        g = "Unknown";
                    }
                    chaloCardActivePassDetailsUiModel = new ChaloCardActivePassDetailsUiModel(f6155a, strP, g, str3);
                } else {
                    chaloCardActivePassDetailsUiModel = null;
                }
                return ChaloCardInfoViewState.a(it, chaloCardDetails4, list13, false, i9, new SelectedCardDetailsUiModel(z3, str8, strA, z4, z5, list6, chaloCardActivePassDetailsUiModel, str4), chaloCardActivePass6, str7, null, chaloCardInfoScreenLayoutType, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388228);
            }
        });
        return unit;
        List list13 = (List) obj;
        i2 = 0;
        boolean zD = Intrinsics.d(chaloCardDetailsA.getH(), Boolean.TRUE);
        ChaloCardUnsyncedRechargeDetails chaloCardUnsyncedRechargeDetailsA = ChaloCardsInfoAppModelKt.a(chaloCardDetailsA.getF6157a(), chaloCardInfoComponent.G);
        if (chaloCardUnsyncedRechargeDetailsA != null) {
            String strA = chaloCardInfoComponent.l.a(chaloCardUnsyncedRechargeDetailsA.b, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list;
            chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetailsA;
            chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass;
            chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list13;
            chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i5;
            chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = zD;
            chaloCardInfoComponent$setCurrentCardDetail$1.label = 2;
            Object objB3 = stringProvider.b(StringEnum.RECHARGE_OF_X_PENDING, new Object[]{strA}, chaloCardInfoComponent$setCurrentCardDetail$1);
            if (objB3 != obj2) {
                list3 = list13;
                obj = objB3;
                chaloCardActivePass3 = chaloCardActivePass;
                i3 = i5;
                z = zD;
                str = (String) obj;
                chaloCardDetails = chaloCardDetailsA;
                list2 = list;
                chaloCardActivePass2 = chaloCardActivePass3;
                map = new HashMap();
                ChaloCardAnalyticsExtentionsKt.b(chaloCardDetails, map);
                if (chaloCardActivePass2 != null) {
                    ChaloCardAnalyticsExtentionsKt.a(chaloCardActivePass2, map);
                }
                AnalyticsContractImplKt.b(chaloCardInfoComponent.q, "chalo card info fetch success", Source.CHALO_CARD_INFO_SCREEN, ChaloCardInfoContractKt.a((ChaloCardInfoViewState) stateFlow.getValue(), null), false, 24);
                if (chaloCardActivePass2 != null) {
                    c = chaloCardActivePass2.getC();
                } else {
                    c = null;
                }
                if (c == null) {
                    if (c != null) {
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list3;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                        chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i3;
                        chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                        chaloCardInfoComponent$setCurrentCardDetail$1.label = 4;
                        objB = stringProvider.b(StringEnum.NO_SMALL, new Object[0], chaloCardInfoComponent$setCurrentCardDetail$1);
                        if (objB != obj2) {
                            str2 = str;
                            obj = objB;
                            i4 = i3;
                            list4 = list3;
                            list5 = list2;
                            strValueOf = (String) obj;
                            str = str2;
                            list2 = list5;
                            GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase6 = chaloCardInfoComponent.p;
                            chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                            chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                            chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                            chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list4;
                            chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                            chaloCardInfoComponent$setCurrentCardDetail$1.L$5 = strValueOf;
                            chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i4;
                            chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                            chaloCardInfoComponent$setCurrentCardDetail$1.label = 5;
                            objA = getChaloCardPassDescriptionFromPassAttrUseCase6.a(chaloCardActivePass2, chaloCardInfoComponent$setCurrentCardDetail$1);
                            if (objA != obj2) {
                                list6 = list4;
                                list7 = list2;
                                chaloCardActivePass4 = chaloCardActivePass2;
                                chaloCardDetails2 = chaloCardDetails;
                                str3 = strValueOf;
                                str4 = str;
                                final boolean z3 = z;
                                final String str8 = (String) objA;
                                final int i9 = i4;
                                final List list14 = list7;
                                final ChaloCardDetails chaloCardDetails4 = chaloCardDetails2;
                                chaloCardInfoComponent.E0(new Function1() { // from class: oi
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        ChaloCardActivePassDetailsUiModel chaloCardActivePassDetailsUiModel;
                                        ChaloCardInfoViewState it = (ChaloCardInfoViewState) obj3;
                                        Intrinsics.i(it, "it");
                                        ChaloCardInfoScreenLayoutType chaloCardInfoScreenLayoutType = ChaloCardInfoScreenLayoutType.SINGLE_CARD_DETAILS;
                                        List list15 = list14;
                                        int i10 = i9;
                                        String str9 = (String) list15.get(i10);
                                        ChaloCardInfoComponent chaloCardInfoComponent2 = chaloCardInfoComponent;
                                        CurrencyFeature currencyFeature = chaloCardInfoComponent2.l;
                                        ChaloCardDetails chaloCardDetails5 = chaloCardDetails4;
                                        String strA2 = currencyFeature.a(chaloCardDetails5.c().intValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                        boolean b = chaloCardDetails5.getB();
                                        boolean z4 = z3;
                                        boolean z5 = b && !z4;
                                        boolean z6 = (chaloCardDetails5 instanceof OpenCardDetailsAppModel) && StringsKt.x(((OpenCardDetailsAppModel) chaloCardDetails5).d, "NCMC", false);
                                        ChaloCardActivePass chaloCardActivePass6 = chaloCardActivePass4;
                                        if (chaloCardActivePass6 != null) {
                                            String f6155a = chaloCardActivePass6.getF6155a();
                                            if (f6155a == null) {
                                                f6155a = "";
                                            }
                                            TimeUtilsContract timeUtilsContract = chaloCardInfoComponent2.m;
                                            Long b2 = chaloCardActivePass6.getB();
                                            String strP = timeUtilsContract.P(b2 != null ? b2.longValue() : 0L);
                                            String g = chaloCardActivePass6.getG();
                                            if (g == null) {
                                                g = "Unknown";
                                            }
                                            chaloCardActivePassDetailsUiModel = new ChaloCardActivePassDetailsUiModel(f6155a, strP, g, str3);
                                        } else {
                                            chaloCardActivePassDetailsUiModel = null;
                                        }
                                        return ChaloCardInfoViewState.a(it, chaloCardDetails5, list15, false, i10, new SelectedCardDetailsUiModel(z4, str9, strA2, z5, z6, list6, chaloCardActivePassDetailsUiModel, str4), chaloCardActivePass6, str8, null, chaloCardInfoScreenLayoutType, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388228);
                                    }
                                });
                                return unit;
                            }
                        }
                    }
                    if (c == null) {
                        i4 = i3;
                        list4 = list3;
                        strValueOf = null;
                    } else {
                        strValueOf = String.valueOf(chaloCardActivePass2.getC());
                        i4 = i3;
                        list4 = list3;
                    }
                    GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase7 = chaloCardInfoComponent.p;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list4;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$5 = strValueOf;
                    chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i4;
                    chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                    chaloCardInfoComponent$setCurrentCardDetail$1.label = 5;
                    objA = getChaloCardPassDescriptionFromPassAttrUseCase7.a(chaloCardActivePass2, chaloCardInfoComponent$setCurrentCardDetail$1);
                    if (objA != obj2) {
                        list6 = list4;
                        list7 = list2;
                        chaloCardActivePass4 = chaloCardActivePass2;
                        chaloCardDetails2 = chaloCardDetails;
                        str3 = strValueOf;
                        str4 = str;
                        final boolean z4 = z;
                        final String str9 = (String) objA;
                        final int i10 = i4;
                        final List list15 = list7;
                        final ChaloCardDetails chaloCardDetails5 = chaloCardDetails2;
                        chaloCardInfoComponent.E0(new Function1() { // from class: oi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                ChaloCardActivePassDetailsUiModel chaloCardActivePassDetailsUiModel;
                                ChaloCardInfoViewState it = (ChaloCardInfoViewState) obj3;
                                Intrinsics.i(it, "it");
                                ChaloCardInfoScreenLayoutType chaloCardInfoScreenLayoutType = ChaloCardInfoScreenLayoutType.SINGLE_CARD_DETAILS;
                                List list16 = list15;
                                int i11 = i10;
                                String str10 = (String) list16.get(i11);
                                ChaloCardInfoComponent chaloCardInfoComponent2 = chaloCardInfoComponent;
                                CurrencyFeature currencyFeature = chaloCardInfoComponent2.l;
                                ChaloCardDetails chaloCardDetails6 = chaloCardDetails5;
                                String strA2 = currencyFeature.a(chaloCardDetails6.c().intValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                boolean b = chaloCardDetails6.getB();
                                boolean z5 = z4;
                                boolean z6 = b && !z5;
                                boolean z7 = (chaloCardDetails6 instanceof OpenCardDetailsAppModel) && StringsKt.x(((OpenCardDetailsAppModel) chaloCardDetails6).d, "NCMC", false);
                                ChaloCardActivePass chaloCardActivePass6 = chaloCardActivePass4;
                                if (chaloCardActivePass6 != null) {
                                    String f6155a = chaloCardActivePass6.getF6155a();
                                    if (f6155a == null) {
                                        f6155a = "";
                                    }
                                    TimeUtilsContract timeUtilsContract = chaloCardInfoComponent2.m;
                                    Long b2 = chaloCardActivePass6.getB();
                                    String strP = timeUtilsContract.P(b2 != null ? b2.longValue() : 0L);
                                    String g = chaloCardActivePass6.getG();
                                    if (g == null) {
                                        g = "Unknown";
                                    }
                                    chaloCardActivePassDetailsUiModel = new ChaloCardActivePassDetailsUiModel(f6155a, strP, g, str3);
                                } else {
                                    chaloCardActivePassDetailsUiModel = null;
                                }
                                return ChaloCardInfoViewState.a(it, chaloCardDetails6, list16, false, i11, new SelectedCardDetailsUiModel(z5, str10, strA2, z6, z7, list6, chaloCardActivePassDetailsUiModel, str4), chaloCardActivePass6, str9, null, chaloCardInfoScreenLayoutType, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388228);
                            }
                        });
                        return unit;
                    }
                } else {
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list3;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                    chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i3;
                    chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                    chaloCardInfoComponent$setCurrentCardDetail$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.UNLIMITED, new Object[i2], chaloCardInfoComponent$setCurrentCardDetail$1);
                    if (objB2 != obj2) {
                        str2 = str;
                        obj = objB2;
                        i4 = i3;
                        list4 = list3;
                        list5 = list2;
                        strValueOf = (String) obj;
                        str = str2;
                        list2 = list5;
                        GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase8 = chaloCardInfoComponent.p;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list4;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$5 = strValueOf;
                        chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i4;
                        chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                        chaloCardInfoComponent$setCurrentCardDetail$1.label = 5;
                        objA = getChaloCardPassDescriptionFromPassAttrUseCase8.a(chaloCardActivePass2, chaloCardInfoComponent$setCurrentCardDetail$1);
                        if (objA != obj2) {
                            list6 = list4;
                            list7 = list2;
                            chaloCardActivePass4 = chaloCardActivePass2;
                            chaloCardDetails2 = chaloCardDetails;
                            str3 = strValueOf;
                            str4 = str;
                            final boolean z5 = z;
                            final String str10 = (String) objA;
                            final int i11 = i4;
                            final List list16 = list7;
                            final ChaloCardDetails chaloCardDetails6 = chaloCardDetails2;
                            chaloCardInfoComponent.E0(new Function1() { // from class: oi
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    ChaloCardActivePassDetailsUiModel chaloCardActivePassDetailsUiModel;
                                    ChaloCardInfoViewState it = (ChaloCardInfoViewState) obj3;
                                    Intrinsics.i(it, "it");
                                    ChaloCardInfoScreenLayoutType chaloCardInfoScreenLayoutType = ChaloCardInfoScreenLayoutType.SINGLE_CARD_DETAILS;
                                    List list17 = list16;
                                    int i12 = i11;
                                    String str11 = (String) list17.get(i12);
                                    ChaloCardInfoComponent chaloCardInfoComponent2 = chaloCardInfoComponent;
                                    CurrencyFeature currencyFeature = chaloCardInfoComponent2.l;
                                    ChaloCardDetails chaloCardDetails7 = chaloCardDetails6;
                                    String strA2 = currencyFeature.a(chaloCardDetails7.c().intValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                    boolean b = chaloCardDetails7.getB();
                                    boolean z6 = z5;
                                    boolean z7 = b && !z6;
                                    boolean z8 = (chaloCardDetails7 instanceof OpenCardDetailsAppModel) && StringsKt.x(((OpenCardDetailsAppModel) chaloCardDetails7).d, "NCMC", false);
                                    ChaloCardActivePass chaloCardActivePass6 = chaloCardActivePass4;
                                    if (chaloCardActivePass6 != null) {
                                        String f6155a = chaloCardActivePass6.getF6155a();
                                        if (f6155a == null) {
                                            f6155a = "";
                                        }
                                        TimeUtilsContract timeUtilsContract = chaloCardInfoComponent2.m;
                                        Long b2 = chaloCardActivePass6.getB();
                                        String strP = timeUtilsContract.P(b2 != null ? b2.longValue() : 0L);
                                        String g = chaloCardActivePass6.getG();
                                        if (g == null) {
                                            g = "Unknown";
                                        }
                                        chaloCardActivePassDetailsUiModel = new ChaloCardActivePassDetailsUiModel(f6155a, strP, g, str3);
                                    } else {
                                        chaloCardActivePassDetailsUiModel = null;
                                    }
                                    return ChaloCardInfoViewState.a(it, chaloCardDetails7, list17, false, i12, new SelectedCardDetailsUiModel(z6, str11, strA2, z7, z8, list6, chaloCardActivePassDetailsUiModel, str4), chaloCardActivePass6, str10, null, chaloCardInfoScreenLayoutType, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388228);
                                }
                            });
                            return unit;
                        }
                    }
                }
            }
        } else {
            ChaloCardActivePass chaloCardActivePass6 = chaloCardActivePass;
            i3 = i5;
            z = zD;
            chaloCardDetails = chaloCardDetailsA;
            list2 = list;
            chaloCardActivePass2 = chaloCardActivePass6;
            list3 = list13;
            str = null;
            map = new HashMap();
            ChaloCardAnalyticsExtentionsKt.b(chaloCardDetails, map);
            if (chaloCardActivePass2 != null) {
                ChaloCardAnalyticsExtentionsKt.a(chaloCardActivePass2, map);
            }
            AnalyticsContractImplKt.b(chaloCardInfoComponent.q, "chalo card info fetch success", Source.CHALO_CARD_INFO_SCREEN, ChaloCardInfoContractKt.a((ChaloCardInfoViewState) stateFlow.getValue(), null), false, 24);
            if (chaloCardActivePass2 != null) {
                c = chaloCardActivePass2.getC();
            } else {
                c = null;
            }
            if (c == null) {
                if (c != null) {
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list3;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                    chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i3;
                    chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                    chaloCardInfoComponent$setCurrentCardDetail$1.label = 4;
                    objB = stringProvider.b(StringEnum.NO_SMALL, new Object[0], chaloCardInfoComponent$setCurrentCardDetail$1);
                    if (objB != obj2) {
                        str2 = str;
                        obj = objB;
                        i4 = i3;
                        list4 = list3;
                        list5 = list2;
                        strValueOf = (String) obj;
                        str = str2;
                        list2 = list5;
                        GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase9 = chaloCardInfoComponent.p;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list4;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                        chaloCardInfoComponent$setCurrentCardDetail$1.L$5 = strValueOf;
                        chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i4;
                        chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                        chaloCardInfoComponent$setCurrentCardDetail$1.label = 5;
                        objA = getChaloCardPassDescriptionFromPassAttrUseCase9.a(chaloCardActivePass2, chaloCardInfoComponent$setCurrentCardDetail$1);
                        if (objA != obj2) {
                            list6 = list4;
                            list7 = list2;
                            chaloCardActivePass4 = chaloCardActivePass2;
                            chaloCardDetails2 = chaloCardDetails;
                            str3 = strValueOf;
                            str4 = str;
                            final boolean z6 = z;
                            final String str11 = (String) objA;
                            final int i12 = i4;
                            final List list17 = list7;
                            final ChaloCardDetails chaloCardDetails7 = chaloCardDetails2;
                            chaloCardInfoComponent.E0(new Function1() { // from class: oi
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    ChaloCardActivePassDetailsUiModel chaloCardActivePassDetailsUiModel;
                                    ChaloCardInfoViewState it = (ChaloCardInfoViewState) obj3;
                                    Intrinsics.i(it, "it");
                                    ChaloCardInfoScreenLayoutType chaloCardInfoScreenLayoutType = ChaloCardInfoScreenLayoutType.SINGLE_CARD_DETAILS;
                                    List list18 = list17;
                                    int i13 = i12;
                                    String str12 = (String) list18.get(i13);
                                    ChaloCardInfoComponent chaloCardInfoComponent2 = chaloCardInfoComponent;
                                    CurrencyFeature currencyFeature = chaloCardInfoComponent2.l;
                                    ChaloCardDetails chaloCardDetails8 = chaloCardDetails7;
                                    String strA2 = currencyFeature.a(chaloCardDetails8.c().intValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                    boolean b = chaloCardDetails8.getB();
                                    boolean z7 = z6;
                                    boolean z8 = b && !z7;
                                    boolean z9 = (chaloCardDetails8 instanceof OpenCardDetailsAppModel) && StringsKt.x(((OpenCardDetailsAppModel) chaloCardDetails8).d, "NCMC", false);
                                    ChaloCardActivePass chaloCardActivePass7 = chaloCardActivePass4;
                                    if (chaloCardActivePass7 != null) {
                                        String f6155a = chaloCardActivePass7.getF6155a();
                                        if (f6155a == null) {
                                            f6155a = "";
                                        }
                                        TimeUtilsContract timeUtilsContract = chaloCardInfoComponent2.m;
                                        Long b2 = chaloCardActivePass7.getB();
                                        String strP = timeUtilsContract.P(b2 != null ? b2.longValue() : 0L);
                                        String g = chaloCardActivePass7.getG();
                                        if (g == null) {
                                            g = "Unknown";
                                        }
                                        chaloCardActivePassDetailsUiModel = new ChaloCardActivePassDetailsUiModel(f6155a, strP, g, str3);
                                    } else {
                                        chaloCardActivePassDetailsUiModel = null;
                                    }
                                    return ChaloCardInfoViewState.a(it, chaloCardDetails8, list18, false, i13, new SelectedCardDetailsUiModel(z7, str12, strA2, z8, z9, list6, chaloCardActivePassDetailsUiModel, str4), chaloCardActivePass7, str11, null, chaloCardInfoScreenLayoutType, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388228);
                                }
                            });
                            return unit;
                        }
                    }
                }
                if (c == null) {
                    i4 = i3;
                    list4 = list3;
                    strValueOf = null;
                } else {
                    strValueOf = String.valueOf(chaloCardActivePass2.getC());
                    i4 = i3;
                    list4 = list3;
                }
                GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase10 = chaloCardInfoComponent.p;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list4;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$5 = strValueOf;
                chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i4;
                chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                chaloCardInfoComponent$setCurrentCardDetail$1.label = 5;
                objA = getChaloCardPassDescriptionFromPassAttrUseCase10.a(chaloCardActivePass2, chaloCardInfoComponent$setCurrentCardDetail$1);
                if (objA != obj2) {
                    list6 = list4;
                    list7 = list2;
                    chaloCardActivePass4 = chaloCardActivePass2;
                    chaloCardDetails2 = chaloCardDetails;
                    str3 = strValueOf;
                    str4 = str;
                    final boolean z7 = z;
                    final String str12 = (String) objA;
                    final int i13 = i4;
                    final List list18 = list7;
                    final ChaloCardDetails chaloCardDetails8 = chaloCardDetails2;
                    chaloCardInfoComponent.E0(new Function1() { // from class: oi
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            ChaloCardActivePassDetailsUiModel chaloCardActivePassDetailsUiModel;
                            ChaloCardInfoViewState it = (ChaloCardInfoViewState) obj3;
                            Intrinsics.i(it, "it");
                            ChaloCardInfoScreenLayoutType chaloCardInfoScreenLayoutType = ChaloCardInfoScreenLayoutType.SINGLE_CARD_DETAILS;
                            List list19 = list18;
                            int i14 = i13;
                            String str13 = (String) list19.get(i14);
                            ChaloCardInfoComponent chaloCardInfoComponent2 = chaloCardInfoComponent;
                            CurrencyFeature currencyFeature = chaloCardInfoComponent2.l;
                            ChaloCardDetails chaloCardDetails9 = chaloCardDetails8;
                            String strA2 = currencyFeature.a(chaloCardDetails9.c().intValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                            boolean b = chaloCardDetails9.getB();
                            boolean z8 = z7;
                            boolean z9 = b && !z8;
                            boolean z10 = (chaloCardDetails9 instanceof OpenCardDetailsAppModel) && StringsKt.x(((OpenCardDetailsAppModel) chaloCardDetails9).d, "NCMC", false);
                            ChaloCardActivePass chaloCardActivePass7 = chaloCardActivePass4;
                            if (chaloCardActivePass7 != null) {
                                String f6155a = chaloCardActivePass7.getF6155a();
                                if (f6155a == null) {
                                    f6155a = "";
                                }
                                TimeUtilsContract timeUtilsContract = chaloCardInfoComponent2.m;
                                Long b2 = chaloCardActivePass7.getB();
                                String strP = timeUtilsContract.P(b2 != null ? b2.longValue() : 0L);
                                String g = chaloCardActivePass7.getG();
                                if (g == null) {
                                    g = "Unknown";
                                }
                                chaloCardActivePassDetailsUiModel = new ChaloCardActivePassDetailsUiModel(f6155a, strP, g, str3);
                            } else {
                                chaloCardActivePassDetailsUiModel = null;
                            }
                            return ChaloCardInfoViewState.a(it, chaloCardDetails9, list19, false, i14, new SelectedCardDetailsUiModel(z8, str13, strA2, z9, z10, list6, chaloCardActivePassDetailsUiModel, str4), chaloCardActivePass7, str12, null, chaloCardInfoScreenLayoutType, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388228);
                        }
                    });
                    return unit;
                }
            } else {
                chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list3;
                chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i3;
                chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                chaloCardInfoComponent$setCurrentCardDetail$1.label = 3;
                objB2 = stringProvider.b(StringEnum.UNLIMITED, new Object[i2], chaloCardInfoComponent$setCurrentCardDetail$1);
                if (objB2 != obj2) {
                    str2 = str;
                    obj = objB2;
                    i4 = i3;
                    list4 = list3;
                    list5 = list2;
                    strValueOf = (String) obj;
                    str = str2;
                    list2 = list5;
                    GetChaloCardPassDescriptionFromPassAttrUseCase getChaloCardPassDescriptionFromPassAttrUseCase11 = chaloCardInfoComponent.p;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$0 = list2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$1 = chaloCardDetails;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$2 = chaloCardActivePass2;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$3 = list4;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$4 = str;
                    chaloCardInfoComponent$setCurrentCardDetail$1.L$5 = strValueOf;
                    chaloCardInfoComponent$setCurrentCardDetail$1.I$0 = i4;
                    chaloCardInfoComponent$setCurrentCardDetail$1.Z$0 = z;
                    chaloCardInfoComponent$setCurrentCardDetail$1.label = 5;
                    objA = getChaloCardPassDescriptionFromPassAttrUseCase11.a(chaloCardActivePass2, chaloCardInfoComponent$setCurrentCardDetail$1);
                    if (objA != obj2) {
                        list6 = list4;
                        list7 = list2;
                        chaloCardActivePass4 = chaloCardActivePass2;
                        chaloCardDetails2 = chaloCardDetails;
                        str3 = strValueOf;
                        str4 = str;
                        final boolean z8 = z;
                        final String str13 = (String) objA;
                        final int i14 = i4;
                        final List list19 = list7;
                        final ChaloCardDetails chaloCardDetails9 = chaloCardDetails2;
                        chaloCardInfoComponent.E0(new Function1() { // from class: oi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                ChaloCardActivePassDetailsUiModel chaloCardActivePassDetailsUiModel;
                                ChaloCardInfoViewState it = (ChaloCardInfoViewState) obj3;
                                Intrinsics.i(it, "it");
                                ChaloCardInfoScreenLayoutType chaloCardInfoScreenLayoutType = ChaloCardInfoScreenLayoutType.SINGLE_CARD_DETAILS;
                                List list110 = list19;
                                int i15 = i14;
                                String str14 = (String) list110.get(i15);
                                ChaloCardInfoComponent chaloCardInfoComponent2 = chaloCardInfoComponent;
                                CurrencyFeature currencyFeature = chaloCardInfoComponent2.l;
                                ChaloCardDetails chaloCardDetails10 = chaloCardDetails9;
                                String strA2 = currencyFeature.a(chaloCardDetails10.c().intValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                boolean b = chaloCardDetails10.getB();
                                boolean z9 = z8;
                                boolean z10 = b && !z9;
                                boolean z11 = (chaloCardDetails10 instanceof OpenCardDetailsAppModel) && StringsKt.x(((OpenCardDetailsAppModel) chaloCardDetails10).d, "NCMC", false);
                                ChaloCardActivePass chaloCardActivePass7 = chaloCardActivePass4;
                                if (chaloCardActivePass7 != null) {
                                    String f6155a = chaloCardActivePass7.getF6155a();
                                    if (f6155a == null) {
                                        f6155a = "";
                                    }
                                    TimeUtilsContract timeUtilsContract = chaloCardInfoComponent2.m;
                                    Long b2 = chaloCardActivePass7.getB();
                                    String strP = timeUtilsContract.P(b2 != null ? b2.longValue() : 0L);
                                    String g = chaloCardActivePass7.getG();
                                    if (g == null) {
                                        g = "Unknown";
                                    }
                                    chaloCardActivePassDetailsUiModel = new ChaloCardActivePassDetailsUiModel(f6155a, strP, g, str3);
                                } else {
                                    chaloCardActivePassDetailsUiModel = null;
                                }
                                return ChaloCardInfoViewState.a(it, chaloCardDetails10, list110, false, i15, new SelectedCardDetailsUiModel(z9, str14, strA2, z10, z11, list6, chaloCardActivePassDetailsUiModel, str4), chaloCardActivePass7, str13, null, chaloCardInfoScreenLayoutType, null, false, null, null, null, null, false, null, false, null, false, null, false, 8388228);
                            }
                        });
                        return unit;
                    }
                }
            }
        }
        return obj2;
    }

    public final void I0(UvikServiceType uvikServiceType) {
        if (!this.B.a()) {
            E0(new pi(3));
        } else {
            BuildersKt.d(this.j, null, null, new ChaloCardInfoComponent$startUvikTapProcessing$1(this, uvikServiceType, null), 3);
        }
    }

    public final void J0(boolean z) {
        BuildersKt.d(this.j, null, null, new ChaloCardInfoComponent$fetchCardInfo$1(z, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0132  */
    /* JADX WARN: Code duplicated, block: B:48:0x016a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0185  */
    /* JADX WARN: Code duplicated, block: B:54:0x019b  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a8 A[PHI: r2 r6 r7
      0x01a8: PHI (r2v35 java.util.List) = (r2v32 java.util.List), (r2v38 java.util.List) binds: [B:50:0x0183, B:55:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r6v17 java.util.List) = (r6v14 java.util.List), (r6v18 java.util.List) binds: [B:50:0x0183, B:55:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r7v16 app.chalo.ncmc.data.appmodel.ChaloCardDetails) = (r7v13 app.chalo.ncmc.data.appmodel.ChaloCardDetails), (r7v17 app.chalo.ncmc.data.appmodel.ChaloCardDetails) binds: [B:50:0x0183, B:55:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K0(ChaloCardDetails chaloCardDetails, ContinuationImpl continuationImpl) {
        ChaloCardInfoComponent$getCardOperationList$1 chaloCardInfoComponent$getCardOperationList$1;
        List listL;
        ChaloCardDetails chaloCardDetails2;
        List list;
        Object objB;
        List list2;
        List list3;
        Object objB2;
        Object obj;
        List list4;
        Object objB3;
        List list5;
        List list6;
        Object objB4;
        List list7;
        List list8;
        List list9;
        List list10;
        List list11;
        if (continuationImpl instanceof ChaloCardInfoComponent$getCardOperationList$1) {
            chaloCardInfoComponent$getCardOperationList$1 = (ChaloCardInfoComponent$getCardOperationList$1) continuationImpl;
            int i = chaloCardInfoComponent$getCardOperationList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloCardInfoComponent$getCardOperationList$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloCardInfoComponent$getCardOperationList$1 = new ChaloCardInfoComponent$getCardOperationList$1(this, continuationImpl);
            }
        } else {
            chaloCardInfoComponent$getCardOperationList$1 = new ChaloCardInfoComponent$getCardOperationList$1(this, continuationImpl);
        }
        Object objB5 = chaloCardInfoComponent$getCardOperationList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloCardInfoComponent$getCardOperationList$1.label;
        StringProvider stringProvider = this.y;
        switch (i2) {
            case 0:
                listL = py.l(objB5);
                if (!(chaloCardDetails instanceof ClosedCardDetailsAppModel) && !(chaloCardDetails instanceof SemiClosedCardDetailsAppModel) && !(chaloCardDetails instanceof UnknownCardDetailsAppModel)) {
                    if (!(chaloCardDetails instanceof OpenCardDetailsAppModel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.B.c();
                    if (StringsKt.x(((OpenCardDetailsAppModel) chaloCardDetails).d, "NCMC", false)) {
                        chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails;
                        chaloCardInfoComponent$getCardOperationList$1.L$1 = listL;
                        chaloCardInfoComponent$getCardOperationList$1.L$2 = listL;
                        chaloCardInfoComponent$getCardOperationList$1.L$3 = listL;
                        chaloCardInfoComponent$getCardOperationList$1.label = 1;
                        objB = stringProvider.b(StringEnum.VIEW_OFFLINE_BALANCE, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                        if (objB != coroutineSingletons) {
                            chaloCardDetails2 = chaloCardDetails;
                            list2 = listL;
                            list3 = list2;
                            list2.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.ViewOfflineBalance.f6373a, (String) objB, null));
                            chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                            chaloCardInfoComponent$getCardOperationList$1.L$1 = list3;
                            chaloCardInfoComponent$getCardOperationList$1.L$2 = listL;
                            chaloCardInfoComponent$getCardOperationList$1.L$3 = listL;
                            chaloCardInfoComponent$getCardOperationList$1.label = 2;
                            objB2 = stringProvider.b(StringEnum.UPDATE_BALANCE, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                            if (objB2 != coroutineSingletons) {
                                obj = objB2;
                                list4 = listL;
                                list4.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.UpdateBalance.f6372a, (String) obj, null));
                                chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                                chaloCardInfoComponent$getCardOperationList$1.L$1 = list3;
                                chaloCardInfoComponent$getCardOperationList$1.L$2 = listL;
                                chaloCardInfoComponent$getCardOperationList$1.L$3 = listL;
                                chaloCardInfoComponent$getCardOperationList$1.label = 3;
                                objB3 = stringProvider.b(StringEnum.CHANGE_PIN, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                                if (objB3 != coroutineSingletons) {
                                    list5 = listL;
                                    objB5 = objB3;
                                    list6 = list5;
                                    list6.add(new ChaloCardOptionUiModel(new ChaloCardOperationType.SpecificCardOption.ChangePin(((OpenCardDetailsAppModel) chaloCardDetails2).k), (String) objB5, null));
                                    list = list5;
                                    listL = list3;
                                    chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                                    chaloCardInfoComponent$getCardOperationList$1.L$1 = listL;
                                    chaloCardInfoComponent$getCardOperationList$1.L$2 = list;
                                    chaloCardInfoComponent$getCardOperationList$1.L$3 = list;
                                    chaloCardInfoComponent$getCardOperationList$1.label = 4;
                                    objB4 = stringProvider.b(StringEnum.SHOW_MY_CARD_TRANSACTIONS, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                                    if (objB4 != coroutineSingletons) {
                                        list7 = listL;
                                        objB5 = objB4;
                                        list8 = list;
                                        list.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.ViewTransactions.f6374a, (String) objB5, null));
                                        if (Intrinsics.d(chaloCardDetails2.getJ(), Boolean.TRUE)) {
                                            chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                                            chaloCardInfoComponent$getCardOperationList$1.L$1 = list7;
                                            chaloCardInfoComponent$getCardOperationList$1.L$2 = list8;
                                            chaloCardInfoComponent$getCardOperationList$1.L$3 = list8;
                                            chaloCardInfoComponent$getCardOperationList$1.label = 5;
                                            objB5 = stringProvider.b(StringEnum.BLOCK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                                            if (objB5 != coroutineSingletons) {
                                                list9 = list8;
                                                list9.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Block.f6368a, (String) objB5, null));
                                                list10 = list8;
                                                if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                                                    return list7;
                                                }
                                                chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                                                chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                                                chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                                                chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                                                chaloCardInfoComponent$getCardOperationList$1.label = 6;
                                                objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                                                if (objB5 != coroutineSingletons) {
                                                    list11 = list7;
                                                    list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                                                    return list11;
                                                }
                                            }
                                        } else {
                                            list10 = list8;
                                            if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                                                return list7;
                                            }
                                            chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                                            chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                                            chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                                            chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                                            chaloCardInfoComponent$getCardOperationList$1.label = 6;
                                            objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                                            if (objB5 != coroutineSingletons) {
                                                list11 = list7;
                                                list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                                                return list11;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                chaloCardDetails2 = chaloCardDetails;
                list = listL;
                chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                chaloCardInfoComponent$getCardOperationList$1.L$1 = listL;
                chaloCardInfoComponent$getCardOperationList$1.L$2 = list;
                chaloCardInfoComponent$getCardOperationList$1.L$3 = list;
                chaloCardInfoComponent$getCardOperationList$1.label = 4;
                objB4 = stringProvider.b(StringEnum.SHOW_MY_CARD_TRANSACTIONS, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                if (objB4 != coroutineSingletons) {
                    list7 = listL;
                    objB5 = objB4;
                    list8 = list;
                    list.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.ViewTransactions.f6374a, (String) objB5, null));
                    if (Intrinsics.d(chaloCardDetails2.getJ(), Boolean.TRUE)) {
                        chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                        chaloCardInfoComponent$getCardOperationList$1.L$1 = list7;
                        chaloCardInfoComponent$getCardOperationList$1.L$2 = list8;
                        chaloCardInfoComponent$getCardOperationList$1.L$3 = list8;
                        chaloCardInfoComponent$getCardOperationList$1.label = 5;
                        objB5 = stringProvider.b(StringEnum.BLOCK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                        if (objB5 != coroutineSingletons) {
                            list9 = list8;
                            list9.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Block.f6368a, (String) objB5, null));
                            list10 = list8;
                            if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                                return list7;
                            }
                            chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                            chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                            chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                            chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                            chaloCardInfoComponent$getCardOperationList$1.label = 6;
                            objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                            if (objB5 != coroutineSingletons) {
                                list11 = list7;
                                list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                                return list11;
                            }
                        }
                    } else {
                        list10 = list8;
                        if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                            return list7;
                        }
                        chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                        chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                        chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                        chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                        chaloCardInfoComponent$getCardOperationList$1.label = 6;
                        objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                        if (objB5 != coroutineSingletons) {
                            list11 = list7;
                            list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                            return list11;
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                list2 = (List) chaloCardInfoComponent$getCardOperationList$1.L$3;
                List list12 = (List) chaloCardInfoComponent$getCardOperationList$1.L$2;
                list3 = (List) chaloCardInfoComponent$getCardOperationList$1.L$1;
                chaloCardDetails2 = (ChaloCardDetails) chaloCardInfoComponent$getCardOperationList$1.L$0;
                ResultKt.b(objB5);
                objB = objB5;
                listL = list12;
                list2.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.ViewOfflineBalance.f6373a, (String) objB, null));
                chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                chaloCardInfoComponent$getCardOperationList$1.L$1 = list3;
                chaloCardInfoComponent$getCardOperationList$1.L$2 = listL;
                chaloCardInfoComponent$getCardOperationList$1.L$3 = listL;
                chaloCardInfoComponent$getCardOperationList$1.label = 2;
                objB2 = stringProvider.b(StringEnum.UPDATE_BALANCE, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                if (objB2 != coroutineSingletons) {
                    obj = objB2;
                    list4 = listL;
                    list4.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.UpdateBalance.f6372a, (String) obj, null));
                    chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                    chaloCardInfoComponent$getCardOperationList$1.L$1 = list3;
                    chaloCardInfoComponent$getCardOperationList$1.L$2 = listL;
                    chaloCardInfoComponent$getCardOperationList$1.L$3 = listL;
                    chaloCardInfoComponent$getCardOperationList$1.label = 3;
                    objB3 = stringProvider.b(StringEnum.CHANGE_PIN, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                    if (objB3 != coroutineSingletons) {
                        list5 = listL;
                        objB5 = objB3;
                        list6 = list5;
                        list6.add(new ChaloCardOptionUiModel(new ChaloCardOperationType.SpecificCardOption.ChangePin(((OpenCardDetailsAppModel) chaloCardDetails2).k), (String) objB5, null));
                        list = list5;
                        listL = list3;
                        chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                        chaloCardInfoComponent$getCardOperationList$1.L$1 = listL;
                        chaloCardInfoComponent$getCardOperationList$1.L$2 = list;
                        chaloCardInfoComponent$getCardOperationList$1.L$3 = list;
                        chaloCardInfoComponent$getCardOperationList$1.label = 4;
                        objB4 = stringProvider.b(StringEnum.SHOW_MY_CARD_TRANSACTIONS, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                        if (objB4 != coroutineSingletons) {
                            list7 = listL;
                            objB5 = objB4;
                            list8 = list;
                            list.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.ViewTransactions.f6374a, (String) objB5, null));
                            if (Intrinsics.d(chaloCardDetails2.getJ(), Boolean.TRUE)) {
                                chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                                chaloCardInfoComponent$getCardOperationList$1.L$1 = list7;
                                chaloCardInfoComponent$getCardOperationList$1.L$2 = list8;
                                chaloCardInfoComponent$getCardOperationList$1.L$3 = list8;
                                chaloCardInfoComponent$getCardOperationList$1.label = 5;
                                objB5 = stringProvider.b(StringEnum.BLOCK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                                if (objB5 != coroutineSingletons) {
                                    list9 = list8;
                                    list9.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Block.f6368a, (String) objB5, null));
                                    list10 = list8;
                                    if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                                        return list7;
                                    }
                                    chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                                    chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                                    chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                                    chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                                    chaloCardInfoComponent$getCardOperationList$1.label = 6;
                                    objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                                    if (objB5 != coroutineSingletons) {
                                        list11 = list7;
                                        list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                                        return list11;
                                    }
                                }
                            } else {
                                list10 = list8;
                                if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                                    return list7;
                                }
                                chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                                chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                                chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                                chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                                chaloCardInfoComponent$getCardOperationList$1.label = 6;
                                objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                                if (objB5 != coroutineSingletons) {
                                    list11 = list7;
                                    list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                                    return list11;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                list4 = (List) chaloCardInfoComponent$getCardOperationList$1.L$3;
                List list13 = (List) chaloCardInfoComponent$getCardOperationList$1.L$2;
                list3 = (List) chaloCardInfoComponent$getCardOperationList$1.L$1;
                chaloCardDetails2 = (ChaloCardDetails) chaloCardInfoComponent$getCardOperationList$1.L$0;
                ResultKt.b(objB5);
                obj = objB5;
                listL = list13;
                list4.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.UpdateBalance.f6372a, (String) obj, null));
                chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                chaloCardInfoComponent$getCardOperationList$1.L$1 = list3;
                chaloCardInfoComponent$getCardOperationList$1.L$2 = listL;
                chaloCardInfoComponent$getCardOperationList$1.L$3 = listL;
                chaloCardInfoComponent$getCardOperationList$1.label = 3;
                objB3 = stringProvider.b(StringEnum.CHANGE_PIN, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                if (objB3 != coroutineSingletons) {
                    list5 = listL;
                    objB5 = objB3;
                    list6 = list5;
                    list6.add(new ChaloCardOptionUiModel(new ChaloCardOperationType.SpecificCardOption.ChangePin(((OpenCardDetailsAppModel) chaloCardDetails2).k), (String) objB5, null));
                    list = list5;
                    listL = list3;
                    chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                    chaloCardInfoComponent$getCardOperationList$1.L$1 = listL;
                    chaloCardInfoComponent$getCardOperationList$1.L$2 = list;
                    chaloCardInfoComponent$getCardOperationList$1.L$3 = list;
                    chaloCardInfoComponent$getCardOperationList$1.label = 4;
                    objB4 = stringProvider.b(StringEnum.SHOW_MY_CARD_TRANSACTIONS, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                    if (objB4 != coroutineSingletons) {
                        list7 = listL;
                        objB5 = objB4;
                        list8 = list;
                        list.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.ViewTransactions.f6374a, (String) objB5, null));
                        if (Intrinsics.d(chaloCardDetails2.getJ(), Boolean.TRUE)) {
                            chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                            chaloCardInfoComponent$getCardOperationList$1.L$1 = list7;
                            chaloCardInfoComponent$getCardOperationList$1.L$2 = list8;
                            chaloCardInfoComponent$getCardOperationList$1.L$3 = list8;
                            chaloCardInfoComponent$getCardOperationList$1.label = 5;
                            objB5 = stringProvider.b(StringEnum.BLOCK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                            if (objB5 != coroutineSingletons) {
                                list9 = list8;
                                list9.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Block.f6368a, (String) objB5, null));
                                list10 = list8;
                                if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                                    return list7;
                                }
                                chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                                chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                                chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                                chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                                chaloCardInfoComponent$getCardOperationList$1.label = 6;
                                objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                                if (objB5 != coroutineSingletons) {
                                    list11 = list7;
                                    list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                                    return list11;
                                }
                            }
                        } else {
                            list10 = list8;
                            if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                                return list7;
                            }
                            chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                            chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                            chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                            chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                            chaloCardInfoComponent$getCardOperationList$1.label = 6;
                            objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                            if (objB5 != coroutineSingletons) {
                                list11 = list7;
                                list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                                return list11;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                list6 = (List) chaloCardInfoComponent$getCardOperationList$1.L$3;
                list5 = (List) chaloCardInfoComponent$getCardOperationList$1.L$2;
                list3 = (List) chaloCardInfoComponent$getCardOperationList$1.L$1;
                chaloCardDetails2 = (ChaloCardDetails) chaloCardInfoComponent$getCardOperationList$1.L$0;
                ResultKt.b(objB5);
                list6.add(new ChaloCardOptionUiModel(new ChaloCardOperationType.SpecificCardOption.ChangePin(((OpenCardDetailsAppModel) chaloCardDetails2).k), (String) objB5, null));
                list = list5;
                listL = list3;
                chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                chaloCardInfoComponent$getCardOperationList$1.L$1 = listL;
                chaloCardInfoComponent$getCardOperationList$1.L$2 = list;
                chaloCardInfoComponent$getCardOperationList$1.L$3 = list;
                chaloCardInfoComponent$getCardOperationList$1.label = 4;
                objB4 = stringProvider.b(StringEnum.SHOW_MY_CARD_TRANSACTIONS, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                if (objB4 != coroutineSingletons) {
                    list7 = listL;
                    objB5 = objB4;
                    list8 = list;
                    list.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.ViewTransactions.f6374a, (String) objB5, null));
                    if (Intrinsics.d(chaloCardDetails2.getJ(), Boolean.TRUE)) {
                        chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                        chaloCardInfoComponent$getCardOperationList$1.L$1 = list7;
                        chaloCardInfoComponent$getCardOperationList$1.L$2 = list8;
                        chaloCardInfoComponent$getCardOperationList$1.L$3 = list8;
                        chaloCardInfoComponent$getCardOperationList$1.label = 5;
                        objB5 = stringProvider.b(StringEnum.BLOCK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                        if (objB5 != coroutineSingletons) {
                            list9 = list8;
                            list9.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Block.f6368a, (String) objB5, null));
                            list10 = list8;
                            if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                                return list7;
                            }
                            chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                            chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                            chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                            chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                            chaloCardInfoComponent$getCardOperationList$1.label = 6;
                            objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                            if (objB5 != coroutineSingletons) {
                                list11 = list7;
                                list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                                return list11;
                            }
                        }
                    } else {
                        list10 = list8;
                        if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                            return list7;
                        }
                        chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                        chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                        chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                        chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                        chaloCardInfoComponent$getCardOperationList$1.label = 6;
                        objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                        if (objB5 != coroutineSingletons) {
                            list11 = list7;
                            list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                            return list11;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                list = (List) chaloCardInfoComponent$getCardOperationList$1.L$3;
                list8 = (List) chaloCardInfoComponent$getCardOperationList$1.L$2;
                list7 = (List) chaloCardInfoComponent$getCardOperationList$1.L$1;
                chaloCardDetails2 = (ChaloCardDetails) chaloCardInfoComponent$getCardOperationList$1.L$0;
                ResultKt.b(objB5);
                list.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.ViewTransactions.f6374a, (String) objB5, null));
                if (Intrinsics.d(chaloCardDetails2.getJ(), Boolean.TRUE)) {
                    chaloCardInfoComponent$getCardOperationList$1.L$0 = chaloCardDetails2;
                    chaloCardInfoComponent$getCardOperationList$1.L$1 = list7;
                    chaloCardInfoComponent$getCardOperationList$1.L$2 = list8;
                    chaloCardInfoComponent$getCardOperationList$1.L$3 = list8;
                    chaloCardInfoComponent$getCardOperationList$1.label = 5;
                    objB5 = stringProvider.b(StringEnum.BLOCK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                    if (objB5 != coroutineSingletons) {
                        list9 = list8;
                        list9.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Block.f6368a, (String) objB5, null));
                        list10 = list8;
                        if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                            return list7;
                        }
                        chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                        chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                        chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                        chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                        chaloCardInfoComponent$getCardOperationList$1.label = 6;
                        objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                        if (objB5 != coroutineSingletons) {
                            list11 = list7;
                            list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                            return list11;
                        }
                    }
                } else {
                    list10 = list8;
                    if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                        return list7;
                    }
                    chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                    chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                    chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                    chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                    chaloCardInfoComponent$getCardOperationList$1.label = 6;
                    objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                    if (objB5 != coroutineSingletons) {
                        list11 = list7;
                        list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                        return list11;
                    }
                }
                return coroutineSingletons;
            case 5:
                list9 = (List) chaloCardInfoComponent$getCardOperationList$1.L$3;
                list8 = (List) chaloCardInfoComponent$getCardOperationList$1.L$2;
                list7 = (List) chaloCardInfoComponent$getCardOperationList$1.L$1;
                chaloCardDetails2 = (ChaloCardDetails) chaloCardInfoComponent$getCardOperationList$1.L$0;
                ResultKt.b(objB5);
                list9.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Block.f6368a, (String) objB5, null));
                list10 = list8;
                if (!Intrinsics.d(chaloCardDetails2.getI(), Boolean.TRUE)) {
                    return list7;
                }
                chaloCardInfoComponent$getCardOperationList$1.L$0 = list7;
                chaloCardInfoComponent$getCardOperationList$1.L$1 = list10;
                chaloCardInfoComponent$getCardOperationList$1.L$2 = null;
                chaloCardInfoComponent$getCardOperationList$1.L$3 = null;
                chaloCardInfoComponent$getCardOperationList$1.label = 6;
                objB5 = stringProvider.b(StringEnum.UNLINK, new Object[0], chaloCardInfoComponent$getCardOperationList$1);
                if (objB5 != coroutineSingletons) {
                    list11 = list7;
                    list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                    return list11;
                }
                return coroutineSingletons;
            case 6:
                list10 = (List) chaloCardInfoComponent$getCardOperationList$1.L$1;
                list11 = (List) chaloCardInfoComponent$getCardOperationList$1.L$0;
                ResultKt.b(objB5);
                list10.add(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a, (String) objB5, null));
                return list11;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void L0(ChaloCardInfoIntent intent) {
        List listR;
        String f6157a;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof ChaloCardInfoIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new ChaloCardInfoComponent$handleInitializationIntent$1(this, (ChaloCardInfoIntent.InitializationIntent) intent, null), 3);
            return;
        }
        if (intent instanceof ChaloCardInfoIntent.BuyNewCardIntent) {
            BuildersKt.d(contextScope, null, null, new ChaloCardInfoComponent$handleBuyNewClickedIntent$1(this, null), 3);
            return;
        }
        boolean z2 = intent instanceof ChaloCardInfoIntent.RefreshDataClickedIntent;
        StateFlow stateFlow = this.f;
        if (z2) {
            AnalyticsContractImplKt.b(this.q, "refresh chalo card info clicked", Source.CHALO_CARD_INFO_SCREEN, ChaloCardInfoContractKt.a((ChaloCardInfoViewState) stateFlow.getValue(), MapsKt.h(new Pair("refreshChaloCardInfoSource", ((ChaloCardInfoIntent.RefreshDataClickedIntent) intent).f6355a.name()))), false, 24);
            E0(new pi(6));
            J0(true);
            return;
        }
        boolean z3 = intent instanceof ChaloCardInfoIntent.UseLinkCodeClickedIntent;
        ChaloNavigationManager chaloNavigationManager = this.D;
        if (z3) {
            Source source = Source.CHALO_CARD_INFO_SCREEN;
            AnalyticsContractImplKt.b(this.q, "chalo card info link card tut link btn clicked", source, ChaloCardInfoContractKt.a((ChaloCardInfoViewState) stateFlow.getValue(), null), false, 24);
            this.I = true;
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new CardLinkingScreenArgs(source), null, null, 6));
            return;
        }
        String str = "";
        if (intent instanceof ChaloCardInfoIntent.ShowTransactionHistoryClickedIntent) {
            Source source2 = Source.CHALO_CARD_INFO_SCREEN;
            AnalyticsContractImplKt.b(this.q, "chalo card info show transaction history btn clicked", source2, ChaloCardInfoContractKt.a((ChaloCardInfoViewState) stateFlow.getValue(), null), false, 24);
            CardTransactionHistoryArgsModel cardTransactionHistoryArgsModel = new CardTransactionHistoryArgsModel(source2, "", null, null);
            Json json = ChaloJson.b;
            json.getClass();
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new CardTransactionHistoryArgs(json.a(CardTransactionHistoryArgsModel.INSTANCE.serializer(), cardTransactionHistoryArgsModel)), null, null, 6));
            return;
        }
        if (intent instanceof ChaloCardInfoIntent.OnCardClick) {
            BuildersKt.d(contextScope, null, null, new ChaloCardInfoComponent$handleCardClickIntent$1(this, ((ChaloCardInfoIntent.OnCardClick) intent).f6354a, null), 3);
            return;
        }
        if (intent instanceof ChaloCardInfoIntent.AddCardClickIntent) {
            this.I = true;
            E0(new ah(27));
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new CardLinkingScreenArgs(Source.CHALO_CARD_INFO_SCREEN), null, null, 6));
            return;
        }
        if (intent instanceof ChaloCardInfoIntent.ConfirmationDialogPositiveButtonClick) {
            ChaloCardInfoIntent.ConfirmationDialogPositiveButtonClick confirmationDialogPositiveButtonClick = (ChaloCardInfoIntent.ConfirmationDialogPositiveButtonClick) intent;
            E0(new pi(2));
            int i = WhenMappings.f6343a[((ChaloCardInfoViewState) stateFlow.getValue()).q.ordinal()];
            if (i == 1) {
                String str2 = confirmationDialogPositiveButtonClick.f6350a;
                E0(new ah(28));
                BuildersKt.d(contextScope, null, null, new ChaloCardInfoComponent$unlinkCard$2(this, str2, null), 3);
                return;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                String str3 = confirmationDialogPositiveButtonClick.f6350a;
                String str4 = confirmationDialogPositiveButtonClick.b;
                String str5 = confirmationDialogPositiveButtonClick.c;
                E0(new ah(29));
                BuildersKt.d(contextScope, null, null, new ChaloCardInfoComponent$blockCard$2(this, str3, str5, str4, null), 3);
                return;
            }
        }
        if (intent instanceof ChaloCardInfoIntent.ConfirmationDialogNegativeButtonClick) {
            E0(new pi(5));
            return;
        }
        if (intent instanceof ChaloCardInfoIntent.ChangePinClickIntent) {
            BuildersKt.d(contextScope, null, null, new ChaloCardInfoComponent$handleChangePinIntent$1(this, null, null), 3);
            return;
        }
        if (!(intent instanceof ChaloCardInfoIntent.CardOperationClicked)) {
            if (intent.equals(ChaloCardInfoIntent.TapUnavailableBottomSheetOkClickIntent.f6356a)) {
                E0(new ah(26));
                return;
            }
            if (intent.equals(ChaloCardInfoIntent.NavigateBackToAllCards.f6353a)) {
                E0(new pi(0));
                return;
            }
            if (intent.equals(ChaloCardInfoIntent.CardLinkBottomSheetNegativeButtonClicked.f6347a)) {
                E0(new ah(26));
                return;
            }
            if (intent.equals(ChaloCardInfoIntent.CardInfoBottomsheetDismissButtonClicked.f6346a)) {
                E0(new ah(26));
                return;
            }
            if (!intent.equals(ChaloCardInfoIntent.KnowMoreClicked.f6352a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = WhenMappings.b[((ChaloCardInfoViewState) stateFlow.getValue()).i.ordinal()];
            if (i2 == 1) {
                listR = this.G;
            } else if (i2 == 2) {
                ChaloCardDetails chaloCardDetails = ((ChaloCardInfoViewState) stateFlow.getValue()).f6359a;
                List list = this.G;
                if (chaloCardDetails != null && (f6157a = chaloCardDetails.getF6157a()) != null) {
                    str = f6157a;
                }
                ChaloCardUnsyncedRechargeDetails chaloCardUnsyncedRechargeDetailsA = ChaloCardsInfoAppModelKt.a(str, list);
                listR = chaloCardUnsyncedRechargeDetailsA != null ? CollectionsKt.R(chaloCardUnsyncedRechargeDetailsA) : EmptyList.f17557a;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                listR = EmptyList.f17557a;
            }
            BuildersKt.d(contextScope, null, null, new ChaloCardInfoComponent$handlePendingRecahrgeKnowMoreClicked$1(listR, this, null), 3);
            return;
        }
        ChaloCardOperationType chaloCardOperationType = ((ChaloCardInfoIntent.CardOperationClicked) intent).f6348a;
        if (Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.AllCardOption.ChangePin.f6365a) || Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.AllCardOption.Block.f6363a)) {
            return;
        }
        if (Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a)) {
            BuildersKt.d(contextScope, null, null, new ChaloCardInfoComponent$handleBuyNewClickedIntent$1(this, null), 3);
            return;
        }
        if (Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.AllCardOption.Recharge.f6366a)) {
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new EnterCardDetailsArgs(Source.CHALO_CARD_INFO_SCREEN), null, null, 6));
            return;
        }
        if (Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.AllCardOption.ActivateCardForMetro.f6360a)) {
            I0(UvikServiceType.SERVICE_CREATION);
            return;
        }
        if (Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.AllCardOption.UpdateBalance.f6367a) || Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.SpecificCardOption.UpdateBalance.f6372a)) {
            I0(UvikServiceType.BALANCE_UPDATE);
            return;
        }
        if (Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.AllCardOption.BalanceEnquiry.f6362a) || Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.SpecificCardOption.ViewOfflineBalance.f6373a)) {
            I0(UvikServiceType.BALANCE_ENQUIRY);
            return;
        }
        if (Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.SpecificCardOption.Block.f6368a)) {
            E0(new pi(4));
            return;
        }
        if (chaloCardOperationType instanceof ChaloCardOperationType.SpecificCardOption.ChangePin) {
            BuildersKt.d(contextScope, null, null, new ChaloCardInfoComponent$handleCardOperationClicked$1(this, chaloCardOperationType, null), 3);
            return;
        }
        if (Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.SpecificCardOption.ViewTransactions.f6374a)) {
            ChaloCardInfoViewState chaloCardInfoViewState = (ChaloCardInfoViewState) stateFlow.getValue();
            ChaloCardDetails chaloCardDetails2 = chaloCardInfoViewState.f6359a;
            String str6 = chaloCardDetails2 instanceof OpenCardDetailsAppModel ? ((OpenCardDetailsAppModel) chaloCardDetails2).k : null;
            String f6157a2 = chaloCardDetails2 != null ? chaloCardDetails2.getF6157a() : null;
            ChaloCardDetails chaloCardDetails3 = chaloCardInfoViewState.f6359a;
            CardTransactionHistoryArgsModel cardTransactionHistoryArgsModel2 = new CardTransactionHistoryArgsModel(Source.CHALO_CARD_INFO_SCREEN, f6157a2 != null ? f6157a2 : "", str6, chaloCardDetails3 != null ? chaloCardDetails3.getD() : null);
            Json json2 = ChaloJson.b;
            json2.getClass();
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new CardTransactionHistoryArgs(json2.a(CardTransactionHistoryArgsModel.INSTANCE.serializer(), cardTransactionHistoryArgsModel2)), null, null, 6));
            return;
        }
        if (Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.SpecificCardOption.Unlink.f6371a)) {
            E0(new pi(1));
            return;
        }
        if (!Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.SpecificCardOption.Recharge.f6370a)) {
            if (!Intrinsics.d(chaloCardOperationType, ChaloCardOperationType.AllCardOption.ActivateNCMCCard.f6361a)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new ChaloCardInfoComponent$handleActivateChaloNcmcClickedIntent$1(this, null), 3);
            return;
        }
        Source source3 = Source.CHALO_CARD_INFO_SCREEN;
        AnalyticsContractImplKt.b(this.q, "chalo card info add money clicked", source3, ChaloCardInfoContractKt.a((ChaloCardInfoViewState) stateFlow.getValue(), null), false, 24);
        ChaloCardDetails chaloCardDetails4 = ((ChaloCardInfoViewState) stateFlow.getValue()).f6359a;
        if (chaloCardDetails4 instanceof OpenCardDetailsAppModel) {
            BuildersKt.d(contextScope, null, null, new ChaloCardInfoComponent$handleAddMoneyClickedIntent$1(this, chaloCardDetails4, null), 3);
            return;
        }
        CardRechargeEnterAmountArgsModel cardRechargeEnterAmountArgsModel = new CardRechargeEnterAmountArgsModel(source3, new ChaloCardRechargeAmountFlowType.WithChaloCardDetails(chaloCardDetails4));
        Json json3 = CardsJsonKt.f6442a;
        json3.getClass();
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new CardRechargeEnterAmountArgs(json3.a(CardRechargeEnterAmountArgsModel.INSTANCE.serializer(), cardRechargeEnterAmountArgsModel)), null, null, 6));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (ChaloCardInfoViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new ChaloCardInfoViewState(null, null, null, 8388607);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new ChaloCardInfoViewState(null, null, null, 8388607);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        if (this.I) {
            this.I = false;
            BuildersKt.d(this.j, null, null, new ChaloCardInfoComponent$handleOnViewStateActive$1(this, null), 3);
        }
    }
}
