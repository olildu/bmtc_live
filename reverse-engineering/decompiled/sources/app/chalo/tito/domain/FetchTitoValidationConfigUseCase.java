package app.chalo.tito.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.usecase.FeedbackTags;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/tito/domain/FetchTitoValidationConfigUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchTitoValidationConfigUseCase {
    public static final List h = CollectionsKt.S(new FeedbackTags(1, "Forgot to tap out"), new FeedbackTags(2, "Was in a hurry"), new FeedbackTags(3, "Not sure how to tap"), new FeedbackTags(4, "Overcrowded bus"), new FeedbackTags(5, "Technical issues with machine"), new FeedbackTags(6, "Other"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f9652a;
    public final CityProvider b;
    public final CrashlyticsLogger c;
    public final ChaloBuildConfig d;
    public final CoroutineContextProvider e;
    public final BasicInfoContract f;
    public final LinkedHashMap g = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/domain/FetchTitoValidationConfigUseCase$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FetchTitoValidationConfigUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature, CoroutineContextProvider coroutineContextProvider, CityProvider cityProvider) {
        this.f9652a = chaloConfigFeature;
        this.b = cityProvider;
        this.c = crashlyticsLogger;
        this.d = chaloBuildConfig;
        this.e = coroutineContextProvider;
        this.f = basicInfoContract;
    }

    public final Object a(ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        return BuildersKt.g(this.e.getDefault(), new FetchTitoValidationConfigUseCase$invoke$2(validationProduct, this, null), continuationImpl);
    }
}
