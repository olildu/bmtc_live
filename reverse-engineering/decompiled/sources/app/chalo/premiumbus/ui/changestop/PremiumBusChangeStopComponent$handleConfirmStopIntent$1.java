package app.chalo.premiumbus.ui.changestop;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.premiumbus.domain.ChangeStopFailureReason;
import app.chalo.premiumbus.domain.ProcessStopChangeRequestUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.args.PremiumBusChangeStopArgs;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.ej0;
import defpackage.gt0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent$handleConfirmStopIntent$1", f = "PremiumBusChangeStopComponent.kt", l = {323, 339, 372}, m = "invokeSuspend", v = 1)
final class PremiumBusChangeStopComponent$handleConfirmStopIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusChangeStopDataState $currentState;
    final /* synthetic */ String $selectedStopId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PremiumBusChangeStopComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusChangeStopComponent$handleConfirmStopIntent$1(PremiumBusChangeStopDataState premiumBusChangeStopDataState, String str, PremiumBusChangeStopComponent premiumBusChangeStopComponent, Continuation continuation) {
        super(2, continuation);
        this.$currentState = premiumBusChangeStopDataState;
        this.$selectedStopId = str;
        this.this$0 = premiumBusChangeStopComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumBusChangeStopComponent$handleConfirmStopIntent$1 premiumBusChangeStopComponent$handleConfirmStopIntent$1 = new PremiumBusChangeStopComponent$handleConfirmStopIntent$1(this.$currentState, this.$selectedStopId, this.this$0, continuation);
        premiumBusChangeStopComponent$handleConfirmStopIntent$1.L$0 = obj;
        return premiumBusChangeStopComponent$handleConfirmStopIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusChangeStopComponent$handleConfirmStopIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:30:0x0104  */
    /* JADX WARN: Code duplicated, block: B:31:0x0107  */
    /* JADX WARN: Code duplicated, block: B:33:0x010b  */
    /* JADX WARN: Code duplicated, block: B:34:0x010e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0112  */
    /* JADX WARN: Code duplicated, block: B:37:0x0115  */
    /* JADX WARN: Code duplicated, block: B:39:0x0119  */
    /* JADX WARN: Code duplicated, block: B:40:0x011c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0120  */
    /* JADX WARN: Code duplicated, block: B:43:0x0123  */
    /* JADX WARN: Code duplicated, block: B:45:0x0127  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a  */
    /* JADX WARN: Code duplicated, block: B:48:0x012e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0131  */
    /* JADX WARN: Code duplicated, block: B:51:0x0135  */
    /* JADX WARN: Code duplicated, block: B:52:0x0138  */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01af  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object objB;
        KotlinToastManager kotlinToastManager;
        char c;
        Object objA;
        ChaloUseCaseResult chaloUseCaseResult;
        ChangeStopFailureReason reason;
        String str;
        Object objB2;
        ChaloUseCaseResult chaloUseCaseResult2;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            PremiumBusChangeStopDataState premiumBusChangeStopDataState = this.$currentState;
            String str3 = premiumBusChangeStopDataState.f7528a;
            String str4 = this.$selectedStopId;
            if (str4 == null || str3 == null) {
                PremiumBusChangeStopComponent premiumBusChangeStopComponent = this.this$0;
                KotlinToastManager kotlinToastManager2 = premiumBusChangeStopComponent.r;
                this.L$0 = kotlinToastManager2;
                this.label = 1;
                objB = premiumBusChangeStopComponent.s.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (objB != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager2;
                    KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                    return unit;
                }
            } else {
                PremiumBusChangeStopComponent premiumBusChangeStopComponent2 = this.this$0;
                AnalyticsContract analyticsContract = premiumBusChangeStopComponent2.w;
                Source source = Source.PREMIUM_BUS_CHANGE_STOP_SCREEN;
                Source source2 = premiumBusChangeStopComponent2.k.h;
                String str5 = premiumBusChangeStopDataState.b;
                if (str5 == null) {
                    str5 = "";
                }
                c = 1;
                AnalyticsContractImplKt.a(analyticsContract, "pb change stop confirm clicked", source, source2, MapsKt.i(new Pair("currentStopId", str5), new Pair("newStopId", str4)), 48);
                this.this$0.E0(new gt0(14));
                ProcessStopChangeRequestUseCase processStopChangeRequestUseCase = this.this$0.m;
                String str6 = this.$selectedStopId;
                this.L$0 = coroutineScope;
                this.label = 2;
                objA = processStopChangeRequestUseCase.a(str3, str6, this);
                if (objA != coroutineSingletons) {
                    chaloUseCaseResult = (ChaloUseCaseResult) objA;
                    CoroutineScopeKt.d(coroutineScope);
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        PremiumBusChangeStopComponent premiumBusChangeStopComponent3 = this.this$0;
                        AnalyticsContract analyticsContract2 = premiumBusChangeStopComponent3.w;
                        Source source3 = Source.PREMIUM_BUS_CHANGE_STOP_SCREEN;
                        PremiumBusChangeStopArgs premiumBusChangeStopArgs = premiumBusChangeStopComponent3.k;
                        Source source4 = premiumBusChangeStopArgs.h;
                        Pair pair = new Pair("newStopId", this.$selectedStopId);
                        Pair pair2 = new Pair("currentFromStopId", premiumBusChangeStopArgs.d);
                        Pair[] pairArr = new Pair[2];
                        pairArr[0] = pair;
                        pairArr[c] = pair2;
                        AnalyticsContractImplKt.a(analyticsContract2, "pb change stop confirm result success", source3, source4, MapsKt.i(pairArr), 48);
                        this.this$0.E0(new gt0(15));
                        return unit;
                    }
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PremiumBusChangeStopComponent premiumBusChangeStopComponent4 = this.this$0;
                    AnalyticsContract analyticsContract3 = premiumBusChangeStopComponent4.w;
                    Source source5 = Source.PREMIUM_BUS_CHANGE_STOP_SCREEN;
                    Source source6 = premiumBusChangeStopComponent4.k.h;
                    reason = (ChangeStopFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                    Intrinsics.i(reason, "reason");
                    if (reason instanceof ChangeStopFailureReason.ServerError) {
                        str = "ServerError";
                    } else if (reason instanceof ChangeStopFailureReason.LocalError) {
                        str = "LocalError";
                    } else if (reason instanceof ChangeStopFailureReason.ParseError) {
                        str = "ParseError";
                    } else if (reason instanceof ChangeStopFailureReason.UnknownError) {
                        str = "UnknownError";
                    } else if (reason instanceof ChangeStopFailureReason.NoTicketReceived) {
                        str = "NoTicketReceived";
                    } else if (reason instanceof ChangeStopFailureReason.InvalidTicketReceived) {
                        str = "InvalidTicketReceived";
                    } else if (reason instanceof ChangeStopFailureReason.TicketParseError) {
                        str = "TicketParseError";
                    } else if (reason instanceof ChangeStopFailureReason.StopChangeWindowPassed) {
                        str = "StopChangeWindowPassed";
                    } else {
                        if (reason instanceof ChangeStopFailureReason.StopNotEligible) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "StopNotEligible";
                    }
                    AnalyticsContractImplKt.a(analyticsContract3, "pb change stop confirm result failed", source5, source6, vo1.s("reason", str), 48);
                    if (Intrinsics.d(reason, ChangeStopFailureReason.InvalidTicketReceived.f7173a)) {
                    }
                    this.L$0 = chaloUseCaseResult;
                    this.label = 3;
                    objB2 = this.this$0.s.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                    if (objB2 != coroutineSingletons) {
                        chaloUseCaseResult2 = chaloUseCaseResult;
                        chaloUseCaseResult = chaloUseCaseResult2;
                        str2 = (String) objB2;
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB = obj;
            KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
            return unit;
        }
        if (i == 2) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
            c = 1;
            objA = obj;
            chaloUseCaseResult = (ChaloUseCaseResult) objA;
            CoroutineScopeKt.d(coroutineScope);
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                PremiumBusChangeStopComponent premiumBusChangeStopComponent5 = this.this$0;
                AnalyticsContract analyticsContract4 = premiumBusChangeStopComponent5.w;
                Source source7 = Source.PREMIUM_BUS_CHANGE_STOP_SCREEN;
                PremiumBusChangeStopArgs premiumBusChangeStopArgs2 = premiumBusChangeStopComponent5.k;
                Source source8 = premiumBusChangeStopArgs2.h;
                Pair pair3 = new Pair("newStopId", this.$selectedStopId);
                Pair pair4 = new Pair("currentFromStopId", premiumBusChangeStopArgs2.d);
                Pair[] pairArr2 = new Pair[2];
                pairArr2[0] = pair3;
                pairArr2[c] = pair4;
                AnalyticsContractImplKt.a(analyticsContract4, "pb change stop confirm result success", source7, source8, MapsKt.i(pairArr2), 48);
                this.this$0.E0(new gt0(15));
                return unit;
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                throw new NoWhenBranchMatchedException();
            }
            PremiumBusChangeStopComponent premiumBusChangeStopComponent6 = this.this$0;
            AnalyticsContract analyticsContract5 = premiumBusChangeStopComponent6.w;
            Source source9 = Source.PREMIUM_BUS_CHANGE_STOP_SCREEN;
            Source source10 = premiumBusChangeStopComponent6.k.h;
            reason = (ChangeStopFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            Intrinsics.i(reason, "reason");
            if (reason instanceof ChangeStopFailureReason.ServerError) {
                str = "ServerError";
            } else if (reason instanceof ChangeStopFailureReason.LocalError) {
                str = "LocalError";
            } else if (reason instanceof ChangeStopFailureReason.ParseError) {
                str = "ParseError";
            } else if (reason instanceof ChangeStopFailureReason.UnknownError) {
                str = "UnknownError";
            } else if (reason instanceof ChangeStopFailureReason.NoTicketReceived) {
                str = "NoTicketReceived";
            } else if (reason instanceof ChangeStopFailureReason.InvalidTicketReceived) {
                str = "InvalidTicketReceived";
            } else if (reason instanceof ChangeStopFailureReason.TicketParseError) {
                str = "TicketParseError";
            } else if (reason instanceof ChangeStopFailureReason.StopChangeWindowPassed) {
                str = "StopChangeWindowPassed";
            } else {
                if (reason instanceof ChangeStopFailureReason.StopNotEligible) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "StopNotEligible";
            }
            AnalyticsContractImplKt.a(analyticsContract5, "pb change stop confirm result failed", source9, source10, vo1.s("reason", str), 48);
            if (!Intrinsics.d(reason, ChangeStopFailureReason.InvalidTicketReceived.f7173a) || Intrinsics.d(reason, ChangeStopFailureReason.LocalError.f7174a) || Intrinsics.d(reason, ChangeStopFailureReason.NoTicketReceived.f7175a) || Intrinsics.d(reason, ChangeStopFailureReason.ParseError.f7176a) || Intrinsics.d(reason, ChangeStopFailureReason.TicketParseError.f7180a)) {
                this.L$0 = chaloUseCaseResult;
                this.label = 3;
                objB2 = this.this$0.s.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (objB2 != coroutineSingletons) {
                    chaloUseCaseResult2 = chaloUseCaseResult;
                }
                return coroutineSingletons;
            }
            if (reason instanceof ChangeStopFailureReason.UnknownError) {
                str2 = ((ChangeStopFailureReason.UnknownError) reason).f7181a;
            } else if (reason instanceof ChangeStopFailureReason.ServerError) {
                str2 = ((ChangeStopFailureReason.ServerError) reason).f7177a;
            } else if (reason instanceof ChangeStopFailureReason.StopChangeWindowPassed) {
                str2 = ((ChangeStopFailureReason.StopChangeWindowPassed) reason).f7178a;
            } else {
                if (!(reason instanceof ChangeStopFailureReason.StopNotEligible)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = ((ChangeStopFailureReason.StopNotEligible) reason).f7179a;
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloUseCaseResult2 = (ChaloUseCaseResult) this.L$0;
            ResultKt.b(obj);
            objB2 = obj;
        }
        chaloUseCaseResult = chaloUseCaseResult2;
        str2 = (String) objB2;
        this.this$0.E0(new ej0(26, chaloUseCaseResult, str2));
        return unit;
    }
}
