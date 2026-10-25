package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.UserCommutePreferenceStopPlaceEntityMapper;
import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceStopPlaceEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class UserCommutePreferenceStopPlaceDaoImpl$getAllUserCommutePreferencePlacesAsFlow$1 extends FunctionReferenceImpl implements Function12<String, String, String, String, String, String, String, String, String, Double, Double, String, UserCommutePreferenceStopPlaceEntity> {
    @Override // kotlin.jvm.functions.Function12
    public final Object b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d, Double d2, String str10) {
        double dDoubleValue = d.doubleValue();
        double dDoubleValue2 = d2.doubleValue();
        ((UserCommutePreferenceStopPlaceEntityMapper) this.receiver).getClass();
        return new UserCommutePreferenceStopPlaceEntity(str, str2, str3, str4, str5, str6, str7, str8, str9, dDoubleValue, dDoubleValue2, str10);
    }
}
