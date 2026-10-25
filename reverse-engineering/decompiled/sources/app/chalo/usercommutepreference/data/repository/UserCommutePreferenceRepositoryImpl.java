package app.chalo.usercommutepreference.data.repository;

import app.chalo.usercommutepreference.data.api.CreateRideResponseApiModel;
import app.chalo.usercommutepreference.data.api.CreateStopPlaceResponseApiModel;
import app.chalo.usercommutepreference.data.api.DeleteRideResponseApiModel;
import app.chalo.usercommutepreference.data.api.DeleteStopPlaceResponseApiModel;
import app.chalo.usercommutepreference.data.api.UpdateCommutePreferenceApiResponseModel;
import app.chalo.usercommutepreference.data.api.UserCommutePreferenceApiModel;
import app.chalo.usercommutepreference.data.api.UserCommutePreferenceApiResponseModel;
import app.chalo.usercommutepreference.data.api.UserCommutePreferencePlaceLocationApiModel;
import app.chalo.usercommutepreference.data.api.UserCommutePreferenceSavedRideApiModel;
import app.chalo.usercommutepreference.data.api.UserCommutePreferenceStopPlaceApiModel;
import app.chalo.usercommutepreference.data.mappers.UserCommutePreferenceApiResponseToAppModelMapperKt;
import app.chalo.usercommutepreference.data.models.app.CreateRideResponseAppModel;
import app.chalo.usercommutepreference.data.models.app.CreateStopPlaceResponseAppModel;
import app.chalo.usercommutepreference.data.models.app.DeleteRideResponseAppModel;
import app.chalo.usercommutepreference.data.models.app.DeleteStopPlaceResponseAppModel;
import app.chalo.usercommutepreference.data.models.app.UpdateCommutePreferenceAppResponseModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceDetailsAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceTimingAppModel;
import app.chalo.usercommutepreference.data.remote.UserCommutePreferenceRemoteDataSource;
import app.chalo.usercommutepreference.data.remote.request.SaveCommutePreferenceRequestApiModel;
import app.chalo.usercommutepreference.data.remote.request.SaveRideRequestApiModel;
import app.chalo.usercommutepreference.data.remote.request.SaveStopPlaceRequestApiModel;
import app.chalo.usercommutepreference.data.store.UserCommutePreferenceLocalStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/repository/UserCommutePreferenceRepositoryImpl;", "Lapp/chalo/usercommutepreference/data/repository/UserCommutePreferenceRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserCommutePreferenceRepositoryImpl implements UserCommutePreferenceRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCommutePreferenceRemoteDataSource f10264a;
    public final UserCommutePreferenceLocalStore b;

    public UserCommutePreferenceRepositoryImpl(UserCommutePreferenceRemoteDataSource userCommutePreferenceRemoteDataSource, UserCommutePreferenceLocalStore userCommutePreferenceLocalStore) {
        this.f10264a = userCommutePreferenceRemoteDataSource;
        this.b = userCommutePreferenceLocalStore;
    }

    @Override // app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository
    public final Flow a(String str, String str2) {
        return this.b.a(str, str2);
    }

    @Override // app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository
    public final Flow b(String str, String str2) {
        return this.b.b(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        UserCommutePreferenceRepositoryImpl$deletePlaceFromServer$1 userCommutePreferenceRepositoryImpl$deletePlaceFromServer$1;
        if (continuationImpl instanceof UserCommutePreferenceRepositoryImpl$deletePlaceFromServer$1) {
            userCommutePreferenceRepositoryImpl$deletePlaceFromServer$1 = (UserCommutePreferenceRepositoryImpl$deletePlaceFromServer$1) continuationImpl;
            int i = userCommutePreferenceRepositoryImpl$deletePlaceFromServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRepositoryImpl$deletePlaceFromServer$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRepositoryImpl$deletePlaceFromServer$1 = new UserCommutePreferenceRepositoryImpl$deletePlaceFromServer$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRepositoryImpl$deletePlaceFromServer$1 = new UserCommutePreferenceRepositoryImpl$deletePlaceFromServer$1(this, continuationImpl);
        }
        Object objC = userCommutePreferenceRepositoryImpl$deletePlaceFromServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRepositoryImpl$deletePlaceFromServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            userCommutePreferenceRepositoryImpl$deletePlaceFromServer$1.label = 1;
            objC = this.f10264a.c(str, str2, userCommutePreferenceRepositoryImpl$deletePlaceFromServer$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        DeleteStopPlaceResponseApiModel deleteStopPlaceResponseApiModel = (DeleteStopPlaceResponseApiModel) objC;
        if (deleteStopPlaceResponseApiModel != null) {
            return new DeleteStopPlaceResponseAppModel(Intrinsics.d(deleteStopPlaceResponseApiModel.f10224a, Boolean.TRUE));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    @Override // app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository
    public final Object d(String str, ContinuationImpl continuationImpl) {
        UserCommutePreferenceRepositoryImpl$fetchProfileSummary$1 userCommutePreferenceRepositoryImpl$fetchProfileSummary$1;
        ?? arrayList;
        UserCommutePreferenceDetailsAppModel userCommutePreferenceDetailsAppModel;
        ?? arrayList2;
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModelA;
        UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel;
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModelA2;
        String str2;
        Long l;
        String cityId = str;
        if (continuationImpl instanceof UserCommutePreferenceRepositoryImpl$fetchProfileSummary$1) {
            userCommutePreferenceRepositoryImpl$fetchProfileSummary$1 = (UserCommutePreferenceRepositoryImpl$fetchProfileSummary$1) continuationImpl;
            int i = userCommutePreferenceRepositoryImpl$fetchProfileSummary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRepositoryImpl$fetchProfileSummary$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRepositoryImpl$fetchProfileSummary$1 = new UserCommutePreferenceRepositoryImpl$fetchProfileSummary$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRepositoryImpl$fetchProfileSummary$1 = new UserCommutePreferenceRepositoryImpl$fetchProfileSummary$1(this, continuationImpl);
        }
        Object objD = userCommutePreferenceRepositoryImpl$fetchProfileSummary$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRepositoryImpl$fetchProfileSummary$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            userCommutePreferenceRepositoryImpl$fetchProfileSummary$1.L$0 = cityId;
            userCommutePreferenceRepositoryImpl$fetchProfileSummary$1.label = 1;
            objD = this.f10264a.d(cityId, userCommutePreferenceRepositoryImpl$fetchProfileSummary$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cityId = (String) userCommutePreferenceRepositoryImpl$fetchProfileSummary$1.L$0;
            ResultKt.b(objD);
        }
        UserCommutePreferenceApiResponseModel userCommutePreferenceApiResponseModel = (UserCommutePreferenceApiResponseModel) objD;
        if (userCommutePreferenceApiResponseModel == null) {
            return null;
        }
        Intrinsics.i(cityId, "cityId");
        List list = userCommutePreferenceApiResponseModel.f10230a;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModelB = UserCommutePreferenceApiResponseToAppModelMapperKt.b((UserCommutePreferenceStopPlaceApiModel) it.next(), cityId);
                if (userCommutePreferenceStopPlaceAppModelB != null) {
                    arrayList.add(userCommutePreferenceStopPlaceAppModelB);
                }
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        UserCommutePreferenceApiModel userCommutePreferenceApiModel = userCommutePreferenceApiResponseModel.b;
        if (userCommutePreferenceApiModel != null) {
            Long l2 = userCommutePreferenceApiModel.c;
            Long l3 = userCommutePreferenceApiModel.d;
            UserCommutePreferenceTimingAppModel userCommutePreferenceTimingAppModel = (l2 == null || l3 == null) ? null : new UserCommutePreferenceTimingAppModel(l2.longValue(), l3.longValue());
            Long l4 = userCommutePreferenceApiModel.e;
            Long l5 = userCommutePreferenceApiModel.f;
            UserCommutePreferenceTimingAppModel userCommutePreferenceTimingAppModel2 = (l4 == null || l5 == null) ? null : new UserCommutePreferenceTimingAppModel(l4.longValue(), l5.longValue());
            UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel = userCommutePreferenceApiModel.f10228a;
            UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModelB2 = userCommutePreferenceStopPlaceApiModel != null ? UserCommutePreferenceApiResponseToAppModelMapperKt.b(userCommutePreferenceStopPlaceApiModel, cityId) : null;
            UserCommutePreferenceStopPlaceApiModel userCommutePreferenceStopPlaceApiModel2 = userCommutePreferenceApiModel.b;
            UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModelB3 = userCommutePreferenceStopPlaceApiModel2 != null ? UserCommutePreferenceApiResponseToAppModelMapperKt.b(userCommutePreferenceStopPlaceApiModel2, cityId) : null;
            String str3 = userCommutePreferenceApiModel.g;
            if (userCommutePreferenceStopPlaceAppModelB2 == null && userCommutePreferenceStopPlaceAppModelB3 == null && userCommutePreferenceTimingAppModel == null && userCommutePreferenceTimingAppModel2 == null && str3 == null) {
                userCommutePreferenceDetailsAppModel = null;
            } else {
                userCommutePreferenceDetailsAppModel = new UserCommutePreferenceDetailsAppModel(userCommutePreferenceStopPlaceAppModelB2, userCommutePreferenceStopPlaceAppModelB3, userCommutePreferenceTimingAppModel, userCommutePreferenceTimingAppModel2, str3);
            }
        } else {
            userCommutePreferenceDetailsAppModel = null;
        }
        List<UserCommutePreferenceSavedRideApiModel> list2 = userCommutePreferenceApiResponseModel.c;
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (UserCommutePreferenceSavedRideApiModel userCommutePreferenceSavedRideApiModel : list2) {
                Intrinsics.i(userCommutePreferenceSavedRideApiModel, "<this>");
                UserCommutePreferencePlaceLocationApiModel userCommutePreferencePlaceLocationApiModel2 = userCommutePreferenceSavedRideApiModel.b;
                UserCommutePreferenceSavedRideAppModel userCommutePreferenceSavedRideAppModel = (userCommutePreferencePlaceLocationApiModel2 == null || (userCommutePreferencePlaceLocationAppModelA = UserCommutePreferenceApiResponseToAppModelMapperKt.a(userCommutePreferencePlaceLocationApiModel2, cityId)) == null || (userCommutePreferencePlaceLocationApiModel = userCommutePreferenceSavedRideApiModel.c) == null || (userCommutePreferencePlaceLocationAppModelA2 = UserCommutePreferenceApiResponseToAppModelMapperKt.a(userCommutePreferencePlaceLocationApiModel, cityId)) == null || (str2 = userCommutePreferenceSavedRideApiModel.f10234a) == null || (l = userCommutePreferenceSavedRideApiModel.d) == null) ? null : new UserCommutePreferenceSavedRideAppModel(str2, userCommutePreferencePlaceLocationAppModelA, userCommutePreferencePlaceLocationAppModelA2, l.longValue());
                if (userCommutePreferenceSavedRideAppModel != null) {
                    arrayList2.add(userCommutePreferenceSavedRideAppModel);
                }
            }
        } else {
            arrayList2 = EmptyList.f17557a;
        }
        return new UserCommutePreferenceAppModel(arrayList, userCommutePreferenceDetailsAppModel, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository
    public final Object e(SaveRideRequestApiModel saveRideRequestApiModel, String str, ContinuationImpl continuationImpl) {
        UserCommutePreferenceRepositoryImpl$saveRideToServer$1 userCommutePreferenceRepositoryImpl$saveRideToServer$1;
        if (continuationImpl instanceof UserCommutePreferenceRepositoryImpl$saveRideToServer$1) {
            userCommutePreferenceRepositoryImpl$saveRideToServer$1 = (UserCommutePreferenceRepositoryImpl$saveRideToServer$1) continuationImpl;
            int i = userCommutePreferenceRepositoryImpl$saveRideToServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRepositoryImpl$saveRideToServer$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRepositoryImpl$saveRideToServer$1 = new UserCommutePreferenceRepositoryImpl$saveRideToServer$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRepositoryImpl$saveRideToServer$1 = new UserCommutePreferenceRepositoryImpl$saveRideToServer$1(this, continuationImpl);
        }
        Object objE = userCommutePreferenceRepositoryImpl$saveRideToServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRepositoryImpl$saveRideToServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            userCommutePreferenceRepositoryImpl$saveRideToServer$1.label = 1;
            objE = this.f10264a.e(saveRideRequestApiModel, str, userCommutePreferenceRepositoryImpl$saveRideToServer$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        CreateRideResponseApiModel createRideResponseApiModel = (CreateRideResponseApiModel) objE;
        if (createRideResponseApiModel != null) {
            return new CreateRideResponseAppModel(Intrinsics.d(createRideResponseApiModel.f10218a, Boolean.TRUE), createRideResponseApiModel.b);
        }
        return null;
    }

    @Override // app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository
    public final Object f(List list, String str, String str2, Continuation continuation) {
        Object objF = this.b.f(list, str, str2, continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository
    public final Object g(String str, String str2, ContinuationImpl continuationImpl) {
        UserCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1 userCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1;
        if (continuationImpl instanceof UserCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1) {
            userCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1 = (UserCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1) continuationImpl;
            int i = userCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1 = new UserCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1 = new UserCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1(this, continuationImpl);
        }
        Object objG = userCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            userCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1.label = 1;
            objG = this.f10264a.g(str, str2, userCommutePreferenceRepositoryImpl$deleteSavedRideFromServer$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        DeleteRideResponseApiModel deleteRideResponseApiModel = (DeleteRideResponseApiModel) objG;
        if (deleteRideResponseApiModel != null) {
            return new DeleteRideResponseAppModel(Intrinsics.d(deleteRideResponseApiModel.f10222a, Boolean.TRUE));
        }
        return null;
    }

    @Override // app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository
    public final Object h(List list, String str, String str2, Continuation continuation) {
        Object objH = this.b.h(list, str, str2, continuation);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : Unit.f17538a;
    }

    @Override // app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository
    public final Flow i(String originId, String destinationId, String str, String str2) {
        Intrinsics.i(originId, "originId");
        Intrinsics.i(destinationId, "destinationId");
        return this.b.i(originId, destinationId, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository
    public final Object j(SaveCommutePreferenceRequestApiModel saveCommutePreferenceRequestApiModel, String str, ContinuationImpl continuationImpl) {
        UserCommutePreferenceRepositoryImpl$updateCommutePreferences$1 userCommutePreferenceRepositoryImpl$updateCommutePreferences$1;
        if (continuationImpl instanceof UserCommutePreferenceRepositoryImpl$updateCommutePreferences$1) {
            userCommutePreferenceRepositoryImpl$updateCommutePreferences$1 = (UserCommutePreferenceRepositoryImpl$updateCommutePreferences$1) continuationImpl;
            int i = userCommutePreferenceRepositoryImpl$updateCommutePreferences$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRepositoryImpl$updateCommutePreferences$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRepositoryImpl$updateCommutePreferences$1 = new UserCommutePreferenceRepositoryImpl$updateCommutePreferences$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRepositoryImpl$updateCommutePreferences$1 = new UserCommutePreferenceRepositoryImpl$updateCommutePreferences$1(this, continuationImpl);
        }
        Object objJ = userCommutePreferenceRepositoryImpl$updateCommutePreferences$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRepositoryImpl$updateCommutePreferences$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            userCommutePreferenceRepositoryImpl$updateCommutePreferences$1.label = 1;
            objJ = this.f10264a.j(saveCommutePreferenceRequestApiModel, str, userCommutePreferenceRepositoryImpl$updateCommutePreferences$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        UpdateCommutePreferenceApiResponseModel updateCommutePreferenceApiResponseModel = (UpdateCommutePreferenceApiResponseModel) objJ;
        if (updateCommutePreferenceApiResponseModel != null) {
            return new UpdateCommutePreferenceAppResponseModel(Intrinsics.d(updateCommutePreferenceApiResponseModel.f10226a, Boolean.TRUE));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository
    public final Object k(SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel, String str, ContinuationImpl continuationImpl) {
        UserCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1 userCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1;
        if (continuationImpl instanceof UserCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1) {
            userCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1 = (UserCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1) continuationImpl;
            int i = userCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1.label = i - Integer.MIN_VALUE;
            } else {
                userCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1 = new UserCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1(this, continuationImpl);
            }
        } else {
            userCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1 = new UserCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1(this, continuationImpl);
        }
        Object objK = userCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1.label;
        if (i2 == 0) {
            ResultKt.b(objK);
            userCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1.label = 1;
            objK = this.f10264a.k(saveStopPlaceRequestApiModel, str, userCommutePreferenceRepositoryImpl$saveStopPlaceToServer$1);
            if (objK == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objK);
        }
        CreateStopPlaceResponseApiModel createStopPlaceResponseApiModel = (CreateStopPlaceResponseApiModel) objK;
        if (createStopPlaceResponseApiModel != null) {
            return new CreateStopPlaceResponseAppModel(Intrinsics.d(createStopPlaceResponseApiModel.f10220a, Boolean.TRUE));
        }
        return null;
    }
}
