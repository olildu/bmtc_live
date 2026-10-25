package app.chalo.premiumbus.ui.faredetails;

import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel$$serializer;
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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType.FreshPurchase.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsFlowType$FreshPurchase;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusFareDetailsFlowType$FreshPurchase$$serializer implements GeneratedSerializer<PremiumBusFareDetailsFlowType.FreshPurchase> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusFareDetailsFlowType$FreshPurchase$$serializer f7552a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusFareDetailsFlowType$FreshPurchase$$serializer premiumBusFareDetailsFlowType$FreshPurchase$$serializer = new PremiumBusFareDetailsFlowType$FreshPurchase$$serializer();
        f7552a = premiumBusFareDetailsFlowType$FreshPurchase$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType.FreshPurchase", premiumBusFareDetailsFlowType$FreshPurchase$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("tripId", false);
        pluginGeneratedSerialDescriptor.j("configId", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("passUpsell", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c(PremiumBusPassUpsellAppModel$$serializer.f7103a);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, kSerializerC};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            str = strDecodeStringElement2;
            premiumBusPassUpsellAppModel = (PremiumBusPassUpsellAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, PremiumBusPassUpsellAppModel$$serializer.f7103a, null);
            str3 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    premiumBusPassUpsellAppModel2 = (PremiumBusPassUpsellAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, PremiumBusPassUpsellAppModel$$serializer.f7103a, premiumBusPassUpsellAppModel2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            premiumBusPassUpsellAppModel = premiumBusPassUpsellAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusFareDetailsFlowType.FreshPurchase(i, str, str2, str3, premiumBusPassUpsellAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusFareDetailsFlowType.FreshPurchase value = (PremiumBusFareDetailsFlowType.FreshPurchase) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.b;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel = value.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || premiumBusPassUpsellAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, PremiumBusPassUpsellAppModel$$serializer.f7103a, premiumBusPassUpsellAppModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
