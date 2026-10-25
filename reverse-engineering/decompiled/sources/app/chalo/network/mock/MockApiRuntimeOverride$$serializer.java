package app.chalo.network.mock;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/network/mock/MockApiRuntimeOverride.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/network/mock/MockApiRuntimeOverride;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MockApiRuntimeOverride$$serializer implements GeneratedSerializer<MockApiRuntimeOverride> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MockApiRuntimeOverride$$serializer f6490a;
    private static final SerialDescriptor descriptor;

    static {
        MockApiRuntimeOverride$$serializer mockApiRuntimeOverride$$serializer = new MockApiRuntimeOverride$$serializer();
        f6490a = mockApiRuntimeOverride$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.network.mock.MockApiRuntimeOverride", mockApiRuntimeOverride$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("apiSource", true);
        pluginGeneratedSerialDescriptor.j("routeVariants", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ApiSourceJsonSerializer.f6471a, MockApiRuntimeOverride.c[1].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        ApiSource apiSource;
        Map map;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MockApiRuntimeOverride.c;
        ApiSource apiSource2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            apiSource = (ApiSource) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, ApiSourceJsonSerializer.f6471a, null);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Map map2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    apiSource2 = (ApiSource) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, ApiSourceJsonSerializer.f6471a, apiSource2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), map2);
                    i2 |= 2;
                }
            }
            i = i2;
            apiSource = apiSource2;
            map = map2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MockApiRuntimeOverride(i, apiSource, map);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MockApiRuntimeOverride value = (MockApiRuntimeOverride) obj;
        Intrinsics.i(value, "value");
        Map map = value.b;
        ApiSource apiSource = value.f6489a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MockApiRuntimeOverride.c;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || apiSource != ApiSource.REAL) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ApiSourceJsonSerializer.f6471a, apiSource);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.d(map, MapsKt.d())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), map);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
