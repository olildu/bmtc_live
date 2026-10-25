package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.juspay.JusPayErrorResultAppModel;
import app.chalo.juspay.JusPayResultDataType;
import app.chalo.juspay.JuspayErrorResultType;
import app.chalo.juspay.JuspayOperationResult;
import app.chalo.juspay.JuspayOperationUpdate;
import app.chalo.juspay.OnBoardingAndPaySelectedAccount;
import app.chalo.juspay.UserUpiAccountDetails;
import app.chalo.providers.toast.KotlinToastData;
import defpackage.a80;
import defpackage.iq0;
import defpackage.jq0;
import defpackage.nf1;
import defpackage.va;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Map;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$collectJuspayOperation$1", f = "PaymentMainComponent.kt", l = {1051}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$collectJuspayOperation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<JuspayOperationUpdate> $operation;
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$collectJuspayOperation$1(Flow flow, PaymentMainComponent paymentMainComponent, Continuation continuation) {
        super(2, continuation);
        this.$operation = flow;
        this.this$0 = paymentMainComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMainComponent$collectJuspayOperation$1(this.$operation, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$collectJuspayOperation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow<JuspayOperationUpdate> flow = this.$operation;
            final PaymentMainComponent paymentMainComponent = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$collectJuspayOperation$1.1
                /* JADX WARN: Code duplicated, block: B:12:0x003d  */
                /* JADX WARN: Code duplicated, block: B:97:0x01f1  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Object objM1;
                    JuspayOperationUpdate juspayOperationUpdate = (JuspayOperationUpdate) obj2;
                    PaymentMainComponent paymentMainComponent2 = paymentMainComponent;
                    paymentMainComponent2.getClass();
                    ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = paymentMainComponent2.t;
                    boolean zD = Intrinsics.d(juspayOperationUpdate, JuspayOperationUpdate.Started.f4065a);
                    Unit unit = Unit.f17538a;
                    if (zD) {
                        objM1 = unit;
                    } else if (Intrinsics.d(juspayOperationUpdate, JuspayOperationUpdate.Rejected.f4064a)) {
                        objM1 = paymentMainComponent2.n1(continuation);
                        if (objM1 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM1 = unit;
                        }
                    } else {
                        if (Intrinsics.d(juspayOperationUpdate, JuspayOperationUpdate.Abandoned.f4060a)) {
                            paymentMainComponent2.E0(new jq0(19));
                        } else {
                            int i2 = 1;
                            if (juspayOperationUpdate instanceof JuspayOperationUpdate.Loading) {
                                paymentMainComponent2.E0(new a80(juspayOperationUpdate, i2));
                            } else if (juspayOperationUpdate instanceof JuspayOperationUpdate.Completed) {
                                JuspayOperationResult juspayOperationResult = ((JuspayOperationUpdate.Completed) juspayOperationUpdate).f4061a;
                                paymentMainComponent2.E0(new jq0(17));
                                if (juspayOperationResult instanceof JuspayOperationResult.Error) {
                                    paymentMainComponent2.E0(new va(false, 11));
                                    JusPayErrorResultAppModel jusPayErrorResultAppModel = ((JuspayOperationResult.Error) juspayOperationResult).f4056a;
                                    paymentMainComponent2.E0(new jq0(20));
                                    JuspayErrorResultType juspayErrorResultType = jusPayErrorResultAppModel.f;
                                    String str = juspayErrorResultType.f4044a;
                                    Pair pair = new Pair("action", jusPayErrorResultAppModel.d.getActionName());
                                    Pair pair2 = new Pair("errorCode", str);
                                    String str2 = jusPayErrorResultAppModel.e;
                                    ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "juspay sdk operation error", MapsKt.i(pair, pair2, new Pair("reason", str2)), 12);
                                    StateFlow stateFlow = paymentMainComponent2.f;
                                    if (((PaymentDataState) stateFlow.getValue()).n) {
                                        paymentMainComponent2.E0(new jq0(21));
                                        paymentMainComponent2.S.a(new KotlinToastData(nf1.l(str2, " (", str, ")")));
                                        JuspayErrorResultType.Unavailable unavailable = JuspayErrorResultType.Unavailable.INSTANCE;
                                        if (juspayErrorResultType.equals(unavailable)) {
                                            PaymentMainComponent.e1(paymentMainComponent2, null);
                                        } else {
                                            JuspayErrorResultType.TransactionStatusAwaiting transactionStatusAwaiting = JuspayErrorResultType.TransactionStatusAwaiting.INSTANCE;
                                            if (juspayErrorResultType.equals(transactionStatusAwaiting)) {
                                                PaymentMainComponent.e1(paymentMainComponent2, null);
                                            } else {
                                                JuspayErrorResultType.TransactionFailedAtPg transactionFailedAtPg = JuspayErrorResultType.TransactionFailedAtPg.INSTANCE;
                                                if (juspayErrorResultType.equals(transactionFailedAtPg)) {
                                                    PaymentMainComponent.e1(paymentMainComponent2, null);
                                                } else {
                                                    JuspayErrorResultType.IncorrectDashboardConfiguration incorrectDashboardConfiguration = JuspayErrorResultType.IncorrectDashboardConfiguration.INSTANCE;
                                                    if (!juspayErrorResultType.equals(incorrectDashboardConfiguration) && !juspayErrorResultType.equals(JuspayErrorResultType.IntegrationError.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.MultipleInitiateBeforeSdkTermination.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.NoInternet.INSTANCE) && !(juspayErrorResultType instanceof JuspayErrorResultType.Other) && !juspayErrorResultType.equals(JuspayErrorResultType.OtpLimitReached.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.RequiredPermissionsNotAvailable.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.SdkURLRedirectionError.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.ServerError.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.UnsupportedFeature.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.UserBackPress.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.UserBasedError.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.WrongBusinessLogic.INSTANCE)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    JuspayErrorResultType.UserBackPress userBackPress = JuspayErrorResultType.UserBackPress.INSTANCE;
                                                    if (juspayErrorResultType.equals(userBackPress) || juspayErrorResultType.equals(incorrectDashboardConfiguration) || juspayErrorResultType.equals(transactionFailedAtPg)) {
                                                        paymentMainComponent2.q0(new iq0(paymentMainComponent2, 24));
                                                    } else if (!juspayErrorResultType.equals(transactionStatusAwaiting) && !juspayErrorResultType.equals(unavailable) && !juspayErrorResultType.equals(JuspayErrorResultType.IntegrationError.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.MultipleInitiateBeforeSdkTermination.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.NoInternet.INSTANCE) && !(juspayErrorResultType instanceof JuspayErrorResultType.Other) && !juspayErrorResultType.equals(JuspayErrorResultType.OtpLimitReached.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.RequiredPermissionsNotAvailable.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.SdkURLRedirectionError.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.ServerError.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.UnsupportedFeature.INSTANCE) && !juspayErrorResultType.equals(userBackPress) && !juspayErrorResultType.equals(JuspayErrorResultType.UserBasedError.INSTANCE) && !juspayErrorResultType.equals(JuspayErrorResultType.WrongBusinessLogic.INSTANCE)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                }
                                            }
                                        }
                                    } else if (PaymentMainContractKt.b(((PaymentDataState) stateFlow.getValue()).l)) {
                                        paymentMainComponent2.t1();
                                    } else {
                                        objM1 = paymentMainComponent2.w1("sdk error", str2, continuation);
                                        if (objM1 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        }
                                        if (objM1 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        }
                                        if (objM1 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        }
                                    }
                                    objM1 = unit;
                                    if (objM1 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    }
                                    if (objM1 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    }
                                } else if (juspayOperationResult instanceof JuspayOperationResult.Onboarding) {
                                    JusPayResultDataType.OnBoardingAndPay onBoardingAndPay = ((JuspayOperationResult.Onboarding) juspayOperationResult).f4058a;
                                    Pair pair3 = new Pair("pass status", onBoardingAndPay.c.name());
                                    String str3 = onBoardingAndPay.b;
                                    Map mapI = MapsKt.i(pair3, new Pair("transaction id", str3), new Pair(PaymentConstants.ORDER_ID_CAMEL, onBoardingAndPay.d), new Pair("referenceId", onBoardingAndPay.e));
                                    OnBoardingAndPaySelectedAccount onBoardingAndPaySelectedAccount = onBoardingAndPay.f;
                                    Pair pair4 = new Pair("upiId", onBoardingAndPaySelectedAccount.f4084a);
                                    UserUpiAccountDetails userUpiAccountDetails = onBoardingAndPaySelectedAccount.b;
                                    ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "juspay sdk onboarding and pay result", MapsKt.l(mapI, MapsKt.i(pair4, new Pair("bankCode", userUpiAccountDetails.f4096a), new Pair("bankName", userUpiAccountDetails.b), new Pair("maskedAccountNumber", userUpiAccountDetails.e))), 12);
                                    paymentMainComponent2.E0(new jq0(23));
                                    int i3 = PaymentMainComponent.WhenMappings.b[onBoardingAndPay.c.ordinal()];
                                    if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                                        PaymentMainComponent.e1(paymentMainComponent2, str3);
                                    } else {
                                        if (i3 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        paymentMainComponent2.t1();
                                    }
                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                } else if (juspayOperationResult instanceof JuspayOperationResult.Management) {
                                    JusPayResultDataType.Management management = ((JuspayOperationResult.Management) juspayOperationResult).f4057a;
                                    ICheckoutAnalyticsHelper.DefaultImpls.a(iCheckoutAnalyticsHelper, "juspay sdk management result", MapsKt.h(new Pair("pass status", management.b.name())), 12);
                                    int i4 = PaymentMainComponent.WhenMappings.f1531a[management.b.ordinal()];
                                    if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    paymentMainComponent2.t1();
                                } else if (!(juspayOperationResult instanceof JuspayOperationResult.UpiUiScanPay)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                objM1 = unit;
                                if (objM1 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                }
                            } else {
                                if (!(juspayOperationUpdate instanceof JuspayOperationUpdate.Failed)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                objM1 = paymentMainComponent2.m1(((JuspayOperationUpdate.Failed) juspayOperationUpdate).f4062a, continuation);
                                if (objM1 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                }
                            }
                        }
                        objM1 = unit;
                    }
                    return objM1 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1 : unit;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
