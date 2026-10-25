package app.chalo.juspay;

import java.util.List;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/juspay/JusPayResultDataType.UpiSessionToken.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/juspay/JusPayResultDataType$UpiSessionToken;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class JusPayResultDataType$UpiSessionToken$$serializer implements GeneratedSerializer<JusPayResultDataType.UpiSessionToken> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JusPayResultDataType$UpiSessionToken$$serializer f4001a;
    private static final SerialDescriptor descriptor;

    static {
        JusPayResultDataType$UpiSessionToken$$serializer jusPayResultDataType$UpiSessionToken$$serializer = new JusPayResultDataType$UpiSessionToken$$serializer();
        f4001a = jusPayResultDataType$UpiSessionToken$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.juspay.JusPayResultDataType.UpiSessionToken", jusPayResultDataType$UpiSessionToken$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("upiSessionStatus", false);
        pluginGeneratedSerialDescriptor.j("isDeviceBound", false);
        pluginGeneratedSerialDescriptor.j("isDeviceActivated", false);
        pluginGeneratedSerialDescriptor.j("requestIdPrefix", false);
        pluginGeneratedSerialDescriptor.j("mobileNumber", false);
        pluginGeneratedSerialDescriptor.j("upiAccounts", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = JusPayResultDataType.UpiSessionToken.h;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{lazyArr[0].getValue(), booleanSerializer, booleanSerializer, stringSerializer, stringSerializer, lazyArr[5].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        int i;
        boolean z2;
        JusPayUpiSessionStatus jusPayUpiSessionStatus;
        String str;
        String str2;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = JusPayResultDataType.UpiSessionToken.h;
        int i2 = 3;
        int i3 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            JusPayUpiSessionStatus jusPayUpiSessionStatus2 = (JusPayUpiSessionStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            jusPayUpiSessionStatus = jusPayUpiSessionStatus2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement2;
            z = zDecodeBooleanElement2;
            i = 63;
            z2 = zDecodeBooleanElement;
        } else {
            int i4 = 1;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            JusPayUpiSessionStatus jusPayUpiSessionStatus3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            List list2 = null;
            int i5 = 0;
            while (i4 != 0) {
                int i6 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i3 = i6;
                        i4 = i3;
                        i2 = 3;
                        break;
                    case 0:
                        jusPayUpiSessionStatus3 = (JusPayUpiSessionStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), jusPayUpiSessionStatus3);
                        i5 |= 1;
                        i3 = i6;
                        i2 = 3;
                        break;
                    case 1:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i5 |= 2;
                        i3 = i6;
                        break;
                    case 2:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i5 |= 4;
                        i3 = i6;
                        break;
                    case 3:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i5 |= 8;
                        i3 = i6;
                        break;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i3 = i6;
                        break;
                    case 5:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list2);
                        i5 |= 32;
                        i3 = i6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement3;
            i = i5;
            z2 = zDecodeBooleanElement4;
            jusPayUpiSessionStatus = jusPayUpiSessionStatus3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new JusPayResultDataType.UpiSessionToken(i, jusPayUpiSessionStatus, z2, z, str, str2, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JusPayResultDataType.UpiSessionToken value = (JusPayResultDataType.UpiSessionToken) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = JusPayResultDataType.UpiSessionToken.h;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), value.b);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.c);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
