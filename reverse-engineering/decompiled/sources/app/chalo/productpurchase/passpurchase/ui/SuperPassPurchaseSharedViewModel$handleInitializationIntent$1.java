package app.chalo.productpurchase.passpurchase.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.home.domain.GetPremiumPassExpiryEligibilityForPurchaseUseCase;
import app.chalo.home.domain.PassExpiryEligibilityAndDate;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.SuperPassProductConfigurationProperties;
import app.chalo.productpurchase.passpurchase.ui.factory.StateCreationDependencies;
import app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactory;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import defpackage.sl;
import defpackage.vo1;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel$handleInitializationIntent$1", f = "SuperPassPurchaseSharedViewModel.kt", l = {150, 164, 169}, m = "invokeSuspend", v = 1)
final class SuperPassPurchaseSharedViewModel$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPassPurchaseSharedIntent.InitializationIntent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SuperPassPurchaseSharedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassPurchaseSharedViewModel$handleInitializationIntent$1(SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel, SuperPassPurchaseSharedIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassPurchaseSharedViewModel;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassPurchaseSharedViewModel$handleInitializationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassPurchaseSharedViewModel$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0256  */
    /* JADX WARN: Code duplicated, block: B:102:0x025a  */
    /* JADX WARN: Code duplicated, block: B:103:0x025e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0262  */
    /* JADX WARN: Code duplicated, block: B:108:0x027a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0280 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0156  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0177  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187 A[PHI: r2 r6
      0x0187: PHI (r2v44 java.lang.Object) = (r2v38 java.lang.Object), (r2v70 java.lang.Object) binds: [B:68:0x0184, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r6v7 kotlin.jvm.internal.Ref$ObjectRef) = (r6v3 kotlin.jvm.internal.Ref$ObjectRef), (r6v16 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:68:0x0184, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0194  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:84:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:91:0x0227  */
    /* JADX WARN: Code duplicated, block: B:93:0x0244  */
    /* JADX WARN: Code duplicated, block: B:94:0x0247  */
    /* JADX WARN: Code duplicated, block: B:96:0x024b  */
    /* JADX WARN: Code duplicated, block: B:97:0x024e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0252  */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x011a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37, types: [T, app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        SuperPassPurchaseSharedState superPassPurchaseSharedState;
        Ref.ObjectRef objectRef2;
        Object objB;
        SuperPassPurchaseSharedState superPassPurchaseSharedState2;
        Ref.ObjectRef objectRef3;
        T t;
        BookableSuperPassConfiguration bookableSuperPassConfiguration;
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties;
        Object objA;
        Long lA;
        Object objC;
        Ref.ObjectRef objectRef4;
        long jLongValue;
        SuperPassPurchaseSharedState superPassPurchaseSharedState3;
        SuperPassPurchaseSharedState superPassPurchaseSharedState4;
        String str;
        SuperPassPurchaseArgs superPassPurchaseArgs;
        String str2;
        AgencyInfoAppModel agencyInfoAppModel;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                objectRef3 = (Ref.ObjectRef) this.L$2;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.L$1;
                SuperPassPurchaseSharedState superPassPurchaseSharedState5 = (SuperPassPurchaseSharedState) this.L$0;
                ResultKt.b(obj);
                objectRef = objectRef5;
                objB = obj;
                superPassPurchaseSharedState2 = superPassPurchaseSharedState5;
            } else {
                if (i == 2) {
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) this.L$0;
                    ResultKt.b(obj);
                    objectRef2 = objectRef6;
                    objA = obj;
                    lA = ((PassExpiryEligibilityAndDate) objA).a();
                    if (lA == null && (lA = ((SuperPassPurchaseSharedState) objectRef2.element).j) == null) {
                        BasicInfoContract basicInfoContract = this.this$0.p;
                        this.L$0 = objectRef2;
                        this.label = 3;
                        objC = basicInfoContract.c(this);
                        if (objC != coroutineSingletons) {
                            objectRef4 = objectRef2;
                        }
                        return coroutineSingletons;
                    }
                    jLongValue = lA.longValue();
                    objectRef2.element = SuperPassPurchaseSharedState.a((SuperPassPurchaseSharedState) objectRef2.element, null, null, null, null, null, new Long(jLongValue), 0L, false, null, null, 261631);
                    superPassPurchaseSharedState3 = (SuperPassPurchaseSharedState) objectRef2.element;
                    if (!superPassPurchaseSharedState3.l) {
                        SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel = this.this$0;
                        agencyInfoAppModel = superPassPurchaseSharedState3.c;
                        if (agencyInfoAppModel != null) {
                            str3 = agencyInfoAppModel.f8852a;
                        } else {
                            str3 = null;
                        }
                        AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel.u, "agency not available for purchase", Source.SUPER_PASS_PURCHASE_SHARED_COMPONENT, vo1.s("agency", String.valueOf(str3)), false, 24);
                        ChaloNavigationManagerKt.e(superPassPurchaseSharedViewModel.m, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
                    }
                    SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel2 = this.this$0;
                    sl slVar = new sl(objectRef2, 3);
                    Set set = SuperPassPurchaseSharedViewModel.G;
                    superPassPurchaseSharedViewModel2.E0(slVar);
                    superPassPurchaseSharedState4 = (SuperPassPurchaseSharedState) objectRef2.element;
                    str = superPassPurchaseSharedState4.d;
                    if (str != null) {
                        return unit;
                    }
                    SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel3 = this.this$0;
                    SuperPassPurchaseSharedIntent.InitializationIntent initializationIntent = this.$intent;
                    AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel3.u, "superPassPurchaseActivity open", superPassPurchaseSharedState4.f8359a, vo1.s("flow", str), true, 8);
                    superPassPurchaseArgs = initializationIntent.f8348a;
                    if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs) {
                        str2 = "confirmation screen";
                    } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs) {
                        str2 = "basicUserDetails screen";
                    } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.PassengerSelectionArgs) {
                        str2 = "smartPassengerSelection screen";
                    } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs) {
                        str2 = "userProofsOverview screen";
                    } else {
                        if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ProofUploadInternalArgs) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = "start destination not available";
                    }
                    AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel3.u, "superPassPurchase startDestination assigned", Source.SUPER_PASS_PURCHASE_SHARED_COMPONENT, vo1.s("start destination", str2), false, 24);
                    return unit;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef4 = (Ref.ObjectRef) this.L$0;
                ResultKt.b(obj);
                objC = obj;
            }
            objectRef2 = objectRef4;
            jLongValue = ((Number) objC).longValue();
            objectRef2.element = SuperPassPurchaseSharedState.a((SuperPassPurchaseSharedState) objectRef2.element, null, null, null, null, null, new Long(jLongValue), 0L, false, null, null, 261631);
            superPassPurchaseSharedState3 = (SuperPassPurchaseSharedState) objectRef2.element;
            if (!superPassPurchaseSharedState3.l) {
                SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel4 = this.this$0;
                agencyInfoAppModel = superPassPurchaseSharedState3.c;
                if (agencyInfoAppModel != null) {
                    str3 = agencyInfoAppModel.f8852a;
                } else {
                    str3 = null;
                }
                AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel4.u, "agency not available for purchase", Source.SUPER_PASS_PURCHASE_SHARED_COMPONENT, vo1.s("agency", String.valueOf(str3)), false, 24);
                ChaloNavigationManagerKt.e(superPassPurchaseSharedViewModel4.m, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
            }
            SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel5 = this.this$0;
            sl slVar2 = new sl(objectRef2, 3);
            Set set2 = SuperPassPurchaseSharedViewModel.G;
            superPassPurchaseSharedViewModel5.E0(slVar2);
            superPassPurchaseSharedState4 = (SuperPassPurchaseSharedState) objectRef2.element;
            str = superPassPurchaseSharedState4.d;
            if (str != null) {
                return unit;
            }
            SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel6 = this.this$0;
            SuperPassPurchaseSharedIntent.InitializationIntent initializationIntent2 = this.$intent;
            AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel6.u, "superPassPurchaseActivity open", superPassPurchaseSharedState4.f8359a, vo1.s("flow", str), true, 8);
            superPassPurchaseArgs = initializationIntent2.f8348a;
            if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs) {
                str2 = "confirmation screen";
            } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs) {
                str2 = "basicUserDetails screen";
            } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.PassengerSelectionArgs) {
                str2 = "smartPassengerSelection screen";
            } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs) {
                str2 = "userProofsOverview screen";
            } else {
                if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ProofUploadInternalArgs) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "start destination not available";
            }
            AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel6.u, "superPassPurchase startDestination assigned", Source.SUPER_PASS_PURCHASE_SHARED_COMPONENT, vo1.s("start destination", str2), false, 24);
            return unit;
        }
        ResultKt.b(obj);
        SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel7 = this.this$0;
        SuperPassPurchaseArgs superPassPurchaseArgs2 = this.$intent.f8348a;
        Set set3 = SuperPassPurchaseSharedViewModel.G;
        superPassPurchaseSharedViewModel7.getClass();
        if ((superPassPurchaseArgs2 instanceof SuperPassPurchaseArgs.ProofUploadInternalArgs) || (superPassPurchaseArgs2 instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs.InternalArgs) || superPassPurchaseArgs2.equals(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.INSTANCE) || (superPassPurchaseArgs2 instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs)) {
            SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel8 = this.this$0;
            superPassPurchaseSharedViewModel8.m.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(superPassPurchaseSharedViewModel8.k)));
            return unit;
        }
        if (!(superPassPurchaseArgs2 instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof) && !(superPassPurchaseArgs2 instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification) && !(superPassPurchaseArgs2 instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification) && !(superPassPurchaseArgs2 instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew) && !(superPassPurchaseArgs2 instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof) && !(superPassPurchaseArgs2 instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof) && !(superPassPurchaseArgs2 instanceof SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof) && !(superPassPurchaseArgs2 instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication)) {
            throw new NoWhenBranchMatchedException();
        }
        SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel9 = this.this$0;
        StateCreationDependencies stateCreationDependencies = new StateCreationDependencies(superPassPurchaseSharedViewModel9.n, superPassPurchaseSharedViewModel9.o, superPassPurchaseSharedViewModel9.p, superPassPurchaseSharedViewModel9.q, superPassPurchaseSharedViewModel9.r, superPassPurchaseSharedViewModel9.s, superPassPurchaseSharedViewModel9.v);
        Object value = this.this$0.f.getValue();
        if (((SuperPassPurchaseSharedState) value).d == null) {
            value = null;
        }
        SuperPassPurchaseSharedState superPassPurchaseSharedState6 = (SuperPassPurchaseSharedState) value;
        SuperPassPurchaseSharedState superPassPurchaseSharedStateA = superPassPurchaseSharedState6 != null ? SuperPassPurchaseSharedState.a(superPassPurchaseSharedState6, (CityAppModel) this.this$0.q.getE().getValue(), null, null, null, null, null, 0L, false, null, null, 262141) : null;
        objectRef = new Ref.ObjectRef();
        if (superPassPurchaseSharedStateA != null) {
            superPassPurchaseSharedState = superPassPurchaseSharedStateA;
            objectRef2 = objectRef;
            t = superPassPurchaseSharedStateA;
            objectRef.element = t;
            if (Intrinsics.d(objectRef2.element, SuperPassPurchaseSharedContractKt.f8345a)) {
                String message = "Factory returned error state for initial args: " + Reflection.a(this.$intent.f8348a.getClass()).f() + ". Navigating back.";
                Intrinsics.i(message, "message");
                SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel10 = this.this$0;
                superPassPurchaseSharedViewModel10.m.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(superPassPurchaseSharedViewModel10.k)));
                return unit;
            }
            if (superPassPurchaseSharedState == null && CollectionsKt.w(SuperPassPurchaseSharedViewModel.G, ((SuperPassPurchaseSharedState) objectRef2.element).d)) {
                GetPremiumPassExpiryEligibilityForPurchaseUseCase getPremiumPassExpiryEligibilityForPurchaseUseCase = this.this$0.B;
                bookableSuperPassConfiguration = ((SuperPassPurchaseSharedState) objectRef2.element).i;
                if (bookableSuperPassConfiguration != null) {
                    superPassProductConfigurationProperties = bookableSuperPassConfiguration.b;
                } else {
                    superPassProductConfigurationProperties = null;
                }
                this.L$0 = objectRef2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                objA = getPremiumPassExpiryEligibilityForPurchaseUseCase.a(superPassProductConfigurationProperties, this);
                if (objA != coroutineSingletons) {
                    lA = ((PassExpiryEligibilityAndDate) objA).a();
                    if (lA == null) {
                        BasicInfoContract basicInfoContract2 = this.this$0.p;
                        this.L$0 = objectRef2;
                        this.label = 3;
                        objC = basicInfoContract2.c(this);
                        if (objC != coroutineSingletons) {
                            objectRef4 = objectRef2;
                            objectRef2 = objectRef4;
                            jLongValue = ((Number) objC).longValue();
                            objectRef2.element = SuperPassPurchaseSharedState.a((SuperPassPurchaseSharedState) objectRef2.element, null, null, null, null, null, new Long(jLongValue), 0L, false, null, null, 261631);
                        }
                    }
                    jLongValue = lA.longValue();
                    objectRef2.element = SuperPassPurchaseSharedState.a((SuperPassPurchaseSharedState) objectRef2.element, null, null, null, null, null, new Long(jLongValue), 0L, false, null, null, 261631);
                }
            }
            superPassPurchaseSharedState3 = (SuperPassPurchaseSharedState) objectRef2.element;
            if (!superPassPurchaseSharedState3.l) {
                SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel11 = this.this$0;
                agencyInfoAppModel = superPassPurchaseSharedState3.c;
                if (agencyInfoAppModel != null) {
                    str3 = agencyInfoAppModel.f8852a;
                } else {
                    str3 = null;
                }
                AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel11.u, "agency not available for purchase", Source.SUPER_PASS_PURCHASE_SHARED_COMPONENT, vo1.s("agency", String.valueOf(str3)), false, 24);
                ChaloNavigationManagerKt.e(superPassPurchaseSharedViewModel11.m, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
            }
            SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel12 = this.this$0;
            sl slVar3 = new sl(objectRef2, 3);
            Set set4 = SuperPassPurchaseSharedViewModel.G;
            superPassPurchaseSharedViewModel12.E0(slVar3);
            superPassPurchaseSharedState4 = (SuperPassPurchaseSharedState) objectRef2.element;
            str = superPassPurchaseSharedState4.d;
            if (str != null) {
                return unit;
            }
            SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel13 = this.this$0;
            SuperPassPurchaseSharedIntent.InitializationIntent initializationIntent3 = this.$intent;
            AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel13.u, "superPassPurchaseActivity open", superPassPurchaseSharedState4.f8359a, vo1.s("flow", str), true, 8);
            superPassPurchaseArgs = initializationIntent3.f8348a;
            if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs) {
                str2 = "confirmation screen";
            } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs) {
                str2 = "basicUserDetails screen";
            } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.PassengerSelectionArgs) {
                str2 = "smartPassengerSelection screen";
            } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs) {
                str2 = "userProofsOverview screen";
            } else {
                if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ProofUploadInternalArgs) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "start destination not available";
            }
            AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel13.u, "superPassPurchase startDestination assigned", Source.SUPER_PASS_PURCHASE_SHARED_COMPONENT, vo1.s("start destination", str2), false, 24);
            return unit;
        }
        SuperPassPurchaseInitialStateFactory superPassPurchaseInitialStateFactory = this.this$0.l;
        SuperPassPurchaseArgs superPassPurchaseArgs3 = this.$intent.f8348a;
        this.L$0 = superPassPurchaseSharedStateA;
        this.L$1 = objectRef;
        this.L$2 = objectRef;
        this.label = 1;
        objB = superPassPurchaseInitialStateFactory.b(superPassPurchaseArgs3, stateCreationDependencies, this);
        if (objB != coroutineSingletons) {
            superPassPurchaseSharedState2 = superPassPurchaseSharedStateA;
            objectRef3 = objectRef;
        }
        return coroutineSingletons;
        Ref.ObjectRef objectRef7 = objectRef;
        objectRef = objectRef3;
        t = (SuperPassPurchaseSharedState) objB;
        objectRef2 = objectRef7;
        superPassPurchaseSharedState = superPassPurchaseSharedState2;
        objectRef.element = t;
        if (Intrinsics.d(objectRef2.element, SuperPassPurchaseSharedContractKt.f8345a)) {
            String message2 = "Factory returned error state for initial args: " + Reflection.a(this.$intent.f8348a.getClass()).f() + ". Navigating back.";
            Intrinsics.i(message2, "message");
            SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel14 = this.this$0;
            superPassPurchaseSharedViewModel14.m.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(superPassPurchaseSharedViewModel14.k)));
            return unit;
        }
        if (superPassPurchaseSharedState == null) {
            GetPremiumPassExpiryEligibilityForPurchaseUseCase getPremiumPassExpiryEligibilityForPurchaseUseCase2 = this.this$0.B;
            bookableSuperPassConfiguration = ((SuperPassPurchaseSharedState) objectRef2.element).i;
            if (bookableSuperPassConfiguration != null) {
                superPassProductConfigurationProperties = bookableSuperPassConfiguration.b;
            } else {
                superPassProductConfigurationProperties = null;
            }
            this.L$0 = objectRef2;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            objA = getPremiumPassExpiryEligibilityForPurchaseUseCase2.a(superPassProductConfigurationProperties, this);
            if (objA != coroutineSingletons) {
                lA = ((PassExpiryEligibilityAndDate) objA).a();
                if (lA == null) {
                    BasicInfoContract basicInfoContract3 = this.this$0.p;
                    this.L$0 = objectRef2;
                    this.label = 3;
                    objC = basicInfoContract3.c(this);
                    if (objC != coroutineSingletons) {
                        objectRef4 = objectRef2;
                        objectRef2 = objectRef4;
                        jLongValue = ((Number) objC).longValue();
                        objectRef2.element = SuperPassPurchaseSharedState.a((SuperPassPurchaseSharedState) objectRef2.element, null, null, null, null, null, new Long(jLongValue), 0L, false, null, null, 261631);
                    }
                }
                jLongValue = lA.longValue();
                objectRef2.element = SuperPassPurchaseSharedState.a((SuperPassPurchaseSharedState) objectRef2.element, null, null, null, null, null, new Long(jLongValue), 0L, false, null, null, 261631);
            }
            return coroutineSingletons;
        }
        superPassPurchaseSharedState3 = (SuperPassPurchaseSharedState) objectRef2.element;
        if (!superPassPurchaseSharedState3.l) {
            SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel15 = this.this$0;
            agencyInfoAppModel = superPassPurchaseSharedState3.c;
            if (agencyInfoAppModel != null) {
                str3 = agencyInfoAppModel.f8852a;
            } else {
                str3 = null;
            }
            AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel15.u, "agency not available for purchase", Source.SUPER_PASS_PURCHASE_SHARED_COMPONENT, vo1.s("agency", String.valueOf(str3)), false, 24);
            ChaloNavigationManagerKt.e(superPassPurchaseSharedViewModel15.m, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
        }
        SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel16 = this.this$0;
        sl slVar4 = new sl(objectRef2, 3);
        Set set5 = SuperPassPurchaseSharedViewModel.G;
        superPassPurchaseSharedViewModel16.E0(slVar4);
        superPassPurchaseSharedState4 = (SuperPassPurchaseSharedState) objectRef2.element;
        str = superPassPurchaseSharedState4.d;
        if (str != null) {
            return unit;
        }
        SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel17 = this.this$0;
        SuperPassPurchaseSharedIntent.InitializationIntent initializationIntent4 = this.$intent;
        AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel17.u, "superPassPurchaseActivity open", superPassPurchaseSharedState4.f8359a, vo1.s("flow", str), true, 8);
        superPassPurchaseArgs = initializationIntent4.f8348a;
        if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs) {
            str2 = "confirmation screen";
        } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs) {
            str2 = "basicUserDetails screen";
        } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.PassengerSelectionArgs) {
            str2 = "smartPassengerSelection screen";
        } else if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs) {
            str2 = "userProofsOverview screen";
        } else {
            if (superPassPurchaseArgs instanceof SuperPassPurchaseArgs.ProofUploadInternalArgs) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "start destination not available";
        }
        AnalyticsContractImplKt.b(superPassPurchaseSharedViewModel17.u, "superPassPurchase startDestination assigned", Source.SUPER_PASS_PURCHASE_SHARED_COMPONENT, vo1.s("start destination", str2), false, 24);
        return unit;
    }
}
