package app.chalo.home.data.repository;

import app.chalo.models.LastRideInfo;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketActivationInfoAppModel;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.mticketing.dao.LastRideInfoDao;
import app.chalo.models.mticketing.dao.MTicketActivationStoreDao;
import app.chalo.models.mticketing.dao.TicketDao;
import app.chalo.models.mticketing.entity.MTicketActivationInfoEntityModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/data/repository/TicketRepositoryImpl;", "Lapp/chalo/home/data/repository/TicketRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketRepositoryImpl implements TicketRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketDao f2983a;
    public final LastRideInfoDao b;
    public final MTicketActivationStoreDao c;
    public final CityProvider d;

    public TicketRepositoryImpl(TicketDao ticketDao, LastRideInfoDao lastRideInfoDao, MTicketActivationStoreDao mTicketActivationStoreDao, CityProvider cityProvider) {
        this.f2983a = ticketDao;
        this.b = lastRideInfoDao;
        this.c = mTicketActivationStoreDao;
        this.d = cityProvider;
    }

    @Override // app.chalo.home.data.repository.TicketRepository
    public final Object a(MTicket mTicket, ContinuationImpl continuationImpl) {
        String lowerCase = mTicket.d.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        Object objA = this.f2983a.a(MTicket.a(mTicket, lowerCase, 0L, false, 1073741815), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.home.data.repository.TicketRepository
    public final Object b(String str, LastRideInfo lastRideInfo, ContinuationImpl continuationImpl) {
        Object objB = this.b.b(str, lastRideInfo, continuationImpl);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.home.data.repository.TicketRepository
    public final Object c(String str, ContinuationImpl continuationImpl) {
        return this.f2983a.c(str, continuationImpl);
    }

    @Override // app.chalo.home.data.repository.TicketRepository
    public final Object d(String str, MTicketTripReceipt mTicketTripReceipt, Continuation continuation) {
        Object objD = this.f2983a.d(str, mTicketTripReceipt, continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    @Override // app.chalo.home.data.repository.TicketRepository
    public final Object e(String str, ContinuationImpl continuationImpl) {
        return this.b.e(str, continuationImpl);
    }

    @Override // app.chalo.home.data.repository.TicketRepository
    public final Object f(Continuation continuation) {
        Object objF = this.f2983a.f(continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    @Override // app.chalo.home.data.repository.TicketRepository
    public final Object g(String str, ContinuationImpl continuationImpl) {
        Object objG = this.f2983a.g(str, continuationImpl);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.home.data.repository.TicketRepository
    public final Object h(String str, ContinuationImpl continuationImpl) {
        String lowerCase;
        String strB = CityProviderKt.b(this.d);
        if (strB != null) {
            lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = "";
        }
        return this.f2983a.h(str, lowerCase, continuationImpl);
    }

    @Override // app.chalo.home.data.repository.TicketRepository
    public final Object i(MTicketActivationInfoAppModel mTicketActivationInfoAppModel, ContinuationImpl continuationImpl) {
        String lowerCase = mTicketActivationInfoAppModel.f5617a.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        Object objB = this.c.b(new MTicketActivationInfoEntityModel(lowerCase, mTicketActivationInfoAppModel.b, mTicketActivationInfoAppModel.c, mTicketActivationInfoAppModel.d), continuationImpl);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.home.data.repository.TicketRepository
    public final Object j(String str, String str2, ContinuationImpl continuationImpl) {
        TicketRepositoryImpl$getMTicketActivationInfo$1 ticketRepositoryImpl$getMTicketActivationInfo$1;
        if (continuationImpl instanceof TicketRepositoryImpl$getMTicketActivationInfo$1) {
            ticketRepositoryImpl$getMTicketActivationInfo$1 = (TicketRepositoryImpl$getMTicketActivationInfo$1) continuationImpl;
            int i = ticketRepositoryImpl$getMTicketActivationInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ticketRepositoryImpl$getMTicketActivationInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                ticketRepositoryImpl$getMTicketActivationInfo$1 = new TicketRepositoryImpl$getMTicketActivationInfo$1(this, continuationImpl);
            }
        } else {
            ticketRepositoryImpl$getMTicketActivationInfo$1 = new TicketRepositoryImpl$getMTicketActivationInfo$1(this, continuationImpl);
        }
        Object objA = ticketRepositoryImpl$getMTicketActivationInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ticketRepositoryImpl$getMTicketActivationInfo$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            ticketRepositoryImpl$getMTicketActivationInfo$1.label = 1;
            objA = this.c.a(lowerCase, str2, ticketRepositoryImpl$getMTicketActivationInfo$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        MTicketActivationInfoEntityModel mTicketActivationInfoEntityModel = (MTicketActivationInfoEntityModel) objA;
        if (mTicketActivationInfoEntityModel != null) {
            return new MTicketActivationInfoAppModel(mTicketActivationInfoEntityModel.f5626a, mTicketActivationInfoEntityModel.b, mTicketActivationInfoEntityModel.c, mTicketActivationInfoEntityModel.d);
        }
        return null;
    }

    @Override // app.chalo.home.data.repository.TicketRepository
    public final Flow k() {
        String lowerCase;
        String strB = CityProviderKt.b(this.d);
        if (strB != null) {
            lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = "";
        }
        return this.f2983a.e(lowerCase);
    }

    @Override // app.chalo.home.data.repository.TicketRepository
    public final Object l(Continuation continuation) {
        String lowerCase;
        String strB = CityProviderKt.b(this.d);
        if (strB != null) {
            lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = "";
        }
        return this.f2983a.b(lowerCase, continuation);
    }
}
