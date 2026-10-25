package app.chalo.providers.cityprovider.impl.data.models.api;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/providers/cityprovider/impl/data/models/api/MetaDataCityAgencyResponseApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataCityAgencyResponseApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MetaDataCityAgencyResponseApiModel$$serializer implements GeneratedSerializer<MetaDataCityAgencyResponseApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MetaDataCityAgencyResponseApiModel$$serializer f8839a;
    private static final SerialDescriptor descriptor;

    static {
        MetaDataCityAgencyResponseApiModel$$serializer metaDataCityAgencyResponseApiModel$$serializer = new MetaDataCityAgencyResponseApiModel$$serializer();
        f8839a = metaDataCityAgencyResponseApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.providers.cityprovider.impl.data.models.api.MetaDataCityAgencyResponseApiModel", metaDataCityAgencyResponseApiModel$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("agencyName", false);
        pluginGeneratedSerialDescriptor.j("priority", true);
        pluginGeneratedSerialDescriptor.j("liveFeed", true);
        pluginGeneratedSerialDescriptor.j("passBooking", true);
        pluginGeneratedSerialDescriptor.j("newPassBooking", true);
        pluginGeneratedSerialDescriptor.j("isProductAvailable", true);
        pluginGeneratedSerialDescriptor.j("isOnlineCardRechargeAvailable", true);
        pluginGeneratedSerialDescriptor.j("enableQuickPay", true);
        pluginGeneratedSerialDescriptor.j("enableWallet", true);
        pluginGeneratedSerialDescriptor.j("enableClosedLoopWallet", true);
        pluginGeneratedSerialDescriptor.j("isOndcProductAvailable", true);
        pluginGeneratedSerialDescriptor.j("ticketBooking", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{BuiltinSerializersKt.c(StringSerializer.f18170a), IntSerializer.f18146a, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            i5 = 4095;
            str = str2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            z = zDecodeBooleanElement10;
            z2 = zDecodeBooleanElement9;
            z3 = zDecodeBooleanElement7;
            z4 = zDecodeBooleanElement6;
            z5 = zDecodeBooleanElement5;
            z6 = zDecodeBooleanElement3;
            z7 = zDecodeBooleanElement8;
            z8 = zDecodeBooleanElement4;
            z9 = zDecodeBooleanElement2;
            i = iDecodeIntElement;
        } else {
            boolean z10 = true;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            boolean zDecodeBooleanElement14 = false;
            boolean zDecodeBooleanElement15 = false;
            boolean zDecodeBooleanElement16 = false;
            boolean zDecodeBooleanElement17 = false;
            boolean zDecodeBooleanElement18 = false;
            boolean zDecodeBooleanElement19 = false;
            int iDecodeIntElement2 = 0;
            String str3 = null;
            boolean zDecodeBooleanElement20 = false;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 0:
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str3);
                        i5 |= 1;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        zDecodeBooleanElement19 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i5 |= 4;
                        break;
                    case 3:
                        zDecodeBooleanElement16 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement18 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement15 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i5 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement14 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i5 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i5 |= 128;
                        break;
                    case 8:
                        zDecodeBooleanElement17 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i5 |= 256;
                        break;
                    case 9:
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i5 |= 512;
                        break;
                    case 10:
                        zDecodeBooleanElement20 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i5 |= 1024;
                        break;
                    case 11:
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i5 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement11;
            str = str3;
            z = zDecodeBooleanElement20;
            z2 = zDecodeBooleanElement12;
            z3 = zDecodeBooleanElement13;
            z4 = zDecodeBooleanElement14;
            z5 = zDecodeBooleanElement15;
            z6 = zDecodeBooleanElement16;
            z7 = zDecodeBooleanElement17;
            z8 = zDecodeBooleanElement18;
            z9 = zDecodeBooleanElement19;
            i = iDecodeIntElement2;
        }
        int i6 = i5;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MetaDataCityAgencyResponseApiModel(i6, str, i, z9, z6, z8, z5, z4, z3, z7, z2, z, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MetaDataCityAgencyResponseApiModel value = (MetaDataCityAgencyResponseApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        String str = value.f8838a;
        boolean z = value.l;
        boolean z2 = value.k;
        boolean z3 = value.j;
        boolean z4 = value.i;
        boolean z5 = value.h;
        boolean z6 = value.g;
        boolean z7 = value.f;
        boolean z8 = value.e;
        boolean z9 = value.d;
        boolean z10 = value.c;
        int i = value.b;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, str);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || z10) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, z10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || z9) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, z9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || z8) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, z8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || z7) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, z7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || z6) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || z5) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, z5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 9, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 10, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 11, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
