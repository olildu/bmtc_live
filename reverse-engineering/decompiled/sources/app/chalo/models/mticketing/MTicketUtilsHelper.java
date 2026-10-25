package app.chalo.models.mticketing;

import app.chalo.constants.CurrencyRoundOffLogicKt;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.extensions.JsonException;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.helper.FeedbackFeature;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.models.LastRideInfo;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.usecase.GetProductConfigFromProductIdUseCase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/mticketing/MTicketUtilsHelper;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketUtilsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeedbackFeature f5625a;
    public final BasicInfoContract b;
    public final CurrencyFeature c;
    public final CityProvider d;
    public final UserProfileDetailsProvider e;
    public final TicketRepository f;
    public final GetProductConfigFromProductIdUseCase g;
    public final CrashlyticsLogger h;
    public final LocalDataStore i;

    public MTicketUtilsHelper(FeedbackFeature feedbackFeature, BasicInfoContract basicInfoContract, CurrencyFeature currencyFeature, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, TicketRepository ticketRepository, GetProductConfigFromProductIdUseCase getProductConfigFromProductIdUseCase, CrashlyticsLogger crashlyticsLogger, LocalDataStore localDataStore) {
        this.f5625a = feedbackFeature;
        this.b = basicInfoContract;
        this.c = currencyFeature;
        this.d = cityProvider;
        this.e = userProfileDetailsProvider;
        this.f = ticketRepository;
        this.g = getProductConfigFromProductIdUseCase;
        this.h = crashlyticsLogger;
        this.i = localDataStore;
    }

    public static double d(MTicketPassengerInfo mTicketPassengerInfo) {
        Intrinsics.i(mTicketPassengerInfo, "<this>");
        double d = 100;
        return ((d - mTicketPassengerInfo.c) / d) * mTicketPassengerInfo.f5621a;
    }

    public static double h(MTicket ticket) {
        Intrinsics.i(ticket, "ticket");
        Map map = ticket.h;
        double d = 0.0d;
        for (MTicketPassengerInfo info : map.values()) {
            Intrinsics.i(info, "info");
            d += info.f5621a * ((double) info.d);
        }
        double d2 = 0.0d;
        for (MTicketPassengerInfo info2 : map.values()) {
            Intrinsics.i(info2, "info");
            d2 += d(info2) * ((double) info2.d);
        }
        return d - (d2 - 0.0d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, MTicketTripReceipt mTicketTripReceipt, ContinuationImpl continuationImpl) {
        MTicketUtilsHelper$addMticketReceiptToMTicket$1 mTicketUtilsHelper$addMticketReceiptToMTicket$1;
        if (continuationImpl instanceof MTicketUtilsHelper$addMticketReceiptToMTicket$1) {
            mTicketUtilsHelper$addMticketReceiptToMTicket$1 = (MTicketUtilsHelper$addMticketReceiptToMTicket$1) continuationImpl;
            int i = mTicketUtilsHelper$addMticketReceiptToMTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketUtilsHelper$addMticketReceiptToMTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketUtilsHelper$addMticketReceiptToMTicket$1 = new MTicketUtilsHelper$addMticketReceiptToMTicket$1(this, continuationImpl);
            }
        } else {
            mTicketUtilsHelper$addMticketReceiptToMTicket$1 = new MTicketUtilsHelper$addMticketReceiptToMTicket$1(this, continuationImpl);
        }
        Object obj = mTicketUtilsHelper$addMticketReceiptToMTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketUtilsHelper$addMticketReceiptToMTicket$1.label;
        TicketRepository ticketRepository = this.f;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            CityAppModel cityAppModel = (CityAppModel) this.d.b().getValue();
            if (cityAppModel != null && this.b.a(ChaloTransitMode.BUS, cityAppModel) && ((Boolean) this.e.g().getValue()).booleanValue()) {
                mTicketUtilsHelper$addMticketReceiptToMTicket$1.L$0 = str;
                mTicketUtilsHelper$addMticketReceiptToMTicket$1.L$1 = mTicketTripReceipt;
                mTicketUtilsHelper$addMticketReceiptToMTicket$1.label = 1;
                if (ticketRepository.g(str, mTicketUtilsHelper$addMticketReceiptToMTicket$1) != coroutineSingletons) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        mTicketTripReceipt = (MTicketTripReceipt) mTicketUtilsHelper$addMticketReceiptToMTicket$1.L$1;
        str = (String) mTicketUtilsHelper$addMticketReceiptToMTicket$1.L$0;
        ResultKt.b(obj);
        mTicketUtilsHelper$addMticketReceiptToMTicket$1.L$0 = null;
        mTicketUtilsHelper$addMticketReceiptToMTicket$1.L$1 = null;
        mTicketUtilsHelper$addMticketReceiptToMTicket$1.label = 2;
        return ticketRepository.d(str, mTicketTripReceipt, mTicketUtilsHelper$addMticketReceiptToMTicket$1) == coroutineSingletons ? coroutineSingletons : unit;
    }

    public final Object b(String str, Continuation continuation) {
        Object objG;
        CityAppModel cityAppModel = (CityAppModel) this.d.b().getValue();
        return (cityAppModel != null && this.b.a(ChaloTransitMode.BUS, cityAppModel) && ((Boolean) this.e.g().getValue()).booleanValue() && (objG = this.f.g(str, (ContinuationImpl) continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objG : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(MTicketConfiguration mTicketConfiguration, ContinuationImpl continuationImpl) {
        MTicketUtilsHelper$getActivationDuration$1 mTicketUtilsHelper$getActivationDuration$1;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel;
        if (continuationImpl instanceof MTicketUtilsHelper$getActivationDuration$1) {
            mTicketUtilsHelper$getActivationDuration$1 = (MTicketUtilsHelper$getActivationDuration$1) continuationImpl;
            int i = mTicketUtilsHelper$getActivationDuration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketUtilsHelper$getActivationDuration$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketUtilsHelper$getActivationDuration$1 = new MTicketUtilsHelper$getActivationDuration$1(this, continuationImpl);
            }
        } else {
            mTicketUtilsHelper$getActivationDuration$1 = new MTicketUtilsHelper$getActivationDuration$1(this, continuationImpl);
        }
        Object objA = mTicketUtilsHelper$getActivationDuration$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketUtilsHelper$getActivationDuration$1.label;
        long j = 14400000;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (mTicketConfiguration == null) {
                return new Long(14400000L);
            }
            String str = mTicketConfiguration.f5619a;
            mTicketUtilsHelper$getActivationDuration$1.label = 1;
            objA = this.g.a(str, mTicketUtilsHelper$getActivationDuration$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel = (ProductConfigCompleteDetailsListAppModel) objA;
        if (productConfigCompleteDetailsListAppModel != null && (productConfigCompleteDetailsAppModel = productConfigCompleteDetailsListAppModel.f8205a) != null) {
            j = productConfigCompleteDetailsAppModel.s;
        }
        return new Long(j);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[PHI: r10 r11
      0x009c: PHI (r10v5 app.chalo.models.mticketing.MTicket) = (r10v3 app.chalo.models.mticketing.MTicket), (r10v14 app.chalo.models.mticketing.MTicket) binds: [B:34:0x0099, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r11v11 java.lang.Object) = (r11v10 java.lang.Object), (r11v1 java.lang.Object) binds: [B:34:0x0099, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(MTicket mTicket, ContinuationImpl continuationImpl) {
        MTicketUtilsHelper$getMTicketExpirationTime$1 mTicketUtilsHelper$getMTicketExpirationTime$1;
        long j;
        long jLongValue;
        long j2;
        if (continuationImpl instanceof MTicketUtilsHelper$getMTicketExpirationTime$1) {
            mTicketUtilsHelper$getMTicketExpirationTime$1 = (MTicketUtilsHelper$getMTicketExpirationTime$1) continuationImpl;
            int i = mTicketUtilsHelper$getMTicketExpirationTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketUtilsHelper$getMTicketExpirationTime$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketUtilsHelper$getMTicketExpirationTime$1 = new MTicketUtilsHelper$getMTicketExpirationTime$1(this, continuationImpl);
            }
        } else {
            mTicketUtilsHelper$getMTicketExpirationTime$1 = new MTicketUtilsHelper$getMTicketExpirationTime$1(this, continuationImpl);
        }
        Object objK = mTicketUtilsHelper$getMTicketExpirationTime$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketUtilsHelper$getMTicketExpirationTime$1.label;
        if (i2 == 0) {
            ResultKt.b(objK);
            mTicketUtilsHelper$getMTicketExpirationTime$1.L$0 = mTicket;
            mTicketUtilsHelper$getMTicketExpirationTime$1.label = 1;
            objK = k(mTicket, mTicketUtilsHelper$getMTicketExpirationTime$1);
            if (objK != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            mTicket = (MTicket) mTicketUtilsHelper$getMTicketExpirationTime$1.L$0;
            ResultKt.b(objK);
        } else {
            if (i2 == 2) {
                j = mTicketUtilsHelper$getMTicketExpirationTime$1.J$0;
                mTicket = (MTicket) mTicketUtilsHelper$getMTicketExpirationTime$1.L$0;
                ResultKt.b(objK);
                if (j > ((Number) objK).longValue()) {
                    return new Long(mTicket.j);
                }
                mTicketUtilsHelper$getMTicketExpirationTime$1.L$0 = mTicket;
                mTicketUtilsHelper$getMTicketExpirationTime$1.label = 3;
                objK = j(mTicket, mTicketUtilsHelper$getMTicketExpirationTime$1);
                if (objK != obj) {
                    jLongValue = ((Number) objK).longValue();
                    MTicketConfiguration mTicketConfiguration = mTicket.r;
                    mTicketUtilsHelper$getMTicketExpirationTime$1.L$0 = mTicket;
                    mTicketUtilsHelper$getMTicketExpirationTime$1.J$0 = jLongValue;
                    mTicketUtilsHelper$getMTicketExpirationTime$1.label = 4;
                    objK = c(mTicketConfiguration, mTicketUtilsHelper$getMTicketExpirationTime$1);
                    if (objK != obj) {
                        j2 = jLongValue;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                mTicket = (MTicket) mTicketUtilsHelper$getMTicketExpirationTime$1.L$0;
                ResultKt.b(objK);
                jLongValue = ((Number) objK).longValue();
                MTicketConfiguration mTicketConfiguration2 = mTicket.r;
                mTicketUtilsHelper$getMTicketExpirationTime$1.L$0 = mTicket;
                mTicketUtilsHelper$getMTicketExpirationTime$1.J$0 = jLongValue;
                mTicketUtilsHelper$getMTicketExpirationTime$1.label = 4;
                objK = c(mTicketConfiguration2, mTicketUtilsHelper$getMTicketExpirationTime$1);
                if (objK != obj) {
                    j2 = jLongValue;
                }
                return obj;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = mTicketUtilsHelper$getMTicketExpirationTime$1.J$0;
            mTicket = (MTicket) mTicketUtilsHelper$getMTicketExpirationTime$1.L$0;
            ResultKt.b(objK);
        }
        return new Long(Math.min(((Number) objK).longValue() + j2, mTicket.j));
        if (!((Boolean) objK).booleanValue()) {
            return new Long(mTicket.j);
        }
        long j3 = mTicket.i;
        mTicketUtilsHelper$getMTicketExpirationTime$1.L$0 = mTicket;
        mTicketUtilsHelper$getMTicketExpirationTime$1.J$0 = j3;
        mTicketUtilsHelper$getMTicketExpirationTime$1.label = 2;
        objK = j(mTicket, mTicketUtilsHelper$getMTicketExpirationTime$1);
        if (objK != obj) {
            j = j3;
            if (j > ((Number) objK).longValue()) {
                return new Long(mTicket.j);
            }
            mTicketUtilsHelper$getMTicketExpirationTime$1.L$0 = mTicket;
            mTicketUtilsHelper$getMTicketExpirationTime$1.label = 3;
            objK = j(mTicket, mTicketUtilsHelper$getMTicketExpirationTime$1);
            if (objK != obj) {
                jLongValue = ((Number) objK).longValue();
                MTicketConfiguration mTicketConfiguration3 = mTicket.r;
                mTicketUtilsHelper$getMTicketExpirationTime$1.L$0 = mTicket;
                mTicketUtilsHelper$getMTicketExpirationTime$1.J$0 = jLongValue;
                mTicketUtilsHelper$getMTicketExpirationTime$1.label = 4;
                objK = c(mTicketConfiguration3, mTicketUtilsHelper$getMTicketExpirationTime$1);
                if (objK != obj) {
                    j2 = jLongValue;
                    return new Long(Math.min(((Number) objK).longValue() + j2, mTicket.j));
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(MTicket mTicket, ContinuationImpl continuationImpl) {
        MTicketUtilsHelper$getMTicketUsedTime$1 mTicketUtilsHelper$getMTicketUsedTime$1;
        long jLongValue;
        long j;
        long jLongValue2;
        long j2;
        if (continuationImpl instanceof MTicketUtilsHelper$getMTicketUsedTime$1) {
            mTicketUtilsHelper$getMTicketUsedTime$1 = (MTicketUtilsHelper$getMTicketUsedTime$1) continuationImpl;
            int i = mTicketUtilsHelper$getMTicketUsedTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketUtilsHelper$getMTicketUsedTime$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketUtilsHelper$getMTicketUsedTime$1 = new MTicketUtilsHelper$getMTicketUsedTime$1(this, continuationImpl);
            }
        } else {
            mTicketUtilsHelper$getMTicketUsedTime$1 = new MTicketUtilsHelper$getMTicketUsedTime$1(this, continuationImpl);
        }
        Object objC = mTicketUtilsHelper$getMTicketUsedTime$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketUtilsHelper$getMTicketUsedTime$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            boolean z = mTicket.k;
            jLongValue = mTicket.j;
            Long l = mTicket.n;
            if (!z) {
                mTicketUtilsHelper$getMTicketUsedTime$1.L$0 = mTicket;
                mTicketUtilsHelper$getMTicketUsedTime$1.J$0 = jLongValue;
                mTicketUtilsHelper$getMTicketUsedTime$1.label = 1;
                objC = this.b.c(mTicketUtilsHelper$getMTicketUsedTime$1);
                if (objC != obj) {
                    j = jLongValue;
                }
                return obj;
            }
            if (l != null && l.longValue() != 0) {
                jLongValue = l.longValue();
            }
            return new Long(jLongValue);
        }
        if (i2 == 1) {
            j = mTicketUtilsHelper$getMTicketUsedTime$1.J$0;
            mTicket = (MTicket) mTicketUtilsHelper$getMTicketUsedTime$1.L$0;
            ResultKt.b(objC);
        } else {
            if (i2 == 2) {
                mTicket = (MTicket) mTicketUtilsHelper$getMTicketUsedTime$1.L$0;
                ResultKt.b(objC);
                jLongValue2 = ((Number) objC).longValue();
                MTicketConfiguration mTicketConfiguration = mTicket.r;
                mTicketUtilsHelper$getMTicketUsedTime$1.L$0 = null;
                mTicketUtilsHelper$getMTicketUsedTime$1.J$0 = jLongValue2;
                mTicketUtilsHelper$getMTicketUsedTime$1.label = 3;
                objC = c(mTicketConfiguration, mTicketUtilsHelper$getMTicketUsedTime$1);
                if (objC != obj) {
                    j2 = jLongValue2;
                }
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = mTicketUtilsHelper$getMTicketUsedTime$1.J$0;
            ResultKt.b(objC);
        }
        jLongValue = ((Number) objC).longValue() + j2;
        return new Long(jLongValue);
        if (j >= ((Number) objC).longValue()) {
            mTicketUtilsHelper$getMTicketUsedTime$1.L$0 = mTicket;
            mTicketUtilsHelper$getMTicketUsedTime$1.label = 2;
            objC = j(mTicket, mTicketUtilsHelper$getMTicketUsedTime$1);
            if (objC != obj) {
                jLongValue2 = ((Number) objC).longValue();
                MTicketConfiguration mTicketConfiguration2 = mTicket.r;
                mTicketUtilsHelper$getMTicketUsedTime$1.L$0 = null;
                mTicketUtilsHelper$getMTicketUsedTime$1.J$0 = jLongValue2;
                mTicketUtilsHelper$getMTicketUsedTime$1.label = 3;
                objC = c(mTicketConfiguration2, mTicketUtilsHelper$getMTicketUsedTime$1);
                if (objC != obj) {
                    j2 = jLongValue2;
                    jLongValue = ((Number) objC).longValue() + j2;
                }
            }
            return obj;
        }
        jLongValue = mTicket.j;
        return new Long(jLongValue);
    }

    public final Object g(String str, Continuation continuation) {
        return this.i.f(str, (ContinuationImpl) continuation);
    }

    public final double i(MTicket ticket) {
        double d;
        double d2;
        Intrinsics.i(ticket, "ticket");
        long j = 0;
        int i = 0;
        long jMax = 0;
        for (MTicketPassengerInfo mTicketPassengerInfo : ticket.h.values()) {
            Double d3 = mTicketPassengerInfo.b;
            if (d3 != null) {
                d = d3.doubleValue();
                if (Double.isNaN(d)) {
                    d = d(mTicketPassengerInfo);
                }
            } else {
                d = d(mTicketPassengerInfo);
            }
            double d4 = 100;
            j += ((long) (d * d4)) * ((long) mTicketPassengerInfo.d);
            int i2 = mTicketPassengerInfo.g;
            if (Intrinsics.d(ticket.s, Boolean.TRUE)) {
                Double d5 = mTicketPassengerInfo.b;
                if (d5 != null) {
                    d2 = d5.doubleValue();
                    if (Double.isNaN(d2)) {
                        d2 = d(mTicketPassengerInfo);
                    }
                } else {
                    d2 = d(mTicketPassengerInfo);
                }
                jMax = Math.max(jMax, (long) (d2 * d4));
            }
            i = i2;
        }
        return this.c.f(j - jMax, CurrencyRoundOffLogicKt.a(i));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(MTicket mTicket, ContinuationImpl continuationImpl) {
        MTicketUtilsHelper$getUpTripActivationTime$1 mTicketUtilsHelper$getUpTripActivationTime$1;
        if (continuationImpl instanceof MTicketUtilsHelper$getUpTripActivationTime$1) {
            mTicketUtilsHelper$getUpTripActivationTime$1 = (MTicketUtilsHelper$getUpTripActivationTime$1) continuationImpl;
            int i = mTicketUtilsHelper$getUpTripActivationTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketUtilsHelper$getUpTripActivationTime$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketUtilsHelper$getUpTripActivationTime$1 = new MTicketUtilsHelper$getUpTripActivationTime$1(this, continuationImpl);
            }
        } else {
            mTicketUtilsHelper$getUpTripActivationTime$1 = new MTicketUtilsHelper$getUpTripActivationTime$1(this, continuationImpl);
        }
        Object objA = mTicketUtilsHelper$getUpTripActivationTime$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketUtilsHelper$getUpTripActivationTime$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            mTicketUtilsHelper$getUpTripActivationTime$1.L$0 = mTicket;
            mTicketUtilsHelper$getUpTripActivationTime$1.label = 1;
            objA = this.f5625a.a(mTicketUtilsHelper$getUpTripActivationTime$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mTicket = (MTicket) mTicketUtilsHelper$getUpTripActivationTime$1.L$0;
            ResultKt.b(objA);
        }
        LastRideInfo lastRideInfo = (LastRideInfo) objA;
        return new Long((lastRideInfo == null || !Intrinsics.d(lastRideInfo.f5584a, mTicket.f5615a)) ? mTicket.l : lastRideInfo.c);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(MTicket mTicket, ContinuationImpl continuationImpl) {
        MTicketUtilsHelper$isMTicketActive$1 mTicketUtilsHelper$isMTicketActive$1;
        MTicket mTicket2;
        LastRideInfo lastRideInfo;
        long jLongValue;
        long j;
        Object objC;
        long j2;
        long j3;
        if (continuationImpl instanceof MTicketUtilsHelper$isMTicketActive$1) {
            mTicketUtilsHelper$isMTicketActive$1 = (MTicketUtilsHelper$isMTicketActive$1) continuationImpl;
            int i = mTicketUtilsHelper$isMTicketActive$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketUtilsHelper$isMTicketActive$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketUtilsHelper$isMTicketActive$1 = new MTicketUtilsHelper$isMTicketActive$1(this, continuationImpl);
            }
        } else {
            mTicketUtilsHelper$isMTicketActive$1 = new MTicketUtilsHelper$isMTicketActive$1(this, continuationImpl);
        }
        Object objA = mTicketUtilsHelper$isMTicketActive$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketUtilsHelper$isMTicketActive$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objA);
            mTicketUtilsHelper$isMTicketActive$1.L$0 = mTicket;
            mTicketUtilsHelper$isMTicketActive$1.label = 1;
            objA = this.f5625a.a(mTicketUtilsHelper$isMTicketActive$1);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            mTicket = (MTicket) mTicketUtilsHelper$isMTicketActive$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                lastRideInfo = (LastRideInfo) mTicketUtilsHelper$isMTicketActive$1.L$1;
                mTicket2 = (MTicket) mTicketUtilsHelper$isMTicketActive$1.L$0;
                ResultKt.b(objA);
                jLongValue = ((Number) objA).longValue();
                j = lastRideInfo.c;
                MTicketConfiguration mTicketConfiguration = mTicket2.r;
                mTicketUtilsHelper$isMTicketActive$1.L$0 = null;
                mTicketUtilsHelper$isMTicketActive$1.L$1 = null;
                mTicketUtilsHelper$isMTicketActive$1.J$0 = jLongValue;
                mTicketUtilsHelper$isMTicketActive$1.J$1 = j;
                mTicketUtilsHelper$isMTicketActive$1.label = 3;
                objC = c(mTicketConfiguration, mTicketUtilsHelper$isMTicketActive$1);
                if (objC != obj) {
                    j2 = j;
                    objA = objC;
                    j3 = jLongValue;
                }
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = mTicketUtilsHelper$isMTicketActive$1.J$1;
            j3 = mTicketUtilsHelper$isMTicketActive$1.J$0;
            ResultKt.b(objA);
        }
        if (j3 > ((Number) objA).longValue() + j2) {
            z = false;
        }
        return Boolean.valueOf(z);
        LastRideInfo lastRideInfo2 = (LastRideInfo) objA;
        if (lastRideInfo2 == null || !Intrinsics.d(lastRideInfo2.f5584a, mTicket.f5615a)) {
            z = mTicket.m;
        } else if (!mTicket.m) {
            mTicketUtilsHelper$isMTicketActive$1.L$0 = mTicket;
            mTicketUtilsHelper$isMTicketActive$1.L$1 = lastRideInfo2;
            mTicketUtilsHelper$isMTicketActive$1.label = 2;
            Object objC2 = this.b.c(mTicketUtilsHelper$isMTicketActive$1);
            if (objC2 != obj) {
                mTicket2 = mTicket;
                lastRideInfo = lastRideInfo2;
                objA = objC2;
                jLongValue = ((Number) objA).longValue();
                j = lastRideInfo.c;
                MTicketConfiguration mTicketConfiguration2 = mTicket2.r;
                mTicketUtilsHelper$isMTicketActive$1.L$0 = null;
                mTicketUtilsHelper$isMTicketActive$1.L$1 = null;
                mTicketUtilsHelper$isMTicketActive$1.J$0 = jLongValue;
                mTicketUtilsHelper$isMTicketActive$1.J$1 = j;
                mTicketUtilsHelper$isMTicketActive$1.label = 3;
                objC = c(mTicketConfiguration2, mTicketUtilsHelper$isMTicketActive$1);
                if (objC != obj) {
                    j2 = j;
                    objA = objC;
                    j3 = jLongValue;
                    if (j3 > ((Number) objA).longValue() + j2) {
                        z = false;
                    }
                }
            }
            return obj;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object l(MTicket mTicket, ContinuationImpl continuationImpl) {
        MTicketUtilsHelper$isMTicketExpired$1 mTicketUtilsHelper$isMTicketExpired$1;
        long j;
        long jLongValue;
        long j2;
        long jLongValue2;
        Object objC;
        long j3;
        MTicket mTicket2 = mTicket;
        if (continuationImpl instanceof MTicketUtilsHelper$isMTicketExpired$1) {
            mTicketUtilsHelper$isMTicketExpired$1 = (MTicketUtilsHelper$isMTicketExpired$1) continuationImpl;
            int i = mTicketUtilsHelper$isMTicketExpired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketUtilsHelper$isMTicketExpired$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketUtilsHelper$isMTicketExpired$1 = new MTicketUtilsHelper$isMTicketExpired$1(this, continuationImpl);
            }
        } else {
            mTicketUtilsHelper$isMTicketExpired$1 = new MTicketUtilsHelper$isMTicketExpired$1(this, continuationImpl);
        }
        Object objC2 = mTicketUtilsHelper$isMTicketExpired$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketUtilsHelper$isMTicketExpired$1.label;
        BasicInfoContract basicInfoContract = this.b;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objC2);
            if (!mTicket2.k) {
                j = mTicket2.j;
                mTicketUtilsHelper$isMTicketExpired$1.L$0 = mTicket2;
                mTicketUtilsHelper$isMTicketExpired$1.J$0 = j;
                mTicketUtilsHelper$isMTicketExpired$1.label = 1;
                objC2 = basicInfoContract.c(mTicketUtilsHelper$isMTicketExpired$1);
                if (objC2 != obj) {
                }
                return obj;
            }
            return Boolean.valueOf(z);
        }
        if (i2 == 1) {
            j = mTicketUtilsHelper$isMTicketExpired$1.J$0;
            mTicket2 = (MTicket) mTicketUtilsHelper$isMTicketExpired$1.L$0;
            ResultKt.b(objC2);
        } else {
            if (i2 == 2) {
                mTicket2 = (MTicket) mTicketUtilsHelper$isMTicketExpired$1.L$0;
                ResultKt.b(objC2);
                jLongValue = ((Number) objC2).longValue();
                MTicketConfiguration mTicketConfiguration = mTicket2.r;
                mTicketUtilsHelper$isMTicketExpired$1.L$0 = null;
                mTicketUtilsHelper$isMTicketExpired$1.J$0 = jLongValue;
                mTicketUtilsHelper$isMTicketExpired$1.label = 3;
                objC2 = c(mTicketConfiguration, mTicketUtilsHelper$isMTicketExpired$1);
                if (objC2 != obj) {
                    j2 = jLongValue;
                    jLongValue2 = ((Number) objC2).longValue() + j2;
                    mTicketUtilsHelper$isMTicketExpired$1.J$0 = jLongValue2;
                    mTicketUtilsHelper$isMTicketExpired$1.label = 4;
                    objC = basicInfoContract.c(mTicketUtilsHelper$isMTicketExpired$1);
                    if (objC != obj) {
                        objC2 = objC;
                        j3 = jLongValue2;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                j2 = mTicketUtilsHelper$isMTicketExpired$1.J$0;
                ResultKt.b(objC2);
                jLongValue2 = ((Number) objC2).longValue() + j2;
                mTicketUtilsHelper$isMTicketExpired$1.J$0 = jLongValue2;
                mTicketUtilsHelper$isMTicketExpired$1.label = 4;
                objC = basicInfoContract.c(mTicketUtilsHelper$isMTicketExpired$1);
                if (objC != obj) {
                    objC2 = objC;
                    j3 = jLongValue2;
                }
                return obj;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = mTicketUtilsHelper$isMTicketExpired$1.J$0;
            ResultKt.b(objC2);
        }
        if (j3 >= ((Number) objC2).longValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
        if (j >= ((Number) objC2).longValue()) {
            if (mTicket2.m) {
                mTicketUtilsHelper$isMTicketExpired$1.L$0 = mTicket2;
                mTicketUtilsHelper$isMTicketExpired$1.label = 2;
                objC2 = j(mTicket2, mTicketUtilsHelper$isMTicketExpired$1);
                if (objC2 != obj) {
                    jLongValue = ((Number) objC2).longValue();
                    MTicketConfiguration mTicketConfiguration2 = mTicket2.r;
                    mTicketUtilsHelper$isMTicketExpired$1.L$0 = null;
                    mTicketUtilsHelper$isMTicketExpired$1.J$0 = jLongValue;
                    mTicketUtilsHelper$isMTicketExpired$1.label = 3;
                    objC2 = c(mTicketConfiguration2, mTicketUtilsHelper$isMTicketExpired$1);
                    if (objC2 != obj) {
                        j2 = jLongValue;
                        jLongValue2 = ((Number) objC2).longValue() + j2;
                        mTicketUtilsHelper$isMTicketExpired$1.J$0 = jLongValue2;
                        mTicketUtilsHelper$isMTicketExpired$1.label = 4;
                        objC = basicInfoContract.c(mTicketUtilsHelper$isMTicketExpired$1);
                        if (objC != obj) {
                            objC2 = objC;
                            j3 = jLongValue2;
                            if (j3 >= ((Number) objC2).longValue()) {
                                z = false;
                            }
                        }
                    }
                }
                return obj;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(MTicket mTicket, ContinuationImpl continuationImpl) {
        MTicketUtilsHelper$setMTicketActivationInfoFromJson$1 mTicketUtilsHelper$setMTicketActivationInfoFromJson$1;
        if (continuationImpl instanceof MTicketUtilsHelper$setMTicketActivationInfoFromJson$1) {
            mTicketUtilsHelper$setMTicketActivationInfoFromJson$1 = (MTicketUtilsHelper$setMTicketActivationInfoFromJson$1) continuationImpl;
            int i = mTicketUtilsHelper$setMTicketActivationInfoFromJson$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketUtilsHelper$setMTicketActivationInfoFromJson$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketUtilsHelper$setMTicketActivationInfoFromJson$1 = new MTicketUtilsHelper$setMTicketActivationInfoFromJson$1(this, continuationImpl);
            }
        } else {
            mTicketUtilsHelper$setMTicketActivationInfoFromJson$1 = new MTicketUtilsHelper$setMTicketActivationInfoFromJson$1(this, continuationImpl);
        }
        Object objJ = mTicketUtilsHelper$setMTicketActivationInfoFromJson$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketUtilsHelper$setMTicketActivationInfoFromJson$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            String str = mTicket.d;
            String str2 = mTicket.f5615a;
            mTicketUtilsHelper$setMTicketActivationInfoFromJson$1.L$0 = mTicket;
            mTicketUtilsHelper$setMTicketActivationInfoFromJson$1.label = 1;
            objJ = this.f.j(str, str2, mTicketUtilsHelper$setMTicketActivationInfoFromJson$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mTicket = (MTicket) mTicketUtilsHelper$setMTicketActivationInfoFromJson$1.L$0;
            ResultKt.b(objJ);
        }
        MTicket mTicket2 = mTicket;
        MTicketActivationInfoAppModel mTicketActivationInfoAppModel = (MTicketActivationInfoAppModel) objJ;
        if (mTicketActivationInfoAppModel == null) {
            return mTicket2;
        }
        try {
            return MTicket.a(mTicket2, null, mTicketActivationInfoAppModel.c, mTicketActivationInfoAppModel.d, 1073735679);
        } catch (JsonException e) {
            this.h.i(e);
            e.printStackTrace();
            return mTicket2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(MTicket mTicket, ContinuationImpl continuationImpl) {
        MTicketUtilsHelper$shouldConsiderAsExpired$1 mTicketUtilsHelper$shouldConsiderAsExpired$1;
        if (continuationImpl instanceof MTicketUtilsHelper$shouldConsiderAsExpired$1) {
            mTicketUtilsHelper$shouldConsiderAsExpired$1 = (MTicketUtilsHelper$shouldConsiderAsExpired$1) continuationImpl;
            int i = mTicketUtilsHelper$shouldConsiderAsExpired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketUtilsHelper$shouldConsiderAsExpired$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketUtilsHelper$shouldConsiderAsExpired$1 = new MTicketUtilsHelper$shouldConsiderAsExpired$1(this, continuationImpl);
            }
        } else {
            mTicketUtilsHelper$shouldConsiderAsExpired$1 = new MTicketUtilsHelper$shouldConsiderAsExpired$1(this, continuationImpl);
        }
        Object objL = mTicketUtilsHelper$shouldConsiderAsExpired$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketUtilsHelper$shouldConsiderAsExpired$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objL);
            mTicketUtilsHelper$shouldConsiderAsExpired$1.L$0 = mTicket;
            mTicketUtilsHelper$shouldConsiderAsExpired$1.label = 1;
            objL = l(mTicket, mTicketUtilsHelper$shouldConsiderAsExpired$1);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mTicket = (MTicket) mTicketUtilsHelper$shouldConsiderAsExpired$1.L$0;
            ResultKt.b(objL);
        }
        if (!((Boolean) objL).booleanValue() && !Intrinsics.d(mTicket.y, "FAILED")) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
