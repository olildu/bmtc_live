package app.chalo.validationsdk.blevalidation.domain.configuration;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.validationsdk.blevalidation.data.local.ProductValidationsDataStore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/configuration/ShouldShowBleTutorialUseCase;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShouldShowBleTutorialUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f10514a;
    public final ProductValidationsDataStore b;
    public final GetRegularBusProductValidationMethodUseCase c;
    public final CoroutineContextProvider d;

    public ShouldShowBleTutorialUseCase(UserProfileDetailsProvider userProfileDetailsProvider, ProductValidationsDataStore productValidationsDataStore, GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase, CoroutineContextProvider coroutineContextProvider) {
        this.f10514a = userProfileDetailsProvider;
        this.b = productValidationsDataStore;
        this.c = getRegularBusProductValidationMethodUseCase;
        this.d = coroutineContextProvider;
    }

    public final Object a(ValidationProduct validationProduct, Continuation continuation) {
        return BuildersKt.g(this.d.b(), new ShouldShowBleTutorialUseCase$invoke$2(this, validationProduct, null), continuation);
    }
}
