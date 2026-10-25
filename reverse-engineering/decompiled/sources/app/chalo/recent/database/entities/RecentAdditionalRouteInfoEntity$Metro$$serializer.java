package app.chalo.recent.database.entities;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity.Metro.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity$Metro;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RecentAdditionalRouteInfoEntity$Metro$$serializer implements GeneratedSerializer<RecentAdditionalRouteInfoEntity.Metro> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecentAdditionalRouteInfoEntity$Metro$$serializer f8933a;
    private static final SerialDescriptor descriptor;

    static {
        RecentAdditionalRouteInfoEntity$Metro$$serializer recentAdditionalRouteInfoEntity$Metro$$serializer = new RecentAdditionalRouteInfoEntity$Metro$$serializer();
        f8933a = recentAdditionalRouteInfoEntity$Metro$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.recent.database.entities.RecentAdditionalRouteInfoEntity.Metro", recentAdditionalRouteInfoEntity$Metro$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("lineColor", false);
        pluginGeneratedSerialDescriptor.j("mode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.f18170a, RecentAdditionalRouteInfoEntity.Metro.c[1].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String strDecodeStringElement;
        ChaloTransitMode chaloTransitMode;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RecentAdditionalRouteInfoEntity.Metro.c;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            chaloTransitMode = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            ChaloTransitMode chaloTransitMode2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    chaloTransitMode2 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), chaloTransitMode2);
                    i2 |= 2;
                }
            }
            i = i2;
            strDecodeStringElement = strDecodeStringElement2;
            chaloTransitMode = chaloTransitMode2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecentAdditionalRouteInfoEntity.Metro(i, strDecodeStringElement, chaloTransitMode);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RecentAdditionalRouteInfoEntity.Metro value = (RecentAdditionalRouteInfoEntity.Metro) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RecentAdditionalRouteInfoEntity.Metro.c;
        String str = value.f8932a;
        ChaloTransitMode chaloTransitMode = value.b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || chaloTransitMode != ChaloTransitMode.METRO) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), chaloTransitMode);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
