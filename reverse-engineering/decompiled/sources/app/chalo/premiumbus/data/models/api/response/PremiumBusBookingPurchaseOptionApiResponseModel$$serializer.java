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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/api/response/PremiumBusBookingPurchaseOptionApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PremiumBusBookingPurchaseOptionApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusBookingPurchaseOptionApiResponseModel$$serializer implements GeneratedSerializer<PremiumBusBookingPurchaseOptionApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusBookingPurchaseOptionApiResponseModel$$serializer f7041a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusBookingPurchaseOptionApiResponseModel$$serializer premiumBusBookingPurchaseOptionApiResponseModel$$serializer = new PremiumBusBookingPurchaseOptionApiResponseModel$$serializer();
        f7041a = premiumBusBookingPurchaseOptionApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.api.response.PremiumBusBookingPurchaseOptionApiResponseModel", premiumBusBookingPurchaseOptionApiResponseModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("priority", false);
        pluginGeneratedSerialDescriptor.j("optionType", false);
        pluginGeneratedSerialDescriptor.j(ErrorBundle.DETAIL_ENTRY, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(IntSerializer.f18146a), BuiltinSerializersKt.c(StringSerializer.f18170a), BuiltinSerializersKt.c(PremiumBusBookingPurchaseOptionDetailsApiResponseModel$$serializer.f7043a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Integer num;
        String str;
        PremiumBusBookingPurchaseOptionDetailsApiResponseModel premiumBusBookingPurchaseOptionDetailsApiResponseModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Integer num2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.f18146a, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, null);
            premiumBusBookingPurchaseOptionDetailsApiResponseModel = (PremiumBusBookingPurchaseOptionDetailsApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PremiumBusBookingPurchaseOptionDetailsApiResponseModel$$serializer.f7043a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            PremiumBusBookingPurchaseOptionDetailsApiResponseModel premiumBusBookingPurchaseOptionDetailsApiResponseModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.f18146a, num2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    premiumBusBookingPurchaseOptionDetailsApiResponseModel2 = (PremiumBusBookingPurchaseOptionDetailsApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PremiumBusBookingPurchaseOptionDetailsApiResponseModel$$serializer.f7043a, premiumBusBookingPurchaseOptionDetailsApiResponseModel2);
                    i2 |= 4;
                }
            }
            i = i2;
            num = num2;
            str = str2;
            premiumBusBookingPurchaseOptionDetailsApiResponseModel = premiumBusBookingPurchaseOptionDetailsApiResponseModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusBookingPurchaseOptionApiResponseModel(i, num, str, premiumBusBookingPurchaseOptionDetailsApiResponseModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusBookingPurchaseOptionApiResponseModel value = (PremiumBusBookingPurchaseOptionApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.f18146a, value.f7040a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, PremiumBusBookingPurchaseOptionDetailsApiResponseModel$$serializer.f7043a, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
