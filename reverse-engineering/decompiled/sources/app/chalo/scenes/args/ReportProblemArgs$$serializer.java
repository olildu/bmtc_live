package app.chalo.scenes.args;

import app.chalo.features.reportproblem.ReportProblemCollection;
import app.chalo.features.reportproblem.ReportProblemCollection$$serializer;
import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/ReportProblemArgs.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/ReportProblemArgs;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ReportProblemArgs$$serializer implements GeneratedSerializer<ReportProblemArgs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReportProblemArgs$$serializer f9300a;
    private static final SerialDescriptor descriptor;

    static {
        ReportProblemArgs$$serializer reportProblemArgs$$serializer = new ReportProblemArgs$$serializer();
        f9300a = reportProblemArgs$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.ReportProblemArgs", reportProblemArgs$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("problemCollection", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("userPropertiesMap", false);
        pluginGeneratedSerialDescriptor.j("additionalProblemCategoryList", true);
        pluginGeneratedSerialDescriptor.j("supportContactNumber", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ReportProblemArgs.g;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c(ReportProblemCollection$$serializer.f2756a), stringSerializer, lazyArr[2].getValue(), BuiltinSerializersKt.c((KSerializer) lazyArr[3].getValue()), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        ReportProblemCollection reportProblemCollection;
        String str;
        Map map;
        List list;
        String str2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ReportProblemArgs.g;
        ReportProblemCollection reportProblemCollection2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ReportProblemCollection reportProblemCollection3 = (ReportProblemCollection) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ReportProblemCollection$$serializer.f2756a, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            reportProblemCollection = reportProblemCollection3;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, null);
            i = 31;
            map = map2;
            str = strDecodeStringElement;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement2 = null;
            Map map3 = null;
            List list2 = null;
            String str3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    reportProblemCollection2 = (ReportProblemCollection) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ReportProblemCollection$$serializer.f2756a, reportProblemCollection2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), map3);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), list2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str3);
                    i2 |= 16;
                }
            }
            i = i2;
            reportProblemCollection = reportProblemCollection2;
            str = strDecodeStringElement2;
            map = map3;
            list = list2;
            str2 = str3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ReportProblemArgs(i, reportProblemCollection, str, map, list, str2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ReportProblemArgs value = (ReportProblemArgs) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ReportProblemArgs.g;
        ReportProblemCollection$$serializer reportProblemCollection$$serializer = ReportProblemCollection$$serializer.f2756a;
        ReportProblemCollection reportProblemCollection = value.b;
        String str = value.f;
        List list = value.e;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, reportProblemCollection$$serializer, reportProblemCollection);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
