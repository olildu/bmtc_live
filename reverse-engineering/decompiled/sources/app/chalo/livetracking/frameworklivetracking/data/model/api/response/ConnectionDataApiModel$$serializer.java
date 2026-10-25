package app.chalo.livetracking.frameworklivetracking.data.model.api.response;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/frameworklivetracking/data/model/api/response/ConnectionDataApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/ConnectionDataApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ConnectionDataApiModel$$serializer implements GeneratedSerializer<ConnectionDataApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConnectionDataApiModel$$serializer f4279a;
    private static final SerialDescriptor descriptor;

    static {
        ConnectionDataApiModel$$serializer connectionDataApiModel$$serializer = new ConnectionDataApiModel$$serializer();
        f4279a = connectionDataApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.frameworklivetracking.data.model.api.response.ConnectionDataApiModel", connectionDataApiModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("baseUrl", false);
        pluginGeneratedSerialDescriptor.j("forceReconnection", true);
        pluginGeneratedSerialDescriptor.j("path", false);
        pluginGeneratedSerialDescriptor.j("randomizationFactor", false);
        pluginGeneratedSerialDescriptor.j("reconnectionDelay", true);
        pluginGeneratedSerialDescriptor.j("reconnectionDelayMax", true);
        pluginGeneratedSerialDescriptor.j("timeout", true);
        pluginGeneratedSerialDescriptor.j("transports", true);
        pluginGeneratedSerialDescriptor.j("enableCookie", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ConnectionDataApiModel.j;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        KSerializer kSerializerC = BuiltinSerializersKt.c((KSerializer) lazyArr[7].getValue());
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(booleanSerializer);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{stringSerializer, booleanSerializer, stringSerializer, DoubleSerializer.f18137a, longSerializer, longSerializer, longSerializer, kSerializerC, kSerializerC2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        boolean z;
        List list;
        Boolean bool;
        long j;
        String str;
        String str2;
        double d;
        long j2;
        long j3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ConnectionDataApiModel.j;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 3);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            str = strDecodeStringElement;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, null);
            j = jDecodeLongElement2;
            i = 511;
            str2 = strDecodeStringElement2;
            z = zDecodeBooleanElement;
            d = dDecodeDoubleElement;
            j2 = jDecodeLongElement;
            j3 = jDecodeLongElement3;
        } else {
            long jDecodeLongElement4 = 0;
            boolean z2 = true;
            int i2 = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            double dDecodeDoubleElement2 = 0.0d;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            boolean zDecodeBooleanElement2 = false;
            List list2 = null;
            Boolean bool2 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), list2);
                        i2 |= 128;
                        break;
                    case 8:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool2);
                        i2 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            z = zDecodeBooleanElement2;
            list = list2;
            bool = bool2;
            j = jDecodeLongElement4;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            d = dDecodeDoubleElement2;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ConnectionDataApiModel(i, str, z, str2, d, j2, j, j3, list, bool);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ConnectionDataApiModel value = (ConnectionDataApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ConnectionDataApiModel.j;
        String str = value.f4278a;
        Boolean bool = value.i;
        List list = value.h;
        long j = value.g;
        long j2 = value.f;
        long j3 = value.e;
        boolean z = value.b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || j3 != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, j3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || j2 != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || j != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.d(bool, Boolean.FALSE)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
