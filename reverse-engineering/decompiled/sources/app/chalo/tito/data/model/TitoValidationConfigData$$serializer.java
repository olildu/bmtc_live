package app.chalo.tito.data.model;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/tito/data/model/TitoValidationConfigData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/tito/data/model/TitoValidationConfigData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TitoValidationConfigData$$serializer implements GeneratedSerializer<TitoValidationConfigData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TitoValidationConfigData$$serializer f9645a;
    private static final SerialDescriptor descriptor;

    static {
        TitoValidationConfigData$$serializer titoValidationConfigData$$serializer = new TitoValidationConfigData$$serializer();
        f9645a = titoValidationConfigData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.tito.data.model.TitoValidationConfigData", titoValidationConfigData$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("titoValidationConstraints", false);
        pluginGeneratedSerialDescriptor.j("missedTapOutReasons", true);
        pluginGeneratedSerialDescriptor.j("titoNotificationJobConfig", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TitoValidationConfigData.f;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, TitoValidationConstraint$$serializer.f9647a, lazyArr[3].getValue(), TITONotificationJobConfig$$serializer.f9639a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        TitoValidationConstraint titoValidationConstraint;
        List list;
        TITONotificationJobConfig tITONotificationJobConfig;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TitoValidationConfigData.f;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            TitoValidationConstraint titoValidationConstraint2 = (TitoValidationConstraint) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, TitoValidationConstraint$$serializer.f9647a, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            str = strDecodeStringElement2;
            tITONotificationJobConfig = (TITONotificationJobConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, TITONotificationJobConfig$$serializer.f9639a, null);
            titoValidationConstraint = titoValidationConstraint2;
            i = 31;
            str2 = strDecodeStringElement3;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement4 = null;
            TitoValidationConstraint titoValidationConstraint3 = null;
            List list2 = null;
            TITONotificationJobConfig tITONotificationJobConfig2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    titoValidationConstraint3 = (TitoValidationConstraint) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, TitoValidationConstraint$$serializer.f9647a, titoValidationConstraint3);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), list2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    tITONotificationJobConfig2 = (TITONotificationJobConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, TITONotificationJobConfig$$serializer.f9639a, tITONotificationJobConfig2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            titoValidationConstraint = titoValidationConstraint3;
            list = list2;
            tITONotificationJobConfig = tITONotificationJobConfig2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TitoValidationConfigData(i, str, str2, titoValidationConstraint, list, tITONotificationJobConfig);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TitoValidationConfigData value = (TitoValidationConfigData) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TitoValidationConfigData.f;
        String str = value.f9644a;
        List list = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, TitoValidationConstraint$$serializer.f9647a, value.c);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.d(list, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), list);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, TITONotificationJobConfig$$serializer.f9639a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
