package app.chalo.ncmc.data.apiresponsemodel;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ncmc/data/apiresponsemodel/ClosedCardInfoApiResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/ClosedCardInfoApiResponse;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ClosedCardInfoApiResponse$$serializer implements GeneratedSerializer<ClosedCardInfoApiResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ClosedCardInfoApiResponse$$serializer f6094a;
    private static final SerialDescriptor descriptor;

    static {
        ClosedCardInfoApiResponse$$serializer closedCardInfoApiResponse$$serializer = new ClosedCardInfoApiResponse$$serializer();
        f6094a = closedCardInfoApiResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ncmc.data.apiresponsemodel.ClosedCardInfoApiResponse", closedCardInfoApiResponse$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("cardDetails", true);
        pluginGeneratedSerialDescriptor.j("activePasses", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(ClosedCardDetailsApiResponse$$serializer.f6092a), BuiltinSerializersKt.c((KSerializer) ClosedCardInfoApiResponse.c[1].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        ClosedCardDetailsApiResponse closedCardDetailsApiResponse;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ClosedCardInfoApiResponse.c;
        ClosedCardDetailsApiResponse closedCardDetailsApiResponse2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            closedCardDetailsApiResponse = (ClosedCardDetailsApiResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ClosedCardDetailsApiResponse$$serializer.f6092a, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    closedCardDetailsApiResponse2 = (ClosedCardDetailsApiResponse) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ClosedCardDetailsApiResponse$$serializer.f6092a, closedCardDetailsApiResponse2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list2);
                    i2 |= 2;
                }
            }
            i = i2;
            closedCardDetailsApiResponse = closedCardDetailsApiResponse2;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ClosedCardInfoApiResponse(i, closedCardDetailsApiResponse, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ClosedCardInfoApiResponse value = (ClosedCardInfoApiResponse) obj;
        Intrinsics.i(value, "value");
        List list = value.b;
        ClosedCardDetailsApiResponse closedCardDetailsApiResponse = value.f6093a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ClosedCardInfoApiResponse.c;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || closedCardDetailsApiResponse != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, ClosedCardDetailsApiResponse$$serializer.f6092a, closedCardDetailsApiResponse);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
