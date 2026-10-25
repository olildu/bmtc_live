package app.chalo.login.domain;

import app.chalo.contract.RemoteConfigFetcherContract;
import app.chalo.domain.CheckIfExperimentEnabledUseCase;
import app.chalo.login.data.models.app.LoginAfterCitySelectionRemoteConfigModel;
import app.chalo.providers.CoroutineContextProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/login/domain/FetchLoginAfterCitySelectionConfigUseCase;", "", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchLoginAfterCitySelectionConfigUseCase {
    public static final LoginAfterCitySelectionRemoteConfigModel d = new LoginAfterCitySelectionRemoteConfigModel();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigFetcherContract f5232a;
    public final CheckIfExperimentEnabledUseCase b;
    public final CoroutineContextProvider c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/login/domain/FetchLoginAfterCitySelectionConfigUseCase$Companion;", "", "", "SHOULD_START_LOGIN_AFTER_CITY_SELECTION", "Ljava/lang/String;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FetchLoginAfterCitySelectionConfigUseCase(RemoteConfigFetcherContract remoteConfigFetcherContract, CheckIfExperimentEnabledUseCase checkIfExperimentEnabledUseCase, CoroutineContextProvider coroutineContextProvider) {
        this.f5232a = remoteConfigFetcherContract;
        this.b = checkIfExperimentEnabledUseCase;
        this.c = coroutineContextProvider;
    }

    public final Object a(Continuation continuation) {
        return BuildersKt.g(this.c.b(), new FetchLoginAfterCitySelectionConfigUseCase$invoke$2(this, (LoginAfterCitySelectionRemoteConfigModel) this.f5232a.a("showLoginAfterCitySelection", Reflection.a(LoginAfterCitySelectionRemoteConfigModel.class), new LoginAfterCitySelectionRemoteConfigModel()), null), continuation);
    }
}
