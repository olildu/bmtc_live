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
import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/juspay/JusPayResponsePayload.GetUpiSessionToken.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/juspay/JusPayResponsePayload$GetUpiSessionToken;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class JusPayResponsePayload$GetUpiSessionToken$$serializer implements GeneratedSerializer<JusPayResponsePayload.GetUpiSessionToken> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JusPayResponsePayload$GetUpiSessionToken$$serializer f3991a;
    private static final SerialDescriptor descriptor;

    static {
        JusPayResponsePayload$GetUpiSessionToken$$serializer jusPayResponsePayload$GetUpiSessionToken$$serializer = new JusPayResponsePayload$GetUpiSessionToken$$serializer();
        f3991a = jusPayResponsePayload$GetUpiSessionToken$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.juspay.JusPayResponsePayload.GetUpiSessionToken", jusPayResponsePayload$GetUpiSessionToken$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("jusPayAction", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("isDeviceBound", false);
        pluginGeneratedSerialDescriptor.j("isDeviceActivated", false);
        pluginGeneratedSerialDescriptor.j("prefix", false);
        pluginGeneratedSerialDescriptor.j("customerMobileNumber", false);
        pluginGeneratedSerialDescriptor.j("deviceFingerPrint", false);
        pluginGeneratedSerialDescriptor.j("otherInfo", false);
        pluginGeneratedSerialDescriptor.j("vpaAccounts", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = JusPayResponsePayload.GetUpiSessionToken.l;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[9].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        Boolean bool2;
        String str5;
        String str6;
        String str7;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = JusPayResponsePayload.GetUpiSessionToken.l;
        int i2 = 9;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            str = str15;
            str2 = str14;
            str4 = str13;
            str3 = str12;
            bool2 = bool3;
            i = 1023;
            bool = bool4;
            str5 = str11;
            str7 = str10;
            str6 = str9;
        } else {
            boolean z = true;
            int i3 = 0;
            List list2 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            String str20 = null;
            String str21 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        break;
                    case 0:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str8);
                        i3 |= 1;
                        i2 = 9;
                        break;
                    case 1:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str21);
                        i3 |= 2;
                        i2 = 9;
                        break;
                    case 2:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str20);
                        i3 |= 4;
                        i2 = 9;
                        break;
                    case 3:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.f18123a, bool6);
                        i3 |= 8;
                        i2 = 9;
                        break;
                    case 4:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, bool5);
                        i3 |= 16;
                        i2 = 9;
                        break;
                    case 5:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str18);
                        i3 |= 32;
                        i2 = 9;
                        break;
                    case 6:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str19);
                        i3 |= 64;
                        i2 = 9;
                        break;
                    case 7:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str17);
                        i3 |= 128;
                        i2 = 9;
                        break;
                    case 8:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str16);
                        i3 |= 256;
                        i2 = 9;
                        break;
                    case 9:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, (DeserializationStrategy) lazyArr[i2].getValue(), list2);
                        i3 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            list = list2;
            str = str16;
            str2 = str17;
            str3 = str18;
            str4 = str19;
            bool = bool5;
            bool2 = bool6;
            str5 = str20;
            str6 = str8;
            str7 = str21;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new JusPayResponsePayload.GetUpiSessionToken(i, str6, str7, str5, bool2, bool, str3, str4, str2, str, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JusPayResponsePayload.GetUpiSessionToken value = (JusPayResponsePayload.GetUpiSessionToken) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        JusPayResponsePayload.GetUpiSessionToken.Companion companion = JusPayResponsePayload.GetUpiSessionToken.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f3990a);
        Lazy[] lazyArr = JusPayResponsePayload.GetUpiSessionToken.l;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.d);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
