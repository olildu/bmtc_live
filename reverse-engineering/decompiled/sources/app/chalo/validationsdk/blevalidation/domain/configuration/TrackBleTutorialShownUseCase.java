package app.chalo.validationsdk.blevalidation.domain.configuration;

import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.validationsdk.blevalidation.data.local.ProductValidationsDataStore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/configuration/TrackBleTutorialShownUseCase;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackBleTutorialShownUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f10516a;
    public final ProductValidationsDataStore b;
    public final CoroutineContextProvider c;

    public TrackBleTutorialShownUseCase(UserProfileDetailsProvider userProfileDetailsProvider, ProductValidationsDataStore productValidationsDataStore, CoroutineContextProvider coroutineContextProvider) {
        this.f10516a = userProfileDetailsProvider;
        this.b = productValidationsDataStore;
        this.c = coroutineContextProvider;
    }

    public final Object a(Continuation continuation) {
        return BuildersKt.g(this.c.b(), new TrackBleTutorialShownUseCase$invoke$2(this, null), continuation);
    }
}
