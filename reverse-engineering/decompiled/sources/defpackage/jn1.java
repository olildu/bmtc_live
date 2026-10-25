package defpackage;

import app.chalo.core.User_commute_preference_saved_ride_tableQueries;
import app.chalo.core.database.dao.UserCommutePreferenceSavedRideDaoImpl;
import app.chalo.core.database.mappers.UserCommutePreferenceSavedRideEntityMapperKt;
import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceSavedRideEntity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jn1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17423a = 1;
    public final /* synthetic */ UserCommutePreferenceSavedRideDaoImpl b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List e;

    public /* synthetic */ jn1(UserCommutePreferenceSavedRideDaoImpl userCommutePreferenceSavedRideDaoImpl, String str, String str2, List list) {
        this.b = userCommutePreferenceSavedRideDaoImpl;
        this.c = str;
        this.d = str2;
        this.e = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17423a) {
            case 0:
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    this.b.f2085a.X(UserCommutePreferenceSavedRideEntityMapperKt.a((UserCommutePreferenceSavedRideEntity) it.next(), this.c, this.d));
                }
                break;
            default:
                UserCommutePreferenceSavedRideDaoImpl userCommutePreferenceSavedRideDaoImpl = this.b;
                User_commute_preference_saved_ride_tableQueries user_commute_preference_saved_ride_tableQueries = userCommutePreferenceSavedRideDaoImpl.f2085a;
                String str = this.c;
                String str2 = this.d;
                user_commute_preference_saved_ride_tableQueries.W(str, str2);
                Iterator it2 = this.e.iterator();
                while (it2.hasNext()) {
                    userCommutePreferenceSavedRideDaoImpl.f2085a.X(UserCommutePreferenceSavedRideEntityMapperKt.a((UserCommutePreferenceSavedRideEntity) it2.next(), str, str2));
                }
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ jn1(List list, UserCommutePreferenceSavedRideDaoImpl userCommutePreferenceSavedRideDaoImpl, String str, String str2) {
        this.e = list;
        this.b = userCommutePreferenceSavedRideDaoImpl;
        this.c = str;
        this.d = str2;
    }
}
