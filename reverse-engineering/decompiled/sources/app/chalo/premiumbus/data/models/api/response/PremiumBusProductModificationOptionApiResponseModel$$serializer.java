package app.chalo.premiumbus.data.models.api.response;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/api/response/PremiumBusProductModificationOptionApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PremiumBusProductModificationOptionApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusProductModificationOptionApiResponseModel$$serializer implements GeneratedSerializer<PremiumBusProductModificationOptionApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusProductModificationOptionApiResponseModel$$serializer f7049a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusProductModificationOptionApiResponseModel$$serializer premiumBusProductModificationOptionApiResponseModel$$serializer = new PremiumBusProductModificationOptionApiResponseModel$$serializer();
        f7049a = premiumBusProductModificationOptionApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.api.response.PremiumBusProductModificationOptionApiResponseModel", premiumBusProductModificationOptionApiResponseModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("actionId", false);
        pluginGeneratedSerialDescriptor.j("actionName", false);
        pluginGeneratedSerialDescriptor.j("actionSubText", false);
        pluginGeneratedSerialDescriptor.j("actionIcon", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("inActiveReason", false);
        pluginGeneratedSerialDescriptor.j("contactNumber", false);
        pluginGeneratedSerialDescriptor.j("textColour", false);
        pluginGeneratedSerialDescriptor.j("additionalInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(BooleanSerializer.f18123a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(PremiumBusProductModificationAdditionalInfoApiResponseModel$$serializer.f7047a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        PremiumBusProductModificationAdditionalInfoApiResponseModel premiumBusProductModificationAdditionalInfoApiResponseModel;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            premiumBusProductModificationAdditionalInfoApiResponseModel = (PremiumBusProductModificationAdditionalInfoApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, PremiumBusProductModificationAdditionalInfoApiResponseModel$$serializer.f7047a, null);
            str2 = str14;
            str3 = str13;
            str7 = str12;
            i = 511;
            bool = bool2;
            str6 = str11;
            str5 = str10;
            str4 = str9;
        } else {
            boolean z = true;
            int i3 = 0;
            String str15 = null;
            PremiumBusProductModificationAdditionalInfoApiResponseModel premiumBusProductModificationAdditionalInfoApiResponseModel2 = null;
            String str16 = null;
            String str17 = null;
            Boolean bool3 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        break;
                    case 0:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str8);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str18);
                        i3 |= 2;
                        i2 = 7;
                        break;
                    case 2:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str19);
                        i3 |= 4;
                        i2 = 7;
                        break;
                    case 3:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str20);
                        i3 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, bool3);
                        i3 |= 16;
                        i2 = 7;
                        break;
                    case 5:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str17);
                        i3 |= 32;
                        i2 = 7;
                        break;
                    case 6:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str16);
                        i3 |= 64;
                        break;
                    case 7:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str15);
                        i3 |= 128;
                        break;
                    case 8:
                        premiumBusProductModificationAdditionalInfoApiResponseModel2 = (PremiumBusProductModificationAdditionalInfoApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, PremiumBusProductModificationAdditionalInfoApiResponseModel$$serializer.f7047a, premiumBusProductModificationAdditionalInfoApiResponseModel2);
                        i3 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str15;
            premiumBusProductModificationAdditionalInfoApiResponseModel = premiumBusProductModificationAdditionalInfoApiResponseModel2;
            str2 = str16;
            str3 = str17;
            bool = bool3;
            str4 = str8;
            str5 = str18;
            str6 = str19;
            str7 = str20;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusProductModificationOptionApiResponseModel(i, str4, str5, str6, str7, bool, str3, str2, str, premiumBusProductModificationAdditionalInfoApiResponseModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusProductModificationOptionApiResponseModel value = (PremiumBusProductModificationOptionApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f7048a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, PremiumBusProductModificationAdditionalInfoApiResponseModel$$serializer.f7047a, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
