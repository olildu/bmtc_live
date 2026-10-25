package app.chalo.tripreceipt.tripreceiptnew;

import app.chalo.home.domain.ActivationCheckSuccessRemarks;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.domain.ProductActivationFailureReason;
import app.chalo.home.domain.RunPreActivationChecksUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.tripreceipt.domain.FetchSuperPassBookingFromPassIdUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$runPassPreActivationCheckAndProceed$2", f = "RideReceiptComponent.kt", l = {253, 255, 260, 261, 269, 273}, m = "invokeSuspend", v = 1)
final class RideReceiptComponent$runPassPreActivationCheckAndProceed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $passId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RideReceiptComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9739a;

        static {
            int[] iArr = new int[ActivationCheckSuccessRemarks.values().length];
            try {
                iArr[ActivationCheckSuccessRemarks.PRODUCT_ACTIVATION_POSSIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivationCheckSuccessRemarks.PRODUCT_ACTIVATION_NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivationCheckSuccessRemarks.PRODUCT_ACTIVATION_ALREADY_DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivationCheckSuccessRemarks.PRODUCT_TAPPED_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9739a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideReceiptComponent$runPassPreActivationCheckAndProceed$2(RideReceiptComponent rideReceiptComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rideReceiptComponent;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideReceiptComponent$runPassPreActivationCheckAndProceed$2 rideReceiptComponent$runPassPreActivationCheckAndProceed$2 = new RideReceiptComponent$runPassPreActivationCheckAndProceed$2(this.this$0, this.$passId, continuation);
        rideReceiptComponent$runPassPreActivationCheckAndProceed$2.L$0 = obj;
        return rideReceiptComponent$runPassPreActivationCheckAndProceed$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RideReceiptComponent$runPassPreActivationCheckAndProceed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[PHI: r1 r10
      0x0084: PHI (r1v8 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking) = 
      (r1v4 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking)
      (r1v10 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking)
     binds: [B:27:0x0080, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r10v13 java.lang.Object) = (r10v7 java.lang.Object), (r10v0 java.lang.Object) binds: [B:27:0x0080, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloUserBookingType.SuperPassBooking superPassBooking;
        KotlinToastManager kotlinToastManager;
        KotlinToastManager kotlinToastManager2;
        ChaloUseCaseResult chaloUseCaseResult;
        int i;
        RideReceiptComponent rideReceiptComponent;
        Object objI0;
        RideReceiptComponent rideReceiptComponent2;
        RideReceiptComponent rideReceiptComponent3;
        ProductActivationFailureReason productActivationFailureReason;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        Unit unit = Unit.f17538a;
        switch (i2) {
            case 0:
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FetchSuperPassBookingFromPassIdUseCase fetchSuperPassBookingFromPassIdUseCase = this.this$0.n;
                String str = this.$passId;
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = fetchSuperPassBookingFromPassIdUseCase.a(str, this);
                if (obj != coroutineSingletons) {
                    superPassBooking = (ChaloUserBookingType.SuperPassBooking) obj;
                    if (superPassBooking == null) {
                        RideReceiptComponent rideReceiptComponent4 = this.this$0;
                        kotlinToastManager = rideReceiptComponent4.x;
                        this.L$0 = kotlinToastManager;
                        this.label = 2;
                        obj = rideReceiptComponent4.m.b(StringEnum.PASS_EXPIRING, new Object[0], this);
                        if (obj != coroutineSingletons) {
                            kotlinToastManager2 = kotlinToastManager;
                            KotlinToastManagerKt.a(kotlinToastManager2, (String) obj, ToastLength.LONG);
                            return unit;
                        }
                    } else {
                        RunPreActivationChecksUseCase runPreActivationChecksUseCase = this.this$0.p;
                        this.L$0 = superPassBooking;
                        this.label = 3;
                        obj = runPreActivationChecksUseCase.c(superPassBooking, this);
                        if (obj != coroutineSingletons) {
                            chaloUseCaseResult = (ChaloUseCaseResult) obj;
                            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                rideReceiptComponent3 = this.this$0;
                                productActivationFailureReason = (ProductActivationFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                                this.L$0 = null;
                                this.label = 4;
                                if (rideReceiptComponent3.J0(productActivationFailureReason, superPassBooking, this) == coroutineSingletons) {
                                    return unit;
                                }
                            } else {
                                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = WhenMappings.f9739a[((ActivationCheckSuccessRemarks) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).ordinal()];
                                if (i != 1) {
                                    if (i != 2 || i == 3) {
                                        rideReceiptComponent2 = this.this$0;
                                        this.L$0 = null;
                                        this.label = 6;
                                        if (rideReceiptComponent2.K0(superPassBooking, this) == coroutineSingletons) {
                                        }
                                    } else if (i != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return unit;
                                }
                                rideReceiptComponent = this.this$0;
                                this.L$0 = null;
                                this.label = 5;
                                rideReceiptComponent.getClass();
                                if (!(superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) || (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking)) {
                                    objI0 = rideReceiptComponent.I0(superPassBooking, this);
                                    if (objI0 != coroutineSingletons) {
                                    }
                                    if (objI0 != coroutineSingletons) {
                                        return unit;
                                    }
                                } else if (!(superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) && !(superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                objI0 = unit;
                                if (objI0 != coroutineSingletons) {
                                    return unit;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                ResultKt.b(obj);
                superPassBooking = (ChaloUserBookingType.SuperPassBooking) obj;
                if (superPassBooking == null) {
                    RideReceiptComponent rideReceiptComponent5 = this.this$0;
                    kotlinToastManager = rideReceiptComponent5.x;
                    this.L$0 = kotlinToastManager;
                    this.label = 2;
                    obj = rideReceiptComponent5.m.b(StringEnum.PASS_EXPIRING, new Object[0], this);
                    if (obj != coroutineSingletons) {
                        kotlinToastManager2 = kotlinToastManager;
                        KotlinToastManagerKt.a(kotlinToastManager2, (String) obj, ToastLength.LONG);
                        return unit;
                    }
                } else {
                    RunPreActivationChecksUseCase runPreActivationChecksUseCase2 = this.this$0.p;
                    this.L$0 = superPassBooking;
                    this.label = 3;
                    obj = runPreActivationChecksUseCase2.c(superPassBooking, this);
                    if (obj != coroutineSingletons) {
                        chaloUseCaseResult = (ChaloUseCaseResult) obj;
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            rideReceiptComponent3 = this.this$0;
                            productActivationFailureReason = (ProductActivationFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                            this.L$0 = null;
                            this.label = 4;
                            if (rideReceiptComponent3.J0(productActivationFailureReason, superPassBooking, this) == coroutineSingletons) {
                                return unit;
                            }
                        } else {
                            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = WhenMappings.f9739a[((ActivationCheckSuccessRemarks) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    rideReceiptComponent2 = this.this$0;
                                    this.L$0 = null;
                                    this.label = 6;
                                    if (rideReceiptComponent2.K0(superPassBooking, this) == coroutineSingletons) {
                                    }
                                } else {
                                    rideReceiptComponent2 = this.this$0;
                                    this.L$0 = null;
                                    this.label = 6;
                                    if (rideReceiptComponent2.K0(superPassBooking, this) == coroutineSingletons) {
                                    }
                                }
                                return unit;
                            }
                            rideReceiptComponent = this.this$0;
                            this.L$0 = null;
                            this.label = 5;
                            rideReceiptComponent.getClass();
                            if (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
                                objI0 = rideReceiptComponent.I0(superPassBooking, this);
                                if (objI0 != coroutineSingletons) {
                                    objI0 = unit;
                                }
                            } else {
                                objI0 = rideReceiptComponent.I0(superPassBooking, this);
                                if (objI0 != coroutineSingletons) {
                                    objI0 = unit;
                                }
                            }
                            if (objI0 != coroutineSingletons) {
                                return unit;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                KotlinToastManagerKt.a(kotlinToastManager2, (String) obj, ToastLength.LONG);
                return unit;
            case 3:
                superPassBooking = (ChaloUserBookingType.SuperPassBooking) this.L$0;
                ResultKt.b(obj);
                chaloUseCaseResult = (ChaloUseCaseResult) obj;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    rideReceiptComponent3 = this.this$0;
                    productActivationFailureReason = (ProductActivationFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                    this.L$0 = null;
                    this.label = 4;
                    if (rideReceiptComponent3.J0(productActivationFailureReason, superPassBooking, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return unit;
                }
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = WhenMappings.f9739a[((ActivationCheckSuccessRemarks) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        rideReceiptComponent2 = this.this$0;
                        this.L$0 = null;
                        this.label = 6;
                        if (rideReceiptComponent2.K0(superPassBooking, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        rideReceiptComponent2 = this.this$0;
                        this.L$0 = null;
                        this.label = 6;
                        if (rideReceiptComponent2.K0(superPassBooking, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return unit;
                }
                rideReceiptComponent = this.this$0;
                this.L$0 = null;
                this.label = 5;
                rideReceiptComponent.getClass();
                if (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
                    objI0 = rideReceiptComponent.I0(superPassBooking, this);
                    if (objI0 != coroutineSingletons) {
                        objI0 = unit;
                    }
                } else {
                    objI0 = rideReceiptComponent.I0(superPassBooking, this);
                    if (objI0 != coroutineSingletons) {
                        objI0 = unit;
                    }
                }
                if (objI0 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 4:
                ResultKt.b(obj);
                return unit;
            case 5:
                ResultKt.b(obj);
                return unit;
            case 6:
                ResultKt.b(obj);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
