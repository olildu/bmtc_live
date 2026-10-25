package app.chalo.quickpay.ui.payforticket;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.data.ClusterConfig;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.quickpay.ui.payforticket.PayForTicketViewState;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.quickpay.ui.payforticket.PayForTicketComponent$handleInitializationIntent$2", f = "PayForTicketComponent.kt", l = {73, EACTags.DEPRECATED, EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID, 78}, m = "invokeSuspend", v = 1)
final class PayForTicketComponent$handleInitializationIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PayForTicketIntent.InitialIntent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PayForTicketComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayForTicketComponent$handleInitializationIntent$2(PayForTicketComponent payForTicketComponent, PayForTicketIntent.InitialIntent initialIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = payForTicketComponent;
        this.$intent = initialIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PayForTicketComponent$handleInitializationIntent$2(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PayForTicketComponent$handleInitializationIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:52:0x010e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        WalletSetupConfiguration walletSetupConfiguration;
        ClusterConfig clusterConfig;
        String str;
        String str2;
        Object objF0;
        ClusterConfig clusterConfig2;
        WalletSetupConfiguration walletSetupConfiguration2;
        String str3;
        final String str4;
        WalletTypeIdentifier walletTypeIdentifier;
        ChaloUseCaseResult chaloUseCaseResult;
        String str5;
        ClusterConfig clusterConfig3;
        String str6;
        WalletSetupConfiguration walletSetupConfiguration3;
        long jIntValue;
        final String strA;
        final boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final boolean zA = true;
        if (i == 0) {
            ResultKt.b(obj);
            GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase = this.this$0.l;
            this.label = 1;
            obj = getWalletSetupConfigurationUseCase.b(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                lowerCase = (String) this.L$1;
                walletSetupConfiguration = (WalletSetupConfiguration) this.L$0;
                ResultKt.b(obj);
                clusterConfig = (ClusterConfig) obj;
                str2 = this.$intent.f8886a;
                if (str2 == null) {
                    str2 = "";
                }
                PayForTicketComponent payForTicketComponent = this.this$0;
                this.L$0 = walletSetupConfiguration;
                this.L$1 = lowerCase;
                this.L$2 = clusterConfig;
                this.L$3 = str2;
                this.label = 3;
                objF0 = PayForTicketComponent.F0(payForTicketComponent, this);
                if (objF0 != coroutineSingletons) {
                    WalletSetupConfiguration walletSetupConfiguration4 = walletSetupConfiguration;
                    clusterConfig2 = clusterConfig;
                    obj = objF0;
                    walletSetupConfiguration2 = walletSetupConfiguration4;
                    String str7 = str2;
                    str3 = lowerCase;
                    str4 = str7;
                    walletTypeIdentifier = (WalletTypeIdentifier) obj;
                    if (walletTypeIdentifier != null) {
                        FetchWalletBalanceUseCase fetchWalletBalanceUseCase = this.this$0.m;
                        this.L$0 = walletSetupConfiguration2;
                        this.L$1 = str3;
                        this.L$2 = clusterConfig2;
                        this.L$3 = str4;
                        this.label = 4;
                        obj = fetchWalletBalanceUseCase.b(walletTypeIdentifier, this);
                        if (obj != coroutineSingletons) {
                            str5 = str4;
                            clusterConfig3 = clusterConfig2;
                            str6 = str3;
                            walletSetupConfiguration3 = walletSetupConfiguration2;
                        }
                    } else {
                        chaloUseCaseResult = null;
                    }
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        jIntValue = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).intValue();
                    } else {
                        jIntValue = -1;
                    }
                    if (jIntValue != -1) {
                        strA = this.this$0.q.a(jIntValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                    } else {
                        strA = null;
                    }
                    if (walletSetupConfiguration2.a()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (str3 != null) {
                        zA = clusterConfig2.a(str3);
                    }
                    AnalyticsContractImplKt.b(this.this$0.n, "pay for ticket screen opened", Source.PAY_FOR_TICKET_SCREEN, MapsKt.d(), true, 8);
                    PopUpToConfig.Prev prev = PopUpToConfig.Prev.f9221a;
                    if (!zA) {
                        if (zA) {
                            this.this$0.E0(new Function1() { // from class: dq0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    ((PayForTicketViewState) obj2).getClass();
                                    String routeJsonString = str4;
                                    Intrinsics.i(routeJsonString, "routeJsonString");
                                    return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                                }
                            });
                        } else {
                            this.this$0.E0(new Function1() { // from class: dq0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    ((PayForTicketViewState) obj2).getClass();
                                    String routeJsonString = str4;
                                    Intrinsics.i(routeJsonString, "routeJsonString");
                                    return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                                }
                            });
                        }
                    } else if (zA) {
                        this.this$0.E0(new Function1() { // from class: dq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ((PayForTicketViewState) obj2).getClass();
                                String routeJsonString = str4;
                                Intrinsics.i(routeJsonString, "routeJsonString");
                                return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                            }
                        });
                    } else {
                        this.this$0.E0(new Function1() { // from class: dq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ((PayForTicketViewState) obj2).getClass();
                                String routeJsonString = str4;
                                Intrinsics.i(routeJsonString, "routeJsonString");
                                return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                            }
                        });
                    }
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                str4 = (String) this.L$3;
                clusterConfig2 = (ClusterConfig) this.L$2;
                str3 = (String) this.L$1;
                walletSetupConfiguration2 = (WalletSetupConfiguration) this.L$0;
                ResultKt.b(obj);
                walletTypeIdentifier = (WalletTypeIdentifier) obj;
                if (walletTypeIdentifier != null) {
                    FetchWalletBalanceUseCase fetchWalletBalanceUseCase2 = this.this$0.m;
                    this.L$0 = walletSetupConfiguration2;
                    this.L$1 = str3;
                    this.L$2 = clusterConfig2;
                    this.L$3 = str4;
                    this.label = 4;
                    obj = fetchWalletBalanceUseCase2.b(walletTypeIdentifier, this);
                    if (obj != coroutineSingletons) {
                        str5 = str4;
                        clusterConfig3 = clusterConfig2;
                        str6 = str3;
                        walletSetupConfiguration3 = walletSetupConfiguration2;
                    }
                    return coroutineSingletons;
                }
                chaloUseCaseResult = null;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    jIntValue = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).intValue();
                } else {
                    jIntValue = -1;
                }
                if (jIntValue != -1) {
                    strA = this.this$0.q.a(jIntValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                } else {
                    strA = null;
                }
                if (walletSetupConfiguration2.a() || !walletSetupConfiguration2.b()) {
                    z = false;
                } else {
                    z = true;
                }
                if (str3 != null && clusterConfig2 != null) {
                    zA = clusterConfig2.a(str3);
                }
                AnalyticsContractImplKt.b(this.this$0.n, "pay for ticket screen opened", Source.PAY_FOR_TICKET_SCREEN, MapsKt.d(), true, 8);
                PopUpToConfig.Prev prev2 = PopUpToConfig.Prev.f9221a;
                if (!zA && z) {
                    this.this$0.o.b(new ChaloNavigationRequest.Navigate(new TicketPurchaseArgs.QuickPayArgs(this.this$0.k.c), new ChaloNavOptions(prev2, 3), null, 4));
                } else if (zA || z) {
                    this.this$0.E0(new Function1() { // from class: dq0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ((PayForTicketViewState) obj2).getClass();
                            String routeJsonString = str4;
                            Intrinsics.i(routeJsonString, "routeJsonString");
                            return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                        }
                    });
                } else {
                    PayForTicketComponent payForTicketComponent2 = this.this$0;
                    ChaloNavigationManager chaloNavigationManager = payForTicketComponent2.o;
                    Source source = payForTicketComponent2.k.c;
                    if (str4.length() <= 0) {
                        str4 = null;
                    }
                    chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TicketPurchaseArgs.MTicketTripInfoArgs(source, str4, null), new ChaloNavOptions(prev2, 3), null, 4));
                }
                return Unit.f17538a;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = (String) this.L$3;
            clusterConfig3 = (ClusterConfig) this.L$2;
            str6 = (String) this.L$1;
            walletSetupConfiguration3 = (WalletSetupConfiguration) this.L$0;
            ResultKt.b(obj);
        }
        chaloUseCaseResult = (ChaloUseCaseResult) obj;
        walletSetupConfiguration2 = walletSetupConfiguration3;
        str3 = str6;
        clusterConfig2 = clusterConfig3;
        str4 = str5;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            jIntValue = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).intValue();
        } else {
            jIntValue = -1;
        }
        if (jIntValue != -1) {
            strA = this.this$0.q.a(jIntValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
        } else {
            strA = null;
        }
        if (walletSetupConfiguration2.a()) {
            z = false;
        } else {
            z = false;
        }
        if (str3 != null) {
            zA = clusterConfig2.a(str3);
        }
        AnalyticsContractImplKt.b(this.this$0.n, "pay for ticket screen opened", Source.PAY_FOR_TICKET_SCREEN, MapsKt.d(), true, 8);
        PopUpToConfig.Prev prev3 = PopUpToConfig.Prev.f9221a;
        if (!zA) {
            if (zA) {
                this.this$0.E0(new Function1() { // from class: dq0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ((PayForTicketViewState) obj2).getClass();
                        String routeJsonString = str4;
                        Intrinsics.i(routeJsonString, "routeJsonString");
                        return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                    }
                });
            } else {
                this.this$0.E0(new Function1() { // from class: dq0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ((PayForTicketViewState) obj2).getClass();
                        String routeJsonString = str4;
                        Intrinsics.i(routeJsonString, "routeJsonString");
                        return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                    }
                });
            }
        } else if (zA) {
            this.this$0.E0(new Function1() { // from class: dq0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((PayForTicketViewState) obj2).getClass();
                    String routeJsonString = str4;
                    Intrinsics.i(routeJsonString, "routeJsonString");
                    return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                }
            });
        } else {
            this.this$0.E0(new Function1() { // from class: dq0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((PayForTicketViewState) obj2).getClass();
                    String routeJsonString = str4;
                    Intrinsics.i(routeJsonString, "routeJsonString");
                    return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                }
            });
        }
        return Unit.f17538a;
        WalletSetupConfiguration walletSetupConfiguration5 = (WalletSetupConfiguration) obj;
        CityAppModel cityAppModel = (CityAppModel) this.this$0.r.getE().getValue();
        if (cityAppModel == null || (str = cityAppModel.f8854a) == null) {
            lowerCase = null;
        } else {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        }
        if (lowerCase != null) {
            GetClusterConfigForCityUseCase getClusterConfigForCityUseCase = this.this$0.s;
            this.L$0 = walletSetupConfiguration5;
            this.L$1 = lowerCase;
            this.label = 2;
            Object objA = getClusterConfigForCityUseCase.a(lowerCase, this);
            if (objA != coroutineSingletons) {
                walletSetupConfiguration = walletSetupConfiguration5;
                obj = objA;
                clusterConfig = (ClusterConfig) obj;
                str2 = this.$intent.f8886a;
                if (str2 == null) {
                    str2 = "";
                }
                PayForTicketComponent payForTicketComponent3 = this.this$0;
                this.L$0 = walletSetupConfiguration;
                this.L$1 = lowerCase;
                this.L$2 = clusterConfig;
                this.L$3 = str2;
                this.label = 3;
                objF0 = PayForTicketComponent.F0(payForTicketComponent3, this);
                if (objF0 != coroutineSingletons) {
                    WalletSetupConfiguration walletSetupConfiguration6 = walletSetupConfiguration;
                    clusterConfig2 = clusterConfig;
                    obj = objF0;
                    walletSetupConfiguration2 = walletSetupConfiguration6;
                    String str8 = str2;
                    str3 = lowerCase;
                    str4 = str8;
                    walletTypeIdentifier = (WalletTypeIdentifier) obj;
                    if (walletTypeIdentifier != null) {
                        FetchWalletBalanceUseCase fetchWalletBalanceUseCase3 = this.this$0.m;
                        this.L$0 = walletSetupConfiguration2;
                        this.L$1 = str3;
                        this.L$2 = clusterConfig2;
                        this.L$3 = str4;
                        this.label = 4;
                        obj = fetchWalletBalanceUseCase3.b(walletTypeIdentifier, this);
                        if (obj != coroutineSingletons) {
                            str5 = str4;
                            clusterConfig3 = clusterConfig2;
                            str6 = str3;
                            walletSetupConfiguration3 = walletSetupConfiguration2;
                            chaloUseCaseResult = (ChaloUseCaseResult) obj;
                            walletSetupConfiguration2 = walletSetupConfiguration3;
                            str3 = str6;
                            clusterConfig2 = clusterConfig3;
                            str4 = str5;
                        }
                    } else {
                        chaloUseCaseResult = null;
                    }
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        jIntValue = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).intValue();
                    } else {
                        jIntValue = -1;
                    }
                    if (jIntValue != -1) {
                        strA = this.this$0.q.a(jIntValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                    } else {
                        strA = null;
                    }
                    if (walletSetupConfiguration2.a()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (str3 != null) {
                        zA = clusterConfig2.a(str3);
                    }
                    AnalyticsContractImplKt.b(this.this$0.n, "pay for ticket screen opened", Source.PAY_FOR_TICKET_SCREEN, MapsKt.d(), true, 8);
                    PopUpToConfig.Prev prev4 = PopUpToConfig.Prev.f9221a;
                    if (!zA) {
                        if (zA) {
                            this.this$0.E0(new Function1() { // from class: dq0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    ((PayForTicketViewState) obj2).getClass();
                                    String routeJsonString = str4;
                                    Intrinsics.i(routeJsonString, "routeJsonString");
                                    return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                                }
                            });
                        } else {
                            this.this$0.E0(new Function1() { // from class: dq0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    ((PayForTicketViewState) obj2).getClass();
                                    String routeJsonString = str4;
                                    Intrinsics.i(routeJsonString, "routeJsonString");
                                    return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                                }
                            });
                        }
                    } else if (zA) {
                        this.this$0.E0(new Function1() { // from class: dq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ((PayForTicketViewState) obj2).getClass();
                                String routeJsonString = str4;
                                Intrinsics.i(routeJsonString, "routeJsonString");
                                return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                            }
                        });
                    } else {
                        this.this$0.E0(new Function1() { // from class: dq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ((PayForTicketViewState) obj2).getClass();
                                String routeJsonString = str4;
                                Intrinsics.i(routeJsonString, "routeJsonString");
                                return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                            }
                        });
                    }
                    return Unit.f17538a;
                }
            }
        } else {
            walletSetupConfiguration = walletSetupConfiguration5;
            clusterConfig = null;
            str2 = this.$intent.f8886a;
            if (str2 == null) {
                str2 = "";
            }
            PayForTicketComponent payForTicketComponent4 = this.this$0;
            this.L$0 = walletSetupConfiguration;
            this.L$1 = lowerCase;
            this.L$2 = clusterConfig;
            this.L$3 = str2;
            this.label = 3;
            objF0 = PayForTicketComponent.F0(payForTicketComponent4, this);
            if (objF0 != coroutineSingletons) {
                WalletSetupConfiguration walletSetupConfiguration7 = walletSetupConfiguration;
                clusterConfig2 = clusterConfig;
                obj = objF0;
                walletSetupConfiguration2 = walletSetupConfiguration7;
                String str9 = str2;
                str3 = lowerCase;
                str4 = str9;
                walletTypeIdentifier = (WalletTypeIdentifier) obj;
                if (walletTypeIdentifier != null) {
                    FetchWalletBalanceUseCase fetchWalletBalanceUseCase4 = this.this$0.m;
                    this.L$0 = walletSetupConfiguration2;
                    this.L$1 = str3;
                    this.L$2 = clusterConfig2;
                    this.L$3 = str4;
                    this.label = 4;
                    obj = fetchWalletBalanceUseCase4.b(walletTypeIdentifier, this);
                    if (obj != coroutineSingletons) {
                        str5 = str4;
                        clusterConfig3 = clusterConfig2;
                        str6 = str3;
                        walletSetupConfiguration3 = walletSetupConfiguration2;
                        chaloUseCaseResult = (ChaloUseCaseResult) obj;
                        walletSetupConfiguration2 = walletSetupConfiguration3;
                        str3 = str6;
                        clusterConfig2 = clusterConfig3;
                        str4 = str5;
                    }
                } else {
                    chaloUseCaseResult = null;
                }
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    jIntValue = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).intValue();
                } else {
                    jIntValue = -1;
                }
                if (jIntValue != -1) {
                    strA = this.this$0.q.a(jIntValue, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                } else {
                    strA = null;
                }
                if (walletSetupConfiguration2.a()) {
                    z = false;
                } else {
                    z = false;
                }
                if (str3 != null) {
                    zA = clusterConfig2.a(str3);
                }
                AnalyticsContractImplKt.b(this.this$0.n, "pay for ticket screen opened", Source.PAY_FOR_TICKET_SCREEN, MapsKt.d(), true, 8);
                PopUpToConfig.Prev prev5 = PopUpToConfig.Prev.f9221a;
                if (!zA) {
                    if (zA) {
                        this.this$0.E0(new Function1() { // from class: dq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ((PayForTicketViewState) obj2).getClass();
                                String routeJsonString = str4;
                                Intrinsics.i(routeJsonString, "routeJsonString");
                                return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                            }
                        });
                    } else {
                        this.this$0.E0(new Function1() { // from class: dq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ((PayForTicketViewState) obj2).getClass();
                                String routeJsonString = str4;
                                Intrinsics.i(routeJsonString, "routeJsonString");
                                return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                            }
                        });
                    }
                } else if (zA) {
                    this.this$0.E0(new Function1() { // from class: dq0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ((PayForTicketViewState) obj2).getClass();
                            String routeJsonString = str4;
                            Intrinsics.i(routeJsonString, "routeJsonString");
                            return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                        }
                    });
                } else {
                    this.this$0.E0(new Function1() { // from class: dq0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ((PayForTicketViewState) obj2).getClass();
                            String routeJsonString = str4;
                            Intrinsics.i(routeJsonString, "routeJsonString");
                            return new PayForTicketViewState(routeJsonString, strA, false, z, zA);
                        }
                    });
                }
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }
}
