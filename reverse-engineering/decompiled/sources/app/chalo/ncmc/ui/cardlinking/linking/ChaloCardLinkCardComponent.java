package app.chalo.ncmc.ui.cardlinking.linking;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.extensions.StringExtsKt;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.mvibase.simple.DataFetchOperationErrorReason;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.ncmc.domain.GetLinkCardConfigUseCase;
import app.chalo.ncmc.domain.LinkChaloCardFailureReason;
import app.chalo.ncmc.domain.LinkChaloCardUseCase;
import app.chalo.ncmc.ui.cardlinking.linking.CardLinkingErrorType;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastData;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CardLinkingScreenArgs;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ch;
import defpackage.fi;
import defpackage.pi;
import defpackage.ui;
import defpackage.vi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkCardComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkIntent;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkViewState;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkDataState;", "Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkSideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardLinkCardComponent extends ChaloBaseStateMviComponent<ChaloCardLinkIntent, ChaloCardLinkViewState, ChaloCardLinkViewState, ChaloCardLinkSideEffect> {
    public final LinkChaloCardUseCase k;
    public final StringProvider l;
    public final AnalyticsContract m;
    public final GetLinkCardConfigUseCase n;
    public final KotlinToastManager o;
    public final ChaloNavigationManager p;
    public ChaloCardLinkRestoredState q;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ncmc/ui/cardlinking/linking/ChaloCardLinkCardComponent$Companion;", "", "", "CHALO_CARD_LINK_CARD_STATE_KEEPER_KEY", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6271a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[DataFetchOperationErrorReason.values().length];
            try {
                iArr[DataFetchOperationErrorReason.NO_INTERNET_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataFetchOperationErrorReason.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataFetchOperationErrorReason.REQUEST_CANCELLATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataFetchOperationErrorReason.API_CALL_AUTHORISATION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataFetchOperationErrorReason.UNEXPECTED_EXCEPTION_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DataFetchOperationErrorReason.UNKNOWN_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DataFetchOperationErrorReason.SUCCESS_RESPONSE_PARSING_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DataFetchOperationErrorReason.NO_UPDATE_IN_DATA_BASED_ON_ETAG.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DataFetchOperationErrorReason.ERROR_RESPONSE_PARSING_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f6271a = iArr;
            int[] iArr2 = new int[LinkChaloCardFailureReason.values().length];
            try {
                iArr2[LinkChaloCardFailureReason.CARD_LINKED_TO_ANOTHER_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[LinkChaloCardFailureReason.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[LinkChaloCardFailureReason.UNKNOWN_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[LinkChaloCardFailureReason.INVALID_CARD_NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[LinkChaloCardFailureReason.INVALID_LINK_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[LinkChaloCardFailureReason.KYC_NOT_DONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[LinkChaloCardFailureReason.CARD_NOT_REGISTERED_IN_CURR_CITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            b = iArr2;
        }
    }

    public ChaloCardLinkCardComponent(ComponentContext componentContext, CardLinkingScreenArgs cardLinkingScreenArgs, LinkChaloCardUseCase linkChaloCardUseCase, StringProvider stringProvider, AnalyticsContract analyticsContract, GetLinkCardConfigUseCase getLinkCardConfigUseCase, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager) {
        super(componentContext);
        this.k = linkChaloCardUseCase;
        this.l = stringProvider;
        this.m = analyticsContract;
        this.n = getLinkCardConfigUseCase;
        this.o = kotlinToastManager;
        this.p = chaloNavigationManager;
        componentContext.getB().d("CHALO_CARD_LINK_CARD_STATE_KEEPER_KEY", ChaloCardLinkRestoredState.INSTANCE.serializer(), new fi(this, 1));
        G0(new ChaloCardLinkIntent.InitializationLinkIntent(cardLinkingScreenArgs.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object F0(final ChaloCardLinkCardComponent chaloCardLinkCardComponent, UseCaseOperationError useCaseOperationError, ContinuationImpl continuationImpl) {
        ChaloCardLinkCardComponent$handleCardLinkingError$1 chaloCardLinkCardComponent$handleCardLinkingError$1;
        String str;
        Object objB;
        UseCaseOperationError useCaseOperationError2 = useCaseOperationError;
        StateFlow stateFlow = chaloCardLinkCardComponent.f;
        KotlinToastManager kotlinToastManager = chaloCardLinkCardComponent.o;
        if (continuationImpl instanceof ChaloCardLinkCardComponent$handleCardLinkingError$1) {
            chaloCardLinkCardComponent$handleCardLinkingError$1 = (ChaloCardLinkCardComponent$handleCardLinkingError$1) continuationImpl;
            int i = chaloCardLinkCardComponent$handleCardLinkingError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloCardLinkCardComponent$handleCardLinkingError$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloCardLinkCardComponent$handleCardLinkingError$1 = new ChaloCardLinkCardComponent$handleCardLinkingError$1(chaloCardLinkCardComponent, continuationImpl);
            }
        } else {
            chaloCardLinkCardComponent$handleCardLinkingError$1 = new ChaloCardLinkCardComponent$handleCardLinkingError$1(chaloCardLinkCardComponent, continuationImpl);
        }
        Object obj = chaloCardLinkCardComponent$handleCardLinkingError$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloCardLinkCardComponent$handleCardLinkingError$1.label;
        final int i3 = 0;
        final int i4 = 1;
        if (i2 == 0) {
            ResultKt.b(obj);
            str = useCaseOperationError2.c;
            StringProvider stringProvider = chaloCardLinkCardComponent.l;
            StringEnum stringEnum = StringEnum.GENERIC_ERROR_WITH_ERROR_CODE;
            Object[] objArr = {new Integer(useCaseOperationError2.b)};
            chaloCardLinkCardComponent$handleCardLinkingError$1.L$0 = useCaseOperationError2;
            chaloCardLinkCardComponent$handleCardLinkingError$1.L$1 = str;
            chaloCardLinkCardComponent$handleCardLinkingError$1.label = 1;
            objB = stringProvider.b(stringEnum, objArr, chaloCardLinkCardComponent$handleCardLinkingError$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) chaloCardLinkCardComponent$handleCardLinkingError$1.L$1;
            UseCaseOperationError useCaseOperationError3 = (UseCaseOperationError) chaloCardLinkCardComponent$handleCardLinkingError$1.L$0;
            ResultKt.b(obj);
            str = str2;
            useCaseOperationError2 = useCaseOperationError3;
            objB = obj;
        }
        final String strB = StringExtsKt.b(str, (String) objB);
        OperationFailureError operationFailureError = useCaseOperationError2.f6000a;
        int i5 = 2;
        if (operationFailureError instanceof OperationFailureError.DataFetchOperationFailure) {
            DataFetchOperationErrorReason dataFetchOperationErrorReason = ((OperationFailureError.DataFetchOperationFailure) operationFailureError).f5998a;
            AnalyticsContract.DefaultImpls.a(chaloCardLinkCardComponent.m, "chalo card linking failed", "CHALO_CARD_LINKING_SCREEN", ChaloCardLinkCardContractKt.a((ChaloCardLinkViewState) stateFlow.getValue(), MapsKt.i(new Pair("cardLinkingErrorReason", dataFetchOperationErrorReason.name()), new Pair("errorCode", Integer.valueOf(dataFetchOperationErrorReason.getErrorCode())))), null, false, 24);
            switch (WhenMappings.f6271a[dataFetchOperationErrorReason.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    chaloCardLinkCardComponent.E0(new vi(chaloCardLinkCardComponent, i3));
                    kotlinToastManager.a(new KotlinToastData(strB));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(operationFailureError instanceof OperationFailureError.UseCaseSpecificError)) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj2 = ((OperationFailureError.UseCaseSpecificError) operationFailureError).f5999a;
            LinkChaloCardFailureReason linkChaloCardFailureReason = (LinkChaloCardFailureReason) obj2;
            AnalyticsContract.DefaultImpls.a(chaloCardLinkCardComponent.m, "chalo card linking failed", "CHALO_CARD_LINKING_SCREEN", ChaloCardLinkCardContractKt.a((ChaloCardLinkViewState) stateFlow.getValue(), MapsKt.i(new Pair("cardLinkingErrorReason", linkChaloCardFailureReason.name()), new Pair("errorCode", Integer.valueOf(linkChaloCardFailureReason.getErrorCode())))), null, false, 24);
            switch (WhenMappings.b[((LinkChaloCardFailureReason) obj2).ordinal()]) {
                case 1:
                    chaloCardLinkCardComponent.E0(new ch(useCaseOperationError2, 8));
                    break;
                case 2:
                    chaloCardLinkCardComponent.E0(new vi(chaloCardLinkCardComponent, i4));
                    kotlinToastManager.a(new KotlinToastData(strB));
                    break;
                case 3:
                    chaloCardLinkCardComponent.E0(new vi(chaloCardLinkCardComponent, i5));
                    kotlinToastManager.a(new KotlinToastData(strB));
                    break;
                case 4:
                    chaloCardLinkCardComponent.E0(new pi(22));
                    break;
                case 5:
                    chaloCardLinkCardComponent.E0(new vi(chaloCardLinkCardComponent, 3));
                    break;
                case 6:
                    chaloCardLinkCardComponent.E0(new Function1(chaloCardLinkCardComponent) { // from class: wi
                        public final /* synthetic */ ChaloCardLinkCardComponent b;

                        {
                            this.b = chaloCardLinkCardComponent;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            ChaloCardLinkViewState it = (ChaloCardLinkViewState) obj3;
                            switch (i3) {
                                case 0:
                                    Intrinsics.i(it, "it");
                                    return ChaloCardLinkViewState.a(it, ((ChaloCardLinkViewState) this.b.f.getValue()).f6279a, "", false, false, CardLinkingErrorType.KYC_NOT_DONE, true, strB, null, 0, 0, 0, 0, false, 3968);
                                default:
                                    Intrinsics.i(it, "it");
                                    return ChaloCardLinkViewState.a(it, ((ChaloCardLinkViewState) this.b.f.getValue()).f6279a, "", false, false, CardLinkingErrorType.CARD_NOT_REGISTERED_IN_CURR_CITY, true, strB, null, 0, 0, 0, 0, false, 3968);
                            }
                        }
                    });
                    break;
                case 7:
                    chaloCardLinkCardComponent.E0(new Function1(chaloCardLinkCardComponent) { // from class: wi
                        public final /* synthetic */ ChaloCardLinkCardComponent b;

                        {
                            this.b = chaloCardLinkCardComponent;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            ChaloCardLinkViewState it = (ChaloCardLinkViewState) obj3;
                            switch (i4) {
                                case 0:
                                    Intrinsics.i(it, "it");
                                    return ChaloCardLinkViewState.a(it, ((ChaloCardLinkViewState) this.b.f.getValue()).f6279a, "", false, false, CardLinkingErrorType.KYC_NOT_DONE, true, strB, null, 0, 0, 0, 0, false, 3968);
                                default:
                                    Intrinsics.i(it, "it");
                                    return ChaloCardLinkViewState.a(it, ((ChaloCardLinkViewState) this.b.f.getValue()).f6279a, "", false, false, CardLinkingErrorType.CARD_NOT_REGISTERED_IN_CURR_CITY, true, strB, null, 0, 0, 0, 0, false, 3968);
                            }
                        }
                    });
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f17538a;
    }

    public final void G0(ChaloCardLinkIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof ChaloCardLinkIntent.InitializationLinkIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new ChaloCardLinkCardComponent$handleInitializationIntent$1(this, ((ChaloCardLinkIntent.InitializationLinkIntent) intent).f6273a, null), 3);
            return;
        }
        boolean z2 = intent instanceof ChaloCardLinkIntent.OnLinkCodeEnteredLink;
        boolean z3 = false;
        StateFlow stateFlow = this.f;
        if (z2) {
            String str = ((ChaloCardLinkIntent.OnLinkCodeEnteredLink) intent).f6275a;
            int i = ((ChaloCardLinkViewState) stateFlow.getValue()).l;
            int i2 = ((ChaloCardLinkViewState) stateFlow.getValue()).j;
            int length = str.length();
            if (i <= length && length <= i2) {
                String str2 = ((ChaloCardLinkViewState) stateFlow.getValue()).f6279a;
                int i3 = ((ChaloCardLinkViewState) stateFlow.getValue()).k;
                int i4 = ((ChaloCardLinkViewState) stateFlow.getValue()).i;
                int length2 = str2.length();
                if (i3 <= length2 && length2 <= i4) {
                    z3 = true;
                }
            }
            E0(new ui(str, z3, 0));
            return;
        }
        if (!(intent instanceof ChaloCardLinkIntent.OnCardLinkNumberEntered)) {
            if (!intent.equals(ChaloCardLinkIntent.ProceedClickedLinkIntent.f6276a)) {
                if (!intent.equals(ChaloCardLinkIntent.CardAlreadyLinkedErrorDialogOkClickedLinkIntent.f6272a)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new pi(23));
                return;
            } else {
                AnalyticsContract.DefaultImpls.a(this.m, "chalocard link code proceed btn clicked", "CHALO_CARD_LINKING_SCREEN", ChaloCardLinkCardContractKt.a((ChaloCardLinkViewState) stateFlow.getValue(), null), null, false, 24);
                E0(new pi(21));
                BuildersKt.d(contextScope, null, null, new ChaloCardLinkCardComponent$handleProceedClickedIntent$2(this, null), 3);
                return;
            }
        }
        String str3 = ((ChaloCardLinkIntent.OnCardLinkNumberEntered) intent).f6274a;
        int i5 = ((ChaloCardLinkViewState) stateFlow.getValue()).k;
        int i6 = ((ChaloCardLinkViewState) stateFlow.getValue()).i;
        int length3 = str3.length();
        if (i5 <= length3 && length3 <= i6) {
            String str4 = ((ChaloCardLinkViewState) stateFlow.getValue()).b;
            int i7 = ((ChaloCardLinkViewState) stateFlow.getValue()).l;
            int i8 = ((ChaloCardLinkViewState) stateFlow.getValue()).j;
            int length4 = str4.length();
            if (i7 <= length4 && length4 <= i8) {
                z3 = true;
            }
        }
        E0(new ui(str3, z3, 1));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (ChaloCardLinkViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        if (this.q == null) {
            this.q = (ChaloCardLinkRestoredState) this.f5983a.getB().a("CHALO_CARD_LINK_CARD_STATE_KEEPER_KEY", ChaloCardLinkRestoredState.INSTANCE.serializer());
        }
        ChaloCardLinkRestoredState chaloCardLinkRestoredState = this.q;
        if (chaloCardLinkRestoredState == null) {
            return new ChaloCardLinkViewState(null, null, null, null, 0, 0, 0, 0, 8191);
        }
        return new ChaloCardLinkViewState(chaloCardLinkRestoredState.f6277a, chaloCardLinkRestoredState.b, null, chaloCardLinkRestoredState.g, chaloCardLinkRestoredState.c, chaloCardLinkRestoredState.d, chaloCardLinkRestoredState.e, chaloCardLinkRestoredState.f, 4220);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new ChaloCardLinkViewState(null, null, null, null, 0, 0, 0, 0, 8191);
    }
}
