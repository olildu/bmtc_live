package app.chalo.premiumbus.bulkbookingridedetails.data.remote;

import app.chalo.premiumbus.bulkbookingridedetails.data.exception.PbBulkBookingRideDetailsInvalidDataException;
import app.chalo.premiumbus.bulkbookingridedetails.data.exception.PbUpdatePassStartDateInvalidDataException;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.PbTripBookingApiResponseModel;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.PunchTimeResponseApiModel;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.SuperPassApiResponseModel;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.TripPreferencesApiResponseModel;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.UpdatePassStartDateRequestApiModel;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.UserProfile;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.PbTripBookingResponseAppModel;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.SuperPassResponseAppModel;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.UpdatePassStartDateRequestAppModel;
import app.chalo.premiumbus.data.mappers.PBRemoteToAppModelMappersKt;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/remote/PbBulkBookingRideDetailsRepositoryImpl;", "Lapp/chalo/premiumbus/bulkbookingridedetails/data/remote/PbBulkBookingRideDetailsRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PbBulkBookingRideDetailsRepositoryImpl implements PbBulkBookingRideDetailsRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PbBulkBookingRideDetailsRemoteDataSource f6894a;

    public PbBulkBookingRideDetailsRepositoryImpl(PbBulkBookingRideDetailsRemoteDataSource pbBulkBookingRideDetailsRemoteDataSource) {
        this.f6894a = pbBulkBookingRideDetailsRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.premiumbus.bulkbookingridedetails.data.remote.PbBulkBookingRideDetailsRepository
    public final Object a(String str, ContinuationImpl continuationImpl) throws PbBulkBookingRideDetailsInvalidDataException {
        PbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1 pbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1;
        PbTripBookingResponseAppModel pbTripBookingResponseAppModel;
        String str2;
        int i;
        List list;
        if (continuationImpl instanceof PbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1) {
            pbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1 = (PbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1) continuationImpl;
            int i2 = pbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1.label = i2 - Integer.MIN_VALUE;
            } else {
                pbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1 = new PbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1(this, continuationImpl);
            }
        } else {
            pbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1 = new PbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1(this, continuationImpl);
        }
        Object objA = pbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = pbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1.label;
        if (i3 == 0) {
            ResultKt.b(objA);
            pbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1.label = 1;
            objA = this.f6894a.a(str, pbBulkBookingRideDetailsRepositoryImpl$fetchPbTripBookingDetails$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        PbTripBookingApiResponseModel pbTripBookingApiResponseModel = (PbTripBookingApiResponseModel) objA;
        Intrinsics.i(pbTripBookingApiResponseModel, "<this>");
        SuperPassApiResponseModel superPassApiResponseModel = pbTripBookingApiResponseModel.f6878a;
        if (superPassApiResponseModel != null) {
            String str3 = superPassApiResponseModel.f6882a;
            String str4 = superPassApiResponseModel.p;
            UserProfile userProfile = superPassApiResponseModel.m;
            String strN = vo1.n(userProfile.f6888a, " ", userProfile.b);
            long j = superPassApiResponseModel.h;
            long j2 = superPassApiResponseModel.i;
            int i4 = superPassApiResponseModel.k;
            int i5 = superPassApiResponseModel.D;
            int i6 = superPassApiResponseModel.C;
            TripPreferencesApiResponseModel tripPreferencesApiResponseModel = superPassApiResponseModel.B;
            SuperPassTripPreferences superPassTripPreferences = tripPreferencesApiResponseModel != null ? new SuperPassTripPreferences(tripPreferencesApiResponseModel.f6884a, tripPreferencesApiResponseModel.b, tripPreferencesApiResponseModel.c, tripPreferencesApiResponseModel.d, tripPreferencesApiResponseModel.e) : null;
            String str5 = superPassApiResponseModel.b;
            String str6 = superPassApiResponseModel.c;
            List list2 = superPassApiResponseModel.K;
            if (list2 != null) {
                List list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((PunchTimeResponseApiModel) it.next()).f6880a));
                    i5 = i5;
                    str6 = str6;
                }
                str2 = str6;
                i = i5;
                list = arrayList;
            } else {
                str2 = str6;
                i = i5;
                list = EmptyList.f17557a;
            }
            SuperPassResponseAppModel superPassResponseAppModel = new SuperPassResponseAppModel(superPassApiResponseModel.t, str3, str4, strN, j, j2, i4, Integer.valueOf(i), Integer.valueOf(i6), superPassTripPreferences, str5, str2, list);
            List list4 = pbTripBookingApiResponseModel.b;
            if (list4 != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    PremiumReserveTicketAppModel premiumReserveTicketAppModelC = PBRemoteToAppModelMappersKt.c((GenericMobileTicketProductApiResponseModel) it2.next());
                    if (premiumReserveTicketAppModelC != null) {
                        arrayList2.add(premiumReserveTicketAppModelC);
                    }
                }
                pbTripBookingResponseAppModel = new PbTripBookingResponseAppModel(superPassResponseAppModel, arrayList2);
            } else {
                pbTripBookingResponseAppModel = null;
            }
        } else {
            pbTripBookingResponseAppModel = null;
        }
        if (pbTripBookingResponseAppModel != null) {
            return pbTripBookingResponseAppModel;
        }
        throw new PbBulkBookingRideDetailsInvalidDataException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // app.chalo.premiumbus.bulkbookingridedetails.data.remote.PbBulkBookingRideDetailsRepository
    public final Object b(String str, String str2, UpdatePassStartDateRequestAppModel updatePassStartDateRequestAppModel, boolean z, ContinuationImpl continuationImpl) throws PbUpdatePassStartDateInvalidDataException {
        PbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1 pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1;
        if (continuationImpl instanceof PbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1) {
            pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1 = (PbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1) continuationImpl;
            int i = pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1.label = i - Integer.MIN_VALUE;
            } else {
                pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1 = new PbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1(this, continuationImpl);
            }
        } else {
            pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1 = new PbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1(this, continuationImpl);
        }
        PbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1 pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$2 = pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$1;
        Object objB = pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$2.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            UpdatePassStartDateRequestApiModel updatePassStartDateRequestApiModel = new UpdatePassStartDateRequestApiModel(updatePassStartDateRequestAppModel.f6892a);
            pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$2.label = 1;
            objB = this.f6894a.b(str, str2, updatePassStartDateRequestApiModel, z, pbBulkBookingRideDetailsRepositoryImpl$updatePassStartDate$2);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        JsonObject jsonObject = (JsonObject) objB;
        if (jsonObject != null) {
            return jsonObject;
        }
        throw new PbUpdatePassStartDateInvalidDataException();
    }
}
