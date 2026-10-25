package app.chalo.domain;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2525a;

    public /* synthetic */ a(int i) {
        this.f2525a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2525a) {
            case 0:
                IsNewCardExperienceEnabledUseCase.CardOptionsConfig.Companion companion = IsNewCardExperienceEnabledUseCase.CardOptionsConfig.INSTANCE;
                return new ArrayListSerializer(IsNewCardExperienceEnabledUseCase$CityCardOptions$$serializer.f2510a);
            default:
                IsNewCardExperienceEnabledUseCase.CityCardOptions.Companion companion2 = IsNewCardExperienceEnabledUseCase.CityCardOptions.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
        }
    }
}
