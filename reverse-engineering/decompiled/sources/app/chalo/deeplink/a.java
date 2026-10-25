package app.chalo.deeplink;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DeepLinkNavigationMapper.TrackingAdditionalFeaturesPayload.Companion companion = DeepLinkNavigationMapper.TrackingAdditionalFeaturesPayload.INSTANCE;
        return new ArrayListSerializer(StringSerializer.f18170a);
    }
}
