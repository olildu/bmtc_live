package app.chalo.network.mock;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/network/mock/MockApiRouteVariantSelection.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/network/mock/MockApiRouteVariantSelection;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MockApiRouteVariantSelection$$serializer implements GeneratedSerializer<MockApiRouteVariantSelection> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MockApiRouteVariantSelection$$serializer f6488a;
    private static final SerialDescriptor descriptor;

    static {
        MockApiRouteVariantSelection$$serializer mockApiRouteVariantSelection$$serializer = new MockApiRouteVariantSelection$$serializer();
        f6488a = mockApiRouteVariantSelection$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.network.mock.MockApiRouteVariantSelection", mockApiRouteVariantSelection$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("variant", false);
        pluginGeneratedSerialDescriptor.j("customResponse", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MockApiVariantJsonSerializer.f6491a, BuiltinSerializersKt.c(MockApiCustomResponse$$serializer.f6476a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        MockApiVariant mockApiVariant;
        MockApiCustomResponse mockApiCustomResponse;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        MockApiVariant mockApiVariant2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            mockApiVariant = (MockApiVariant) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MockApiVariantJsonSerializer.f6491a, null);
            mockApiCustomResponse = (MockApiCustomResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, MockApiCustomResponse$$serializer.f6476a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            MockApiCustomResponse mockApiCustomResponse2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    mockApiVariant2 = (MockApiVariant) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MockApiVariantJsonSerializer.f6491a, mockApiVariant2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    mockApiCustomResponse2 = (MockApiCustomResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, MockApiCustomResponse$$serializer.f6476a, mockApiCustomResponse2);
                    i2 |= 2;
                }
            }
            i = i2;
            mockApiVariant = mockApiVariant2;
            mockApiCustomResponse = mockApiCustomResponse2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MockApiRouteVariantSelection(i, mockApiVariant, mockApiCustomResponse);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MockApiRouteVariantSelection value = (MockApiRouteVariantSelection) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MockApiVariantJsonSerializer mockApiVariantJsonSerializer = MockApiVariantJsonSerializer.f6491a;
        MockApiVariant mockApiVariant = value.f6487a;
        MockApiCustomResponse mockApiCustomResponse = value.b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, mockApiVariantJsonSerializer, mockApiVariant);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || mockApiCustomResponse != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, MockApiCustomResponse$$serializer.f6476a, mockApiCustomResponse);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
