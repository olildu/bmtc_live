package app.chalo.superpass.data.models;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/superpass/data/models/DigitalTripReceiptRemoteApiRequestModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/superpass/data/models/DigitalTripReceiptRemoteApiRequestModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class DigitalTripReceiptRemoteApiRequestModel$$serializer implements GeneratedSerializer<DigitalTripReceiptRemoteApiRequestModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DigitalTripReceiptRemoteApiRequestModel$$serializer f9526a;
    private static final SerialDescriptor descriptor;

    static {
        DigitalTripReceiptRemoteApiRequestModel$$serializer digitalTripReceiptRemoteApiRequestModel$$serializer = new DigitalTripReceiptRemoteApiRequestModel$$serializer();
        f9526a = digitalTripReceiptRemoteApiRequestModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.superpass.data.models.DigitalTripReceiptRemoteApiRequestModel", digitalTripReceiptRemoteApiRequestModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("appVer", false);
        pluginGeneratedSerialDescriptor.j("passActivations", true);
        pluginGeneratedSerialDescriptor.j("ticketActivations", true);
        pluginGeneratedSerialDescriptor.j("passInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = DigitalTripReceiptRemoteApiRequestModel.e;
        return new KSerializer[]{IntSerializer.f18146a, BuiltinSerializersKt.c((KSerializer) lazyArr[1].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[2].getValue()), BuiltinSerializersKt.c(PassInfoApiRequestModel$$serializer.f9530a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        int i;
        List list;
        List list2;
        PassInfoApiRequestModel passInfoApiRequestModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = DigitalTripReceiptRemoteApiRequestModel.e;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            passInfoApiRequestModel = (PassInfoApiRequestModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, PassInfoApiRequestModel$$serializer.f9530a, null);
            i = 15;
            list = list3;
        } else {
            boolean z = true;
            iDecodeIntElement = 0;
            List list4 = null;
            List list5 = null;
            PassInfoApiRequestModel passInfoApiRequestModel2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list4);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list5);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    passInfoApiRequestModel2 = (PassInfoApiRequestModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, PassInfoApiRequestModel$$serializer.f9530a, passInfoApiRequestModel2);
                    i2 |= 8;
                }
            }
            i = i2;
            list = list4;
            list2 = list5;
            passInfoApiRequestModel = passInfoApiRequestModel2;
        }
        int i3 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DigitalTripReceiptRemoteApiRequestModel(i, i3, list, list2, passInfoApiRequestModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        DigitalTripReceiptRemoteApiRequestModel value = (DigitalTripReceiptRemoteApiRequestModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = DigitalTripReceiptRemoteApiRequestModel.e;
        int i = value.f9525a;
        PassInfoApiRequestModel passInfoApiRequestModel = value.d;
        List list = value.c;
        List list2 = value.b;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, i);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || passInfoApiRequestModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, PassInfoApiRequestModel$$serializer.f9530a, passInfoApiRequestModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
