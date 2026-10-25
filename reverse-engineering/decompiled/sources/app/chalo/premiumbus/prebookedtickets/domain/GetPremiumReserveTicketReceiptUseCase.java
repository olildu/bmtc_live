package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.data.RefundStatus;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.premiumbus.data.exceptions.PBTicketReceiptFetchFailedException;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1;
import app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getPremiumReserveTicketReceiptByIdAsFlow$$inlined$map$1;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationReceiptDataKt;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/GetPremiumReserveTicketReceiptUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPremiumReserveTicketReceiptUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7310a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7311a;

        static {
            int[] iArr = new int[RefundStatus.values().length];
            try {
                iArr[RefundStatus.NOT_ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefundStatus.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RefundStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RefundStatus.REFUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7311a = iArr;
        }
    }

    public GetPremiumReserveTicketReceiptUseCase(PremiumBusRepository premiumBusRepository) {
        this.f7310a = premiumBusRepository;
    }

    public static ChaloUseCaseResult a(PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel) {
        return premiumReserveTicketReceiptAppModel != null ? new ChaloUseCaseResult.Success(PremiumReserveTicketValidationReceiptDataKt.a(premiumReserveTicketReceiptAppModel)) : new ChaloUseCaseResult.Failure(new PremiumReserveTicketReceiptFetchFailed());
    }

    public static boolean c(String str, PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel) {
        return Intrinsics.d(premiumReserveTicketReceiptAppModel.f7116a, str) && Intrinsics.d(premiumReserveTicketReceiptAppModel.i, "mobileTicket") && Intrinsics.d(premiumReserveTicketReceiptAppModel.j, "premiumReserveTicket");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[LOOP:0: B:73:0x0108->B:105:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0100 A[Catch: Exception -> 0x0051, NetworkSuccessResponseParseException -> 0x0054, ChaloLocalException -> 0x0057, PBTicketReceiptFetchFailedException -> 0x005a, PHI: r2 r13 r14
      0x0100: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v9 java.lang.String) binds: [B:70:0x00fd, B:20:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r13v11 app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel) = 
      (r13v7 app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel)
      (r13v21 app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel)
     binds: [B:70:0x00fd, B:20:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r14v18 java.lang.Object) = (r14v12 java.lang.Object), (r14v1 java.lang.Object) binds: [B:70:0x00fd, B:20:0x004c] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {ChaloLocalException -> 0x0057, NetworkSuccessResponseParseException -> 0x0054, PBTicketReceiptFetchFailedException -> 0x005a, Exception -> 0x0051, blocks: (B:20:0x004c, B:72:0x0100, B:73:0x0108, B:75:0x010e, B:78:0x011c, B:80:0x0121, B:86:0x013a, B:69:0x00f3), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x010e A[Catch: Exception -> 0x0051, NetworkSuccessResponseParseException -> 0x0054, ChaloLocalException -> 0x0057, PBTicketReceiptFetchFailedException -> 0x005a, TryCatch #3 {ChaloLocalException -> 0x0057, NetworkSuccessResponseParseException -> 0x0054, PBTicketReceiptFetchFailedException -> 0x005a, Exception -> 0x0051, blocks: (B:20:0x004c, B:72:0x0100, B:73:0x0108, B:75:0x010e, B:78:0x011c, B:80:0x0121, B:86:0x013a, B:69:0x00f3), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0121 A[Catch: Exception -> 0x0051, NetworkSuccessResponseParseException -> 0x0054, ChaloLocalException -> 0x0057, PBTicketReceiptFetchFailedException -> 0x005a, TRY_LEAVE, TryCatch #3 {ChaloLocalException -> 0x0057, NetworkSuccessResponseParseException -> 0x0054, PBTicketReceiptFetchFailedException -> 0x005a, Exception -> 0x0051, blocks: (B:20:0x004c, B:72:0x0100, B:73:0x0108, B:75:0x010e, B:78:0x011c, B:80:0x0121, B:86:0x013a, B:69:0x00f3), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:0x013a A[Catch: Exception -> 0x0051, NetworkSuccessResponseParseException -> 0x0054, ChaloLocalException -> 0x0057, PBTicketReceiptFetchFailedException -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {ChaloLocalException -> 0x0057, NetworkSuccessResponseParseException -> 0x0054, PBTicketReceiptFetchFailedException -> 0x005a, Exception -> 0x0051, blocks: (B:20:0x004c, B:72:0x0100, B:73:0x0108, B:75:0x010e, B:78:0x011c, B:80:0x0121, B:86:0x013a, B:69:0x00f3), top: B:102:0x0025 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19, types: [app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel] */
    /* JADX WARN: Type inference failed for: r0v8, types: [app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel] */
    /* JADX WARN: Type inference failed for: r0v9, types: [app.chalo.premiumbus.data.models.app.PremiumReserveTicketReceiptAppModel] */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        GetPremiumReserveTicketReceiptUseCase$invoke$1 getPremiumReserveTicketReceiptUseCase$invoke$1;
        ?? r0;
        String str2;
        PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel;
        RefundStatus refundStatus;
        RefundInfoAppModel refundInfoAppModel;
        int i;
        RefundInfoAppModel refundInfoAppModel2;
        String str3;
        RefundInfoAppModel refundInfoAppModel3;
        PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel2;
        PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel3;
        if (continuationImpl instanceof GetPremiumReserveTicketReceiptUseCase$invoke$1) {
            getPremiumReserveTicketReceiptUseCase$invoke$1 = (GetPremiumReserveTicketReceiptUseCase$invoke$1) continuationImpl;
            int i2 = getPremiumReserveTicketReceiptUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPremiumReserveTicketReceiptUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getPremiumReserveTicketReceiptUseCase$invoke$1 = new GetPremiumReserveTicketReceiptUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getPremiumReserveTicketReceiptUseCase$invoke$1 = new GetPremiumReserveTicketReceiptUseCase$invoke$1(this, continuationImpl);
        }
        Object objV = getPremiumReserveTicketReceiptUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getPremiumReserveTicketReceiptUseCase$invoke$1.label;
        Object obj = null;
        PremiumBusRepository premiumBusRepository = this.f7310a;
        try {
            if (i3 == 0) {
                ResultKt.b(objV);
                PremiumBusRepositoryImpl$getPremiumReserveTicketReceiptByIdAsFlow$$inlined$map$1 premiumBusRepositoryImpl$getPremiumReserveTicketReceiptByIdAsFlow$$inlined$map$1C = premiumBusRepository.c(str);
                getPremiumReserveTicketReceiptUseCase$invoke$1.L$0 = str;
                getPremiumReserveTicketReceiptUseCase$invoke$1.label = 1;
                objV = FlowKt.v(premiumBusRepositoryImpl$getPremiumReserveTicketReceiptByIdAsFlow$$inlined$map$1C, getPremiumReserveTicketReceiptUseCase$invoke$1);
                if (objV != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        premiumReserveTicketReceiptAppModel3 = (PremiumReserveTicketReceiptAppModel) getPremiumReserveTicketReceiptUseCase$invoke$1.L$1;
                        r0 = (PremiumReserveTicketReceiptAppModel) getPremiumReserveTicketReceiptUseCase$invoke$1.L$0;
                        try {
                            ResultKt.b(objV);
                            r0 = r0;
                            return new ChaloUseCaseResult.Success(PremiumReserveTicketValidationReceiptDataKt.a(premiumReserveTicketReceiptAppModel3));
                        } catch (ChaloLocalException unused) {
                            return a(r0);
                        } catch (NetworkSuccessResponseParseException unused2) {
                            return a(r0);
                        } catch (PBTicketReceiptFetchFailedException unused3) {
                            return a(r0);
                        } catch (Exception unused4) {
                            return a(r0);
                        }
                    }
                    premiumReserveTicketReceiptAppModel = (PremiumReserveTicketReceiptAppModel) getPremiumReserveTicketReceiptUseCase$invoke$1.L$1;
                    str2 = (String) getPremiumReserveTicketReceiptUseCase$invoke$1.L$0;
                    ResultKt.b(objV);
                    for (Object obj2 : (List) objV) {
                        if (c(str2, (PremiumReserveTicketReceiptAppModel) obj2)) {
                            obj = obj2;
                            break;
                        }
                    }
                    premiumReserveTicketReceiptAppModel2 = (PremiumReserveTicketReceiptAppModel) obj;
                    if (premiumReserveTicketReceiptAppModel2 == null) {
                        return a(premiumReserveTicketReceiptAppModel);
                    }
                    getPremiumReserveTicketReceiptUseCase$invoke$1.L$0 = premiumReserveTicketReceiptAppModel;
                    getPremiumReserveTicketReceiptUseCase$invoke$1.L$1 = premiumReserveTicketReceiptAppModel2;
                    getPremiumReserveTicketReceiptUseCase$invoke$1.label = 4;
                    if (premiumBusRepository.D(premiumReserveTicketReceiptAppModel2, getPremiumReserveTicketReceiptUseCase$invoke$1) != coroutineSingletons) {
                        r0 = premiumReserveTicketReceiptAppModel;
                        premiumReserveTicketReceiptAppModel3 = premiumReserveTicketReceiptAppModel2;
                        return new ChaloUseCaseResult.Success(PremiumReserveTicketValidationReceiptDataKt.a(premiumReserveTicketReceiptAppModel3));
                    }
                    return coroutineSingletons;
                }
                premiumReserveTicketReceiptAppModel = (PremiumReserveTicketReceiptAppModel) getPremiumReserveTicketReceiptUseCase$invoke$1.L$1;
                str2 = (String) getPremiumReserveTicketReceiptUseCase$invoke$1.L$0;
                ResultKt.b(objV);
                premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) objV;
                if (premiumReserveTicketReceiptAppModel != null || (refundInfoAppModel3 = premiumReserveTicketReceiptAppModel.m) == null || (refundStatus = refundInfoAppModel3.f2396a) == null) {
                    if (premiumReserveTicketAppModel != null || (refundInfoAppModel = premiumReserveTicketAppModel.f7113a.n) == null) {
                        refundStatus = null;
                    } else {
                        refundStatus = refundInfoAppModel.f2396a;
                    }
                }
                if (refundStatus == null) {
                    i = -1;
                } else {
                    i = WhenMappings.f7311a[refundStatus.ordinal()];
                }
                if (i == -1 && i != 1 && i != 2 && i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (premiumReserveTicketReceiptAppModel != null && (refundInfoAppModel2 = premiumReserveTicketReceiptAppModel.m) != null && (str3 = refundInfoAppModel2.d) != null && (!StringsKt.F(str3))) {
                        return new ChaloUseCaseResult.Success(PremiumReserveTicketValidationReceiptDataKt.a(premiumReserveTicketReceiptAppModel));
                    }
                } else if (premiumReserveTicketReceiptAppModel != null) {
                    return a(premiumReserveTicketReceiptAppModel);
                }
                getPremiumReserveTicketReceiptUseCase$invoke$1.L$0 = str2;
                getPremiumReserveTicketReceiptUseCase$invoke$1.L$1 = premiumReserveTicketReceiptAppModel;
                getPremiumReserveTicketReceiptUseCase$invoke$1.label = 3;
                objV = premiumBusRepository.t(str2, getPremiumReserveTicketReceiptUseCase$invoke$1);
                if (objV == coroutineSingletons) {
                    while (r14.hasNext()) {
                        if (c(str2, (PremiumReserveTicketReceiptAppModel) obj2)) {
                            obj = obj2;
                            break;
                        }
                    }
                    premiumReserveTicketReceiptAppModel2 = (PremiumReserveTicketReceiptAppModel) obj;
                    if (premiumReserveTicketReceiptAppModel2 == null) {
                        return a(premiumReserveTicketReceiptAppModel);
                    }
                    getPremiumReserveTicketReceiptUseCase$invoke$1.L$0 = premiumReserveTicketReceiptAppModel;
                    getPremiumReserveTicketReceiptUseCase$invoke$1.L$1 = premiumReserveTicketReceiptAppModel2;
                    getPremiumReserveTicketReceiptUseCase$invoke$1.label = 4;
                    if (premiumBusRepository.D(premiumReserveTicketReceiptAppModel2, getPremiumReserveTicketReceiptUseCase$invoke$1) != coroutineSingletons) {
                        r0 = premiumReserveTicketReceiptAppModel;
                        premiumReserveTicketReceiptAppModel3 = premiumReserveTicketReceiptAppModel2;
                        return new ChaloUseCaseResult.Success(PremiumReserveTicketValidationReceiptDataKt.a(premiumReserveTicketReceiptAppModel3));
                    }
                }
                return coroutineSingletons;
            }
            str = (String) getPremiumReserveTicketReceiptUseCase$invoke$1.L$0;
            ResultKt.b(objV);
            PremiumReserveTicketReceiptAppModel premiumReserveTicketReceiptAppModel4 = (PremiumReserveTicketReceiptAppModel) objV;
            PremiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1 premiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1I = premiumBusRepository.i(str);
            getPremiumReserveTicketReceiptUseCase$invoke$1.L$0 = str;
            getPremiumReserveTicketReceiptUseCase$invoke$1.L$1 = premiumReserveTicketReceiptAppModel4;
            getPremiumReserveTicketReceiptUseCase$invoke$1.label = 2;
            Object objV2 = FlowKt.v(premiumBusRepositoryImpl$getPremiumReserveTicketByIdAsFlow$$inlined$map$1I, getPremiumReserveTicketReceiptUseCase$invoke$1);
            if (objV2 != coroutineSingletons) {
                str2 = str;
                premiumReserveTicketReceiptAppModel = premiumReserveTicketReceiptAppModel4;
                objV = objV2;
                premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) objV;
                if (premiumReserveTicketReceiptAppModel != null) {
                    if (premiumReserveTicketAppModel != null) {
                        refundStatus = null;
                    } else {
                        refundStatus = null;
                    }
                } else if (premiumReserveTicketAppModel != null) {
                    refundStatus = null;
                } else {
                    refundStatus = null;
                }
                if (refundStatus == null) {
                    i = -1;
                } else {
                    i = WhenMappings.f7311a[refundStatus.ordinal()];
                }
                if (i == -1) {
                    if (premiumReserveTicketReceiptAppModel != null) {
                        return a(premiumReserveTicketReceiptAppModel);
                    }
                } else if (premiumReserveTicketReceiptAppModel != null) {
                    return a(premiumReserveTicketReceiptAppModel);
                }
                getPremiumReserveTicketReceiptUseCase$invoke$1.L$0 = str2;
                getPremiumReserveTicketReceiptUseCase$invoke$1.L$1 = premiumReserveTicketReceiptAppModel;
                getPremiumReserveTicketReceiptUseCase$invoke$1.label = 3;
                objV = premiumBusRepository.t(str2, getPremiumReserveTicketReceiptUseCase$invoke$1);
                if (objV == coroutineSingletons) {
                    while (r14.hasNext()) {
                        if (c(str2, (PremiumReserveTicketReceiptAppModel) obj2)) {
                            obj = obj2;
                            break;
                        }
                    }
                    premiumReserveTicketReceiptAppModel2 = (PremiumReserveTicketReceiptAppModel) obj;
                    if (premiumReserveTicketReceiptAppModel2 == null) {
                        return a(premiumReserveTicketReceiptAppModel);
                    }
                    getPremiumReserveTicketReceiptUseCase$invoke$1.L$0 = premiumReserveTicketReceiptAppModel;
                    getPremiumReserveTicketReceiptUseCase$invoke$1.L$1 = premiumReserveTicketReceiptAppModel2;
                    getPremiumReserveTicketReceiptUseCase$invoke$1.label = 4;
                    if (premiumBusRepository.D(premiumReserveTicketReceiptAppModel2, getPremiumReserveTicketReceiptUseCase$invoke$1) != coroutineSingletons) {
                        r0 = premiumReserveTicketReceiptAppModel;
                        premiumReserveTicketReceiptAppModel3 = premiumReserveTicketReceiptAppModel2;
                        return new ChaloUseCaseResult.Success(PremiumReserveTicketValidationReceiptDataKt.a(premiumReserveTicketReceiptAppModel3));
                    }
                }
            }
            return coroutineSingletons;
        } catch (ChaloLocalException unused5) {
            r0 = str;
        } catch (NetworkSuccessResponseParseException unused6) {
            r0 = str;
        } catch (PBTicketReceiptFetchFailedException unused7) {
            r0 = str;
        } catch (Exception unused8) {
            r0 = str;
        }
    }
}
