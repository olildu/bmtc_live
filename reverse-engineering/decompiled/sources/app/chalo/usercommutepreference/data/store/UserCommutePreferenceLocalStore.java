package app.chalo.usercommutepreference.data.store;

import app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllSavedRidesAsFlow$$inlined$map$1;
import app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getAllUserCommutePreferencePlacesAsFlow$$inlined$map$1;
import app.chalo.usercommutepreference.data.store.impl.UserCommutePreferenceLocalStoreImpl$getSavedRidesByODPairAsFlow$$inlined$map$1;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/store/UserCommutePreferenceLocalStore;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UserCommutePreferenceLocalStore {
    UserCommutePreferenceLocalStoreImpl$getAllSavedRidesAsFlow$$inlined$map$1 a(String str, String str2);

    UserCommutePreferenceLocalStoreImpl$getAllUserCommutePreferencePlacesAsFlow$$inlined$map$1 b(String str, String str2);

    Object f(List list, String str, String str2, Continuation continuation);

    Object h(List list, String str, String str2, Continuation continuation);

    UserCommutePreferenceLocalStoreImpl$getSavedRidesByODPairAsFlow$$inlined$map$1 i(String str, String str2, String str3, String str4);
}
