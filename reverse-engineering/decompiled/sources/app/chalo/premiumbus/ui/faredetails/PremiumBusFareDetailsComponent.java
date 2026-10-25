package app.chalo.premiumbus.ui.faredetails;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.instantticket.data.model.app.response.FareBreakupOperationType;
import app.chalo.instantticket.data.model.app.response.PassengerDetailAppModel;
import app.chalo.instantticket.data.model.app.response.SeatLimitAppModel;
import app.chalo.instantticket.data.model.ui.FareBreakupUiModel;
import app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsComponentDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDelegateRestoredState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsEntryContext;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsIntent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSharedContext;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchError;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.scenes.args.PremiumBusFareDetailsArgs;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.et0;
import defpackage.gt0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsComponentDataState;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsUiState;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusFareDetailsComponent extends ChaloBaseStateMviComponent {
    public static final PremiumBusFareDetailsFlowType.FreshPurchase z = new PremiumBusFareDetailsFlowType.FreshPurchase("", "", "", null);
    public final PremiumBusFareDetailsDelegateResolver k;
    public final CheckoutResultStateManager l;
    public final CurrencyFeature m;
    public final StringProvider n;
    public final PremiumBusFareDetailsUiStateFactory o;
    public final PremiumBusFareDetailsFlowType p;
    public final PremiumBusFareDetailsSharedContext q;
    public PremiumBusFareDetailsDelegate r;
    public Job s;
    public Job t;
    public PremiumBusFareDetailsDelegate u;
    public final MutexImpl v;
    public final LinkedHashMap w;
    public String x;
    public final PremiumBusFareDetailsFlowType.FreshPurchase y;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsComponent$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "STATE_KEEPER_KEY", "ACTIVE_FLOW_TYPE_KEEPER_KEY", "DELEGATE_STATE_KEEPER_KEY", "", "SWITCH_FIRST_RESOLVED_TIMEOUT_MS", "J", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$FreshPurchase;", "PLACEHOLDER_FLOW_TYPE", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$FreshPurchase;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7549a;

        static {
            int[] iArr = new int[FareBreakupOperationType.values().length];
            try {
                iArr[FareBreakupOperationType.SUBTRACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FareBreakupOperationType.ADDITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FareBreakupOperationType.NO_OP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7549a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusFareDetailsComponent(ComponentContext componentContext, PremiumBusFareDetailsArgs args, PremiumBusFareDetailsDelegateResolver premiumBusFareDetailsDelegateResolver, CheckoutResultStateManager checkoutResultStateManager, CurrencyFeature currencyFeature, StringProvider stringProvider, PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(args, "args");
        this.k = premiumBusFareDetailsDelegateResolver;
        this.l = checkoutResultStateManager;
        this.m = currencyFeature;
        this.n = stringProvider;
        this.o = premiumBusFareDetailsUiStateFactory;
        Json json = ChaloJson.b;
        String str = args.b;
        json.getClass();
        PremiumBusFareDetailsFlowType.Companion companion = PremiumBusFareDetailsFlowType.INSTANCE;
        PremiumBusFareDetailsFlowType flowType = (PremiumBusFareDetailsFlowType) json.b(str, companion.serializer());
        PremiumBusFareDetailsFlowType premiumBusFareDetailsFlowType = (PremiumBusFareDetailsFlowType) componentContext.getB().a("PremiumBusFareDetails_ActiveFlowType_SK_Key", companion.serializer());
        premiumBusFareDetailsFlowType = premiumBusFareDetailsFlowType == null ? flowType : premiumBusFareDetailsFlowType;
        this.p = premiumBusFareDetailsFlowType;
        StateKeeper b = componentContext.getB();
        PremiumBusFareDetailsDelegateRestoredState.Companion companion2 = PremiumBusFareDetailsDelegateRestoredState.INSTANCE;
        PremiumBusFareDetailsDelegateRestoredState premiumBusFareDetailsDelegateRestoredState = (PremiumBusFareDetailsDelegateRestoredState) b.a("PremiumBusFareDetails_DelegateState_SK_Key", companion2.serializer());
        Intrinsics.i(flowType, "flowType");
        FareDetailsData fareDetailsData = (FareDetailsData) json.b(args.c, FareDetailsData.INSTANCE.serializer());
        String str2 = args.e;
        List list = str2 != null ? (List) json.b(str2, new ArrayListSerializer(SeatInfoAppModel.INSTANCE.serializer())) : null;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext = new PremiumBusFareDetailsSharedContext(flowType.getB(), list == null ? EmptyList.f17557a : list, fareDetailsData, PremiumBusFareDetailsEntryContext.valueOf(args.d), args.f);
        this.q = premiumBusFareDetailsSharedContext;
        this.r = premiumBusFareDetailsDelegateResolver.a(premiumBusFareDetailsFlowType);
        this.v = MutexKt.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.w = linkedHashMap;
        this.y = flowType instanceof PremiumBusFareDetailsFlowType.FreshPurchase ? (PremiumBusFareDetailsFlowType.FreshPurchase) flowType : null;
        E0(new et0(this, 7));
        final int i = 0;
        componentContext.getB().d("PremiumBusFareDetails_ActiveFlowType_SK_Key", companion.serializer(), new Function0(this) { // from class: vt0
            public final /* synthetic */ PremiumBusFareDetailsComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PremiumBusFareDetailsComponent premiumBusFareDetailsComponent = this.b;
                switch (i2) {
                    case 0:
                        PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase = PremiumBusFareDetailsComponent.z;
                        return ((PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsComponent.f.getValue()).f7572a;
                    case 1:
                        return premiumBusFareDetailsComponent.r.b();
                    default:
                        String str3 = premiumBusFareDetailsComponent.x;
                        if (str3 != null) {
                            return new ResultStateKeeperMeta(str3);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        componentContext.getB().d("PremiumBusFareDetails_DelegateState_SK_Key", companion2.serializer(), new Function0(this) { // from class: vt0
            public final /* synthetic */ PremiumBusFareDetailsComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                PremiumBusFareDetailsComponent premiumBusFareDetailsComponent = this.b;
                switch (i3) {
                    case 0:
                        PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase = PremiumBusFareDetailsComponent.z;
                        return ((PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsComponent.f.getValue()).f7572a;
                    case 1:
                        return premiumBusFareDetailsComponent.r.b();
                    default:
                        String str3 = premiumBusFareDetailsComponent.x;
                        if (str3 != null) {
                            return new ResultStateKeeperMeta(str3);
                        }
                        return null;
                }
            }
        });
        PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate = this.r;
        premiumBusFareDetailsDelegate.c(new a(this, premiumBusFareDetailsDelegate, 0));
        premiumBusFareDetailsDelegate.f(new a(this, premiumBusFareDetailsDelegate, 1));
        PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate2 = this.r;
        Job job = this.s;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.s = BuildersKt.d(this.j, null, null, new PremiumBusFareDetailsComponent$observeActiveDelegateState$1(premiumBusFareDetailsDelegate2, this, null), 3);
        if (premiumBusFareDetailsDelegateRestoredState != null) {
            this.r.a(premiumBusFareDetailsDelegateRestoredState);
        }
        this.r.g(this.j, premiumBusFareDetailsSharedContext);
        StateKeeper b2 = componentContext.getB();
        ResultStateKeeperMeta.Companion companion3 = ResultStateKeeperMeta.INSTANCE;
        KSerializer<ResultStateKeeperMeta> kSerializerSerializer = companion3.serializer();
        KSerializer<ResultStateKeeperMeta> kSerializerSerializer2 = companion3.serializer();
        final int i3 = 2;
        ResultStateRecoveredData resultStateRecoveredDataA = checkoutResultStateManager.a("PremiumBusFareDetails_SK_Key", b2, kSerializerSerializer, kSerializerSerializer2, new Function0(this) { // from class: vt0
            public final /* synthetic */ PremiumBusFareDetailsComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                PremiumBusFareDetailsComponent premiumBusFareDetailsComponent = this.b;
                switch (i4) {
                    case 0:
                        PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase = PremiumBusFareDetailsComponent.z;
                        return ((PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsComponent.f.getValue()).f7572a;
                    case 1:
                        return premiumBusFareDetailsComponent.r.b();
                    default:
                        String str3 = premiumBusFareDetailsComponent.x;
                        if (str3 != null) {
                            return new ResultStateKeeperMeta(str3);
                        }
                        return null;
                }
            }
        });
        if (resultStateRecoveredDataA != null) {
            String str3 = resultStateRecoveredDataA.f9052a.f9041a;
            String str4 = this.x;
            if (str4 == null || str4.equals(str3)) {
                PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate3 = this.r;
                Job job2 = (Job) linkedHashMap.remove(premiumBusFareDetailsDelegate3);
                if (job2 != null) {
                    job2.cancel(null);
                }
                this.x = str3;
                linkedHashMap.put(premiumBusFareDetailsDelegate3, BuildersKt.d(this.j, null, null, new PremiumBusFareDetailsComponent$5$1(this, resultStateRecoveredDataA, premiumBusFareDetailsDelegate3, null), 3));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(PremiumBusFareDetailsComponent premiumBusFareDetailsComponent, PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate, PremiumBusFareDetailsSwitchError premiumBusFareDetailsSwitchError, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsComponent$abandonSwitch$1 premiumBusFareDetailsComponent$abandonSwitch$1;
        Mutex mutex;
        premiumBusFareDetailsComponent.getClass();
        if (continuationImpl instanceof PremiumBusFareDetailsComponent$abandonSwitch$1) {
            premiumBusFareDetailsComponent$abandonSwitch$1 = (PremiumBusFareDetailsComponent$abandonSwitch$1) continuationImpl;
            int i = premiumBusFareDetailsComponent$abandonSwitch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsComponent$abandonSwitch$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsComponent$abandonSwitch$1 = new PremiumBusFareDetailsComponent$abandonSwitch$1(premiumBusFareDetailsComponent, continuationImpl);
            }
        } else {
            premiumBusFareDetailsComponent$abandonSwitch$1 = new PremiumBusFareDetailsComponent$abandonSwitch$1(premiumBusFareDetailsComponent, continuationImpl);
        }
        Object obj = premiumBusFareDetailsComponent$abandonSwitch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsComponent$abandonSwitch$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            premiumBusFareDetailsDelegate.dispose();
            mutex = premiumBusFareDetailsComponent.v;
            premiumBusFareDetailsComponent$abandonSwitch$1.L$0 = premiumBusFareDetailsSwitchError;
            premiumBusFareDetailsComponent$abandonSwitch$1.L$1 = mutex;
            premiumBusFareDetailsComponent$abandonSwitch$1.label = 1;
            if (mutex.a(premiumBusFareDetailsComponent$abandonSwitch$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) premiumBusFareDetailsComponent$abandonSwitch$1.L$1;
            premiumBusFareDetailsSwitchError = (PremiumBusFareDetailsSwitchError) premiumBusFareDetailsComponent$abandonSwitch$1.L$0;
            ResultKt.b(obj);
        }
        try {
            premiumBusFareDetailsComponent.u = null;
            mutex.e(null);
            premiumBusFareDetailsComponent.E0(new et0(premiumBusFareDetailsSwitchError, 6));
            return Unit.f17538a;
        } catch (Throwable th) {
            mutex.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(PremiumBusFareDetailsComponent premiumBusFareDetailsComponent, PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate, PremiumBusFareDetailsFlowType premiumBusFareDetailsFlowType, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsComponent$commitSwitch$1 premiumBusFareDetailsComponent$commitSwitch$1;
        Mutex mutex;
        premiumBusFareDetailsComponent.getClass();
        if (continuationImpl instanceof PremiumBusFareDetailsComponent$commitSwitch$1) {
            premiumBusFareDetailsComponent$commitSwitch$1 = (PremiumBusFareDetailsComponent$commitSwitch$1) continuationImpl;
            int i = premiumBusFareDetailsComponent$commitSwitch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsComponent$commitSwitch$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsComponent$commitSwitch$1 = new PremiumBusFareDetailsComponent$commitSwitch$1(premiumBusFareDetailsComponent, continuationImpl);
            }
        } else {
            premiumBusFareDetailsComponent$commitSwitch$1 = new PremiumBusFareDetailsComponent$commitSwitch$1(premiumBusFareDetailsComponent, continuationImpl);
        }
        Object obj = premiumBusFareDetailsComponent$commitSwitch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsComponent$commitSwitch$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            mutex = premiumBusFareDetailsComponent.v;
            premiumBusFareDetailsComponent$commitSwitch$1.L$0 = premiumBusFareDetailsDelegate;
            premiumBusFareDetailsComponent$commitSwitch$1.L$1 = premiumBusFareDetailsFlowType;
            premiumBusFareDetailsComponent$commitSwitch$1.L$2 = mutex;
            premiumBusFareDetailsComponent$commitSwitch$1.label = 1;
            if (mutex.a(premiumBusFareDetailsComponent$commitSwitch$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) premiumBusFareDetailsComponent$commitSwitch$1.L$2;
            premiumBusFareDetailsFlowType = (PremiumBusFareDetailsFlowType) premiumBusFareDetailsComponent$commitSwitch$1.L$1;
            PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate2 = (PremiumBusFareDetailsDelegate) premiumBusFareDetailsComponent$commitSwitch$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            premiumBusFareDetailsDelegate = premiumBusFareDetailsDelegate2;
        }
        try {
            PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate3 = premiumBusFareDetailsComponent.r;
            Job job = (Job) premiumBusFareDetailsComponent.w.remove(premiumBusFareDetailsDelegate3);
            if (job != null) {
                job.cancel(null);
            }
            premiumBusFareDetailsComponent.x = null;
            Job job2 = premiumBusFareDetailsComponent.s;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            premiumBusFareDetailsComponent.s = null;
            premiumBusFareDetailsDelegate3.dispose();
            premiumBusFareDetailsComponent.r = premiumBusFareDetailsDelegate;
            premiumBusFareDetailsComponent.u = null;
            mutex.e(null);
            Job job3 = premiumBusFareDetailsComponent.s;
            if (job3 != null) {
                ((JobSupport) job3).cancel(null);
            }
            premiumBusFareDetailsComponent.s = BuildersKt.d(premiumBusFareDetailsComponent.j, null, null, new PremiumBusFareDetailsComponent$observeActiveDelegateState$1(premiumBusFareDetailsDelegate, premiumBusFareDetailsComponent, null), 3);
            premiumBusFareDetailsComponent.E0(new et0(premiumBusFareDetailsFlowType, 5));
            return Unit.f17538a;
        } catch (Throwable th) {
            mutex.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static final Object H0(PremiumBusFareDetailsComponent premiumBusFareDetailsComponent, PassengerDetailAppModel passengerDetailAppModel, int i, String str, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1 premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1;
        String strA;
        String str2;
        String str3;
        int i2;
        String str4;
        String str5;
        Object obj;
        String str6;
        String str7;
        boolean z2;
        ArrayList arrayList;
        int i3;
        String str8;
        PassengerDetailAppModel passengerDetailAppModel2 = passengerDetailAppModel;
        premiumBusFareDetailsComponent.getClass();
        CurrencyFeature currencyFeature = premiumBusFareDetailsComponent.m;
        if (continuationImpl instanceof PremiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1) {
            premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1 = (PremiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1) continuationImpl;
            int i4 = premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.label = i4 - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1 = new PremiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1(premiumBusFareDetailsComponent, continuationImpl);
            }
        } else {
            premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1 = new PremiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1(premiumBusFareDetailsComponent, continuationImpl);
        }
        Object obj2 = premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.label;
        int i6 = 1;
        if (i5 == 0) {
            ResultKt.b(obj2);
            long j = passengerDetailAppModel2.f3892a;
            Integer num = passengerDetailAppModel2.f;
            CurrencyRoundOffLogic currencyRoundOffLogic = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING;
            String strA2 = currencyFeature.a(j, currencyRoundOffLogic);
            String strA3 = currencyFeature.a(passengerDetailAppModel2.h, currencyRoundOffLogic);
            strA = currencyFeature.a(passengerDetailAppModel2.f3892a * ((long) i), currencyRoundOffLogic);
            if (!passengerDetailAppModel2.e || num == null || num.intValue() <= 0) {
                str2 = str;
                str3 = null;
                i2 = i;
                str4 = strA2;
                str5 = strA3;
            } else {
                StringProvider stringProvider = premiumBusFareDetailsComponent.n;
                StringEnum stringEnum = StringEnum.DISCOUNT_X_OFF;
                Object[] objArr = {num};
                premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.L$0 = passengerDetailAppModel2;
                str2 = str;
                premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.L$1 = str2;
                premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.L$2 = strA2;
                premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.L$3 = strA3;
                premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.L$4 = strA;
                premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.I$0 = i;
                premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.label = 1;
                Object objB = stringProvider.b(stringEnum, objArr, premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objB;
                i2 = i;
                str6 = strA2;
                str7 = strA3;
            }
            String str9 = str3;
            String str10 = strA;
            if (str2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = !z2 ? !(!passengerDetailAppModel2.d.equals(str2) || i2 >= passengerDetailAppModel2.i.b) : i2 < passengerDetailAppModel2.i.b;
            boolean z4 = !z2 ? !(!passengerDetailAppModel2.d.equals(str2) || i2 <= passengerDetailAppModel2.i.f3893a) : i2 > passengerDetailAppModel2.i.f3893a;
            String str11 = passengerDetailAppModel2.d;
            String str12 = passengerDetailAppModel2.g;
            boolean z5 = passengerDetailAppModel2.e;
            List<FareBreakupAppModel> list = passengerDetailAppModel2.c;
            arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (FareBreakupAppModel fareBreakupAppModel : list) {
                i3 = WhenMappings.f7549a[fareBreakupAppModel.b.ordinal()];
                if (i3 == i6) {
                    str8 = "-";
                } else {
                    if (i3 == 2 && i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str8 = "";
                }
                arrayList.add(new FareBreakupUiModel(fareBreakupAppModel.f3890a, str8, currencyFeature.a(((long) i2) * fareBreakupAppModel.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)));
                i6 = 1;
            }
            SeatLimitAppModel seatLimitAppModel = passengerDetailAppModel2.i;
            return new PassengerFareDetailsUiModel(str11, str12, z5, str9, str4, str5, arrayList, i2, seatLimitAppModel.f3893a, seatLimitAppModel.b, z3, z4, str10, passengerDetailAppModel2.d.equals(str2));
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.I$0;
        String str13 = (String) premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.L$4;
        str7 = (String) premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.L$3;
        str6 = (String) premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.L$2;
        String str14 = (String) premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.L$1;
        PassengerDetailAppModel passengerDetailAppModel3 = (PassengerDetailAppModel) premiumBusFareDetailsComponent$toPassengerFareDetailsUiModel$1.L$0;
        ResultKt.b(obj2);
        strA = str13;
        passengerDetailAppModel2 = passengerDetailAppModel3;
        obj = obj2;
        str2 = str14;
        str3 = (String) obj;
        str5 = str7;
        str4 = str6;
        String str15 = str3;
        String str16 = strA;
        if (str2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
        }
        if (z2) {
        }
        String str17 = passengerDetailAppModel2.d;
        String str18 = passengerDetailAppModel2.g;
        boolean z6 = passengerDetailAppModel2.e;
        List<FareBreakupAppModel> list2 = passengerDetailAppModel2.c;
        arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        while (r2.hasNext()) {
            i3 = WhenMappings.f7549a[fareBreakupAppModel.b.ordinal()];
            if (i3 == i6) {
                if (i3 == 2) {
                }
                str8 = "";
            } else {
                str8 = "-";
            }
            arrayList.add(new FareBreakupUiModel(fareBreakupAppModel.f3890a, str8, currencyFeature.a(((long) i2) * fareBreakupAppModel.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)));
            i6 = 1;
        }
        SeatLimitAppModel seatLimitAppModel2 = passengerDetailAppModel2.i;
        return new PassengerFareDetailsUiModel(str17, str18, z6, str15, str4, str5, arrayList, i2, seatLimitAppModel2.f3893a, seatLimitAppModel2.b, z3, z4, str16, passengerDetailAppModel2.d.equals(str2));
    }

    public final void I0(PremiumBusFareDetailsIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        if (intent instanceof PremiumBusFareDetailsIntent.SwitchErrorDismissedIntent) {
            E0(new gt0(16));
        } else {
            this.r.e(intent);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsComponent$convertToUiState$2 premiumBusFareDetailsComponent$convertToUiState$2 = new PremiumBusFareDetailsComponent$convertToUiState$2(1, this, PremiumBusFareDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsIntent;)V", 0);
        return this.o.k((PremiumBusFareDetailsComponentDataState) obj, this.q, premiumBusFareDetailsComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PremiumBusFareDetailsComponentDataState(z, new PremiumBusFareDetailsDataState(), false, null, "", EmptyList.f17557a, false);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        Job job = this.s;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        LinkedHashMap linkedHashMap = this.w;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(null);
        }
        Job job2 = this.t;
        if (job2 != null) {
            ((JobSupport) job2).cancel(null);
        }
        PremiumBusFareDetailsDelegate premiumBusFareDetailsDelegate = this.u;
        if (premiumBusFareDetailsDelegate != null) {
            premiumBusFareDetailsDelegate.dispose();
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((PremiumBusFareDetailsDelegate) obj) != this.r) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            ((PremiumBusFareDetailsDelegate) obj2).dispose();
        }
        this.r.dispose();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        I0(PremiumBusFareDetailsIntent.InitializationIntent.f7592a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        I0(PremiumBusFareDetailsIntent.OnStoppedIntent.f7598a);
    }
}
