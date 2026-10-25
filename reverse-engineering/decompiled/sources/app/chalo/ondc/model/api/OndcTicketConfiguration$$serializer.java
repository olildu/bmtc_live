package app.chalo.ondc.model.api;

import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.instantticket.config.models.BrandingDetails$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductValidationType;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ondc/model/api/OndcTicketConfiguration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ondc/model/api/OndcTicketConfiguration;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OndcTicketConfiguration$$serializer implements GeneratedSerializer<OndcTicketConfiguration> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OndcTicketConfiguration$$serializer f6729a;
    private static final SerialDescriptor descriptor;

    static {
        OndcTicketConfiguration$$serializer ondcTicketConfiguration$$serializer = new OndcTicketConfiguration$$serializer();
        f6729a = ondcTicketConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ondc.model.api.OndcTicketConfiguration", ondcTicketConfiguration$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("isVisible", false);
        pluginGeneratedSerialDescriptor.j("productValidationType", false);
        pluginGeneratedSerialDescriptor.j("minAppVer", false);
        pluginGeneratedSerialDescriptor.j("branding", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = OndcTicketConfiguration.l;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, BuiltinSerializersKt.c(booleanSerializer), lazyArr[6].getValue(), BuiltinSerializersKt.c(IntSerializer.f18146a), BrandingDetails$$serializer.f3828a, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        BrandingDetails brandingDetails;
        Integer num;
        ProductValidationType productValidationType;
        Boolean bool;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String strDecodeStringElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OndcTicketConfiguration.l;
        int i2 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, null);
            ProductValidationType productValidationType2 = (ProductValidationType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, null);
            BrandingDetails brandingDetails2 = (BrandingDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, BrandingDetails$$serializer.f3828a, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            productValidationType = productValidationType2;
            str = strDecodeStringElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            str5 = strDecodeStringElement6;
            num = num2;
            bool = bool2;
            str4 = strDecodeStringElement5;
            brandingDetails = brandingDetails2;
            z = zDecodeBooleanElement;
            str3 = strDecodeStringElement4;
            i = 2047;
            str2 = strDecodeStringElement3;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            BrandingDetails brandingDetails3 = null;
            Integer num3 = null;
            ProductValidationType productValidationType3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            int i3 = 0;
            Boolean bool3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 10;
                        break;
                    case 0:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 10;
                        break;
                    case 1:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 10;
                        break;
                    case 2:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 10;
                        break;
                    case 3:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 10;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, bool3);
                        i3 |= 32;
                        break;
                    case 6:
                        productValidationType3 = (ProductValidationType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), productValidationType3);
                        i3 |= 64;
                        break;
                    case 7:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, num3);
                        i3 |= 128;
                        break;
                    case 8:
                        brandingDetails3 = (BrandingDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, BrandingDetails$$serializer.f3828a, brandingDetails3);
                        i3 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        break;
                    case 10:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            brandingDetails = brandingDetails3;
            num = num3;
            productValidationType = productValidationType3;
            bool = bool3;
            i = i3;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            strDecodeStringElement = strDecodeStringElement12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OndcTicketConfiguration(i, str, str2, str3, str4, z, bool, productValidationType, num, brandingDetails, str5, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OndcTicketConfiguration value = (OndcTicketConfiguration) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OndcTicketConfiguration.l;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f6728a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.f18146a, value.h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, BrandingDetails$$serializer.f3828a, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.j);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
