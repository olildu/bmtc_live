package app.chalo.premiumbus.managers;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel$$serializer;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel$$serializer;
import app.chalo.premiumbus.ui.productselection.PBProductConfigAppModel;
import app.chalo.premiumbus.ui.productselection.PBProductConfigAppModel$$serializer;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/managers/PremiumBusPurchaseInfoState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/managers/PremiumBusPurchaseInfoState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumBusPurchaseInfoState$$serializer implements GeneratedSerializer<PremiumBusPurchaseInfoState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumBusPurchaseInfoState$$serializer f7274a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumBusPurchaseInfoState$$serializer premiumBusPurchaseInfoState$$serializer = new PremiumBusPurchaseInfoState$$serializer();
        f7274a = premiumBusPurchaseInfoState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.managers.PremiumBusPurchaseInfoState", premiumBusPurchaseInfoState$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("productConfigItemSelected", false);
        pluginGeneratedSerialDescriptor.j("originDestinationSelected", false);
        pluginGeneratedSerialDescriptor.j("slotSelected", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(PBProductConfigAppModel$$serializer.f7690a), BuiltinSerializersKt.c(PBOriginDestinationAppModel$$serializer.f7092a), BuiltinSerializersKt.c(PBAvailableSlotsTripAppModel$$serializer.f7090a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        PBProductConfigAppModel pBProductConfigAppModel;
        PBOriginDestinationAppModel pBOriginDestinationAppModel;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        PBProductConfigAppModel pBProductConfigAppModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            pBProductConfigAppModel = (PBProductConfigAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PBProductConfigAppModel$$serializer.f7690a, null);
            pBOriginDestinationAppModel = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, null);
            pBAvailableSlotsTripAppModel = (PBAvailableSlotsTripAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PBAvailableSlotsTripAppModel$$serializer.f7090a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            PBOriginDestinationAppModel pBOriginDestinationAppModel2 = null;
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    pBProductConfigAppModel2 = (PBProductConfigAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, PBProductConfigAppModel$$serializer.f7690a, pBProductConfigAppModel2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, pBOriginDestinationAppModel2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    pBAvailableSlotsTripAppModel2 = (PBAvailableSlotsTripAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PBAvailableSlotsTripAppModel$$serializer.f7090a, pBAvailableSlotsTripAppModel2);
                    i2 |= 4;
                }
            }
            i = i2;
            pBProductConfigAppModel = pBProductConfigAppModel2;
            pBOriginDestinationAppModel = pBOriginDestinationAppModel2;
            pBAvailableSlotsTripAppModel = pBAvailableSlotsTripAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumBusPurchaseInfoState(i, pBProductConfigAppModel, pBOriginDestinationAppModel, pBAvailableSlotsTripAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumBusPurchaseInfoState value = (PremiumBusPurchaseInfoState) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, PBProductConfigAppModel$$serializer.f7690a, value.f7273a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, PBOriginDestinationAppModel$$serializer.f7092a, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, PBAvailableSlotsTripAppModel$$serializer.f7090a, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
