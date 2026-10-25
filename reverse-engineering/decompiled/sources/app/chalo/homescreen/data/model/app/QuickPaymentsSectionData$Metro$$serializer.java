package app.chalo.homescreen.data.model.app;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/homescreen/data/model/app/QuickPaymentsSectionData.Metro.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionData$Metro;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class QuickPaymentsSectionData$Metro$$serializer implements GeneratedSerializer<QuickPaymentsSectionData.Metro> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final QuickPaymentsSectionData$Metro$$serializer f3790a;
    private static final SerialDescriptor descriptor;

    static {
        QuickPaymentsSectionData$Metro$$serializer quickPaymentsSectionData$Metro$$serializer = new QuickPaymentsSectionData$Metro$$serializer();
        f3790a = quickPaymentsSectionData$Metro$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.homescreen.data.model.app.QuickPaymentsSectionData.Metro", quickPaymentsSectionData$Metro$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("metroCardData", false);
        pluginGeneratedSerialDescriptor.j("isFullWidth", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MetroCardAppModel$$serializer.f3760a, BooleanSerializer.f18123a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        MetroCardAppModel metroCardAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            metroCardAppModel = (MetroCardAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MetroCardAppModel$$serializer.f3760a, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            i = 3;
        } else {
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            MetroCardAppModel metroCardAppModel2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    metroCardAppModel2 = (MetroCardAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MetroCardAppModel$$serializer.f3760a, metroCardAppModel2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i2 |= 2;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i2;
            metroCardAppModel = metroCardAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new QuickPaymentsSectionData.Metro(i, metroCardAppModel, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        QuickPaymentsSectionData.Metro value = (QuickPaymentsSectionData.Metro) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        QuickPaymentsSectionData.Metro.Companion companion = QuickPaymentsSectionData.Metro.INSTANCE;
        MetroCardAppModel$$serializer metroCardAppModel$$serializer = MetroCardAppModel$$serializer.f3760a;
        MetroCardAppModel metroCardAppModel = value.b;
        boolean z = value.c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, metroCardAppModel$$serializer, metroCardAppModel);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
